import java.util.Scanner;

public class product_digits_12 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        String num = input.nextLine();
        int product = 1;

        for(int i=0; i<num.length(); i++){
           
            char c = num.charAt(i);
            product *= c-48;

        }
        
        System.out.println("The Product Of "+num+" Is : "+product);

    }

}
