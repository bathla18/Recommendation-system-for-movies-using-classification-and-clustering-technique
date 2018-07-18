package project;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class register extends javax.swing.JFrame {
    Map<String,List<String>> user_data = new HashMap <>();
    
    public register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(940, 80, 100, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(1040, 90, 230, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Age");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(940, 140, 60, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(1040, 150, 230, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Sex");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(940, 220, 50, 20);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(1040, 220, 50, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Occupation");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(930, 280, 110, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "technician", "writer", "executive", "administrator", "student", "lawyer", "educator", "scientist", "entertainment", "programmer", "librarian", "homemaker", "artist", "engineer", "marketing", "healthcare", "retired", "salesman", "doctor", "other", "none" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(1040, 290, 230, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Pincode");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(930, 360, 100, 20);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00000", "01002", "01040", "01080", "01331", "01375", "01581", "01602", "01701", "01720", "01754", "01810", "01824", "01913", "01915", "01940", "01945", "01960", "01970", "02110", "02113", "02125", "02136", "02138", "02139", "02140", "02143", "02146", "02154", "02159", "02176", "02215", "02320", "02324", "02341", "02859", "02903", "02918", "03052", "03060", "03062", "03261", "03755", "03869", "04102", "04988", "05001", "05146", "05201", "05452", "05464", "05779", "06059", "06260", "06333", "06355", "06365", "06371", "06405", "06437", "06472", "06492", "06512", "06513", "06518", "06779", "06811", "06906", "06927", "07029", "07030", "07039", "07102", "07204", "07310", "07733", "08034", "08043", "08052", "08105", "08360", "08403", "08534", "08610", "08816", "08832", "08904", "09645", "10003", "10010", "10011", "10016", "10018", "10019", "10021", "10022", "10025", "10309", "10314", "10522", "10707", "10960", "11101", "11201", "11211", "11217", "11231", "11238", "11577", "11701", "11727", "11753", "11758", "11787", "12065", "12180", "12205", "12345", "12550", "12603", "12866", "13210", "13820", "14085", "14211", "14216", "14476", "14534", "14627", "14850", "14853", "15017", "15203", "15213", "15217", "15222", "15232", "15235", "15237", "15610", "16125", "16506", "16509", "16801", "16803", "17036", "17110", "17325", "17331", "17345", "17604", "17870", "17961", "18015", "18053", "18301", "18505", "19047", "19102", "19104", "19146", "19149", "19341", "19382", "19422", "19711", "19716", "19807", "20001", "20003", "20006", "20008", "20009", "20015", "20057", "20064", "20090", "20657", "20685", "20707", "20723", "20755", "20770", "20784", "20817", "20850", "20854", "20879", "20902", "20910", "21010", "21012", "21044", "21114", "21201", "21206", "21208", "21218", "21227", "21250", "21911", "22003", "22030", "22202", "22206", "22207", "22306", "22902", "22903", "22904", "22906", "22911", "22932", "22973", "23092", "23112", "23226", "23227", "23237", "23322", "23509", "24060", "25652", "26241", "26506", "27105", "27249", "27502", "27510", "27511", "27514", "27606", "27705", "27708", "27713", "28018", "28450", "28480", "28734", "28806", "28814", "29201", "29205", "29206", "29210", "29301", "29379", "29440", "29464", "29631", "29646", "29678", "30002", "30011", "30030", "30033", "30040", "30067", "30068", "30078", "30093", "30220", "30329", "30350", "30606", "30803", "31211", "31404", "31820", "31909", "32067", "32114", "32250", "32301", "32303", "32605", "32707", "32712", "32789", "33066", "33205", "33308", "33319", "33484", "33556", "33716", "33755", "33763", "33765", "33775", "33884", "34105", "34656", "35802", "36106", "36117", "37076", "37212", "37235", "37411", "37412", "37725", "37771", "37777", "37901", "38115", "38401", "38866", "39042", "39762", "40205", "40206", "40243", "40256", "40503", "40504", "40515", "41850", "42101", "42141", "42459", "42647", "43017", "43085", "43201", "43202", "43204", "43212", "43215", "43221", "43512", "43537", "44074", "44092", "44106", "44124", "44133", "44134", "44212", "44224", "44265", "44405", "44648", "44691", "45218", "45243", "45439", "45660", "45680", "45810", "46005", "46032", "46260", "46538", "47024", "47130", "47401", "47905", "47906", "48043", "48076", "48103", "48105", "48118", "48197", "48322", "48446", "48823", "48825", "48911", "49036", "49428", "49508", "49512", "49705", "49931", "49938", "50112", "50233", "50266", "50311", "50322", "50325", "50613", "50670", "51157", "51250", "52241", "52245", "52246", "52302", "53066", "53115", "53144", "53171", "53188", "53202", "53210", "53211", "53214", "53703", "53705", "53706", "53711", "53713", "53715", "54248", "54302", "54467", "54494", "54901", "55013", "55021", "55038", "55104", "55105", "55106", "55107", "55108", "55109", "55113", "55116", "55117", "55122", "55125", "55128", "55303", "55305", "55320", "55337", "55343", "55345", "55346", "55369", "55406", "55408", "55409", "55412", "55413", "55414", "55417", "55420", "55422", "55423", "55428", "55436", "55439", "55443", "55454", "56321", "56567", "57197", "58202", "58644", "59717", "59801", "60005", "60007", "60008", "60035", "60067", "60089", "60090", "60115", "60135", "60152", "60187", "60201", "60202", "60302", "60402", "60440", "60466", "60476", "60515", "60613", "60614", "60615", "60626", "60630", "60641", "60657", "60659", "60804", "61073", "61401", "61455", "61462", "61755", "61801", "61820", "62522", "62901", "62903", "63021", "63033", "63044", "63108", "63119", "63129", "63130", "63132", "63146", "63304", "63645", "64118", "64131", "64153", "65203", "66046", "66215", "66221", "66315", "67401", "68106", "68147", "68503", "68504", "68767", "70116", "70124", "70403", "70802", "70808", "71457", "71701", "73013", "73034", "73071", "73132", "73162", "73439", "74075", "74078", "74101", "75006", "75013", "75094", "75204", "75206", "75218", "75230", "75240", "76013", "76059", "76111", "76201", "76234", "76309", "77005", "77008", "77009", "77042", "77048", "77073", "77081", "77380", "77459", "77504", "77801", "77840", "77841", "77845", "77904", "78155", "78205", "78209", "78212", "78213", "78264", "78390", "78602", "78628", "78704", "78739", "78741", "78746", "78750", "78756", "79070", "79508", "80027", "80123", "80127", "80209", "80227", "80228", "80236", "80302", "80303", "80521", "80525", "80526", "80538", "80913", "80919", "81648", "82435", "83686", "83702", "83709", "83716", "83814", "84010", "84103", "84105", "84107", "84116", "84302", "84408", "84601", "84604", "85016", "85032", "85202", "85210", "85233", "85251", "85258", "85281", "85282", "85710", "85711", "85719", "87501", "87544", "89104", "89503", "89801", "90008", "90016", "90019", "90034", "90036", "90064", "90095", "90210", "90247", "90254", "90291", "90405", "90630", "90703", "90804", "90814", "90840", "91040", "91105", "91201", "91206", "91335", "91344", "91351", "91505", "91606", "91711", "91903", "91919", "92020", "92037", "92064", "92093", "92103", "92110", "92113", "92115", "92121", "92154", "92374", "92507", "92626", "92629", "92653", "92660", "92688", "92705", "93003", "93055", "93063", "93101", "93109", "93117", "93402", "93550", "93555", "93612", "93711", "94025", "94040", "94043", "94086", "94115", "94117", "94131", "94143", "94305", "94306", "94403", "94533", "94551", "94560", "94583", "94591", "94608", "94612", "94618", "94619", "94702", "94703", "94708", "94720", "94920", "95014", "95032", "95050", "95064", "95076", "95110", "95123", "95129", "95161", "95316", "95403", "95453", "95468", "95521", "95628", "95660", "95662", "95821", "95823", "95938", "96349", "96754", "96819", "97006", "97007", "97124", "97203", "97208", "97212", "97214", "97215", "97229", "97232", "97301", "97302", "97330", "97365", "97403", "97405", "97408", "97520", "98006", "98027", "98034", "98038", "98072", "98101", "98102", "98103", "98117", "98121", "98133", "98199", "98225", "98257", "98281", "98405", "98501", "98620", "98682", "98801", "99206", "99603", "99687", "99709", "99835", "E2A4H", "E2E3R", "K7L5J", "L1V3W", "L9G2B", "M4J2K", "M7A1A", "N2L5N", "N4T1A", "R3T5K", "T8H1N", "V0R2H", "V0R2M", "V1G4L", "V3N4P", "V5A2B", "Y1A6B" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(1040, 360, 230, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("City");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(930, 430, 80, 20);

        jTextField3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(1040, 430, 230, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Register");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1080, 520, 180, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Back");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 20, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/Register_page_background2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void register(int user_id,String age,String gender,String occupation, String pincode) throws IOException{

        File file = new File("../Data-files/u.user");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            List<String> l = new ArrayList<>();
            l.add(age);l.add(gender);l.add(occupation);l.add(pincode);
            System.out.println (String.valueOf(user_id) + " "+ age+ " "+gender+" "+occupation+ " "+ pincode );
            user_data.put(String.valueOf(user_id), l);
            String str = String.valueOf(user_id);
            System.out.println ( l.size()+ " "+ user_data.size());
            Iterator iterator = user_data.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next().toString();
                l = user_data.get(key);
                bw.write(key);
                for (String l1 : l) {
                    bw.write(" " + l1);
                }
                bw.write("\n");
            }
        }
        
        JOptionPane.showMessageDialog(null,"your user id is = "+ user_id, "\n your password is = "+ user_id, 1);
    
    }  
    
    public int read_user_data() throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("../Data-files/u.user");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String word;
        int j;
        int max = 0;
        while ((word = br.readLine()) != null) {
            String[] result = word.split(" ");
            List<String> l = new ArrayList<>();
            for ( j = 1; j < result.length; j++){
                l.add(result[j]);
            }
            user_data.put(result[0], l);
            if ( max < Integer.parseInt(result[0])){
                max = Integer.parseInt(result[0]);
            }
        }        
        return max;
    }
    
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
            int user_id = read_user_data();
            String age = jTextField2.getText();
            String gender = jComboBox2.getSelectedItem().toString();
            String occupation = jComboBox1.getSelectedItem().toString();
            String pincode = jComboBox3.getSelectedItem().toString();
            register(user_id+1,age,gender,occupation,pincode);
            this.setVisible(false);
            new login().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
         jLabel8.setForeground(Color.yellow);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setForeground(Color.yellow);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
       jLabel9.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       new login().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    
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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
