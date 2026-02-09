import java.util.Scanner;

public class strong_num_19 {

    public static int fict(int x){
        int fact = 1;
        for(int i=x; i>=1; i--){
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = input.nextInt();
        int fix_num = num;
        int sum = 0;
        
        while(num>0){
            int n = num%10;
            sum += fict(n);
            num = num/10;
        }

        if(fix_num == sum){
            System.out.println(fix_num+" Is A Strong Number.");
        }else{
            System.out.println(fix_num+" Is Not A Strong Number.");
        }

    }

}
