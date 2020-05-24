// program Test_math compiled on Sun May 24 11:39:40 MSK 2020
package result;
public class Main {
private static int fu(int data){
data=data*4;
return data;
}
private static float flo(Float data){
data=data+5;
return data;
}
public static void main(String[]args) throws Exception{
int i = 5;
float f = 19.01f;
final int hundred = 100;
int b = 1;
int c = (int)f;
int a = ((i*hundred+123^2-hundred %2)-1*b);
System.out.println(a);
a=fu(a);
System.out.println(a);
float l = f-2.28f;
if (l<=f){
System.out.println(l);
}else{
System.out.println(f);
}
f=flo(l);
System.out.println(f);
}
}
