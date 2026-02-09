import java.util.Scanner;

public class char_ascii_22 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("For Which Character You Want To Check ASCII : ");
        char c = input.next().charAt(0);

        int ascii = c;
        System.out.println(ascii);

    }

}