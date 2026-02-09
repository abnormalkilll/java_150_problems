import java.util.Scanner;

public class triangle_type_29 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Side : ");
        int s1 = input.nextInt();
        System.out.print("Enter 2nd Side : ");
        int s2 = input.nextInt();
        System.out.print("Enter 3rd Side : ");
        int s3 = input.nextInt();

        if(s1==s2 && s2==s3){
            System.out.println("The Triangle Is An Equilateral Triangle.");
        }else if(s1==s2 || s2==s3 || s1==s3){
            System.out.println("The Triangle Is An Isosceles Triangle.");
        }else{
            System.out.println("The Triangle Is An Scalene Triangle.");
        }
        
    }

}
