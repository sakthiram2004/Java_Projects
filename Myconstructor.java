import java.io.*;
class Exam
{
int a,b;
Exam()
{
a=10;
b=20;
}
Exam(int a,int b)
{
this.a=a;
this.b=b;
}
Exam (Exam t)
{
a=t.a;
b=t.b;
}
void output()
{System.out.println(a+"\t"+b);
}
}

class Mymain
{
public static void main(String arg[])
{
Exam e1=new Exam();
Exam e2=new Exam(100,200);
e1.output();
e2.output();
}
}

