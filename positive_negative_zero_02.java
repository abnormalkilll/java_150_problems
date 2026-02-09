import java.util.Scanner;

public class positive_negative_zero_02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = input.nextInt();

        if(num==0){
            System.out.println("Number Is Zero!");
        }else if(num>0){
            System.out.println("Number Is Positive!");
        }else{
            System.out.println("Number Is Negative!");
        }

    }

}
