import java.util.Scanner;

public class gcd_16{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = input.nextInt();
        System.out.print("The GCD Of "+num1+", "+num2+" Is : ");

        while(true){
            
            if(num2 == 0){
                System.out.println(num1);
                break;
            }

            int r = num1%num2;
            num1 = num2;
            num2 = r;

        }

    }

}