import java.util.*;
public class sum_digits_11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        String num = input.nextLine();
        int sum = 0;

        for(int i=0; i<num.length(); i++){
           
            char c = num.charAt(i);
            sum += c-48;

        }
        
        System.out.println("The Sum Of "+num+" Is : "+sum);
        
    }

}
