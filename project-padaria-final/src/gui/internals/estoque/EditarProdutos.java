/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internals.estoque;

import gui.internals.fornecedores.*;
import Clientes.Clientes;
import Fornecedores.Fornecedores;
import Fornecedores.Ocasional;
import Fornecedores.Recorrente;
import Produtos.Produtos;
import gui.TelaInicial;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class EditarProdutos extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarCliente
     */
    private Produtos aux = null;

    public EditarProdutos(String codigo) {
        initComponents();
        aux = TelaInicial.padaria.estoque.dadosProduto(codigo);
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "Nao encontrou!");
            this.dispose();
        } else {
            lbCPF.setText("Código: " + codigo);
            tfNome.setText(aux.getNome());
            tfEndereco.setText(aux.getEndereco());

            if (aux instanceof Recorrente) {
                tfTaxaDesc.setText(aux.getTaxaDesconto());

            } else {
                tfTaxaDesc.setEditable(false);
            }
        }
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
        lbCPF = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfTaxaDesc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Editar Fornecedores");
        setPreferredSize(new java.awt.Dimension(615, 315));

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereço:");

        lbCPF.setText("CNPJ:");

        jLabel4.setText("Taxa Desc:");

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(50, 50, 50)
                            .addComponent(tfTaxaDesc))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(lbCPF))
                            .addGap(54, 54, 54)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addComponent(tfEndereco)))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbCPF)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tfTaxaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton1)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome, endereco, taxaDesc, cnpj;

        if (tfNome.getText().equalsIgnoreCase("") || tfEndereco.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Dados incompletos, por favor tente novamente.");
        } else {
            if (aux instanceof Ocasional) {
                //System.out.println(tfNome.getText());
                nome = tfNome.getText();
                endereco = tfEndereco.getText();
                cnpj = aux.getCnpj();
                Ocasional ocaAux = new Ocasional(nome, endereco, cnpj);
                TelaInicial.padaria.updateFornecedor(ocaAux);
                TelaInicial.padaria.imprimeDadosFornecedores(cnpj);
                JOptionPane.showMessageDialog(null, "Fornecedor atualizado com Sucesso!");
                this.dispose();
            } else {
                if (tfTaxaDesc.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Dados incompletos, por favor tente novamente.");
                } else {
                    taxaDesc = tfTaxaDesc.getText();
                    nome = tfNome.getText();
                    endereco = tfEndereco.getText();
                    cnpj = aux.getCnpj();
                    Recorrente recAux = new Recorrente(nome, endereco, cnpj, taxaDesc);
                    TelaInicial.padaria.updateFornecedor(recAux);
                    JOptionPane.showMessageDialog(null, "Fornecedor atualizado com Sucesso!");
                    this.dispose();

                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTaxaDesc;
    // End of variables declaration//GEN-END:variables

}
