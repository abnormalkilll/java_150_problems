import java.util.Scanner;

public class max_two_nums_03 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = input.nextInt();

        if(num1 == num2){
            System.out.println("Both Numbers Are Equal.");
        }else if(num1>num2){
            System.out.println("1st Number Is Greator Than 2nd.");
        }else{
            System.out.println("2nd Number Is Greator Than 1st.");
        }

    }

}
