import java.util.Scanner;

public class num_palindrome_09{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        String num = input.nextLine();
        String reverse_num = "";
        
        for(int i=num.length()-1; i>=0; i--){

            char c = num.charAt(i);
            reverse_num += c;

        }

        if(num.equals(reverse_num)){
            System.out.println(num+" Is A Palindromic Number.");
        }else{
            System.out.println(num+" Is Not A Palindromic Number.");
        }
    }

}