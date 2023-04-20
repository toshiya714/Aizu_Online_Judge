import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        String op, sc_str;
        String[] str;
        
        while(sc.hasNextLine()){
            // sc_str = sc.nextLine();
            str = sc.nextLine().split(" ");
            a = Integer.parseInt(str[0]);
            op = str[1];
            b = Integer.parseInt(str[2]);
            
            if(op.equals("?")){
                break;
            }
            
            if(op.equals("+")){
                System.out.println(a + b);
            }
            else if(op.equals("-")){
                System.out.println(a - b);
            }
            else if(op.equals("*")){
                System.out.println(a * b);
            }
            else{
                System.out.println(a / b);
            }
        }
    }
}