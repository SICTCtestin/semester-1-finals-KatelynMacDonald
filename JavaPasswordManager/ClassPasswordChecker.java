import java.util.Arrays;

public class ClassPasswordChecker {






    public static boolean passwordCheck(String password){
        
        String specialCharacters = "!@#$%&*";         
          //      length,,upper,numbers,specials
        boolean[] reqCheckList = {false,false,false,false};
        if(password.length()>=8){      //if it meets the length requirement it will go on to check the individual characters
            reqCheckList[0]=true;
            
        }
        
        for(int i=0;i<password.length();i++){
            //A-Z on ASCII is....... range(65-91)
            //SSystem.out.println(i);
                if(Character.isUpperCase((password.charAt(i)))){
                    reqCheckList[1]=true;
                    
                    
                }
                else if(Character.isDigit((password.charAt(i)))){
                    reqCheckList[2]=true;
                    
                }
                else if(specialCharacters.contains(password.substring(i,i+1))){      //https://www.geeksforgeeks.org/check-if-a-value-is-present-in-an-array-in-java/
                    reqCheckList[3]=true;
                    
                }

        }
        
        for(int i=0;i<reqCheckList.length;i++){
            if(reqCheckList[i]==false){
                return false;
            }
            
        }
        
        return true;
        
        
        
        
    }
}

