import java.util.Scanner;

public class num_power_21 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int base = input.nextInt();
        System.out.print("Enter Power : ");
        int power = input.nextInt();

        int result = 1;
        for(int i=1; i<=power; i++){
            result *= base;
        }
        
        System.out.println("Result Will Be : "+result);

    }

}
