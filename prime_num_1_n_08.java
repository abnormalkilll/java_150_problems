import java.util.Scanner;

public class prime_num_1_n_08 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = input.nextInt();

        if(n<2){
            System.out.println("Number Should Be Greator Than 2.");
            return;
        }

        for(int i=2; i<=n; i++){
            
            boolean flag = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    flag = false;
                    break;   
                }
            }

            if(flag){
                System.out.println(i+" Is Prime!");  
            }else{
                System.out.println(i+" Is Composite!");
            }

        }

    }

}
