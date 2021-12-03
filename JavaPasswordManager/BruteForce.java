public class BruteForce{
    public static void bruteForcer(String password){
        System.out.println("This would take a second");

        int passLen = password.length();
        char[] charOfPass = new char[passLen];

        //for i in the range of passlen
        for(int i=0;i<=passLen-1;i++){
            //for i starting at 33 and ending at 126
            for(int j=33;j<=126;j++){
                //   'a'        97
                char ch = (char)j;
                //saves the char to charOfPass
                charOfPass[i]=ch;

                if (charOfPass[i]==password.charAt(i)){
                    break;
                    
                }
                
                
            }

        }
        System.out.println(charOfPass);
    }
}
