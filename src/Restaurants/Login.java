
package Restaurants;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import Restaurants.Restaurants;
import java.awt.Dimension;

import java.sql.*;
/**
 *
 * @author ghinc
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setTitle("Loggin");
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextFieldUsername1 = new javax.swing.JTextField();
        jlblUserName2 = new javax.swing.JLabel();
        jlblpasswd2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButtonLog1 = new javax.swing.JButton();
        jButtonExit1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabelUser = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setLayout(null);

        jPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyReleased(evt);
            }
        });
        jPanel5.add(jPasswordField2);
        jPasswordField2.setBounds(180, 150, 300, 30);

        jTextFieldUsername1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldUsername1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsername1ActionPerformed(evt);
            }
        });
        jTextFieldUsername1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldUsername1KeyReleased(evt);
            }
        });
        jPanel5.add(jTextFieldUsername1);
        jTextFieldUsername1.setBounds(180, 70, 300, 30);

        jlblUserName2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblUserName2.setForeground(new java.awt.Color(255, 255, 255));
        jlblUserName2.setText("Username");
        jPanel5.add(jlblUserName2);
        jlblUserName2.setBounds(180, 50, 170, 20);

        jlblpasswd2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblpasswd2.setForeground(new java.awt.Color(255, 255, 255));
        jlblpasswd2.setText("Password");
        jPanel5.add(jlblpasswd2);
        jlblpasswd2.setBounds(180, 120, 150, 30);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel3);
        jPanel3.setBounds(180, 100, 300, 3);

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6);
        jPanel6.setBounds(180, 180, 300, 3);

        jButtonLog1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonLog1.setText("LOGIN");
        jButtonLog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLog1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonLog1);
        jButtonLog1.setBounds(180, 200, 73, 23);

        jButtonExit1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExit1.setText("EXIT");
        jButtonExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExit1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonExit1);
        jButtonExit1.setBounds(260, 200, 73, 23);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("View Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox1);
        jCheckBox1.setBounds(361, 200, 120, 23);

        jLabelUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jLabelUser);
        jLabelUser.setBounds(340, 50, 140, 20);

        jLabelPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPass.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jLabelPass);
        jLabelPass.setBounds(340, 130, 140, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant.jpg"))); // NOI18N
        jPanel5.add(jLabel2);
        jLabel2.setBounds(0, 0, 560, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsername1ActionPerformed

    private void jButtonLog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLog1ActionPerformed
        if(jTextFieldUsername1.getText().trim().isEmpty() && jPasswordField2.getText().trim().isEmpty()){
            jLabelUser.setText("Username is empty!");
            jLabelPass.setText("Password is empty!");
        }
        else if(jTextFieldUsername1.getText().trim().isEmpty()){
            jLabelUser.setText("Username is empty!");
        }
        else if(jPasswordField2.getText().trim().isEmpty()){
            jLabelPass.setText("Password is empty!");
        }
        else if(jTextFieldUsername1.getText().equals("admin") && jPasswordField2.getText().equals("admin")){
            this.setVisible(false);
            AdminPanel ceva = new AdminPanel();
            ceva.setVisible(true);
            
        }
        else {
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root","");
             String sql = "Select * from loginusers where username=? and password=?";
             PreparedStatement pst=con.prepareStatement(sql);
             pst.setString(1,jTextFieldUsername1.getText());
             pst.setString(2,jPasswordField2.getText());
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
                 JOptionPane.showMessageDialog(null,"Username and Password matched!!!");
                 Restaurants ghincea=new Restaurants();
                 ghincea.setVisible(true);
                 setVisible(false);
             }
             else
             {
                JOptionPane.showMessageDialog(null,"Username and Password don't match!!!"); 
                jTextFieldUsername1.setText("");
                jPasswordField2.setText("");
             }
             con.close();
         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
         
    }//GEN-LAST:event_jButtonLog1ActionPerformed

    private void jButtonExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExit1ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButtonExit1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            jPasswordField2.setEchoChar((char)0);
        }
        else{
            jPasswordField2.setEchoChar('*');
        }   
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextFieldUsername1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsername1KeyReleased
        
        jLabelUser.setText("");
    }//GEN-LAST:event_jTextFieldUsername1KeyReleased

    private void jPasswordField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyReleased
        
        jLabelPass.setText("");
    }//GEN-LAST:event_jPasswordField2KeyReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit1;
    private javax.swing.JButton jButtonLog1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextFieldUsername1;
    private javax.swing.JLabel jlblUserName2;
    private javax.swing.JLabel jlblpasswd2;
    // End of variables declaration//GEN-END:variables
private void systemExit()
    {
        WindowEvent winCloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        
    }
}
