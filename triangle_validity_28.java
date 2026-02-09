import java.util.Scanner;

public class triangle_validity_28 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Side : ");
        int s1 = input.nextInt();
        System.out.print("Enter 2nd Side : ");
        int s2 = input.nextInt();
        System.out.print("Enter 3rd Side : ");
        int s3 = input.nextInt();

        if(s1+s2>s3 && s1+s3>s2 && s2+s3>s1){
            System.out.println(s1+", "+s2+", "+s3+" Are Sides Of A Valid Triangle.");
        }else{
            System.out.println(s1+", "+s2+", "+s3+" Are Not Sides Of A Valid Triangle.");
        }

    }

}
