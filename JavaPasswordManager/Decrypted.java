import java.io.BufferedReader;
import java.io.FileWriter;
import java.nio.file.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Decrypted {
    public static void decoder() {
        //Two array lists for the File lines
        ArrayList<String> fileLines = new ArrayList<String>();
        ArrayList<String> decodedFileLines = new ArrayList<String>();
        
        //sets a new bufferReader
        BufferedReader reader;
        //try
		try {
            //opens the file from the pathway              "This here" \/
			reader = new BufferedReader(new FileReader("encodedData.txt"));
			String line = reader.readLine();
            //while line  doesnt equal null
			while (line != null) {
                //adds the line to the array filelines
                fileLines.add(line);
				// read next line
				line = reader.readLine();
			}
            //closes reader
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        //for every item in the fileLines array
        for (int i = 0; i < fileLines.size(); i++) {
            //use the decode method (code down below) to decode
            String decodedLine = ( Decrypted.decode( fileLines.get(i), 20 ));
            //add the decodedLine
            decodedFileLines.add(decodedLine);   
        }   
        
        BufferWritter.writeString(decodedFileLines.toString().replace("[", "").replace("]", ""),"decodedData.txt");
        BufferWritter.saveAndClose("decodedData.txt");
        // create object of Path
        Path path = Paths.get("decodedData.txt");
  
        // delete File
        try {
            Files.delete(path);
        }
        catch (IOException e) {
            System.out.println("Unable to delete file");
            e.printStackTrace();
        }
        
        String lines ="";
        //Save the new DecodeFileLine to the text file - decodedData.txt
        try{
            FileWriter myWriter = new FileWriter("decodedData.txt");
            for (int i = 0; i < decodedFileLines.size(); i++) {
                //BufferWritter.writeString(encodedFileLines.get(i),"encodedData.txt");
                
                lines = lines.concat((decodedFileLines.get(i)+"\n"));
            }

            try {
                myWriter.write(lines);  
                System.out.println("Successfully Decodeed the file.");
            } 
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            myWriter.close();
        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        
    }
    
    public static String decode(String enc, int offset) {
        return encode(enc, 26-offset);
    }
    
    public static String encode(String enc, int offset) {
        //what number you want your data to be set off
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        //for every character in enc
        for (char i : enc.toCharArray()) {
            //if the char is a letter
            if (Character.isLetter(i)) {
                //if i isUpperCase 
                if (Character.isUpperCase(i)) {
                    //adds the char which has been offseted A-O
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } 
                else {
                    //adds the char which has been offseted a-o
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } 

            else {
                //adds it to the list
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
    
    
}
