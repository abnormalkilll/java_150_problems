import java.util.Scanner;

public class vowel_consonant_25 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Line : ");
        String str = input.nextLine().toLowerCase();
        int vowels = 0;
        int consonants = 0;

        if(str.contains("a")){
            vowels++;
        }
        if(str.contains("e")){
            vowels++;
        }
        if(str.contains("i")){
            vowels++;
        }
        if(str.contains("o")){
            vowels++;
        }
        if(str.contains("u")){
            vowels++;
        }

        for(int j=0; j<str.length(); j++){
            char c = str.charAt(j);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowels += 0;
            }else{
                consonants++;
            }
        }

        System.out.println(vowels+" Vowels");
        System.out.println(consonants+" Consonants");

    }

}
