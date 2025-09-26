
package Zho_Scientific_Calculator;


public class Message extends javax.swing.JFrame {

    protected Message() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jmsg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jmsg.setBackground(new java.awt.Color(153, 153, 0));
        jmsg.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jmsg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jmsg.setText("Welcome Our Calculator.....");
        jmsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmsgActionPerformed(evt);
            }
        });
        getContentPane().add(jmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmsgActionPerformed
        
    }//GEN-LAST:event_jmsgActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Message().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jmsg;
    // End of variables declaration//GEN-END:variables
}
