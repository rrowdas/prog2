/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internals.funcionarios;

import Funcionarios.Funcionarios;
import Funcionarios.Gerente;
import Funcionarios.Padeiro;
import Funcionarios.Vendedor;
import gui.TelaInicial;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class EditarFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarCliente
     */
    private Funcionarios aux = null;

    public EditarFuncionario(String codigo) {
        initComponents();
        aux = TelaInicial.padaria.dadosFuncionario(codigo);
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "Nao encontrou!");
            this.dispose();
        } else {
            lbCPF.setText("CPF: " + codigo);
            tfNome.setText(aux.getNome());
            tfEndereco.setText(aux.getEndereco());
            tfTelefone.setText(aux.getTelefone());
            tfSalBase.setText(aux.getSalarioBase());

            if (aux instanceof Padeiro) {
                tfHoraNormal.setEditable(true);
                tfHoraAlternativa.setEditable(true);
                tfHoraNormal.setText(((Padeiro) aux).getHorasNormais());
                tfHoraAlternativa.setText(((Padeiro) aux).getHorasAlternativas());

            } else {
                tfHoraNormal.setEditable(false);
                tfHoraAlternativa.setEditable(false);
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
        lbCPF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tfHoraNormal = new javax.swing.JTextField();
        tfHoraAlternativa = new javax.swing.JTextField();
        jlnome = new javax.swing.JLabel();
        jlendereco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfSalBase = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Editar Funcionarios");
        setPreferredSize(new java.awt.Dimension(615, 315));

        lbCPF.setText("CPF:");

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfHoraNormal.setEditable(false);
        tfHoraNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraNormalActionPerformed(evt);
            }
        });

        tfHoraAlternativa.setEditable(false);

        jlnome.setText("Nome:");

        jlendereco.setText("Endereço:");

        jLabel1.setText("Telefone:");

        jLabel2.setText("Salário Base:");

        jLabel4.setText("Jornada Normal:");

        jLabel3.setText("Jornada Alternativa:");

        jLabel5.setText("Se padeiro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCPF)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlnome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlendereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfHoraNormal)
                                .addComponent(tfTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfSalBase, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfHoraAlternativa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(55, 78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlnome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlendereco)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSalBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tfHoraNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfHoraAlternativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
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

    private void tfHoraNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraNormalActionPerformed

        //        int tipo = cbTipoFornecedor.getSelectedIndex();
        //        System.out.println(tipo);
        //        if (tipo == 0) {
        //            tfDesconto.setEditable(false);
        //        }
    }//GEN-LAST:event_tfHoraNormalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome, endereco, cpf, telefone, salBase, hAlt, hNorm;

        if (tfNome.getText().equalsIgnoreCase("") || tfEndereco.getText().equalsIgnoreCase("") || tfTelefone.getText().equalsIgnoreCase("")
                || tfSalBase.getText().equalsIgnoreCase("")) { //|| cbFuncao.getSelectedIndex() == 0
            JOptionPane.showMessageDialog(null, "Dados incompletos, por favor tente novamente.");
        } else {
            nome = tfNome.getText();
            endereco = tfEndereco.getText();
            cpf = aux.getCpf();
            telefone = tfTelefone.getText();
            salBase = tfSalBase.getText();

            if (aux instanceof Gerente) {
                Gerente aux2 = new Gerente(nome, endereco, cpf, telefone, salBase);
                TelaInicial.padaria.updateFuncionario(aux2);
                JOptionPane.showMessageDialog(null, "Funcionario atualizado com Sucesso!");
                this.dispose();
            } else if (aux instanceof Vendedor) {
                Vendedor aux2 = new Vendedor(nome, endereco, cpf, telefone, salBase);
                TelaInicial.padaria.updateFuncionario(aux2);
                JOptionPane.showMessageDialog(null, "Funcionario atualizado com Sucesso!");
                this.dispose();
            } else if (aux instanceof Padeiro) {
                hAlt = tfHoraAlternativa.getText();
                hNorm = tfHoraNormal.getText();
                if (hAlt.equalsIgnoreCase("") || hNorm.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Dados incompletos, por favor tente novamente.");
                } else {
                    Padeiro aux2 = new Padeiro(nome, endereco, cpf, telefone, salBase, hNorm, hAlt);
                    TelaInicial.padaria.updateFuncionario(aux2);
                    JOptionPane.showMessageDialog(null, "Funcionario atualizado com Sucesso!");
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlendereco;
    private javax.swing.JLabel jlnome;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfHoraAlternativa;
    private javax.swing.JTextField tfHoraNormal;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalBase;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables

}
