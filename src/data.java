
package project;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class data {
    public static void main(String args[]) throws IOException {

    FileInputStream fstream = new FileInputStream("../Data-files/u.item");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        
        while ((word = br.readLine()) != null) {
            String[] result = word.split("@");
            
                int u = Integer.parseInt(result[0]);
                System.out.print(  u + " " + result[1]);
                System.out.print("\n");
        }
    }
}
