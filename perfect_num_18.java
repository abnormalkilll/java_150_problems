import java.util.*;
public class perfect_num_18{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = input.nextInt();
        int sum = 0;

        for(int i=1; i<num; i++){
            
            if(num%i==0){
                sum+=i;
            }

        }

        if(num==sum){
          System.out.println(num+" Is A Perfect Number.");  
        }else{
            System.out.println(num+" Is Not A Perfect Number.");
        }

    }

}