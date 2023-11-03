import java.io.*;
class Exam
{
int a,b;
Exam()
{
a=10;
b=20;
}
Exam(int m,int n)
{
a=m;
b=n;
}
Exam(Exam e)
{
a=e.a;
b=e.b;
}

void output()
{
System.out.println(a+"\t"+b);
}
}

class MyTest
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Exam e1=new Exam();
Exam e2=new Exam();
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
Exam e3=new Exam(a,b);
Exam e4=new Exam(e3);
e1.output();
e2.output();
e3.output();
e4.output();
}
}


