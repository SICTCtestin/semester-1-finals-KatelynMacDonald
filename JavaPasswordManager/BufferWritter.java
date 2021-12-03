import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;


public class BufferWritter {
    //global variables to help out
    
    private static Scanner in;
    private static BufferedWriter out;

    //writeString
    public static void writeString(String s, String DATA_FILE) {
        //check to see if out is already created or not
        if(out==null){
            try{
                
                out = new BufferedWriter(new FileWriter(DATA_FILE));

            }
            catch(Exception e){
                System.err.println("Cannot open file for output");
                e.printStackTrace();
            }
        }
        try{
            out.write(s);
            out.newLine();
        }
        catch(Exception e){
            System.err.println("cannot write file!");
            e.printStackTrace();
        }
    }

    //saveAndClose
    public static void saveAndClose(String DATA_FILE) {
        if (in!=null){
            try{
                in.close();
                in = null;
            }
            catch(Exception e){
                System.err.println("Cannot close input file!");
                e.printStackTrace();
            }
        }
        if(out!=null){
            try{
                out.close();
                out = null;
            }
            catch(Exception e){
                System.err.println("Cannot close output file");
                e.printStackTrace();
            }
        }
    }
    
    //readString
    public static String readString(String DATA_FILE) {
        if(in==null){
            try{
                in = new Scanner(new File(DATA_FILE));
            }
            catch(Exception e){
                System.err.println("Cannot open file for input!");
                e.printStackTrace();
            }
        }
        try{
            if (in.hasNext()){
                String s = in.nextLine();
                saveAndClose(DATA_FILE);
                return s;
            }
            else{
                saveAndClose(DATA_FILE);
                return null;
            }
        }
        catch(Exception e){
            System.err.println("Cannot read the file!");
            e.printStackTrace();
        }

        saveAndClose(DATA_FILE);
        return null;
    }
}
