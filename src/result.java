
package project;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class result extends javax.swing.JFrame {

    int num = 0;
    int x = 250;
    int y = 0;
    Set<String> result_r,result_e;
    double accuracy;
    Map<String, List<String>> movie_all;
    int user;
    
    public result( Set<String> result_1, Set<String> result_2, double accuracy1, Map<String, List<String>> m, int user1 ) {
        result_r = result_1;
        result_e = result_2;
        accuracy = accuracy1;
        movie_all = m;
        user = user1;
        initComponents();
        setSize(1366,768);
    }
    result(){
        setSize(1366,768);
    }
    public void setvalues_r()
    {
        String str;
        Iterator iter = result_r.iterator();
        while (iter.hasNext()) {
            str =  iter.next().toString();
            if ( movie_all.containsKey(str)){
                List<String> l = movie_all.get(str);
                System.out.println ( l.size());
                if ( l.size() > 4){
                    print(l,str);
                }
            }
        }
        if ( user == 0 ){
            double accuracy2 = accuracy * 100;
            jTextField1.setText(Double.toString((int)accuracy2));
        }else {
            jTextField1.hide();
            jLabel2.hide();
        }
    }
    
    public void setvalues_e()
    {
        String str;
        Iterator iter = result_e.iterator();
        System.out.println ( result_e.size() + "in print");
        while (iter.hasNext()) {
            str =  iter.next().toString();
            if ( movie_all.containsKey(str)){
                List<String> l = movie_all.get(str);
                if ( l.size() > 4){
                    print(l,str);
                }
            }
        }
        System.out.println ( "user = " + user);
        if ( user == 0 ){
            double accuracy2 = accuracy * 100;
            jTextField1.setText(Double.toString((int)accuracy2));
        }else {
            jTextField1.hide();
            jLabel2.hide();
        }
    }
    
    public void setvalues_a()
    {
        jTextField1.hide();
        jLabel2.hide();
        System.out.println(movie_all.size());
        for (String key : movie_all.keySet()) {
            List<String> l = movie_all.get(key);
            if ( l.size() > 4){
                print ( l, key);
            }
        }
    }
   public void print(List<String> l,String str) {
       num++;
        JPanel Panel = new JPanel();
        Panel.setSize(710, 240);
        
        JLabel number = new JLabel();
        number.setText(num + ").");
        
        JLabel line = new JLabel();
        JLabel img = new JLabel();
        
        JLabel name = new JLabel();
        name.setText("Name: ");
        
        JLabel name1 = new JLabel();
        str = refine ( str);
        name1.setText(str);
        
        JLabel director = new JLabel();
        director.setText("Director: ");
        
        JLabel director1 = new JLabel();
        str = refine ( l.get(0));
        director1.setText(str);
        
        JLabel producer = new JLabel();
        producer.setText("Producer: ");
        
        JLabel producer1 = new JLabel();
        str = refine(l.get(1));
        producer1.setText(str);
        
        JLabel music = new JLabel();
        music.setText("Music Composer: ");
        
        JLabel music1 = new JLabel();
        str = refine(l.get(2)); 
        music1.setText(str);
        
        JLabel writer = new JLabel();
        writer.setText("Writer: ");
        
        JLabel writer1 = new JLabel();
        str = refine ( l.get(3));
        writer1.setText(str);
        
        JLabel starrer = new JLabel();
        starrer.setText("Starrer: ");
        
        JLabel starrer1 = new JLabel();
        str = refine ( l.get(4));
        starrer1.setText(str);
        
        Panel.setLayout(null);
        Panel.setBackground(new java.awt.Color(255, 255, 255));
        
        Panel.add(number);
        number.setLocation(0, 110);
        number.setSize(80, 20);
        number.setFont(new java.awt.Font("Tahoma", 0, 16));
        
  //      Panel.add(img);
        img.setLocation(30, 20);
        img.setSize(150, 180);
        img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
        Panel.add(name);
        name.setLocation(175, 0);
        name.setSize(80, 40);
        name.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        Panel.add(name1);
        name1.setLocation(270, 0);
        name1.setSize(400, 40);
        name1.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        Panel.add(writer);
        writer.setLocation(175, 40);
        writer.setSize(80, 40);
        writer.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        Panel.add(writer1);
        writer1.setLocation(270, 40);
        writer1.setSize(400, 40);
        writer1.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        /*Panel.add(line);
        line.setLocation(770, 5);
        line.setSize(25, 190);*/
        
        Panel.add(director);
        director.setLocation(175, 80);
        director.setSize(80, 40);
        director.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        Panel.add(director1);
        director1.setLocation(270, 80);
        director1.setSize(400, 40);
        director1.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        Panel.add(producer);
        producer.setLocation(175, 120);
        producer.setSize(80, 40);
        producer.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        Panel.add(producer1);
        producer1.setLocation(270, 120);
        producer1.setSize(400, 40);
        producer1.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        Panel.add(starrer);
        starrer.setLocation(175, 160);
        starrer.setSize(80, 40);
        starrer.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        Panel.add(starrer1);
        starrer1.setLocation(270, 160);
        starrer1.setSize(400, 40);
        starrer1.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        Panel.add(music);
        music.setLocation(175, 200);
        music.setSize(80, 40);
        music.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        Panel.add(music1);
        music1.setLocation(270,200 );
        music1.setSize(400, 40);
        music1.setFont(new java.awt.Font("Tahoma", 0, 16));
 //       jPanel2.setLayout(null);
        
        jPanel1.add(Panel);
        Panel.setLocation(0, y);
        x = x + 245;
        jPanel1.setPreferredSize(new java.awt.Dimension(1326, x));
        y = y+245;
   }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(710, 210));
        jPanel1.setLayout(null);
        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(650, 10, 700, 750);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Accuracy");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 150, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 50, 110, 30);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton1.setText("Simple Recommendation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 330, 210, 29);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton2.setText("All Movies");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 230, 210, 29);

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton3.setText("Feature Based");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 280, 210, 29);

        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton4.setText("Log out");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(535, 20, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/thor-wallpaper-1366x768.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String str;
        num = 0;
        y = 0;
        x = 250;
        jPanel1.setSize(710, x);
        Iterator iter = result_r.iterator();
    //    System.out.println ( result_r.size() + "in print");
        while (iter.hasNext()) {
            str =  iter.next().toString();
            if ( movie_all.containsKey(str)){
                List<String> l = movie_all.get(str);
      //          System.out.println ( l.size());
                if ( l.size() > 4){
                    print(l,str);
                }
            }
        }
        System.out.println ( "user = " + user);
        if ( user == 0 ){
            jLabel2.show();jTextField1.show();
            double accuracy2 = accuracy * 100;
            jTextField1.setText(Double.toString((int)accuracy2));
        }else {
            
            jTextField1.hide();jLabel2.hide();
        }
        jButton3.hide();jButton1.show();jButton2.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String str;
        num = 0;
        y = 0;
        x = 250;
        jPanel1.setSize(710, x);
        Iterator iter = result_e.iterator();
        //System.out.println ( result_e.size() + "in print");
        while (iter.hasNext()) {
            str =  iter.next().toString();
            if ( movie_all.containsKey(str)){
                List<String> l = movie_all.get(str);
          //      System.out.println ( l.size());
                if ( l.size() > 4){
                    print(l,str);
                }
            }
        }
        System.out.println ( "user = " + user);
        if ( user == 0 ){
            jLabel2.show();jTextField1.show();
            double accuracy2 = accuracy * 100;
            jTextField1.setText(Double.toString((int)accuracy2));
        }else {
            jTextField1.hide();jLabel2.hide();
        }
        jButton1.hide();jButton2.show();jButton3.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.hide();jLabel2.hide();
        num = 0;
        y = 0;
        x = 250;
        jPanel1.setSize(710, x);
     //   System.out.println(movie_all.size());
        for (String key : movie_all.keySet()) {
            List<String> l = movie_all.get(key);
          //  System.out.println ( l.size());
            if ( l.size() > 4){
                print ( l, key);
            }
        }
        jButton2.hide();jButton1.show();jButton3.show();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    String refine ( String str)
    {
        String str_1 = "";
        int u = 0;
        for ( int i = 0; i < str.length(); i++){
            if ( u == 1){
                if ( str.charAt(i) == '_'){
                    str_1 = str_1 + ' ';
                }else 
                    str_1 = str_1 + str.charAt(i);
                
            }
            if ( u == 0 && str.charAt(i) == 'e' && str.charAt(i+1) == '/' ){
                u = 1;
                i++;
            }
        }
        return str_1;
    }
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       new login().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

   
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
