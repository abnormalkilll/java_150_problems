import java.util.Scanner;

public class num_divisibleby_5_11_06 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = input.nextInt();

        if(num%5 == 0 && num%11 == 0){
            System.out.println(num+" Is Divisible By 5 And 11.");
        }else{
            System.out.println(num+" Is Not Divisible By 5 And 11.");
        }

    }

}
