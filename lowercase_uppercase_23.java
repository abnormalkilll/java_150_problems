import java.util.Scanner;

public class lowercase_uppercase_23 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Line : ");
        String str = input.nextLine();

        for(int i=0; i<str.length(); i++){

            char c1 = str.charAt(i);
            if(c1>='a' && c1<='z'){
                int ascii = c1;
                ascii -=32;
                char c2 = (char) ascii;
                str = str.replace(c1, c2);
            }

        }
        
        System.out.println("Updated String : "+str);

    }

}
