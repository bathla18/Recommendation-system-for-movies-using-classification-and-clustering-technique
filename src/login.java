package project;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {
    
    int[][] user_item = new int[944][1683];
    double[][] centroid = new double[101][4];
    Map<Integer,String> movielen_dbpedia = new HashMap();
    Map<String, List<String>> feature_correspond_item = new HashMap<>();
    Map<Integer, List<Integer>> cluster_with_user = new HashMap<>();
    Map<String,Integer> file_occupation = new HashMap();
    Map<String,Integer> pin = new HashMap();
    Map<String,List<String>> user_data = new HashMap <>();
    
    int new_user = 0;
    double accuracy;
    
    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(1030, 290, 220, 30);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1030, 244, 150, 40);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(1030, 410, 220, 30);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sign in");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1030, 470, 180, 40);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Register");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1030, 540, 220, 40);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1030, 360, 220, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/141340.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 100, 1370, 620);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Recommendator System on Movies");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void read_user_item() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/user_item_correct");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
    
        String word;
        int i = 1,j;
        
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            for ( j = 0; j < result.length; j++){
                user_item[i][j] = Integer.parseInt(result[j]);
            }
            i++;
        }
        
        System.out.println ( "user_item read");
    
    }
    
    public void read_centroid () throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/centroid_100_withoutuserid.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
    
        String word;
        int i = 1,j;
        
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            for ( j = 0; j <= result.length-1; j++){
                centroid[i][j] = Double.parseDouble(result[j]);
            }
            i++;
        }
        
        System.out.println("centroid read");
    
    }
    
    public void read_movielen_dbpedia() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/mapping-movielens-dbpedia.csv");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
    
        String word;
        int i = 1,j;
        
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            movielen_dbpedia.put(Integer.parseInt(result[0]), result[1]);
        }
    
    }
    
    public void read_feature_item() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/feature_correspond_item");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
  
        String word;
        int j;
        
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            List<String> l = new ArrayList<>();
            for ( j = 1; j < result.length; j++){
                l.add(result[j]);
            }
            feature_correspond_item.put(result[0], l);
        }
        
        System.out.println ( "feature read done ");
    }
    
    public void read_cluster_with_user() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/user_belong_clusters_witout_id");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        
        String word;
        int j;
        
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            List<Integer> l = new ArrayList<>();
            for ( j = 1; j < result.length; j++){
                l.add(Integer.parseInt(result[j]));
            }
            cluster_with_user.put(Integer.parseInt(result[0]), l);
        }
        
        System.out.println("read cluster_with_user done");
    }
    
    public void read_file_occupation() throws FileNotFoundException, IOException
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
    
    public void read_pin() throws FileNotFoundException, IOException
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
    
    public void read_user_data() throws FileNotFoundException, IOException
    {
        recommend r = new recommend();
        FileInputStream fstream = new FileInputStream("../Data-files/u.user");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        
        String word;
        int j;
        
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            List<String> l = new ArrayList<>();
            for ( j = 1; j < result.length; j++){
                l.add(result[j]);
            }
            l.add(result[0]);  //password
            user_data.put(result[0], l);
            
        }
    }
    
    public boolean verify(String userid, String password) throws IOException{
        read_user_data();
        System.out.println ( user_data.size());
        int u  = 0;
        if ( user_data.containsKey(userid)){
            List<String> l = user_data.get(userid);
            String passwd = l.get(4);
            if ( passwd.equals(password)){
                read_user_item();
                read_centroid();
                read_movielen_dbpedia();
                read_feature_item();
                read_cluster_with_user();
                read_file_occupation();
                read_pin();
                cal_result(userid);
                u = 1;
            }
        }
        return u != 0;
    }
    
    int convert_age_value(int b)
    {       
        if ( b >= 0 && b <= 20 ) {
			return  1;
	}else if ( b > 20 && b <= 30 ) {
			return 2;
	}else if ( b > 30 && b <= 40 ) {
			return  3;
	}else if ( b > 40 && b <= 50 ) {
			return  4;
	}else if ( b > 50 && b <= 60 ) {
			return  5;
	}else if ( b > 60 && b <= 100 ) {
			return 6;
        }else {
            return 7;
        }
    }
    
    int distance_minimum_cluster( String userid )
    {
        List<String> l = user_data.get(userid);
        double age = (double)convert_age_value(Integer.parseInt(l.get(0)));
        String gender = l.get(1);
        double gender_int;
        if ( gender.equals("M")){
            gender_int = 1.0;
        }else {
            gender_int = 0.0;
        }
        double occupation_int = (double)file_occupation.get(l.get(2));
        double pin_int = (double)pin.get(l.get(3));
        int min = 10000;
        double min_value = 100000.0;
        for ( int i = 1; i <= 100; i++){
            double dis = Math.sqrt(((centroid[i][0]-age)*(centroid[i][0]-age)) + ((centroid[i][1]-gender_int)*(centroid[i][1]-gender_int)) + ((centroid[i][2]-occupation_int)*(centroid[i][2]-occupation_int)) + ((centroid[i][1]-pin_int)*(centroid[i][1]-pin_int)));
            if ( dis <= min_value){
                min_value = dis;
                min = i;
            }
        }
        return min + 1;
    }
    
    void cal_result( String userid){
        
        Set<String> result = new HashSet();
        Set<String> result_error = new HashSet();
        int index_cluster =  distance_minimum_cluster(userid);
        System.out.println ( index_cluster + "ank");
        List<Integer> l = cluster_with_user.get(index_cluster);
   
        for (Integer l1 : l) {
            if ( l1 == Integer.parseInt(userid)){
                continue;
            }
        
            System.out.println ( l1);
            Set<String> result_user = new HashSet();
            Map<String, Integer> m = new HashMap<>();
            for (int j = 0; j < 1683; j++) {
                if (user_item[l1][j] == 1) {
                    if ( movielen_dbpedia.containsKey(j+1)){
                        String movie_name = movielen_dbpedia.get(j+1);
                        if ( feature_correspond_item.containsKey(movie_name)){
                            result_user.add(movie_name);
                            result_error.add(movie_name);
                            List<String> l_1 = feature_correspond_item.get(movie_name);
                            for (String l_11 : l_1) {
                                if (!m.containsKey(l_11)) {
                                    m.put(l_11, 0);
                                } else {
                                    int y = m.get(l_11);
                                    m.put(l_11, y + 1);
                                }
                            }
                        }
                    }
                }
            }
            
            int max_result = 0;
            Iterator iterator = result_user.iterator();
            TreeMap<Integer,List<String>> movie_with_weight = new TreeMap();
            
            while ( iterator.hasNext())
            {
                String movie = iterator.next().toString();
                List<String> l_2 =  feature_correspond_item.get(movie);
                int u = 0;
                for (String l_21 : l_2) {
                    u = u + m.get(l_21);
                }             
                if ( u > max_result ){
                    max_result = u;
                }
                if ( !movie_with_weight.containsKey(u)){
                    List<String> insert = new ArrayList();
                    insert.add(movie);
                    movie_with_weight.put(u,insert);
                }else {
                    movie_with_weight.get(u).add(movie);
                }
            }int w = 0;
           while ( w != 5000){
               if ( movie_with_weight.containsKey(max_result-w)){
                   List<String> l_3 = movie_with_weight.get(max_result-w);
                   for (String l_31 : l_3) {
                       result.add(l_31);
                   }
               }
               w++;
           }
        }
        System.out.println ( "sugessted movies");
        Iterator iterator_r = result.iterator();
        System.out.println ( result_error.size());
        
        if ( new_user == 0 ){
            int u_1 = 0,u_2 = 0;
            for ( int i = 0; i < 1683; i++){
                  if ( user_item[Integer.parseInt(userid)][i] == 1 ){
                        if ( movielen_dbpedia.containsKey(i+1)){
                            String movie_name = movielen_dbpedia.get(i+1);
                            if ( result_error.contains(movie_name)){
                                   u_1++;
                            }
                            u_2++;
                        }
                  }
            }
    
            System.out.println ( result_error.size() + " " + result.size());
            System.out.println ( u_1 + " "+ u_2);
            System.out.println ( "accuracy is  = " + (double)u_1/(double)u_2);  //precision
            accuracy = (double)u_1/(double)u_2;
        
        }
        
        new login_next(result,result_error,accuracy,feature_correspond_item,new_user).setVisible(true);
        this.setVisible(false);
    
    }
    
    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setForeground(Color.yellow);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(Color.yellow);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel5MouseExited
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      
        String userid = jTextField1.getText();
        String password = jPasswordField1.getText();    
        
        while (true){
            try {
                if ( Integer.parseInt(userid) > 943 ){
                    new_user = 1;
                }
                boolean result;    
                result = verify(userid,password);    
                if ( result == true){
                    System.out.print("login");
                    break;
                }else {
                    System.out.println("user not exist");
                    JOptionPane.showMessageDialog(null,"user not exist or password may be incorrect");
                    break;
                }
            } catch (IOException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
     
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       new register().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
