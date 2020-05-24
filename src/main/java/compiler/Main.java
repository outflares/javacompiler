package compiler;

import compiler.grammar.mylangLexer;
import compiler.grammar.mylangParser;
import compiler.grammar.mylangVisitor;
import compiler.visitor.setVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

import static compiler.config.Config.compiledFileName;

public class Main {
    public static void main(String[] args) throws Exception {
        String sourceFileName = getSourceFileName(args);
        compileSource(sourceFileName);
        compileResultCode();
        packageToJarFile();
        System.out.println("\nProgram output:");
        executeResultCode();
    }

    private static void clearJarTargetDirectory() throws IOException {
        Runtime.getRuntime().exec("cmd /C cd compiled && del target.jar");
    }

    private static String getSourceFileName(String [] args) {
        String fileName = "";

        if (args.length == 1){
            fileName = args[0];
        } else {
            System.out.print("Not valid arg");
            System.exit(-1);
        }
        return fileName;
    }

    private static void compileSource(String sourceFileName) {
        mylangLexer lexer = null;
        try {
            lexer = new mylangLexer(new ANTLRFileStream(sourceFileName));
            mylangParser parser = new mylangParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.parse();
            mylangVisitor mylangVisitor = new setVisitor(sourceFileName);
            String output = (String) mylangVisitor.visit(tree);
            PrintWriter printer = null;
            printer = new PrintWriter(compiledFileName);
            printer.print(output);
            printer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void compileResultCode() throws Exception {
        Runtime.getRuntime().exec("javac -sourcepath ./compiled/src -d compiled/target compiled/src/result/Main.java");
    }

    private static void packageToJarFile() throws IOException {
        Runtime.getRuntime().exec("jar cmvf ./compiled/META-INF/MANIFEST.mf ./compiled/target.jar -C ./compiled/target/ .");
    }

    private static void executeResultCode() throws Exception {
        Process p = Runtime.getRuntime().exec("java -jar  ./compiled/target.jar");
        String line;
        BufferedReader errorStream = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        while ((line = errorStream.readLine()) != null) {
            System.out.println(line);
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}