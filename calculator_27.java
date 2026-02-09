import java.util.Scanner;

public class calculator_27 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Num : ");
        int n1 = input.nextInt();
        System.out.print("Enter 2nd Num : ");
        int n2 = input.nextInt();
        System.out.print("Enter Which Operation You Want To Perform : ");
        char c = input.next().charAt(0);
        
        switch(c){
            case '+':
                System.out.println("Sum Of " +n1+", "+n2+" Is : "+(n1+n2));
                break;
            case '-':
                System.out.println("Sub Of " +n1+", "+n2+" Is : "+(n1-n2));
                break;
            case '*':
                System.out.println("Mul Of " +n1+", "+n2+" Is : "+(n1*n2));
                break;
            case '/':
                System.out.println("Div Of " +n1+", "+n2+" Is : "+(n1/n2));
                break;
            case '%':
                System.out.println("Sum Of " +n1+", "+n2+" Is : "+(n1%n2));
                break;
            default:
                System.out.println("Please Enter A Valid Operation.");
                break;
        }

    }

}
