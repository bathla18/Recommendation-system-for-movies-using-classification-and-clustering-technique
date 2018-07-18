/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ankit
 */
public class unique {
     public static void main(String args[]) throws IOException{
         Set<String> unique = new HashSet<String>();
         FileInputStream fstream = new FileInputStream("../Data-files/musiccomposer_only");
        // Get the object of DataInputStream
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        //Read File Line By Line
        int l = 0;
        
        while ((strLine = br.readLine()) != null) {
            unique.add(strLine);
            l++;
        }
        System.out.println(unique.size() + "\n" + l);
         
     }
    
}
