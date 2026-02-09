import java.util.Scanner;

public class check_char_26 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Character : ");
        char c = input.next().charAt(0);

        if(Character.isLetter(c)){
            System.out.println(c+" Is A Aplhabet.");
        }else if(Character.isDigit(c)){
            System.out.println(c+" Is A Number.");
        }else{
            System.out.println(c+" Is A Symbol.");
        }

    }

}
