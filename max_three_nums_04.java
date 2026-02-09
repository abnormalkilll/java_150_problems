import java.util.Scanner;

public class max_three_nums_04 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = input.nextInt();
        System.out.print("Enter 3rd Number : ");
        int num3 = input.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("All Numbers Are Equal.");
        }else if(num1>num2 && num1>num3){
            System.out.println("1st Number Is Greatest.");
        }else if(num2>num1 && num2>num3){
            System.out.println("2nd Number Is Greatest.");
        }else{
            System.out.println("3rd Number Is Greatest");
        }

    }

}
