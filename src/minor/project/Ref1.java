/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor.project;

/**
 *
 * @author Abhishek verma
 */
public class Ref1 extends javax.swing.JFrame {

    /**
     * Creates new form Ref1
     */
    public Ref1() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextArea1.setBackground(new java.awt.Color(102, 0, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("M.R.P.:\tRS.   29,000.00\n\tInclusive of all taxes\nEMI starts at    1,093 per month. Options \nOnly 1 left in stock.\nGet delivery in 3-5 business days. Details\nSold by Festivals_SLP_Mumbai (3.8 out of 5 | 234 ratings) and Fulfilled by Amazon. Gift-wrap available.\n•Frost Free Double Door: Auto defrost to stop ice-build up\n•Capacity 253 L: Suitable for families with 2 to 3 members\n•Energy Rating: 2 Star\n•Warranty: 1 year warranty on product and 10 years warranty on compressor\n•stabilizer free operation\n•Inverter Compressor: Energy efficient, less noise & more durable\n•Shelf Type: Toughened Glass to withstand the weight of heaviest vessels\n•Also included in the box: User manual, Warranty card\n•Easy Returns: This product is eligible for full refund within 10 days of delivery in case of any product defects, damage or features not matching the description provided\n•Other features: Recess handle, twist ice maker, Moist Fresh Zone, Big Bottle Guard\n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 680, 290);

        jButton1.setText("Buy Now");
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 380, 90, 23);

        jButton2.setText("Add to cart");
        jPanel1.add(jButton2);
        jButton2.setBounds(450, 380, 90, 30);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 10, 55, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhishek verma\\Downloads\\SHAREit\\SM-G360H\\photo\\images w5.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
refrigerator rf= new refrigerator();
rf.setVisible(true);
this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ref1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ref1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ref1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ref1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ref1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
