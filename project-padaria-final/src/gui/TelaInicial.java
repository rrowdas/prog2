/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Clientes.Clientes;
import Produtos.NaoPereciveis;
import Produtos.Pereciveis;
import Fornecedores.Ocasional;
import Fornecedores.Recorrente;
import Funcionarios.Gerente;
import Funcionarios.Padeiro;
import Funcionarios.Vendedor;
import PadTremBao.PadTremBao;
import gui.internals.clientes.CadastrarCliente;
import gui.internals.clientes.ListarCliente;
import gui.internals.clientes.RemoverCliente;
import gui.internals.fornecedores.CadastrarFornecedor;
import gui.internals.fornecedores.ListarFornecedor;
import gui.internals.fornecedores.RemoverFornecedor;
import gui.internals.funcionarios.CadastrarFuncionario;
import gui.internals.funcionarios.ListarFuncionario;
import gui.internals.funcionarios.RemoverFuncionario;
import gui.internals.estoque.CadastrarProdutos;
import gui.internals.estoque.ListarProdutos;
import gui.internals.estoque.RemoverProdutos;
import gui.internals.vendas.NovaVenda;

/**
 *
 * @author roger
 */
public class TelaInicial extends javax.swing.JFrame {

    public static PadTremBao padaria = new PadTremBao();

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();

        Clientes c1 = new Clientes("Menino Neymar", "14 de julho", "99999999999", "4002-6400");

        c1.imprimeDados();
        //Aplicando os sets aqui!
        c1.setNome("Junior");
        c1.setCpf("100012378945");
        c1.setEndereco("Bosque dos Ypes");
        c1.setTelefone("4002-8922");
        c1.setAcumuladoCompras(150);
        c1.imprimeDados();

        Clientes c2 = new Clientes("Coutinho", "Marechal Rondon", "00000000000", "9214-7412");
        Clientes c3 = new Clientes("Marcelo camisa 6", "Euclides da Cunha", "11111111111", "7894-1563");
        Clientes c4 = new Clientes("Gabriel Jesus", "Afonso Pena", "22222222222", "4569-8712");
        Clientes c5 = new Clientes("Antonio", "Bom Pastor", "33333333333", "1645-2398");
        Clientes c6 = new Clientes("Alex", "Rua Goias", "44444444444", "3305-5033");
        Clientes c7 = new Clientes("Wesley", "Mato Grosso", "55555555555", "7777-8888");
        Clientes c8 = new Clientes("Rodrigo", "Rua Jupiter", "66666666666", "4563-2198");
        Clientes c9 = new Clientes("Pedro", "Rua Ceara", "77777777777", "7412-5896");
        Clientes c10 = new Clientes("Isabela", "Rua 3 Coracoes", "88888888888", "7412-5896");

        c2.setAcumuladoCompras(201);

        c3.setAcumuladoCompras(250);

        c4.setAcumuladoCompras(100);

        c5.setAcumuladoCompras(120);

        padaria.cadastraCliente(c1);
        padaria.cadastraCliente(c2);
        padaria.cadastraCliente(c3);
        padaria.cadastraCliente(c4);
        padaria.cadastraCliente(c5);
        padaria.cadastraCliente(c6);
        padaria.cadastraCliente(c7);
        padaria.cadastraCliente(c8);
        padaria.cadastraCliente(c9);
        padaria.cadastraCliente(c10);

        Ocasional oc1 = new Ocasional("Anderson", "Calogeras", "00000000000000");
        Ocasional oc2 = new Ocasional("Flavio", "Rua Aleatoria", "11111111111111");
        Ocasional oc3 = new Ocasional("Rafael", "Centro", "22222222222222");
        Ocasional oc4 = new Ocasional("Henrique", "Jarim Paulista", "33333333333333");
        Recorrente rec5 = new Recorrente("Alexandra", "Rua Amazonas", "44444444444444", "0.3");
        Recorrente rec6 = new Recorrente("Wesley", "Mato Grosso", "55555555555555", "0.4");
        Recorrente rec7 = new Recorrente("Renata", "Rua Jupiter", "66666666666666", "0.4");

        padaria.cadastraFornecedor(oc1);
        padaria.cadastraFornecedor(oc2);
        padaria.cadastraFornecedor(oc3);
        padaria.cadastraFornecedor(oc4);
        padaria.cadastraFornecedor(rec5);
        padaria.cadastraFornecedor(rec6);
        padaria.cadastraFornecedor(rec7);
//nome, endereco, cpf, telefone, salarioBase

        Padeiro padeiro1 = new Padeiro("Cesar", "Centro", "00000000000", "4433-3344", "1300.00", "40", "12");
        Vendedor ven2 = new Vendedor("Otavio", "Tres Barras", "11111111111", "3300-4747", "1100.00");
        Vendedor ven3 = new Vendedor("Joana", "Zona Norte", "22222222222", "4400-0044", "1000.00");
        Gerente ger4 = new Gerente("Gabriel", "Av. Paulista", "33333333333", "7474-0000", "2000.00");
        Padeiro padeiro5 = new Padeiro("Jonathan", "Liberdade", "44444444444", "1212-2121", "1150.00", "20", "10");

        padaria.cadastraFuncionario(padeiro1);
        padaria.cadastraFuncionario(ven2);
        padaria.cadastraFuncionario(ven3);
        padaria.cadastraFuncionario(ger4);
        padaria.cadastraFuncionario(padeiro5);

//                 milho, macarrão, feijão, soja, arroz, café, fubá, açúcar, polvilho, farinha de trigo, cevada, farelo de trigo, leite em pó, óleo, biscoitos, pipoca, achocolatado e gelatina em pó.  
        NaoPereciveis milho = new NaoPereciveis("Milho", "111111", "11111111111111", "2.00", "6.00", "50");
        NaoPereciveis cafe = new NaoPereciveis("Cafe", "222222", "22222222222222", "2.00", "8.00", "100");
        NaoPereciveis gelatinaEmPo = new NaoPereciveis("Gelatina em pó", "333333", "33333333333333", "1.00", "4.00", "50");
        NaoPereciveis acucar = new NaoPereciveis("Acucar", "444444", "44444444444444", "3.00", "6.00", "40");
        NaoPereciveis trigo = new NaoPereciveis("Farinha de Trigo", "555555", "55555555555555", "3.00", "5.00", "50");
        NaoPereciveis leite = new NaoPereciveis("Leite em pó", "66666", "11111111111111", "1.50", "4.00", "60");
        NaoPereciveis trakinas = new NaoPereciveis("Trakinas", "777777", "33333333333333", "1.00", "3.50", "50");
        NaoPereciveis oleo = new NaoPereciveis("Oleo", "888888", "22222222222222", "1.50", "3.50", "40");
        NaoPereciveis achocolatado = new NaoPereciveis("Achocolatado", "999999", "22222222222222", "2.00", "5.00", "30");
        NaoPereciveis fuba = new NaoPereciveis("Fuba", "101010", "55555555555555", "2.00", "6.00", "20");

        Pereciveis pao = new Pereciveis("Pão", "000000", "00000000000000", "5.00", "13.00", "Cacetinho", "40", "12", "12", "2018");
        Pereciveis brigadeiro = new Pereciveis("Brigadeiro", "111222", "00000000000000", "1.00", "3.00", "Negrinho", "60", "1", "12", "2019");
        Pereciveis geladinho = new Pereciveis("Geladinho", "111000", "00000000000000", "0.50", "2.00", "Chup-chup", "50", "25", "11", "2019");
        Pereciveis mingau = new Pereciveis("Mingau", "123000", "11111111111111", "4.00", "10.00", "Canjica", "30", "12", "3", "2019");
        Pereciveis aimpim = new Pereciveis("Aimpim", "787878", "00000000000000", "6.00", "9.00", "Mandioca", "40", "21", "7", "2019");
        Pereciveis esfiha = new Pereciveis("Esfiha", "020202", "66666666666666", "2.00", "4.00", "100", "26", "10", "2019");
        Pereciveis chipa = new Pereciveis("Chipa", "808080", "66666666666666", "2.00", "4.00", "Pao de queijo", "100", "23", "4", "2019");
        Pereciveis pastel = new Pereciveis("Pastel", "141414", "66666666666666", "2.00", "4.00", "100", "13", "7", "2019");
        Pereciveis quibe = new Pereciveis("Quibe", "505050", "66666666666666", "2.00", "4.00", "100", "29", "8", "2019");
        Pereciveis enroladinho = new Pereciveis("Enroladinho", "313131", "66666666666666", "2.00", "4.00", "100", "6", "6", "2019");
        
        padaria.estoque.cadastrarProduto(milho);
        padaria.estoque.cadastrarProduto(cafe);
        padaria.estoque.cadastrarProduto(gelatinaEmPo);
        padaria.estoque.cadastrarProduto(acucar);
        padaria.estoque.cadastrarProduto(trigo);
        padaria.estoque.cadastrarProduto(leite);
        padaria.estoque.cadastrarProduto(trakinas);
        padaria.estoque.cadastrarProduto(oleo);
        padaria.estoque.cadastrarProduto(achocolatado);
        padaria.estoque.cadastrarProduto(fuba);
        padaria.estoque.cadastrarProduto(pao);
        padaria.estoque.cadastrarProduto(brigadeiro);
        padaria.estoque.cadastrarProduto(geladinho);
        padaria.estoque.cadastrarProduto(mingau);
        padaria.estoque.cadastrarProduto(aimpim);
        padaria.estoque.cadastrarProduto(esfiha);
        padaria.estoque.cadastrarProduto(chipa);
        padaria.estoque.cadastrarProduto(pastel);
        padaria.estoque.cadastrarProduto(quibe);
        padaria.estoque.cadastrarProduto(enroladinho);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Clientes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmListaCliente = new javax.swing.JMenuItem();
        Fornecedores = new javax.swing.JMenu();
        jmCadastrarFornecedor = new javax.swing.JMenuItem();
        jmRemoverFornecedor = new javax.swing.JMenuItem();
        jmListarFornecedor = new javax.swing.JMenuItem();
        Funcionarios = new javax.swing.JMenu();
        jmCadastrarFornecedor1 = new javax.swing.JMenuItem();
        jmRemoverFornecedor1 = new javax.swing.JMenuItem();
        jmListarFornecedor1 = new javax.swing.JMenuItem();
        Estoque = new javax.swing.JMenu();
        jmCadastrarFornecedor2 = new javax.swing.JMenuItem();
        jmRemoverFornecedor2 = new javax.swing.JMenuItem();
        jmListarFornecedor2 = new javax.swing.JMenuItem();
        mRealizarVenda = new javax.swing.JMenu();
        jmNovaVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpPrincipalLayout = new javax.swing.GroupLayout(dpPrincipal);
        dpPrincipal.setLayout(dpPrincipalLayout);
        dpPrincipalLayout.setHorizontalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        dpPrincipalLayout.setVerticalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );

        Clientes.setText("Clientes");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Clientes.add(jMenuItem1);

        jMenuItem3.setText("Remover");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Clientes.add(jMenuItem3);

        jmListaCliente.setText("Listar e Editar");
        jmListaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaClienteActionPerformed(evt);
            }
        });
        Clientes.add(jmListaCliente);

        jMenuBar1.add(Clientes);

        Fornecedores.setText("Fornecedores");

        jmCadastrarFornecedor.setText("Cadastrar");
        jmCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarFornecedorActionPerformed(evt);
            }
        });
        Fornecedores.add(jmCadastrarFornecedor);

        jmRemoverFornecedor.setText("Remover");
        jmRemoverFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRemoverFornecedorActionPerformed(evt);
            }
        });
        Fornecedores.add(jmRemoverFornecedor);

        jmListarFornecedor.setText("Listar e Editar");
        jmListarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarFornecedorActionPerformed(evt);
            }
        });
        Fornecedores.add(jmListarFornecedor);

        jMenuBar1.add(Fornecedores);

        Funcionarios.setText("Funcionários");

        jmCadastrarFornecedor1.setText("Cadastrar");
        jmCadastrarFornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarFornecedor1ActionPerformed(evt);
            }
        });
        Funcionarios.add(jmCadastrarFornecedor1);

        jmRemoverFornecedor1.setText("Remover");
        jmRemoverFornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRemoverFornecedor1ActionPerformed(evt);
            }
        });
        Funcionarios.add(jmRemoverFornecedor1);

        jmListarFornecedor1.setText("Listar e Editar");
        jmListarFornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarFornecedor1ActionPerformed(evt);
            }
        });
        Funcionarios.add(jmListarFornecedor1);

        jMenuBar1.add(Funcionarios);

        Estoque.setText("Estoque");

        jmCadastrarFornecedor2.setText("Cadastrar");
        jmCadastrarFornecedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarFornecedor2ActionPerformed(evt);
            }
        });
        Estoque.add(jmCadastrarFornecedor2);

        jmRemoverFornecedor2.setText("Remover");
        jmRemoverFornecedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRemoverFornecedor2ActionPerformed(evt);
            }
        });
        Estoque.add(jmRemoverFornecedor2);

        jmListarFornecedor2.setText("Listar e Editar");
        jmListarFornecedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarFornecedor2ActionPerformed(evt);
            }
        });
        Estoque.add(jmListarFornecedor2);

        jMenuBar1.add(Estoque);

        mRealizarVenda.setText("Venda");

        jmNovaVenda.setText("Nova");
        jmNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNovaVendaActionPerformed(evt);
            }
        });
        mRealizarVenda.add(jmNovaVenda);

        jMenuBar1.add(mRealizarVenda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastrarCliente addCliente = new CadastrarCliente();
        dpPrincipal.add(addCliente);
        addCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmListaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaClienteActionPerformed
        // TODO add your handling code here:
        ListarCliente addCliente = new ListarCliente();
        dpPrincipal.add(addCliente);
        addCliente.setVisible(true);
    }//GEN-LAST:event_jmListaClienteActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        RemoverCliente r = new RemoverCliente();
        dpPrincipal.add(r);
        r.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarFornecedorActionPerformed
        CadastrarFornecedor addFornecedor = new CadastrarFornecedor();
        dpPrincipal.add(addFornecedor);
        addFornecedor.setVisible(true);
    }//GEN-LAST:event_jmCadastrarFornecedorActionPerformed

    private void jmListarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarFornecedorActionPerformed
        ListarFornecedor addFornecedor = new ListarFornecedor();
        dpPrincipal.add(addFornecedor);
        addFornecedor.setVisible(true);
    }//GEN-LAST:event_jmListarFornecedorActionPerformed

    private void jmRemoverFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRemoverFornecedorActionPerformed
        RemoverFornecedor rmFornecedor = new RemoverFornecedor();
        dpPrincipal.add(rmFornecedor);
        rmFornecedor.setVisible(true);
    }//GEN-LAST:event_jmRemoverFornecedorActionPerformed

    private void jmCadastrarFornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarFornecedor1ActionPerformed
        CadastrarFuncionario addFunc = new CadastrarFuncionario();
        dpPrincipal.add(addFunc);
        addFunc.setVisible(true);

    }//GEN-LAST:event_jmCadastrarFornecedor1ActionPerformed

    private void jmRemoverFornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRemoverFornecedor1ActionPerformed
        RemoverFuncionario rmFunc = new RemoverFuncionario();
        dpPrincipal.add(rmFunc);
        rmFunc.setVisible(true);
    }//GEN-LAST:event_jmRemoverFornecedor1ActionPerformed

    private void jmListarFornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarFornecedor1ActionPerformed
        ListarFuncionario lsF = new ListarFuncionario();
        dpPrincipal.add(lsF);
        lsF.setVisible(true);
    }//GEN-LAST:event_jmListarFornecedor1ActionPerformed

    private void jmCadastrarFornecedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarFornecedor2ActionPerformed
        CadastrarProdutos addP = new CadastrarProdutos();
        dpPrincipal.add(addP);
        addP.setVisible(true);
    }//GEN-LAST:event_jmCadastrarFornecedor2ActionPerformed

    private void jmListarFornecedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarFornecedor2ActionPerformed
        ListarProdutos lsP = new ListarProdutos();
        dpPrincipal.add(lsP);
        lsP.setVisible(true);
    }//GEN-LAST:event_jmListarFornecedor2ActionPerformed

    private void jmRemoverFornecedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRemoverFornecedor2ActionPerformed
        RemoverProdutos addP = new RemoverProdutos();
        dpPrincipal.add(addP);
        addP.setVisible(true);
    }//GEN-LAST:event_jmRemoverFornecedor2ActionPerformed

    private void jmNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNovaVendaActionPerformed
       NovaVenda addV = new NovaVenda();
       dpPrincipal.add(addV);
       addV.setVisible(true);
    }//GEN-LAST:event_jmNovaVendaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenu Estoque;
    private javax.swing.JMenu Fornecedores;
    private javax.swing.JMenu Funcionarios;
    public static javax.swing.JDesktopPane dpPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmCadastrarFornecedor;
    private javax.swing.JMenuItem jmCadastrarFornecedor1;
    private javax.swing.JMenuItem jmCadastrarFornecedor2;
    private javax.swing.JMenuItem jmListaCliente;
    private javax.swing.JMenuItem jmListarFornecedor;
    private javax.swing.JMenuItem jmListarFornecedor1;
    private javax.swing.JMenuItem jmListarFornecedor2;
    private javax.swing.JMenuItem jmNovaVenda;
    private javax.swing.JMenuItem jmRemoverFornecedor;
    private javax.swing.JMenuItem jmRemoverFornecedor1;
    private javax.swing.JMenuItem jmRemoverFornecedor2;
    private javax.swing.JMenu mRealizarVenda;
    // End of variables declaration//GEN-END:variables
}
