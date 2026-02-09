import java.util.Scanner;

public class armstrong_num_10 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        String num = input.nextLine();
        String final_num = "";
        int power = num.length();
        int sum = 0;

        for(int i=0; i<num.length(); i++){

            char c = num.charAt(i);
            int value = c-48;
            sum += Math.pow(value, power);

        }

        final_num += sum;
        if(num.equals(final_num)){
            System.out.println(num+" Is An Armstrong Number.");
        }else{
            System.out.println(num+" Is Not An Armstrong Number.");
        }

    }

}
