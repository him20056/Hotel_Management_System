/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * roommanag.java
 *
 * Created on 21 Oct, 2014, 7:03:48 PM
 */

package hotel_managementsystem;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author SHRI
 */
public class roommanag extends javax.swing.JFrame {
Connection con;
    Statement stmt;
    ResultSet rs;
    String rno,rtype,rbed;
    int rrate;
    /** Creates new form roommanag */
    public roommanag() {
        initComponents();
    }
public final void displayRecord(){
        try{
            roomno.setText(rs.getString("room_no"));
            roomtype.setText(rs.getString("room_type"));
            roomrate.setText(Integer.toString(rs.getInt("room_rate")));
            bedtype.setText(rs.getString("room_bed"));
        }
        catch(Exception ec){}
    }
    //GET THE VALUES FROM TEXT FIELDS AND AREA
    public void fetchFromTextF(){
        rno=roomno.getText();
        rtype=roomtype.getText();
        rrate=Integer.parseInt(roomrate.getText());
        rbed=bedtype.getText();
    }
    //DISABLE TEXT FIELDS AND AREA
    public void disableTextF(){
        roomno.setEditable(false);
        roomtype.setEditable(false);
        roomrate.setEditable(false);
        bedtype.setEditable(false);
    }
    //CLEAR TEXT FIELDS AND AREA
    public void clearTextF(){
        try
        {
            roomno.setText(null);
            roomtype.setText(null);
            roomrate.setText(null);
            bedtype.setText(null);
        }
        catch(Exception ec)
        {}
    }
    //ENABLE TEXT FIELDS AND AREA
    public void enableTextF(){
        roomno.setEditable(true);
        roomtype.setEditable(true);
        roomrate.setEditable(true);
        bedtype.setEditable(true);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roomno = new javax.swing.JTextField();
        roomtype = new javax.swing.JTextField();
        first = new javax.swing.JButton();
        next = new javax.swing.JButton();
        last = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        roomrate = new javax.swing.JTextField();
        bedtype = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        del = new javax.swing.JButton();
        savecmd = new javax.swing.JButton();
        updcmd = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Room Management Form");
        setBounds(new java.awt.Rectangle(400, 250, 0, 0));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Room Management Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Room No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("<html>Room Type<br /> (AC/NON AC)</html>");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel4.setText("Room Rate");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel5.setText("<html>Bed Type <br/>(Single/Double)</html>");

        roomno.setEditable(false);
        roomno.setFont(new java.awt.Font("Tahoma", 0, 12));

        roomtype.setEditable(false);
        roomtype.setFont(new java.awt.Font("Tahoma", 0, 12));

        first.setFont(new java.awt.Font("Tahoma", 0, 12));
        first.setText("First <<");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Tahoma", 0, 12));
        next.setText("Next >");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        last.setFont(new java.awt.Font("Tahoma", 0, 12));
        last.setText("Last >>");
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        prev.setFont(new java.awt.Font("Tahoma", 0, 12));
        prev.setText("Previous <");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        roomrate.setEditable(false);
        roomrate.setFont(new java.awt.Font("Tahoma", 0, 12));

        bedtype.setEditable(false);
        bedtype.setFont(new java.awt.Font("Tahoma", 0, 12));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Tahoma", 0, 12));
        edit.setText("Edit");
        edit.setEnabled(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        del.setFont(new java.awt.Font("Tahoma", 0, 12));
        del.setText("Delete");
        del.setEnabled(false);
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        savecmd.setText("Save");
        savecmd.setEnabled(false);
        savecmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savecmdActionPerformed(evt);
            }
        });

        updcmd.setText("Update");
        updcmd.setEnabled(false);
        updcmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updcmdActionPerformed(evt);
            }
        });

        jButton11.setText("Click here to search By Room No.");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel6.setText("To delete or update first click on Search By room No.");

        jLabel7.setText("For new entry, click on New then fill the fields and click save button.");

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roomtype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomrate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bedtype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(del))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(prev, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(next, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(last, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(savecmd)
                        .addGap(28, 28, 28)
                        .addComponent(updcmd)
                        .addGap(320, 320, 320)))
                .addGap(35, 35, 35))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bedtype, roomno, roomrate, roomtype});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {first, last, next, prev});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(roomno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(roomrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(del)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(first)
                                            .addComponent(prev))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(next)
                                            .addComponent(last)))
                                    .addComponent(edit))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(bedtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savecmd)
                            .addComponent(updcmd)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Room Management Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","tiger");
            String sql = "SELECT * FROM roomdetail";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            rs.first();
            displayRecord();
        } catch (Exception ex) {
        }
}//GEN-LAST:event_firstActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        try {
            rs.next();
            if (rs.isLast()) {
                rs.last();
            }
            displayRecord();
        } catch (Exception ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());}
}//GEN-LAST:event_nextActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","tiger");
            String sql = "SELECT * FROM roomdetail";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            rs.last();
            displayRecord();
        } catch (Exception ex) {
        }
}//GEN-LAST:event_lastActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        try {
            rs.previous();
            if (rs.isFirst()) {
                rs.first();
            }
            displayRecord();
        } catch (Exception ex) {
        }
}//GEN-LAST:event_prevActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            clearTextF();
            enableTextF();
            savecmd.setEnabled(true);

}//GEN-LAST:event_jButton1ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
            enableTextF();
            updcmd.setEnabled(true);
            roomno.setEnabled(false);
}//GEN-LAST:event_editActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","tiger");
            String sql = "SELECT * FROM roomdetail";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            if(rs.next()){}
            rno=roomno.getText();
                int code = JOptionPane.showConfirmDialog(this, "Room No" + rno + " will be deleted from database.", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (code == JOptionPane.YES_OPTION) {
                    String updatequery = "DELETE from roomdetail where room_no='" +rno+ "'";
                    stmt = con.createStatement();
                    int success = stmt.executeUpdate(updatequery);
                        JOptionPane.showMessageDialog(this, "Record Deleted");
                        clearTextF();
                } else {JOptionPane.showMessageDialog(this, "Problem in deletion. Retry");
                }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_delActionPerformed

    private void savecmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savecmdActionPerformed
try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","tiger");
            String sql = "SELECT * FROM roomdetail";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            if(rs.next()){
            fetchFromTextF();
                int code = JOptionPane.showConfirmDialog(this, "New Room No: " + rno + " will be created", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (code == JOptionPane.YES_OPTION) {
                    String updatequery = "insert into roomdetail values('"+rno+"','"+rtype+"','"+rrate+"','"+rbed+"')";
                    stmt = con.createStatement();
                    int success = stmt.executeUpdate(updatequery);
                        JOptionPane.showMessageDialog(this, "Record Inserted");
                } else {JOptionPane.showMessageDialog(this, "Check details...");
                }}
            else{
            JOptionPane.showMessageDialog(rootPane, "Already Exists. Check Details.");}
        } catch (Exception ex) {
JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
savecmd.setEnabled(false);// TODO add your handling code here:
}//GEN-LAST:event_savecmdActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
try{
Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","tiger");
            String sql = "SELECT * FROM roomdetail where room_no='"
                    +(JOptionPane.showInputDialog(null,"Enter Room No. to search"))+"'";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            if(rs.next()){
            displayRecord();
}
            else{
            JOptionPane.showMessageDialog(rootPane, "Room Not Exist...");}
}
catch (Exception ex){
JOptionPane.showMessageDialog(rootPane, "Room Not Exist");
}
edit.setEnabled(true);del.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void updcmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updcmdActionPerformed
try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","tiger");
            String sql = "SELECT * FROM roomdetail";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            if(rs.next()){
            fetchFromTextF();
                int code = JOptionPane.showConfirmDialog(this, "Room No: " + rno + " will be updated", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (code == JOptionPane.YES_OPTION) {
                    String updatequery = "update roomdetail set room_type='"+rtype+"', room_rate='"+rrate+"', room_bed='"+rbed+"' where room_no='"+rno+"'";
                    stmt = con.createStatement();
                    int success = stmt.executeUpdate(updatequery);
                        JOptionPane.showMessageDialog(this, "Updated Successfully");
                } else {JOptionPane.showMessageDialog(this, "Check details...");
                }}
            else{
            JOptionPane.showMessageDialog(rootPane, "Some Problem. Check Details.");}
        } catch (Exception ex) {
JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
updcmd.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_updcmdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
clearTextF();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roommanag().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bedtype;
    private javax.swing.JButton del;
    private javax.swing.JButton edit;
    private javax.swing.JButton first;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton last;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JTextField roomno;
    private javax.swing.JTextField roomrate;
    private javax.swing.JTextField roomtype;
    private javax.swing.JButton savecmd;
    private javax.swing.JButton updcmd;
    // End of variables declaration//GEN-END:variables

}
