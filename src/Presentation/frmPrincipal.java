/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author ALUNO
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSistema = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuCadastroPessoas = new javax.swing.JMenu();
        mnuPessoaCadastro = new javax.swing.JMenuItem();
        mnuProdutoCadastro = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuSistema.setText("Sistema");

        jMenuItem1.setText("sair");
        mnuSistema.add(jMenuItem1);

        jMenuBar1.add(mnuSistema);

        mnuCadastroPessoas.setText("Cadastros");

        mnuPessoaCadastro.setText("Pessoa");
        mnuPessoaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPessoaCadastroActionPerformed(evt);
            }
        });
        mnuCadastroPessoas.add(mnuPessoaCadastro);

        mnuProdutoCadastro.setText("Produto");
        mnuProdutoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProdutoCadastroActionPerformed(evt);
            }
        });
        mnuCadastroPessoas.add(mnuProdutoCadastro);

        jMenuBar1.add(mnuCadastroPessoas);

        jMenu3.setText("Relatorios");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPessoaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPessoaCadastroActionPerformed
        // TODO add your handling code here:
        frmPessoaListagem janela= new frmPessoaListagem();
       
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_mnuPessoaCadastroActionPerformed

    private void mnuProdutoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProdutoCadastroActionPerformed
        // TODO add your handling code here:
        frmCadastroProduto janela= new frmCadastroProduto ();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_mnuProdutoCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu mnuCadastroPessoas;
    private javax.swing.JMenuItem mnuPessoaCadastro;
    private javax.swing.JMenuItem mnuProdutoCadastro;
    private javax.swing.JMenu mnuSistema;
    // End of variables declaration//GEN-END:variables
}