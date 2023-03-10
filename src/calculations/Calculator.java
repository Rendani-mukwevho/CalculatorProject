/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculations;

/**
 *
 * @author libun
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    double firstnumber;
    double Secondnumber;
    double results;
    String operations;
    
    public Calculator() {
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

        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jBzero = new javax.swing.JButton();
        jBplus = new javax.swing.JButton();
        jBsub = new javax.swing.JButton();
        jBcancel = new javax.swing.JButton();
        jBdot = new javax.swing.JButton();
        jBNeg = new javax.swing.JButton();
        jBequal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jbtdisplay = new javax.swing.JTextArea();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jB8.setBackground(new java.awt.Color(0, 204, 204));
        jB8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB8.setText("8");
        jB8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB9.setBackground(new java.awt.Color(0, 204, 204));
        jB9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB9.setText("9");
        jB9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jBzero.setBackground(new java.awt.Color(0, 204, 204));
        jBzero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBzero.setText("0");
        jBzero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jBzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBzeroActionPerformed(evt);
            }
        });

        jBplus.setBackground(new java.awt.Color(0, 204, 204));
        jBplus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBplus.setText("+");
        jBplus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jBplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBplusActionPerformed(evt);
            }
        });

        jBsub.setBackground(new java.awt.Color(0, 204, 204));
        jBsub.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBsub.setText("-");
        jBsub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jBsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsubActionPerformed(evt);
            }
        });

        jBcancel.setBackground(new java.awt.Color(0, 204, 204));
        jBcancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBcancel.setText("C");
        jBcancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jBcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelActionPerformed(evt);
            }
        });

        jBdot.setBackground(new java.awt.Color(0, 204, 204));
        jBdot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBdot.setText(".");
        jBdot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jBdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdotActionPerformed(evt);
            }
        });

        jBNeg.setBackground(new java.awt.Color(0, 204, 204));
        jBNeg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBNeg.setText("+/-");
        jBNeg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jBNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNegActionPerformed(evt);
            }
        });

        jBequal.setBackground(new java.awt.Color(0, 204, 204));
        jBequal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBequal.setText("=");
        jBequal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jBequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBequalActionPerformed(evt);
            }
        });

        jbtdisplay.setBackground(new java.awt.Color(0, 204, 204));
        jbtdisplay.setColumns(20);
        jbtdisplay.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jbtdisplay.setRows(5);
        jbtdisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jScrollPane1.setViewportView(jbtdisplay);

        jB1.setBackground(new java.awt.Color(0, 204, 204));
        jB1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB1.setText("1");
        jB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setBackground(new java.awt.Color(0, 204, 204));
        jB2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB2.setText("2");
        jB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB3.setBackground(new java.awt.Color(0, 204, 204));
        jB3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB3.setText("3");
        jB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jB4.setBackground(new java.awt.Color(0, 204, 204));
        jB4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB4.setText("4");
        jB4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.setBackground(new java.awt.Color(0, 204, 204));
        jB5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB5.setText("5");
        jB5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB6.setBackground(new java.awt.Color(0, 204, 204));
        jB6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB6.setText("6");
        jB6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB7.setBackground(new java.awt.Color(0, 204, 204));
        jB7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB7.setText("7");
        jB7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBzero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBplus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBsub, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBdot, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBequal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBzero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBplus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsub, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBcancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBdot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBequal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
       String enternumber= jbtdisplay.getText() + jB1.getText();
       jbtdisplay.setText(enternumber);
    }//GEN-LAST:event_jB1ActionPerformed

    private void jBcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelActionPerformed
       jbtdisplay.setText(" ");       
    }//GEN-LAST:event_jBcancelActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
       String enternumber= jbtdisplay.getText() + jB6.getText();
       jbtdisplay.setText(enternumber);        
    }//GEN-LAST:event_jB6ActionPerformed

    private void jBzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBzeroActionPerformed
       String enternumber= jbtdisplay.getText() + jBzero.getText();
       jbtdisplay.setText(enternumber);        
    }//GEN-LAST:event_jBzeroActionPerformed

    private void jBsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsubActionPerformed
       firstnumber = Double.parseDouble(jbtdisplay.getText());
       jbtdisplay.setText("");
       operations ="-"; 
    }//GEN-LAST:event_jBsubActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
       String enternumber= jbtdisplay.getText() + jB3.getText();
       jbtdisplay.setText(enternumber);        
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
       String enternumber= jbtdisplay.getText() + jB2.getText();
       jbtdisplay.setText(enternumber); 
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
       String enternumber= jbtdisplay.getText() + jB4.getText();
       jbtdisplay.setText(enternumber); 
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
       String enternumber= jbtdisplay.getText() + jB5.getText();
       jbtdisplay.setText(enternumber);
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
       String enternumber= jbtdisplay.getText() + jB7.getText();
       jbtdisplay.setText(enternumber);        
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
       String enternumber= jbtdisplay.getText() + jB8.getText();
       jbtdisplay.setText(enternumber);       
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
       String enternumber= jbtdisplay.getText() + jB9.getText();
       jbtdisplay.setText(enternumber);        
    }//GEN-LAST:event_jB9ActionPerformed

    private void jBplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBplusActionPerformed
       firstnumber = Double.parseDouble(jbtdisplay.getText());
      // jbtdisplay.setText("");
       operations ="+"; 
       jbtdisplay.setText(operations);
    }//GEN-LAST:event_jBplusActionPerformed

    private void jBdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdotActionPerformed
       String enternumber= jbtdisplay.getText() + jBdot.getText();
       jbtdisplay.setText(enternumber);       
    }//GEN-LAST:event_jBdotActionPerformed

    private void jBNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNegActionPerformed
       double opposite = Double.parseDouble(String.valueOf(jbtdisplay.getText())); 
       opposite=opposite*(-1);
       jbtdisplay.setText(String.valueOf(opposite));        
    }//GEN-LAST:event_jBNegActionPerformed

    private void jBequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBequalActionPerformed
       //double answer;
       Secondnumber=Double.parseDouble(jbtdisplay.getText());
       if(operations =="+"){
             results = firstnumber + Secondnumber;
             //answer= results;
             jbtdisplay.setText(String.valueOf(results));
       }
       else if(operations =="-"){
             results = firstnumber - Secondnumber;
            // answer= results;
             jbtdisplay.setText(String.valueOf(results)); 
         }
    }//GEN-LAST:event_jBequalActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBNeg;
    private javax.swing.JButton jBcancel;
    private javax.swing.JButton jBdot;
    private javax.swing.JButton jBequal;
    private javax.swing.JButton jBplus;
    private javax.swing.JButton jBsub;
    private javax.swing.JButton jBzero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jbtdisplay;
    // End of variables declaration//GEN-END:variables
}
