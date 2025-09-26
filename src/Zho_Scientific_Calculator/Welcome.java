

package Zho_Scientific_Calculator;


public class Welcome extends javax.swing.JFrame {

  
    public Welcome() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtnCal = new javax.swing.JButton();
        jbtnWelcom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Screen");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 340, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, 70));

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCal.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jbtnCal.setText("GoTo Calculator");
        jbtnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 210, 40));

        jbtnWelcom.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jbtnWelcom.setText("Welcome Message");
        jbtnWelcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnWelcomActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnWelcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 210, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 380, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnWelcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnWelcomActionPerformed
    Message msg = new Message();
    msg.show();
    }//GEN-LAST:event_jbtnWelcomActionPerformed

    private void jbtnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalActionPerformed
        Scientific_Calculator c1 = new Scientific_Calculator();
        c1.show();
    }//GEN-LAST:event_jbtnCalActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnCal;
    private javax.swing.JButton jbtnWelcom;
    // End of variables declaration//GEN-END:variables

}
