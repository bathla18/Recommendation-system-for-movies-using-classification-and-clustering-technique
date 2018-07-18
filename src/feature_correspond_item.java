
package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class feature_correspond_item {
    Map<String, Vector<String> > item_feature  = new HashMap();
    void load_map_dcterm() throws IOException
    {
        
        FileInputStream fstream = new FileInputStream("../Data-files/dcterm_onlywithfilm");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        while ((word = br.readLine()) != null) {
            Vector<String> v = new Vector<String>();
            String[] result = word.split(" ");
            if ( item_feature.containsKey(result[0]) ){
                for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }else {
                   item_feature.put(result[0], v);
                   for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }
        }   
    }
    void load_map_writer() throws IOException
    {
        
        FileInputStream fstream = new FileInputStream("../Data-files/writer_only_withfilm");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        while ((word = br.readLine()) != null) {
            Vector<String> v = new Vector<String>();
            String[] result = word.split(" ");
            if ( item_feature.containsKey(result[0]) ){
                for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }else {
                   item_feature.put(result[0], v);
                   for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }
        }
    }
    
    void load_map_musiccomposer() throws IOException
    {
        
        FileInputStream fstream = new FileInputStream("../Data-files/musiccomposer_only_withfilm");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        while ((word = br.readLine()) != null) {
            Vector<String> v = new Vector<String>();
            String[] result = word.split(" ");
            if ( item_feature.containsKey(result[0]) ){
                for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }else {
                   item_feature.put(result[0], v);
                   for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }
        } 
    }
    
    void load_map_producer() throws IOException
    {
        
        FileInputStream fstream = new FileInputStream("../Data-files/producer_only_withfilm");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        while ((word = br.readLine()) != null) {
            Vector<String> v = new Vector<String>();
            String[] result = word.split(" ");
            if ( item_feature.containsKey(result[0]) ){
                for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }else {
                   item_feature.put(result[0], v);
                   for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }
        } 
    }
    
    void load_map_starring() throws IOException
    {
        
        FileInputStream fstream = new FileInputStream("../Data-files/starring_with_film");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        while ((word = br.readLine()) != null) {
            Vector<String> v = new Vector<String>();
            String[] result = word.split(" ");
            if ( item_feature.containsKey(result[0]) ){
                for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }else {
                   item_feature.put(result[0], v);
                   for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }
        } 
    }
    
    void load_map_director() throws IOException
    {
        
        FileInputStream fstream = new FileInputStream("../Data-files/director_only_withfilm");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        while ((word = br.readLine()) != null) {
            Vector<String> v = new Vector<String>();
            String[] result = word.split(" ");
            if ( item_feature.containsKey(result[0]) ){
                for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }else {
                   item_feature.put(result[0], v);
                   for ( int i = 1; i < result.length; i++ ) {   
                    item_feature.get(result[0]).addElement(result[i]);
                }
            }
        } 
    }
    void print_map() throws IOException{
        File file = new File("../Data-files/feature_correspond_item");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        Iterator iterator = item_feature.keySet().iterator(); 
        int u = 0;
        System.out.print("an" + item_feature.size());
        while (iterator.hasNext()) {
            String key = iterator.next().toString();
            bw.write(key + "@");
            System.out.print ( key);
            Vector vec = item_feature.get(key);
            System.out.println (vec.size());
            Enumeration e = vec.elements();
            while (e.hasMoreElements()) {         
                bw.write(" " + e.nextElement());
            }  
            bw.write("\n");
            u++;
       }
        System.out.print(u);
                
    }
    public static void main(String args[]) throws IOException {
        feature_correspond_item item = new feature_correspond_item();
        item.load_map_writer();
        item.print_map();
    }
}
