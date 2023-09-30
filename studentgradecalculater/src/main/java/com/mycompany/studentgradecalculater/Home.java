
package com.mycompany.studentgradecalculater;

import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame { 

    public Home() {
        initComponents();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rollnotf = new javax.swing.JTextField();
        javal = new javax.swing.JLabel();
        javatf = new javax.swing.JTextField();
        pythonl = new javax.swing.JLabel();
        pythontf = new javax.swing.JTextField();
        cppl = new javax.swing.JLabel();
        cpptf = new javax.swing.JTextField();
        dsal = new javax.swing.JLabel();
        dsatf = new javax.swing.JTextField();
        osl = new javax.swing.JLabel();
        ostf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        totall = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        averagel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gradel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Grade Calculator");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Name");

        nametf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Roll No");

        rollnotf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        javal.setText("JAVA");

        javatf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        javatf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javatfActionPerformed(evt);
            }
        });

        pythonl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pythonl.setText("Python");

        pythontf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pythontf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pythontfActionPerformed(evt);
            }
        });

        cppl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cppl.setText("C++");

        cpptf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        dsal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dsal.setText("DSA");

        dsatf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        osl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        osl.setText("OS");

        ostf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ostf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ostfActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total");

        totall.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Average");

        averagel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        averagel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Grade");

        gradel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gradel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 51, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
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
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(javal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pythonl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cppl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dsal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(osl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(javatf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pythontf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpptf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dsatf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ostf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totall, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averagel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rollnotf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollnotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(javal)
                            .addComponent(javatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pythonl)
                            .addComponent(pythontf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(averagel)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cppl)
                        .addComponent(cpptf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(gradel)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dsal)
                    .addComponent(dsatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ostf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(osl)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(totall)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void javatfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javatfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_javatfActionPerformed

    private void pythontfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pythontfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pythontfActionPerformed

    private void ostfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ostfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ostfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double rollno,java,python,cpp,dsa,os,total,avg;
        String grade;
        int f=0;
        try
        {
            if(nametf.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "please enter some value in "+jLabel2.getText());
                nametf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            
            if(rollnotf.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "please enter some value in "+jLabel3.getText());
                rollnotf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            
            if(javatf.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "please enter some value in "+javal.getText());
                javatf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            if(pythontf.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "please enter some value in "+pythonl.getText());
                pythontf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            if(cpptf.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "please enter some value in "+cppl.getText());
                cpptf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            if(dsatf.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "please enter some value in "+dsal.getText());
                dsatf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            if(ostf.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "please enter some value in "+osl.getText());
                ostf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            rollno=Integer.parseInt(rollnotf.getText());
            java=Integer.parseInt(javatf.getText());
            python=Integer.parseInt(pythontf.getText());
            cpp=Integer.parseInt(cpptf.getText());
            dsa=Integer.parseInt(dsatf.getText());
            os=Integer.parseInt(ostf.getText());
            
            if(java<0||java>100.0)
            {
                JOptionPane.showMessageDialog(this, "please enter the marks between 0-100 range in "+javal.getText());
                javatf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            if(python<0||python>100.0)
            {
                JOptionPane.showMessageDialog(this, "please enter the marks between 0-100 range in "+pythonl.getText());
                pythontf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            if(cpp<0||cpp>100.0)
            {
                JOptionPane.showMessageDialog(this, "please enter the marks between 0-100 range in "+cppl.getText());
                cpptf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            if(dsa<0||dsa>100.0)
            {
                JOptionPane.showMessageDialog(this, "please enter the marks between 0-100 range in "+dsal.getText());
                dsatf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            
            if(os<0||os>100.0)
            {
                JOptionPane.showMessageDialog(this, "please enter the marks between 0-100 range in "+osl.getText());
                ostf.setText("");
                totall.setText("");
                averagel.setText("");
                gradel.setText("");
                f=1;
            }
            
            

            if(f==0)
            {
            total=java+python+cpp+dsa+os;

            totall.setText(String.valueOf(total));
            
            avg=total/5;
            averagel.setText(String.valueOf(avg));
            
            if(avg>85.0)
                grade="A";
            else if(avg>75.0)
                grade="B";
            else if(avg>60.0)
                grade="C";
            else if(avg>40.0)
                grade="S";
            else
                grade="F";
            
            gradel.setText(grade);
            }

        }
        catch(Exception e)
        {
            if(rollnotf.getText().equals(""))
            {
            JOptionPane.showMessageDialog(this, "Please enter only numbers in "+jLabel3.getText());
            
            rollnotf.setText("");
            }
            
            if(javatf.getText().equals(""))
            {
            JOptionPane.showMessageDialog(this, "Please enter only numbers in "+javal.getText());
            javatf.setText("");
            }
            if(pythontf.getText().equals(""))
            {
            JOptionPane.showMessageDialog(this, "Please enter only numbers in "+pythonl.getText());
            pythontf.setText("");
            }
            if(cpptf.getText().equals(""))
            {
            JOptionPane.showMessageDialog(this, "Please enter only numbers in "+cppl.getText());
            
            cpptf.setText("");
            }
            if(dsatf.getText().equals(""))
            {
            JOptionPane.showMessageDialog(this, "Please enter only numbers in "+dsal.getText());
            
            dsatf.setText("");
            }
            if(ostf.getText().equals(""))
            {
            JOptionPane.showMessageDialog(this, "Please enter only numbers in "+osl.getText());
            
            ostf.setText("");
            }
             
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        nametf.setText("");
        rollnotf.setText("");
        javatf.setText("");
        pythontf.setText("");
        cpptf.setText("");
        dsatf.setText("");
        ostf.setText("");
        totall.setText("");
        averagel.setText("");
        gradel.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel averagel;
    private javax.swing.JLabel cppl;
    private javax.swing.JTextField cpptf;
    private javax.swing.JLabel dsal;
    private javax.swing.JTextField dsatf;
    private javax.swing.JLabel gradel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel javal;
    private javax.swing.JTextField javatf;
    private javax.swing.JTextField nametf;
    private javax.swing.JLabel osl;
    private javax.swing.JTextField ostf;
    private javax.swing.JLabel pythonl;
    private javax.swing.JTextField pythontf;
    private javax.swing.JTextField rollnotf;
    private javax.swing.JLabel totall;
    // End of variables declaration//GEN-END:variables
}
