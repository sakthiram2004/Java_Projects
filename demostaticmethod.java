import java.io.*;
class Exam
{
int sno;
static int c;
String name;
float wt;

void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Name and wt");
sno=++c;
name=br.readLine();
wt=Float.parseFloat(br.readLine());
}
void output()
{
System.out.println(name+"\t"+wt);

}
static void  disp()
{
System.out.println("count"+c);
}

}

class Mymain
{
public static void main(String arg[])throws IOException
{
Exam e1=new Exam();
e1.input();
Exam e2=new Exam();
e2.input();
Exam e3=new Exam();
e3.input();
e1.output();
e2.output();
e3.output();
Exam.disp();
}
}
