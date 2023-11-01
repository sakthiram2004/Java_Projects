import java.io.*;

class Mymain
{
public static void main(String arg[])throws IOException
{
Complex a=new Complex();
Complex b=new Complex();
Complex c=new Complex();
a.input();
b.input();
c.process(a,b);
c.output();
}
}
class Complex
{
int rp,ip;
void input() throws IOException
{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter rp,ip");
rp=Integer.parseInt(br.readLine());
ip=Integer.parseInt(br.readLine());
}
 void process(Complex a,Complex b)
{
rp=a.rp+b.rp;
ip=a.ip+b.ip;
}
void output()
{
if(ip>=0)
System.out.println(rp+"+"+ip+"i");
else
System.out.println(rp+ip+"i");
}

}