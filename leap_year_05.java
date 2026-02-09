import java.util.Scanner;

public class leap_year_05 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = input.nextInt();

        if(year%4 == 0){
            System.out.println(year+" Is A Leap Year!");
        }else{
            System.out.println(year+" Is Not A Leap Year!");
        }

    }

}
