import java.util.Scanner;

public class grade_30 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your percentage : ");
        double marks = input.nextDouble();

        if(marks>=85){
            System.out.println("Your Grade Is 'A'.");
        }else if(marks>=75 && marks<85){
            System.out.println("Your Grade Is 'B'.");
        }else if(marks>=65 && marks<75){
            System.out.println("Your Grade Is 'C'.");
        }else if(marks>=55 && marks<65){
            System.out.println("Your Grade Is 'D'.");
        }else{
            System.out.println("Your Grade Is 'F'.");
        }

    }

}
