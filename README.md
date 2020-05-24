Откройте проект в IDE c установленным Antlr4 плагином.

Запустите Main.java (аргументом должен подаваться файл с кодом на языке MathLanguage, по умолчанию - test.math).

В результате выполнения программы исходный код из файла test.math будет преобразован в код на языке Java, хранящийся по пути: ~/compiled/scr/result/Main.java

Получившийся код будет выполнен.

# test.math:
```
fun integer fu (integer data) {
    data=data*4
    return data
}

fun float flo (float data) {
    data = data+5
    return data
}

main {
  integer i = 5
  float f = 19.01
  const integer hundred = 100

  integer b = 1

  integer c = (integer) f

  integer a = ((i*hundred + 123^2 - hundred%2)-1*b)
  print a

  a = fu(a)
  print a

  float l = f - 2.28

  if (l<=f){
  print l
  }
  else{
  print f
  }

  f = flo(l)
  print f

}
```

# Main.java:
```java
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
```
