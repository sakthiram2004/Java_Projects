import java.io.*;
class Sumation
{
int sum (int a,int b)
{
return a+b;
}
float sum(float a,float b)
{
return a+b;
}
double sum(double a,double b)
{
return a+b;
}
String sum(String a,String b)
{
return a+b;
}
int sum(int n)
{
int s=0;
for(int i=1;i<=n;i++)
s=s+i;
return s;
}
}

class MySum
{
public static void main(String arg[])
{
Sumation s=new Sumation();
System.out.println("Sum of two integer:"+s.sum(10,11));
System.out.println("Sum of two Strings:"+s.sum("Hello"," World"));
}
}