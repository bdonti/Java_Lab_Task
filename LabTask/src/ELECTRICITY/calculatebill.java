/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package electricitynew;

import static electricitynew.myvariables.password;
import static electricitynew.myvariables.path;
import static electricitynew.myvariables.place;
import static electricitynew.myvariables.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parveen
 */
public class calculatebill extends javax.swing.JInternalFrame {
            double payable=200;
String rate;
   
    public calculatebill() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Calculate Bill");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose your district");

        jLabel7.setText("Connection Id");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose your district" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Bill");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Previous Reading");

        jLabel9.setText("New Reading");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel10.setText("Units");

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setText("Select Type");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Connection type", "Domestic", "Commercial", " " }));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Date");

        jLabel15.setText("Name");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Connection Id ", "Name", "Select Type", "District", "Previous Readings", "New Readings "
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("Search by Id");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Search by Name");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(565, 565, 565)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(161, 161, 161)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(78, 78, 78)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel7))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(jButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton5)))
                                        .addGap(40, 40, 40))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jButton2)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

        

       }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
// try {
//    Connection myconnection = null ;
//      
//            myconnection =DriverManager.getConnection(path+place, username, password);
//        
//try{
//  
//     String q="select * from readingtable where dist=?";
//    PreparedStatement mysat=myconnection.prepareStatement(q);
//       mysat.setString(1,jComboBox1.getSelectedItem().toString());
//    ResultSet myresult=mysat.executeQuery();
//    
//    if(myresult.next())
//            { 
//                    jTextField6.setText(myresult.getString("nreadings"));
//                    jTextField6.setText(myresult.getString("pname"));
//
//                    jComboBox2.setSelectedItem(myresult.getString("ctype"));
////                    jLabel3.setText(myresult.getString("month"));
////                    jLabel5.setText(myresult.getString("year"));
//                    jTextField4.setText(myresult.getString("cid"));
//                    jTextField5.setText(myresult.getString("preadings"));
//                        }
//    
//    else
//    {
//         JOptionPane.showMessageDialog(rootPane, "enterted wrong input");
//    } 
//   
//} 
//catch(Exception  e)
//{
//
//JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
//    }                                        
//finally
//{
//       
//            myconnection.close();
//        
//}
//}       catch (Exception ex) {
//    JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+ex.getMessage());
//
//        }
//        
        
        
            }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       try {
    Connection myconnection = null ;
        myconnection =DriverManager.getConnection(path+place, username, password);
     

try{
    String q1="select * from district";
    PreparedStatement mysat1=myconnection.prepareStatement(q1);
    ResultSet myresult1=mysat1.executeQuery();
    if(myresult1.next())
    {
       do
       {
           jComboBox1.addItem(myresult1.getString("add_district"));
    }while(myresult1.next());
    }
    else
    {

    }
}
catch(Exception  e)
{
e.printStackTrace();
JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
    }  
          finally
       { 
            myconnection.close();
        } 
        }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
 
       }   
          
         }//GEN-LAST:event_formInternalFrameActivated

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed

    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
    Connection myconnection = null ;
        try {
            myconnection =DriverManager.getConnection(path+place, username, password);
        } catch (SQLException ex) {
        }
try{
    String q="insert into calculatebill value (?,?,?,?,?,?,?,?,?)";
    PreparedStatement mysat=myconnection.prepareStatement(q);
        mysat.setString(1, jTextField4.getText());
        mysat.setString(2,  jTextField7.getText());
        mysat.setString(3, jComboBox1.getSelectedItem().toString());
        SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
      String date=myformat.format(jDateChooser1.getDate());
      mysat.setString(4, date);
        mysat.setString(5, jTextField6.getText());
        mysat.setString(6, jComboBox2.getSelectedItem().toString());
        mysat.setString(7, jLabel12.getText());
        mysat.setString(8, jTextField3.getText());
        mysat.setString(9, "unpaid");
        mysat.executeUpdate();
JOptionPane.showMessageDialog(rootPane,"Save sucessfully",title,JOptionPane.INFORMATION_MESSAGE);

         
} 
catch(Exception  e)
{
e.printStackTrace();
JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
    }                                        
finally
{
        try {
            myconnection.close();
        } catch (SQLException ex) {
        }
}
}       catch (Exception ex) {
    JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+ex.getMessage());

        }
      
      }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
 int column=0;
        int row=jTable1.getSelectedRow();
        String cid1=jTable1.getValueAt(row, column).toString();
        try {
            Connection myconnection;
            myconnection=DriverManager.getConnection(path+place, username, password);

            try{
                String q="select * from readingtable where cid=?";
                PreparedStatement mysat=myconnection.prepareStatement(q);
                mysat.setString(1,cid1);
                ResultSet myresult=mysat.executeQuery();
                if(myresult.next()){
                    jTextField4.setText(myresult.getString("cid"));
                  jTextField7.setText(myresult.getString("pname"));
                   // jTextField4.setText(myresult.getString("cid"));
                    jTextField5.setText(myresult.getString("preadings"));
                    jTextField6.setText(myresult.getString("nreadings"));
        jComboBox2.setSelectedItem(myresult.getString("ctype"));
                }
                else
                {
                    JOptionPane.showInternalMessageDialog(rootPane, "No connections found ", " ", JOptionPane.YES_NO_CANCEL_OPTION);

                }
            }
            catch(Exception  e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
            }
            finally
            {
                myconnection.close();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error in connection due to"+e.getMessage() );
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int p=Integer.parseInt(jTextField5.getText());
        int g1= Integer.parseInt(jTextField6.getText());
        int g=p-g1;
        if(jComboBox2.getSelectedItem().toString().equals("Domestic"))
        {
            if(g<=100)
            {
                payable=0;
            }
            else if(g>101)

            {
                payable= (payable+100*0.50);
            }
        }
        else if(jComboBox2.getSelectedItem().toString().equals("Commerical"))
        {
            if(g<=200)
            {
                payable=0;
            }
            else if(g>201)

            {
                payable= (payable+100*0.12);
            }
        }
        jLabel12.setText(String.valueOf(g));

        jTextField3.setText(String.valueOf(payable));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
        {
            Connection myconnection;

            myconnection=DriverManager.getConnection(path+place, username, password);
            try{
                String q="select *  from readingtable where cid=?";
                PreparedStatement mysat=myconnection.prepareStatement(q);
                mysat.setString(1,jTextField4.getText());
                ResultSet myresult=mysat.executeQuery();
                if(myresult.next())
                {
                    jTextField7.setText(myresult.getString("pname"));
                    jTextField5.setText(myresult.getString("preadings"));
                    jTextField6.setText(myresult.getString("nreadings"));
                   // jDateChooser1.setDate(myresult.getDate("date"));
                    // jComboBox1.removeAllItems();
                    //jComboBox1.addItem("choose district");
                  //  jComboBox1.setSelectedItem(myresult.getString("choosedistrict"));
                    jComboBox2.setSelectedItem(myresult.getString("ctype"));

                    //jFormattedTextField1 .setText(myresult.getString("Mno"));
                   

                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "enterted wrong input");
                }

            }
            catch(Exception  e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
            }
            finally
            {
                myconnection.close();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error in connection due to"+e.getMessage() );
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jTextField2.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);

        
        try
        {
            Connection myconnection;

            myconnection=DriverManager.getConnection(path+place, username, password);
            try{
                String q="select * from readingtable where pname like '%"+ jTextField7.getText() +"%'" ;
                PreparedStatement mysat=myconnection.prepareStatement(q);
                //mysat.setString(1,+ "%");
                ResultSet myresult=mysat.executeQuery();

                if(myresult.next())
                {
                    DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                    mymodel.setRowCount(0);
                    do
                    {
                        String cno,name,ph,add,dist,ctype;
                        cno=myresult.getString("cid");
                        name=myresult.getString("pname");
                        dist=myresult.getString("preadings");
                        ph=myresult.getString("nreadings");
                    add=myresult.getString("dist");
                        ctype=myresult.getString("ctype");
                        mymodel.addRow(new Object[]{cno,name,ctype,add,dist,ph});
                    }
                    while(myresult.next());

                }
                else
                {
                    JOptionPane.showInternalMessageDialog(rootPane, "No connections found ", " ", JOptionPane.YES_NO_CANCEL_OPTION);

                }

            }
            catch(Exception  e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
            }
            finally
            {

                myconnection.close();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error in connection due to"+e.getMessage() );
        }

    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
