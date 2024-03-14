import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadane_Algorithm {
    public static void main(String arg[])throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
        int n = Integer.parseInt(br.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=Integer.parseInt(br.readLine());

        int max_sum = a[0];
        int current_sum = max_sum;
        for(int i=1;i<n;i++){
            current_sum = Math.max(a[i]+current_sum,a[i]);
            max_sum = Math.max(max_sum,current_sum);
        }
        System.out.println(max_sum);

    }
}
