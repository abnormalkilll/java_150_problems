import java.util.Scanner;

public class factorial_15 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = input.nextInt();
        int factorial = 1;

        for(int i=num; i>=1; i--){
            factorial *= i;
        }
        System.out.println("The Factorial Of "+num+" Is : "+factorial);

    }

}
