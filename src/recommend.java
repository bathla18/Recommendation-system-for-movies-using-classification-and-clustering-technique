
package project;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class recommend {
    int[][] user_item = new int[944][1683];
    Float[][] centroid = new Float[101][4];
    Map<Integer,String> movielen_dbpedia = new HashMap();
    Map<String, List<String>> feature_correspond_item = new HashMap<String, List<String>>();
    Map<Integer, List<Integer>> cluster_with_user = new HashMap<Integer,List<Integer>>();
    Map<String,Integer> file_occupation = new HashMap();
    Map<String,Integer> pin = new HashMap();
    Map<String,List<String>> user_data = new HashMap <String, List<String>>();
    
    void read_user_item() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/user_item_correct");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        int i = 1,j = 0;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            for ( j = 0; j < result.length; j++){
                user_item[i][j] = Integer.parseInt(result[j]);
            }
            i++;
        }
        System.out.println ( "user_item read");
    }
    
    void read_centroid () throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/centroid_100_withoutuserid.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        int i = 1,j = 0;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            for ( j = 0; j <= result.length-1; j++){
                centroid[i][j] = Float.parseFloat(result[j]);
            }
            i++;
        }
        System.out.println("centroid read");
    }
    
    void read_movielen_dbpedia() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/mapping-movielens-dbpedia.csv");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        int i = 1,j = 0;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            movielen_dbpedia.put(Integer.parseInt(result[0]), result[1]);
        }
        System.out.print(movielen_dbpedia.size());
        
    }
    
    void read_feature_item() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/feature_correspond_item");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        int j = 0;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            List<String> l = new ArrayList<String>();
            for ( j = 1; j < result.length; j++){
                l.add(result[j]);
            }
            feature_correspond_item.put(result[0], l);
        }
        System.out.println ( "feature read done ");
    }
    
    void read_cluster_with_user() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/user_belong_clusters_witout_id");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        int j = 0;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            List<Integer> l = new ArrayList<Integer>();
            for ( j = 1; j < result.length; j++){
                l.add(Integer.parseInt(result[j]));
            }
            cluster_with_user.put(Integer.parseInt(result[0]), l);
        }
        System.out.println("read cluster_with_user done");
    }
    
    void read_file_occupation() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/file_occ.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
       
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            file_occupation.put(result[0], Integer.parseInt(result[1]));
        }
        System.out.println ( "file occupation done" );
    }
    void read_pin() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/pin");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
       
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            pin.put(result[0],Integer.parseInt(result[1]));
        }
        System.out.println (" pin read");
        
    }
    
    void read_user_data() throws FileNotFoundException, IOException
    {
        recommend r = new recommend();
        FileInputStream fstream = new FileInputStream("../Data-files/u.user");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        int j = 0;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            List<String> l = new ArrayList<String>();
            for ( j = 1; j < result.length; j++){
                l.add(result[j]);
            }
            l.add(result[0]);  //password
            user_data.put(result[0], l);
            
        }
    }
    
    boolean verify(String userid, String password){
        if ( user_data.containsKey(userid)){
            List<String> l = user_data.get(userid);
            String passwd = l.get(4);
            System.out.println (passwd );
            if ( passwd.equals(password)){
                return true;
            }
        }
        return false;
    }
    
    int distance_minimum_cluster( String userid )
    {
        List<String> l = user_data.get(userid);
        System.out.print(l.size());
        int age = Integer.parseInt(l.get(0));
        String gender = l.get(1);
        String occupation = l.get(2);
        String pin = l.get(3);
        System.out.println ( " "+ gender + " "+ occupation + " " + pin );*/
        return 0;
    }
    
    void cal_result( String userid){
        recommend r = new recommend();
        r.distance_minimum_cluster(userid);
    }
   void load_data() throws IOException{
         recommend r = new recommend();
         r.read_user_item();
         r.read_centroid();
         r.read_movielen_dbpedia();
         r.read_feature_item();
         r.read_cluster_with_user();
         r.read_file_occupation();
         r.read_user_data();
         r.read_pin();     
    }
}
