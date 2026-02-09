import java.util.*;
public class reverse_num_14 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        String num = input.nextLine();
        String reverse_num = "";

        for (int i=(num.length()-1); i>=0; i--) {
            
            char c = num.charAt(i);
            reverse_num += c;

        }

        System.out.println("Reverse Of "+num+" Is : "+reverse_num);

    }

}
