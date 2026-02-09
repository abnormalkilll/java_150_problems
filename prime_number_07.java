import java.util.Scanner;

public class prime_number_07{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = input.nextInt();

        if(num<2){
            System.out.println("Number Should Be Greator Than 2.");
            return;
        }

        boolean flag = true;
        for(int i=2; i<num; i++){
            if(num%i == 0){
                flag = false;
                break;   
            }
        }

        if(flag){
            System.out.println(num+" Is Prime!");  
        }else{
            System.out.println(num+" Is Composite!");
        }

    }

}