/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internals.fornecedores;

import Fornecedores.Ocasional;
import Fornecedores.Recorrente;
import gui.TelaInicial;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class CadastrarFornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarFornecedor() {
        initComponents();
    }
//    CadastrarCliente() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfDesconto = new javax.swing.JTextField();
        ftfCnpj = new javax.swing.JFormattedTextField();
        jbCadastrarFornecedores = new javax.swing.JButton();
        cbTipoFornecedor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastrar Fornecedores");
        setPreferredSize(new java.awt.Dimension(615, 315));

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereço:");

        jLabel3.setText("CNPJ:");

        jLabel4.setText("Taxa de Desconto:");

        tfDesconto.setEditable(false);
        tfDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescontoActionPerformed(evt);
            }
        });

        try {
            ftfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfCnpjActionPerformed(evt);
            }
        });

        jbCadastrarFornecedores.setText("Cadastrar");
        jbCadastrarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarFornecedoresActionPerformed(evt);
            }
        });

        cbTipoFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocasional", "Recorrente" }));
        cbTipoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoFornecedorActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCadastrarFornecedores)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftfCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbTipoFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfDesconto)))))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ftfCnpj, tfDesconto, tfEndereco, tfNome});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(ftfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbCadastrarFornecedores)
                .addGap(43, 43, 43))
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
    }// </editor-fold>//GEN-END:initComponents

    private void ftfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfCnpjActionPerformed

    private void jbCadastrarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarFornecedoresActionPerformed
        String nome, endereco, cnpj, tDesc;

        if (tfNome.getText().equalsIgnoreCase("") || tfEndereco.getText().equalsIgnoreCase("") || ftfCnpj.getText().equalsIgnoreCase("           ")) {
            JOptionPane.showMessageDialog(null, "Dados incompletos, por favor tente novamente.");
        } else if (TelaInicial.padaria.consultaFornecedor(ftfCnpj.getText()) != -1) {
            JOptionPane.showMessageDialog(null, "ERRO: CNPJ já cadastrado. Insira outro CNPJ válido.");
        } else {
            //System.out.println(tfNome.getText());
            nome = tfNome.getText();
            endereco = tfEndereco.getText();
            cnpj = ftfCnpj.getText();
            // System.out.println(nome);
            if (cbTipoFornecedor.getSelectedIndex() == 0) {
                Ocasional fornAux = new Ocasional(nome, endereco, cnpj);
                TelaInicial.padaria.cadastraFornecedor(fornAux);
                TelaInicial.padaria.imprimeDadosFornecedores(cnpj);
                JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com Sucesso!");
                this.dispose();
            } else {
                tDesc = tfDesconto.getText();
                if (tfDesconto.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Dados incompletos, por favor tente novamente.");
                } else {
                    Recorrente fornAux = new Recorrente(nome, endereco, cnpj, tDesc);
                    TelaInicial.padaria.cadastraFornecedor(fornAux);
                    JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com Sucesso!");
                    TelaInicial.padaria.imprimeDadosFornecedores(cnpj);
                    this.dispose();
                }
            }
        }


    }//GEN-LAST:event_jbCadastrarFornecedoresActionPerformed

    private void cbTipoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoFornecedorActionPerformed
        int tipo = cbTipoFornecedor.getSelectedIndex();
        //System.out.println(tipo);
        if (tipo == 0) {
            tfDesconto.setEditable(false);
        } else
            tfDesconto.setEditable(true);
    }//GEN-LAST:event_cbTipoFornecedorActionPerformed

    private void tfDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescontoActionPerformed

//        int tipo = cbTipoFornecedor.getSelectedIndex();
//        System.out.println(tipo);
//        if (tipo == 0) {
//            tfDesconto.setEditable(false);
//        }

    }//GEN-LAST:event_tfDescontoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbTipoFornecedor;
    private javax.swing.JFormattedTextField ftfCnpj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCadastrarFornecedores;
    private javax.swing.JTextField tfDesconto;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
