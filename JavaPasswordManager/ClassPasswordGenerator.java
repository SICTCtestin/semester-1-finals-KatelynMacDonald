import java.util.Random;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;


public class ClassPasswordGenerator {
    

    public static String passwordGenerator (){
        String password="";
        int number = 3;
        int capLetters=2;
        int lowLetters=3;
        int special=3;
        char[] specialCharacters={'!','@','#','$','%','&','*'};


        for(int i=0;i<capLetters;i++){                                      //https://stackoverflow.com/questions/26459729/random-number-and-letter-generators
            int firstUppercaseIndex = (int)'A'; // for uppercase
            Random r = new Random();
            int letterIndex = r.nextInt(26); // random number between 0 and 26
            char randomUppercase = (char) (firstUppercaseIndex + letterIndex);
            //System.out.println("randomUppercase = " + randomUppercase);
            password+=randomUppercase;
        }
        for(int i=0;i<lowLetters;i++){
            int firstLowercaseIndex = (int)'a'; // for lowercase
            Random r = new Random();
            int letterIndex = r.nextInt(26); // random number between 0 and 26
            char randomLowercase = (char) (firstLowercaseIndex + letterIndex);      //will take the random number that is bewtween 26 and adds it to the int value of a to get another int value. It will then change that number to a letter
            //System.out.println("randomLowercase = " + randomLowercase);
            password+=randomLowercase;
        }
        for(int i=0;i<number;i++){
            int numberInt= (int)(Math.random()*10);
            //System.out.println(numberInt);
            password+=numberInt;
        }



        for(int i=0;i<special;i++){
            Random r = new Random();
            int specialIndex = r.nextInt(specialCharacters.length);
            char specialChar= specialCharacters[specialIndex];
            //System.out.println(specialChar);
            password+=specialChar;
        }
        
        //System.out.println(password);
        
        
        // https://stackoverflow.com/questions/4247810/scramble-a-word-using-java

        ArrayList<Character> chars = new ArrayList<Character>(password.length());
        for ( char c : password.toCharArray() ) {
            chars.add(c);
        }
        Collections.shuffle(chars);
        char[] shuffled = new char[chars.size()];
        for ( int i = 0; i < shuffled.length; i++ ) {
            shuffled[i] = chars.get(i);
        }
        String newPassword = new String(shuffled);
        //System.out.println(newPassword);
        BruteForce.bruteForcer(newPassword);
        return newPassword;





    }
    
}
