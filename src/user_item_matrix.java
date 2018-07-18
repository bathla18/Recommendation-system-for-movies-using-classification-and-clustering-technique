/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ANKI
 */
public class user_item_matrix {
    
    int[][] matrix = new int[944][1683];
    
        void make_user_item() throws FileNotFoundException, IOException{            
            FileInputStream fstream = new FileInputStream("../Data-files/u.data_1");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String word;
        
            while ((word = br.readLine()) != null) {
                String[] result = word.split(" ");
                if ( Integer.parseInt(result[2]) >= 3 ) {
                    matrix[Integer.parseInt(result[0])][Integer.parseInt(result[1])] = 1;
                }else {
                    matrix[Integer.parseInt(result[0])][Integer.parseInt(result[1])] = 0;
                }
            }
        }
        void print_matrix() throws IOException{
            File file = new File("../Data-files/user_item_matrix");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for ( int i = 0; i < 944; i++ ) {
                for ( int j = 0; j < 1683; j++ ) {
                    bw.write( matrix[i][j] + " ");
                }
                bw.write( "\n");
          }
        }
         public static void main(String args[]) throws IOException {
             user_item_matrix mat = new user_item_matrix();
             mat.make_user_item(); 
             mat.print_matrix();
        }
}
