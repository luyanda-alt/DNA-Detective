/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project;

/**
 *
 * @author Pooja
 */
public class Info extends javax.swing.JFrame {

    /**
     * Creates new form Screen1
     */
    public Info() {
        initComponents();
        this.setLocationRelativeTo(null);

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
        display = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        okay2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        display.setEditable(false);
        display.setBackground(new java.awt.Color(0, 0, 0));
        display.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setText("DNA Detective\nAbout Us\nWelcome to DNA Detective, a groundbreaking application created by a dedicated team of nine talented individuals. Our mission is to empower you with the knowledge and tools to explore the fascinating world of DNA analysis and uncover the secrets hidden within your genes.\n\nFunctionality\nThe DNA Detectives sequence checker function validates DNA sequence pairs by ensuring they are valid. It checks if nucleotide pairs follow the rule of A pairing with T and G pairing with C. Additionally, it verifies that all pairs are present in the sequence. These checks enhance the function's capability to accurately assess and validate DNA sequences.\n\nThe DNA sequence similarity checker is a tool for comparing two DNA sequences and determining their similarity as a percentage. It uses a Finite State Machine (FSM) with states like Start, Match, Mismatch, and End. Users input two valid sequences, and the program counts matching elements to calculate the similarity percentage.\n\nProtein synthesis uses RNA to create proteins. It involves two steps: transcription (DNA to mRNA, forming codons) and translation (ribosomes read mRNA to assemble proteins). Codons in mRNA determine the amino acid order in the protein, with each codon made of three nucleotides pairing with complementary anticodons on tRNA carrying specific amino acids.\n\nThe Mutation program takes two DNA sequences as input and compares them to detect any differences or mutations. It identifies substitutions, insertions, or deletions of nucleotide bases at specific positions, providing insights into genetic variations between the two DNA strands\n\nOur Team\nMeet the minds behind DNA Detective, a diverse group of individuals from various fields who have come together to make this app a reality:\n\nSimarin Naidoo\nInnocent Mbonambi \nMvelo Mlangeni \nPooja Ramahsarai\nNabeela Mia\nLuyanda Maphumulo\nMuhammad Shah\nAndile Madonsela \nJaan Fredericks\n\nContact Us\nIf you have any questions, feedback, or inquiries, please don't hesitate to reach out to our team at [dnadetective@email.com]. We're here to assist you on your DNA discovery adventure.\n\nThank you for choosing DNA Detective.");
        jScrollPane1.setViewportView(display);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 920, 590));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("ABOUT US ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        okay2.setBackground(new java.awt.Color(0, 0, 0));
        okay2.setFont(new java.awt.Font("Lucida Bright", 3, 24)); // NOI18N
        okay2.setForeground(new java.awt.Color(255, 255, 255));
        okay2.setText("BACK");
        okay2.setToolTipText("GO BACK TO WELCOME PAGE");
        okay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okay2ActionPerformed(evt);
            }
        });
        jPanel1.add(okay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okay2ActionPerformed

        //Closes form and returns to welcome page
        Welcome w = new Welcome();
        w.show();
        dispose();
    }//GEN-LAST:event_okay2ActionPerformed

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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okay2;
    // End of variables declaration//GEN-END:variables
}
