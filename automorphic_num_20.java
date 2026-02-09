import java.util.Scanner;

public class automorphic_num_20 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = input.nextInt();
        int square_num = num*num;

        String str_num = "";
        str_num += num;
        String str_square = "";
        str_square += square_num;
        
        if(str_square.endsWith(str_num)){
            System.out.println(num+" Is A Auto-Morphic Number.");
        }else{
            System.out.println(num+" Is Not A Auto-Morphic Number.");
        }


    }

}
