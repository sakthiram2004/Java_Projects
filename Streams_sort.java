import java.util.*;
class Stud
{
int sno,m1,m2;
String name;
Stud(int sno,String name,int m1,int m2)
{
this.sno=sno;
this.name=name;
this.m1=m1;
this.m2=m2;
}
public String toString()
{
return sno+"\t"+name+"\t"+m1+"\t"+m2+"\t"+(m1+m2)+"\t"+((m1+m2)/2.0)+"\n";
}
}
class MySolution
{
public static void main(String arg[])
{
Stud s[]=new Stud[5];
s[0] = new Stud(12,"Simren",100,99);
s[1] = new Stud(17,"Reema",90,76);
s[2] = new Stud(11,"Kiren",76,91);
s[3] = new Stud(22,"Nayan",60,29);
s[4] = new Stud(14,"Meera",76,69);
List<Stud> l = Arrays.asList(s);
Collections.reverse(l);
Arrays.stream(l.toArray()).forEach(System.out::println);
System.out.println("Sorted");

l.stream().sorted((x,y)->(x.name.compareTo(y.name))).forEach(System.out::println);
System.out.println("Sorted");

l.stream().sorted((x,y)->(x.sno - y.sno)).forEach(System.out::println);
System.out.println("Max mark 1");

l.stream().max((x,y)->(x.m1 - y.m1)).ifPresent(System.out::println);
System.out.println(l.stream().count());
}
}
