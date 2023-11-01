import java.io.*;
class Complex1
{
int rp,ip;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter rp,ip");
rp=Integer.parseInt(br.readLine());
ip=Integer.parseInt(br.readLine());
}

Complex1 process(Complex1 b)
{
Complex1 c=new Complex1();
c.rp=rp+b.rp;
c.ip=ip+b.ip;
return c;
}
void output()
{
if(ip>=0)
System.out.println(rp+"+"+ip+"i");
else
System.out.println(rp+ip+"i");
}
}


class Mymain1
{
public static void main(String arg[])throws IOException
{
Complex1 a=new Complex1();
Complex1 b=new Complex1();
a.input();
b.input();
Complex1 c=a.process(b);
c.output();
}
}
