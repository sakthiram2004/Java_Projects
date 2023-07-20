import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stream.*;
class MySolution
{
public static void main(String arg[])
{
List<String> a=Arrays.asList("cup",null,"forest",null,"car");
ArrayList<String> b=a.stream().filter(n-> n!=null).collect(collectors.toList());
System.out.println(b);
}
}