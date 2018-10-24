/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internals.funcionarios;

import Funcionarios.Gerente;
import Funcionarios.Padeiro;
import Funcionarios.Vendedor;
import gui.TelaInicial;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class CadastrarFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarFuncionario() {
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
        jlnome = new javax.swing.JLabel();
        jlendereco = new javax.swing.JLabel();
        jlcpf = new javax.swing.JLabel();
        jlfuncao = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfHoraNormal = new javax.swing.JTextField();
        tfHoraAlternativa = new javax.swing.JTextField();
        ftfCpf = new javax.swing.JFormattedTextField();
        jbCadastrarFornecedores = new javax.swing.JButton();
        cbFuncao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfSalBase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastrar Funcionarios");
        setPreferredSize(new java.awt.Dimension(615, 315));

        jlnome.setText("Nome:");

        jlendereco.setText("Endereço:");

        jlcpf.setText("CPF:");

        jlfuncao.setText("Função:");

        jLabel4.setText("Jornada Normal:");

        tfHoraNormal.setEditable(false);
        tfHoraNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraNormalActionPerformed(evt);
            }
        });

        tfHoraAlternativa.setEditable(false);

        try {
            ftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfCpfActionPerformed(evt);
            }
        });

        jbCadastrarFornecedores.setText("Cadastrar");
        jbCadastrarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarFornecedoresActionPerformed(evt);
            }
        });

        cbFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Padeiro", "Vendedor", "Gerente" }));
        cbFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuncaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Telefone:");

        jLabel2.setText("Salário Base:");

        jLabel3.setText("Jornada Alternativa:");

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
                            .addComponent(jlfuncao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlnome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlendereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlcpf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftfCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(cbFuncao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfHoraNormal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSalBase, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfHoraAlternativa, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ftfCpf, tfEndereco, tfHoraNormal, tfNome});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jlcpf, jlendereco, jlfuncao, jlnome});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlnome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlendereco)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlcpf)
                    .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSalBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlfuncao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tfHoraNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfHoraAlternativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jbCadastrarFornecedores)
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

    private void ftfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfCpfActionPerformed

    private void jbCadastrarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarFornecedoresActionPerformed
        String nome, endereco, cpf, telefone, salBase, jNormal, jAlt;

        if (tfNome.getText().equalsIgnoreCase("") || tfEndereco.getText().equalsIgnoreCase("") || ftfCpf.getText().equalsIgnoreCase("           ") || tfTelefone.getText().equalsIgnoreCase("") || tfSalBase.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Dados incompletos, por favor tente novamente.");
        } else if (TelaInicial.padaria.consultaFuncionario(ftfCpf.getText()) != -1) {
            JOptionPane.showMessageDialog(null, "ERRO: CPF já cadastrado. Insira outro CPF válido.");
        } else {
            //System.out.println(tfNome.getText());
            nome = tfNome.getText();
            endereco = tfEndereco.getText();
            cpf = ftfCpf.getText();
            telefone = tfTelefone.getText();
            salBase = tfSalBase.getText();

            switch (cbFuncao.getSelectedIndex()) {
                case 3:
                    {
                        Gerente aux = new Gerente(nome, endereco, cpf, telefone, salBase);
                        TelaInicial.padaria.cadastraFuncionario(aux);
                        TelaInicial.padaria.imprimeDadosFuncionarios(cpf);
                        JOptionPane.showMessageDialog(null, "Funcionario cadastrado com Sucesso!");
                        this.dispose();
                        break;
                    }
                case 2:
                    {
                        Vendedor aux = new Vendedor(nome, endereco, cpf, telefone, salBase);
                        TelaInicial.padaria.cadastraFuncionario(aux);
                        TelaInicial.padaria.imprimeDadosFuncionarios(cpf);
                        JOptionPane.showMessageDialog(null, "Funcionario cadastrado com Sucesso!");
                        this.dispose();
                        break;
                    }
                case 1:
                    jNormal = tfHoraNormal.getText();
                    jAlt = tfHoraAlternativa.getText();
                    if (jAlt.equalsIgnoreCase("") || jNormal.equalsIgnoreCase("")) {
                        JOptionPane.showMessageDialog(null, "Dados incompletos, por favor tente novamente.");
                    }
                    else{
                        Padeiro aux = new Padeiro (nome, endereco, cpf, telefone, salBase, jNormal, jAlt);
                        TelaInicial.padaria.cadastraFuncionario(aux);
                        JOptionPane.showMessageDialog(null, "Funcionario cadastrado com Sucesso!");
                        this.dispose();
                        
                        
                    }   break;
                default:
                    break;
            }
    
}


    }//GEN-LAST:event_jbCadastrarFornecedoresActionPerformed

    private void cbFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuncaoActionPerformed
        int tipo 



= cbFuncao



.getSelectedIndex



();
        //System.out.println(tipo);
        



if (tipo 



== 1) {
            tfHoraNormal



.setEditable



(true);
            tfHoraAlternativa



.setEditable



(true);
        



} else
            tfHoraNormal



.setEditable



(false);
            tfHoraAlternativa



.setEditable



(false);
    }//GEN-LAST:event_cbFuncaoActionPerformed

    private void tfHoraNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraNormalActionPerformed

//        int tipo = cbTipoFornecedor.getSelectedIndex();
//        System.out.println(tipo);
//        if (tipo == 0) {
//            tfDesconto.setEditable(false);
//        }

    }//GEN-LAST:event_tfHoraNormalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbFuncao;
    private javax.swing.JFormattedTextField ftfCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCadastrarFornecedores;
    private javax.swing.JLabel jlcpf;
    private javax.swing.JLabel jlendereco;
    private javax.swing.JLabel jlfuncao;
    private javax.swing.JLabel jlnome;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfHoraAlternativa;
    private javax.swing.JTextField tfHoraNormal;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalBase;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
