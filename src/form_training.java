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
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ANKI
 */
public class form_training {
    int[][] matrix = new int[944][1684];
    Map<String, Vector<String> > item_feature  = new HashMap();
    Map<Integer, String > mapping  = new HashMap();
    void load_matrix() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/user_item");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        int i = 1;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            for ( int j = 0; j < result.length; j++ ){
                matrix[i][j+1] = Integer.parseInt(result[j]);
            }
            i++;
        }
    }
    void load_item_feature()
    {
        try {
            FileInputStream fstream = new FileInputStream("../Data-files/feature_correspond_item");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String word;
            while ((word = br.readLine()) != null) {
                Vector<String> v = new Vector<String>();
                String[] result = word.split(" ");
                item_feature.put(result[0], v);
                for ( int i = 1; i < result.length; i++ ) {
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(form_training.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void load_movilen_dbpedia()
    {
        try {
            FileInputStream fstream = new FileInputStream("../Data-files/movielen_dbpedia");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String word;
            while ((word = br.readLine()) != null) {
                String[] result = word.split(" ");
                mapping.put(Integer.parseInt(result[0]), result[1]);
            }
            System.out.println(mapping.size());
        } catch (IOException ex) {
            Logger.getLogger(form_training.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void print_training() throws IOException
    {
        File file = new File("../Data-files/feature_correspond_item");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        for ( int i = 1; i < 944; i++){
            for ( int j = 1; j < 1683; j++){
                if ( matrix[i][j] != 0 ){
                    bw.write(i);
                    String str = mapping.get(j);
                    bw.write(" " + str);
                    if ( item_feature.containsKey(str)){
                        Vector vec = item_feature.get(str);  
                        Enumeration e = vec.elements();
                        while (e.hasMoreElements()) {         
                            bw.write(" " + e.nextElement());
                        }
                        bw.write(" " + matrix[i][j]);
                        bw.write("\n");
                    }else {
                        System.out.println("not found " + j);
                    }
                }
            }
        }
    }
    public static void main(String args[]) throws IOException {
        form_training f = new form_training();
        f.load_matrix();
        f.load_movilen_dbpedia();
        f.load_item_feature();
        f.print_training();
    }
}
