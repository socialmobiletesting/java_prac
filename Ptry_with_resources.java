import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ptry_with_resources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int num = 0;
        BufferedReader bufferedReader = null;
        try{
            InputStreamReader inputStreamReader = new InputStreamReader(System.in); // variable need for BufferedReader
            // BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            bufferedReader = new BufferedReader(inputStreamReader); // BufferedReader declared globally
            // bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(bufferedReader.readLine()); // Need to define type to read input
            System.out.println(num);
            
        }
        finally{
            if (bufferedReader != null)
            {
                try{
                    bufferedReader.close();
                    System.out.println("Closed");
                }
                catch(IOException e)
                {
                    System.err.println(e.getMessage());
                }    
            }
            
        }


    }
}
/**
 * IOException : An IOException in Java is a checked exception that signals an Input/Output (I/O) operation failure or interruption.
 * It is part of the java.io package and is commonly thrown when dealing with file handling, networking, or other I/O operations
 *  such as reading or writing data to files, sockets, etc
 */

