/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Restaurants;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ghinc
 */
public class Price extends javax.swing.JInternalFrame {

    /**
     * Creates new form Price
     */
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public Price() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        jTextArea1.setEditable(false);
        this.getContentPane().setBackground( new Color(238,232,170) );
        
        
         jTable1.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        jTable1.setGridColor(Color.BLACK);
        jTable1.setForeground(Color.BLACK);
        jScrollPane2.setBackground(new Color(0,0,0,0));
        jScrollPane2.setOpaque(false);
        jTable1.setOpaque(false);
        //((DefaultTableCellRenderer)jTable2.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jTable1.setShowGrid(true);
        showTableData();
        
        
        //this.livrare.setText(String.valueOf(HomeDelivery.acasa));
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consumatie = new javax.swing.JLabel();
        livrare = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        tva = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        consumatie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        consumatie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consumatie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        livrare.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        livrare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        livrare.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(238, 232, 170));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Genereaza preturile");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(238, 232, 170));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Restaurants/images/icons8-receipt-24.png"))); // NOI18N
        jButton3.setText("Chitanta");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(238, 232, 170));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Restaurants/images/icons8-print-24.png"))); // NOI18N
        jButton4.setText("Print");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Restaurants/images/15cfcc282887ce16d7f32d26139973bc.png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Restaurants/images/comanda.png"))); // NOI18N

        subtotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        subtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        total.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel6.setText("Costul consumatiei");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel7.setText("Costul livrarii");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel8.setText("Sub-Total");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel9.setText("TVA");

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel10.setText("Total");

        jButton2.setBackground(new java.awt.Color(238, 232, 170));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Totalul de plata");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(consumatie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(livrare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(48, 48, 48))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(jLabel6)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tva, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel8)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(consumatie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(livrare, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/logindb","root","");
            String sql = "SELECT sum(pret) from comenzi";
             pst = con.prepareStatement(sql);
             rs=pst.executeQuery();
            if(rs.next())
            {
                String sum = rs.getString("sum(pret)");
                consumatie.setText(sum);
            }
            
            
            
        }
        catch(Exception ex){
             JOptionPane.showMessageDialog(null,ex);
        }
        
         Object[] options = {"Acasa",
                    "Restaurant"
                    };
int n = JOptionPane.showOptionDialog(this,//parent container of JOptionPane
    "Unde doriti sa serviti comanda?",
    "Serve",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,//do not use a custom Icon
    options,//the titles of buttons
    options[1]);//default button title
  double s=7.00;
  double z=0.00;
if(n==JOptionPane.YES_OPTION)
{
    HomeDelivery ghincea=new HomeDelivery();
    ghincea.setVisible(true);
    livrare.setText(String.valueOf(s));
    
    
}else if(n == JOptionPane.NO_OPTION){
    Table ghincea=new Table();
    ghincea.setVisible(true);
    livrare.setText(String.valueOf(z));
}else if (n== JOptionPane.CLOSED_OPTION){
    JOptionPane.showMessageDialog(this,"Selectati una din cele doua variante!");
}

         
    }//GEN-LAST:event_jButton1ActionPerformed

    public void showTableData(){
        try{
             con = DriverManager.getConnection("jdbc:mysql://localhost/logindb","root","");
             String sql= "SELECT * FROM comenzi";
             pst=con.prepareStatement(sql);
             rs=pst.executeQuery();
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Chitanta
                Date obj=new Date();
                String date= obj.toString();
                
         
                jTextArea1.setText(jTextArea1.getText()+"                              Casa Ghincea\n");
                jTextArea1.setText(jTextArea1.getText()+"          Strada Madona Dudu 31, Craiova 200409\n");
                jTextArea1.setText(jTextArea1.getText()+"                              0769 920 410\n");
                 jTextArea1.setText(jTextArea1.getText()+"----------------------------------------------------------------------\n");
                 jTextArea1.setText(jTextArea1.getText()+"   |   Produse   |   Cantitate   |   Pret   |        \n");
                 jTextArea1.setText(jTextArea1.getText()+"----------------------------------------------------------------------\n");
        
         try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/logindb","root","");
            String sql = "SELECT * from comenzi";
             pst = con.prepareStatement(sql);
             rs=pst.executeQuery();
            while(rs.next())
            {
                
                String nume=rs.getString("numeprodus");
                String cantitate=rs.getString("cantitate");
                String pret = rs.getString("pret");
                
               
             jTextArea1.setText(jTextArea1.getText()+"   |   "+nume+"    |    "+cantitate+"    |    "+pret+"   |"+"\n");
             
                
                
                
            }
            jTextArea1.setText(jTextArea1.getText()+"\n");
           
            
            
        }
        catch(Exception ex){
             JOptionPane.showMessageDialog(null,ex);
        }
          jTextArea1.setText(jTextArea1.getText()+"----------------------------------------------------------------------\n");
          if(livrare.getText().equals("7.0")){
            jTextArea1.setText(jTextArea1.getText()+"Servirea a avut loc: acasa "+"\n");  
          }else if(livrare.getText().equals("0.0")){
              jTextArea1.setText(jTextArea1.getText()+"Servirea a avut loc: la restaurant "+"\n");  
              
          }
          
          
          jTextArea1.setText(jTextArea1.getText()+"----------------------------------------------------------------------\n");
          jTextArea1.setText(jTextArea1.getText()+"Sub-totalul este: "+subtotal.getText()+"\n");
          jTextArea1.setText(jTextArea1.getText()+"TVA-ul este: "+tva.getText()+"\n");
          jTextArea1.setText(jTextArea1.getText()+"Totalul de plata este: "+total.getText()+"\n");
          jTextArea1.setText(jTextArea1.getText()+"----------------------------------------------------------------------\n");
          jTextArea1.setText(jTextArea1.getText()+"Data: "+date +"\n");
          jTextArea1.setText(jTextArea1.getText()+"*******************************************\n");
          jTextArea1.setText(jTextArea1.getText()+"Va multumim si va mai asteptam pe la noi!\n");
          jTextArea1.setText(jTextArea1.getText()+"*******************************************\n");
         
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            jTextArea1.print();
        }catch(Exception e){
            
        }
         try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/logindb","root","");
            String sql = "TRUNCATE comenzi";
             pst = con.prepareStatement(sql);
           
         
            pst.executeUpdate();
           
           
            
            
            
        }
        catch(Exception ex){
             JOptionPane.showMessageDialog(null,ex);
        }
         
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(consumatie.getText().isEmpty() ) {
    JOptionPane.showMessageDialog(this,"Comanda dumneavoastra este goala!");
}else if(livrare.getText().isEmpty()){
    JOptionPane.showMessageDialog(this,"Alegeti locul unde doriti sa serviti comanda!");
    
    
}else if(consumatie.getText().isEmpty() && livrare.getText().isEmpty() ){
    JOptionPane.showMessageDialog(this,"Va rugam sa efectuati o comanda, ca apoi sa alegeti unde doriti sa o serviti!");
}
else{       
       double cons = Double.valueOf(consumatie.getText());
      double liv = Double.valueOf(livrare.getText());
      double sub = cons+liv;
      subtotal.setText(String.valueOf(sub)+" Lei");
      double tva1 = 0.19*sub;
      tva.setText(String.valueOf(tva1)+" Lei");
      double total1 = sub+tva1;
      total.setText(String.valueOf(total1)+" Lei");
     // jTextField5.setText(String.valueOf(total));
}
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel consumatie;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel livrare;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel total;
    private javax.swing.JLabel tva;
    // End of variables declaration//GEN-END:variables
}
