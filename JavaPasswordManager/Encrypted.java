import java.io.BufferedReader;
import java.io.FileWriter;
import java.nio.file.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Encrypted {
    public static void encoder() {
        //Two array lists for the File lines
        ArrayList<String> fileLines = new ArrayList<String>();
        ArrayList<String> encodedFileLines = new ArrayList<String>();
        
        //sets a new bufferReader
        BufferedReader reader;
        //try
		try {
            //opens the file from the pathway              "This here" \/
			reader = new BufferedReader(new FileReader("decodedData.txt"));
			String line = reader.readLine();
            //while line  doesnt equal null
			while (line != null) {
				
                fileLines.add(line);
				// read next line
				line = reader.readLine();
			}
            
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

        //for every item in the fileLines array
        for (int i = 0; i < fileLines.size(); i++) {
            //use the encode method (code down below) to encode
            String encodedLine = ( Encrypted.encode( fileLines.get(i), 20 ));
            //add the encodedLine
            encodedFileLines.add(encodedLine);   
        }   
        
        BufferWritter.writeString(encodedFileLines.toString().replace("[", "").replace("]", ""),"encodedData.txt");
        BufferWritter.saveAndClose("decodedData.txt");
        // create object of Path
        Path path = Paths.get("encodedData.txt");
  
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
            FileWriter myWriter = new FileWriter("encodedData.txt");
            for (int i = 0; i < encodedFileLines.size(); i++) {
                //BufferWritter.writeString(encodedFileLines.get(i),"encodedData.txt");
                
                lines = lines.concat((encodedFileLines.get(i)+"\n"));
            }
            
            try {
                myWriter.write(lines);  
                System.out.println("Successfully Encoded the file.");
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
