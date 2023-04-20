import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int n;
        long min = 0, max = 0, sum = 0;
        
        for(int i = 0; i < count; i++){
            n = sc.nextInt();
            if(i == 0){
                sum = n;
                min = n;
                max = n;
            }
            else{
                // sum
                sum += n;
                
                // min
                if(min > n){ min = n; }
                
                // max
                if(max < n){ max = n; }
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}