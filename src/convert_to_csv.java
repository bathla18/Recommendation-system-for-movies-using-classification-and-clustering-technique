
package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class convert_to_csv {
     public static void main(String args[]) throws IOException {
        FileInputStream fstream = new FileInputStream("../Data-files/matrix");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        File file = new File("../Data-files/matrix/matrix1");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        int u = 0;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            for ( int i = 0; i < result.length; i++ ){
                if ( i != result.length-1){
                bw.write(result[i] + ",");
                }else {
                    bw.write(result[i]+"\n");
                }
                u = i;
            }
        }
     }
}
