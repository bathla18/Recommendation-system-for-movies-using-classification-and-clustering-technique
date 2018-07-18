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
import java.util.HashMap;
import java.util.Map;

public class matrixForming {
    int[][] matrix = new int[1604][12628];
    Map<String, Integer> row = new HashMap();
    Map<String, Integer> column = new HashMap();
    
    void initialise_matrix()
    {
        for ( int i = 0; i < 1604; i++ ){
            for ( int j = 0; j < 12628; j++ ){
                matrix[i][j] = 0;
            }
        }
    }
    void  load_row() throws FileNotFoundException, IOException{
        FileInputStream fstream = new FileInputStream("../Data-files/unique_row");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            row.put(result[0], Integer.parseInt(result[1]));
        }
        System.out.println(row.size());
    }
    void load_column() throws FileNotFoundException, IOException{
        FileInputStream fstream = new FileInputStream("../Data-files/unique_column");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            column.put(result[0], Integer.parseInt(result[1]));
        }
        System.out.println(column.size());
          
    }
    void load_director() throws FileNotFoundException, IOException{
        FileInputStream fstream = new FileInputStream("../Data-files/director_only_withfilm");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            int u = row.get(result[0]);
            int v = column.get(result[1]);
            matrix[u][v] = 1;
        }
    }
    void load_musicComposer() throws FileNotFoundException, IOException{
        FileInputStream fstream = new FileInputStream("../Data-files/musiccomposer_only_withfilm");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            int u = row.get(result[0]);
            int v = column.get(result[1]);
            matrix[u][v] = 1;
        }
    }
    void load_starring() throws FileNotFoundException, IOException{
        FileInputStream fstream = new FileInputStream("../Data-files/starring_only_withfilm");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            int u = row.get(result[0]);
            for ( int i = 1; i < result.length; i++){
                if ( column.containsKey(result[i])){
                    int v = column.get(result[i]);
                    matrix[u][v] = 1;
                }else {
                    System.out.println(result[i]);
                }
            }
        }
    }
    void load_writer() throws FileNotFoundException, IOException{
        FileInputStream fstream = new FileInputStream("../Data-files/writer_only_withfilm");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word; 
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            int u = row.get(result[0]);
            int v = column.get(result[1]);
            matrix[u][v] = 1;
        }
    }
    void load_producer() throws FileNotFoundException, IOException{
        FileInputStream fstream = new FileInputStream("../Data-files/producer_only_withfilm");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            int u = row.get(result[0]);
            int v = column.get(result[1]);
            matrix[u][v] = 1;
        }
    }
    void load_dcterm() throws FileNotFoundException, IOException{
        FileInputStream fstream = new FileInputStream("../Data-files/dcterm_onlywithfilm");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            int u = row.get(result[0]);
            for ( int i = 1; i < result.length; i++){
                if ( column.containsKey(result[i])){
                    int v = column.get(result[i]);
                   matrix[u][v] = 1;
                }else {
                    System.out.println(result[i]);
                }
            }     
        }
    }
    
    void print_matrix() throws IOException{
        File file = new File("../Data-files/matrix");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        for ( int i = 0; i < row.size(); i++ ) {
           for ( int j = 0; j < column.size(); j++ ) {
             bw.write( matrix[i][j] + " ");
           }
           bw.write( "\n");
       }
    }
    
    public static void main(String args[]) throws IOException {
        matrixForming mat = new matrixForming();
        
        mat.load_row();
        mat.load_column();
        mat.initialise_matrix();
        mat.load_director();
        mat.load_producer();
        mat.load_musicComposer();
        mat.load_writer();
        mat.load_starring();
        mat.load_dcterm();
        mat.print_matrix();    
    }
}
