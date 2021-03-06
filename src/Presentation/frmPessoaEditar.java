/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataAcess.PessoaDAO;
import DomainModel.Email;
import DomainModel.Endereco;
import DomainModel.Pessoa;
import DomainModel.Telefone;
import java.sql.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALUNO
 */
public class frmPessoaEditar extends javax.swing.JInternalFrame {

    private Iterable<Telefone> telefone;

    /**
     * Creates new form frmPessoaEditar
     */
    public frmPessoaEditar() {
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

        jPanel5 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelDadosGerais = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        txtNome = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        txtData = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        txtTelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTelefones = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        label4 = new java.awt.Label();
        txtEmail = new javax.swing.JTextField();
        btnAdicionarEmail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmails = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        txtCep = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        txtCidade = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        txtRua = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        txtNumero = new javax.swing.JTextField();
        label9 = new java.awt.Label();
        txtBairro = new javax.swing.JTextField();
        btnAdicionarEndereco = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEnderecos = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        label1.setText("Nome");

        label3.setText("Data de Nascimento");

        javax.swing.GroupLayout panelDadosGeraisLayout = new javax.swing.GroupLayout(panelDadosGerais);
        panelDadosGerais.setLayout(panelDadosGeraisLayout);
        panelDadosGeraisLayout.setHorizontalGroup(
            panelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosGeraisLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDadosGeraisLayout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtData))
                    .addGroup(panelDadosGeraisLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        panelDadosGeraisLayout.setVerticalGroup(
            panelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosGeraisLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(456, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Gerais", panelDadosGerais);

        label2.setText("Telefone");

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        tblTelefones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTelefones);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdicionar)))
                .addContainerGap(519, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(146, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Telefones", jPanel3);

        label4.setText("E-Mail: ");

        btnAdicionarEmail.setText("Adicionar");
        btnAdicionarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEmailActionPerformed(evt);
            }
        });

        tblEmails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblEmails);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdicionarEmail))
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("E-Mails", jPanel4);

        label5.setText("CEP: ");

        label6.setText("Cidade");

        label7.setText("Rua: ");

        label8.setText("Numero:");

        label9.setText("Bairro");

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        btnAdicionarEndereco.setText("Adicionar");
        btnAdicionarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEnderecoActionPerformed(evt);
            }
        });

        tblEnderecos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblEnderecos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(btnAdicionarEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(63, 63, 63))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCep)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdicionarEndereco))
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label9.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Enderecos", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnSalvar)
                .addGap(39, 39, 39)
                .addComponent(btnApagar)
                .addGap(42, 42, 42)
                .addComponent(btnLimpar)
                .addContainerGap(354, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnApagar)
                    .addComponent(btnLimpar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Pessoa pessoa;
    PessoaDAO dao;

    public frmPessoaEditar(Pessoa p, PessoaDAO dao) {
        initComponents();



        this.pessoa = p;
        this.dao = dao;
        //Telefone telefones = new 

        List<Telefone> telefones = pessoa.getTelefones();
        List<Email> emails = pessoa.getEmails();
        List<Endereco> enderecos = pessoa.getEnderecos();
        carregaCampos();



        atualizarTabelaTelefones(telefones);
        atualizarTabelaEmails(emails);
        atualizarTabelaEnderecos(enderecos);



    }

    private void carregaCampos() {

        txtNome.setText(pessoa.getNome());
        txtData.setText(String.valueOf(pessoa.getDataNascimento()));

    }

    private void carregaObjeto() {
        try {

            pessoa.setNome(txtNome.getText());
            pessoa.setDataNascimento(Date.valueOf(txtData.getText()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar!!" + ex);

        }

    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed


        /*try {
         if (JOptionPane.showConfirmDialog(rootPane, "Deseja Salvar?") == 0) {

         //carregaObjeto();
         pessoa2.setNome(txtNome.getText());
         pessoa2.setDataNascimento(Date.valueOf(txtData.getText()));
         dao.Salvar(pessoa2);
         JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
         //this.dispose();

         } else {
         JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
         }
         } catch (Exception ex) {
         JOptionPane.showMessageDialog(rootPane, "Erro ao salvar! " + ex);
         }*/
        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja Salvar?") == 0) {

                carregaObjeto();

                if (dao.Salvar(pessoa)) {
                    JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Operação cancelada pelo usuário!");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar!!" + ex);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        carregaObjeto();

        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?") == 0) {
            try {
                dao.Remover(pessoa);
                JOptionPane.showMessageDialog(rootPane, "Operação realizada com sucesso! ");
                this.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao excluir! " + ex);
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada pelo usuario! ");
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        txtNome.setText("");
        txtData.setText("");

    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed
    private void atualizarTabelaTelefones(List<Telefone> telefones) {

        DefaultTableModel model = new DefaultTableModel();
        // model.addColumn("DDD");
        model.addColumn("Telefone");

        for (Telefone t : telefones) {
            Vector valores = new Vector();
            valores.add(0, t.getTelefone());
            model.addRow(valores);
        }
        tblTelefones.setModel(model);
        tblTelefones.repaint();


    }

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        Telefone t = new Telefone();
        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja Adicionar o telefone? ") == 0) {
                t.setTelefone(Integer.parseInt(txtTelefone.getText()));
                pessoa.addTelefone(t);
                atualizarTabelaTelefones(pessoa.getTelefones());
                JOptionPane.showMessageDialog(rootPane, "Dados salvos com sucesso! ");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada pelo usuário!");
            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar!" + ex);
        }
    }

    private void atualizarTabelaEmails(List<Email> emails) {

        DefaultTableModel model = new DefaultTableModel();
        // model.addColumn("DDD");
        model.addColumn("Emails");

        for (Email e : emails) {
            Vector valores = new Vector();
            valores.add(0, e.getEmail());
            model.addRow(valores);
        }
        tblEmails.setModel(model);
        tblEmails.repaint();

    }//GEN-LAST:event_btnAdicionarActionPerformed
    private void atualizarTabelaEnderecos(List<Endereco> enderecos) {

        DefaultTableModel model = new DefaultTableModel();
        // model.addColumn("DDD");
        model.addColumn("CEP");
        model.addColumn("Cidade");
        model.addColumn("Bairro");
        model.addColumn("Rua");
        model.addColumn("Numero");

        for (Endereco e : enderecos) {
            Vector valores = new Vector();
            valores.add(0, e.getCep());
            valores.add(1, e.getCidade());
            valores.add(2, e.getBairro());
            valores.add(3, e.getRua());
            valores.add(4, e.getNumero());
            model.addRow(valores);
        }
        tblEnderecos.setModel(model);
        tblEnderecos.repaint();

    }

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
    }//GEN-LAST:event_txtBairroActionPerformed

    private void btnAdicionarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEnderecoActionPerformed
        Endereco endereco = new Endereco();
        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja Adicionar o Email? ") == 0) {
                endereco.setCep(txtCep.getText());
                endereco.setRua(txtRua.getText());
                endereco.setBairro(txtBairro.getText());
                endereco.setCidade(txtCidade.getText());
                endereco.setNumero(Integer.parseInt(txtCep.getText()));

                pessoa.addEndereco(endereco);
                atualizarTabelaEnderecos(pessoa.getEnderecos());
                JOptionPane.showMessageDialog(rootPane, "Dados salvos com sucesso! ");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada pelo usuário!");
            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar!" + ex);
        }
    }//GEN-LAST:event_btnAdicionarEnderecoActionPerformed

    private void btnAdicionarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEmailActionPerformed
        Email email = new Email();
        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja Adicionar o Email? ") == 0) {
                email.setEmail(txtEmail.getText());
                pessoa.addEmail(email);
                atualizarTabelaEmails(pessoa.getEmails());
                JOptionPane.showMessageDialog(rootPane, "Dados salvos com sucesso! ");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada pelo usuário!");
            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar!" + ex);
        }
    }//GEN-LAST:event_btnAdicionarEmailActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdicionar;
    private javax.swing.JButton btnAdicionarEmail;
    private javax.swing.JButton btnAdicionarEndereco;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JPanel panelDadosGerais;
    private javax.swing.JTable tblEmails;
    private javax.swing.JTable tblEnderecos;
    private javax.swing.JTable tblTelefones;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
