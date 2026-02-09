import java.util.Scanner;

public class lcm_17{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = input.nextInt();
        System.out.print("The LCM Of "+num1+", "+num2+" Is : ");
        int n1 = num1;
        int n2 = num2;
        int gcd = 0;

        while(true){
            
            if(num2 == 0){
                gcd = num1;
                break;
            }

            int R = num1%num2;
            num1 = num2;
            num2 = R;

        }

        int lcm = (n1*n2)/gcd;
        System.out.println(lcm);

    }

}