import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.time.Duration;
import java.time.Instant;
/*​
two method
import "main Folder".BruteForce;
import "main Folder".Encrypted;
*/
public class passwordManagerMain{
    public static void main(String[] args) {
        Decrypted.decoder();
        String username="username";
        String password="password";
        int tries =3;
        Scanner ui = new Scanner(System.in);
        boolean loggedIn=false;             //this is see if they are stil logged in
        System.out.println("Are you a first time user? ");
        String firstTimeUser= ui.nextLine();
        if (firstTimeUser.equals("no")){
            // need to ask for the username and password
            System.out.println("Enter the username ");
            String uiUsername=ui.nextLine();
            //if the username equals the right one then it will ask for the password. If not the program will stop
            if(uiUsername.equals(username)){
                while (tries!=0){       //this will allow the user a certain number of tries to get their password right. If they run out of tries then the program shuts down
                    System.out.println("Enter the password ");
                    String uiPassword=ui.nextLine();
                    //if they get the password right it will start the program
                    if(uiPassword.equals(password)){
                        loggedIn=true;
                        tries=0;
                    }
                    else{   //if they get the password wrong they will lose a try and be asked for it again
                        tries-=1;
                        System.out.printf("That's not the password. Please try again. You have %s amount of tries left /n",tries);
                    }
                }
            }
            else{
                System.out.println("I don't see that username");
                Encrypted.encoder();
            }
        }
        else if(firstTimeUser.equals("yes")){
            System.out.println("Enter your first name ");
            String firstName= ui.nextLine();
            System.out.println("Enter your last name ");
            String lastName= ui.nextLine();
            System.out.println("Enter a username ");
            username= ui.nextLine();
            System.out.println("Enter a password ");
            password= ui.nextLine();
            Instant start = Instant.now();
            BruteForce.bruteForcer(password);
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start, end);
            System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
            while ( ClassPasswordChecker.passwordCheck(password) ==false){
                System.out.println(password);
                System.out.println("That password doesn't work please try again. ");
                System.out.println("Enter a password ");
                password= ui.nextLine();
                ClassPasswordChecker.passwordCheck(password);
            }
            System.out.println("Enter a hint to remember your password ");
            String hint= ui.nextLine();
            // need to ask for the username and password
            System.out.println("Enter the username ");
            String uiUsername=ui.nextLine();
            //if the username equals the right one then it will ask for the password. If not the program will stop
            if(uiUsername.equals(username)){
                while (tries!=0){       //this will allow the user a certain number of tries to get their password right. If they run out of tries then the program shuts down
                    System.out.println("Enter the password ");
                    String uiPassword=ui.nextLine();
                    start = Instant.now();
                    BruteForce.bruteForcer(uiPassword);
                    end = Instant.now();
                    timeElapsed = Duration.between(start, end);
                    System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
                    
                    //if they get the password right it will start the program
                    if(uiPassword.equals(password)){
                        loggedIn=true;
                        tries=0;
                    }
                    else{   //if they get the password wrong they will lose a try and be asked for it again
                        tries-=1;
                        System.out.printf("That's not the password. Please try again. You have %s amount of tries left. Your hint is: %s \n",tries,hint);
                    }
                }
            }
            else{
                System.out.println("I don't see that username");
            }
            loggedIn=true;
        }
        ArrayList <Account> accounts = new ArrayList<Account>();
        String cata="e";
        while (loggedIn==true){
            System.out.println("Would you like to add an account(add), edit a password(edit), delete an account(delete), print all of your accounts(print), print by category (category), if you are done type(done) ");
            String userInput=ui.nextLine();
            if (userInput.equals("add")){      //if the user wants to add an account it will ask all the items and them put them into a object
                System.out.println("What category is this in? ");
                String category=ui.nextLine();
                System.out.println("What is the username? ");
                String InputUsername=ui.nextLine();
                System.out.println("What is the password? If you need to create one type (create) ");
                String InputPassword =ui.nextLine();
                if (InputPassword.equals("create")){                //will create a new password with the class
                    InputPassword=ClassPasswordGenerator.passwordGenerator();
                    Instant start = Instant.now();
                    BruteForce.bruteForcer(InputPassword);
                    Instant end = Instant.now();
                    Duration timeElapsed = Duration.between(start, end);
                    System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
                    System.out.println("Your new password is"+InputPassword);
                }
                while ( ClassPasswordChecker.passwordCheck(InputPassword) ==false){             //will take the users password and pass it throught the checker to make sure it meets the requirements
                    System.out.println(InputPassword);
                    System.out.println("That password doesn't work please try again. ");
                    System.out.println("Enter a password ");
                    InputPassword= ui.nextLine();
                    ClassPasswordChecker.passwordCheck(InputPassword);
                }
                System.out.println("What is this for? ");
                String type = ui.nextLine();
                accounts.add(new Account(InputUsername,InputPassword,category,type));     //this will add the object to the arrayList of all the accounts
            }
            else if(userInput.equals("edit")){
                while(accounts.size()>0){           //makes sure there is something in the list to edit
                    int i=0;
                    while ( i != accounts.size()){
                        System.out.printf("Number: %d   Username: %s    Password: %s    Category: %s    Title: %s \n",i,accounts.get(i).getUserName(),accounts.get(i).getpassword(),accounts.get(i).getCategory(),accounts.get(i).getTitle());
                        
                        i=i+1;
                    }
                    System.out.println("Enter the number that you want to edit the password on ");
                    int index= Integer.parseInt(ui.nextLine());
                    while (index>=accounts.size()){         //makes sure that the index the user put in is actually and index in the list
                        System.out.println("That isn't an index.Enter the number that you want to edit the password on ");
                        index= Integer.parseInt(ui.nextLine());
                    }
                    System.out.println("What is the new password that you want? If you want to create one type create ");
                    String newPassword=ui.nextLine();
                    if (newPassword.equals("create")){          //if the user types in create it will make a new password with the class
                        newPassword=ClassPasswordGenerator.passwordGenerator();
                        System.out.println("Your new password is"+newPassword);
                    }
                    while ( ClassPasswordChecker.passwordCheck(newPassword) ==false){       //make pass the users password into the checker and make sure it has all the requirement
                        System.out.println(newPassword);
                        System.out.println("That password doesn't work please try again. ");
                        System.out.println("Enter a password ");
                        newPassword= ui.nextLine();
                        ClassPasswordChecker.passwordCheck(newPassword);
                    }
                    accounts.get(index).setPassword(newPassword);
                }
            }
            else if(userInput.equals("delete")){
                while(accounts.size()>0){       //makes sure there is something in the list to delete
                    int i=0;
                    while ( i != accounts.size()){      //it will print out until the list is done
                        System.out.printf("Number: %d   Username: %s    Password: %s    Category: %s    Title: %s \n",i,accounts.get(i).getUserName(),accounts.get(i).getpassword(),accounts.get(i).getCategory(),accounts.get(i).getTitle());
                        
                        i=i+1;
                    }
                    System.out.println("Enter the number of the account you want to delete ");
                    int index= Integer.parseInt(ui.nextLine());
                    while (index>=accounts.size()){         //makes sure that the index the user put in is actually and index in the list
                        System.out.println("That isn't an index.Enter the number that you want to edit the password on ");
                        index= Integer.parseInt(ui.nextLine());
                    }
                    accounts.remove(accounts.get(index));
                }
            }
            else if (userInput.equals("print")){
                int i=0;
                while ( i != accounts.size()){      //it will print out until the list is done
                    System.out.printf("Number: %d   Username: %s    Password: %s    Category: %s    Title: %s \n",i,accounts.get(i).getUserName(),accounts.get(i).getpassword(),accounts.get(i).getCategory(),accounts.get(i).getTitle());
                    
                    i=i+1;
                }
            }
            else if(userInput.equals("category")){
                int i=0;
                String categories="";
                while ( i != accounts.size()){      //it will print out until the list is done
                    if (!(categories).contains(accounts.get(i).getCategory())){
                        categories= accounts.get(i).getCategory()+categories;
                        categories=","+categories;
                    }
                        
                    
                    i=i+1;
                }
                System.out.println("Categories: "+categories);
                System.out.println("What category do you want to print out? ");
                String userCategory=ui.nextLine();
                System.out.println(accounts.size());
                i=0;
                while ( i != accounts.size()){      //it will print out until the list is done
                    if (accounts.get(i).getCategory().equals(userCategory)){
                        System.out.printf("Number: %d   Username: %s    Password: %s    Category: %s    Title: %s \n",i,accounts.get(i).getUserName(),accounts.get(i).getpassword(),accounts.get(i).getCategory(),accounts.get(i).getTitle());
                    
                    }
                    i=i+1;
                }
            }

            else if(userInput.equals("done")){
                loggedIn=false;
                Encrypted.encoder();
            }
            
            /*
            System.out.println("Do you need to create a password? ");
            String create= ui.nextLine();
            if (create.equals("yes")){
                password=ClassPasswordGenerator.passwordGenerator();
                System.out.println("Your new password is"+password);
            }*/
        }
    }
}