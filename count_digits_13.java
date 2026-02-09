import java.util.Scanner;

public class count_digits_13 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        String num = input.nextLine();

        int count = num.length();
        System.out.println("Total Number Of Digits In "+num+" Are : "+count);

    }

}
