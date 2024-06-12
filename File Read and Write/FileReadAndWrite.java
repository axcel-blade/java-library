/************************************************************************
 * Author - Srikanth Fernando                                           *
 * GitHub Username - axcel-blade                                        *
 * Title - File Read And Write                                          *
 * Description - This Java code is for file read and write              *
 * Created - 12/06/2024                                                 *
 * Last Modified - 12/06/2024                                           *
 ***********************************************************************/
import java.io.*;

public class FileReadAndWrite {
    /****************************************************************************************************
     * Method - fileRead                                                                                *
     * Import - pFileName (String)                                                                      *
     * Export - fileData[] (String)                                                                     *
     * Description - This function is to read the file and add those data into an array and return them *
     ***************************************************************************************************/
    public static String[] fileRead(String pFileName) {
        String[] fileData = {};

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pFileName + ".txt"));

            int lineCount = 0;

            // Get the number of lines
            while(bufferedReader.readLine() != null) {
                lineCount++;
            }

            fileData = new String[lineCount];
            bufferedReader = new BufferedReader(new FileReader(pFileName + ".txt"));

            // Add the file data line by line to an array
            for(int i = 0; i < lineCount; i++) {
                fileData[i] = bufferedReader.readLine();
            }

            bufferedReader.close();

        } catch(FileNotFoundException e) {
            System.out.println("ERROR: Cannot read the file.");

        } catch (IOException e) {
            System.out.println("ERROR: Cannot read the file.");

        }

        return fileData;
    }

    /****************************************************************************************************
     * Method - fileWrite                                                                               *
     * Import - pFileName (String), pWriteContent[] (String)                                               *
     * Export - none                                                                                    *
     * Description - This function is to write the data in a list to a file                             *
     ***************************************************************************************************/
    public static void fileWrite(String pFileName, String[] pWriteContent) {
        int writeContentLength = pWriteContent.length;

        try {
            File file = new File(pFileName + ".txt");

            // Check whether file already there or not
            if(file.createNewFile()) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pFileName + ".txt"));

                for(int i = 0; i < writeContentLength; i++) {
                    bufferedWriter.write(pWriteContent[i]);

                    // Check whether is the write content is the last one, if it is it will skip writing a newline
                    if(i != writeContentLength - 1){
                        bufferedWriter.newLine();
                    }
                }

                bufferedWriter.close();
                System.out.println("File write successfully.");

            } else {
                System.out.println("File already exists.");
            }

        } catch(IOException e) {
            System.out.println("ERROR: Cannot write data to the file.");
        }
    }
}