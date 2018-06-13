package caixeiroviajante;

import com.alee.laf.WebLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        try {
            UIManager.setLookAndFeel(new WebLookAndFeel());
        } catch (Exception e) {
        }

        initComponents();
        ativaBotoes(false);
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
        jPanel3 = new javax.swing.JPanel();
        jButtonAdicionarCidade = new javax.swing.JButton();
        jButtonRemoverCidade = new javax.swing.JButton();
        jButtonIniciar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextResultado = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxElitismo = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxCidadesAleatorias = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxApresentacaoGrafica = new javax.swing.JCheckBoxMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(626, 382));
        setPreferredSize(new java.awt.Dimension(626, 382));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jButtonAdicionarCidade.setText("Adicionar Cidade");
        jButtonAdicionarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarCidadeActionPerformed(evt);
            }
        });

        jButtonRemoverCidade.setText("Remover Cidade");
        jButtonRemoverCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverCidadeActionPerformed(evt);
            }
        });

        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdicionarCidade)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonIniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRemoverCidade, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButtonAdicionarCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemoverCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonIniciar)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jTextResultado.setColumns(20);
        jTextResultado.setRows(5);
        jScrollPane2.setViewportView(jTextResultado);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Acesse o menu Configurações para verificar os seguintes parâmetros:\n\n1) Ativar Elitismo\n2) Gerar Aleatóriamente Cidades\n3) Apresentação gráfica do resultado.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jMenu2.setText("Configurações");

        jCheckBoxElitismo.setSelected(true);
        jCheckBoxElitismo.setText("Ativar Elitismo");
        jCheckBoxElitismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxElitismoActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxElitismo);

        jCheckBoxCidadesAleatorias.setSelected(true);
        jCheckBoxCidadesAleatorias.setText("Gerar cidades aleatóriamente");
        jCheckBoxCidadesAleatorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCidadesAleatoriasActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxCidadesAleatorias);

        jCheckBoxApresentacaoGrafica.setSelected(true);
        jCheckBoxApresentacaoGrafica.setText("Apresentação Gráfica");
        jMenu2.add(jCheckBoxApresentacaoGrafica);

        jMenuBar1.add(jMenu2);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jCheckBoxElitismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxElitismoActionPerformed

    }//GEN-LAST:event_jCheckBoxElitismoActionPerformed

    private void jCheckBoxCidadesAleatoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCidadesAleatoriasActionPerformed
        ativaBotoes(!jCheckBoxCidadesAleatorias.getState());
    }//GEN-LAST:event_jCheckBoxCidadesAleatoriasActionPerformed

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed

        Populacao populacao;

        if (jCheckBoxCidadesAleatorias.getState()) {
            populacao = CaixeiroViajante.gerarPopulacaoAleatoria();
        } else {
            //Validar variáveis de inicialização
            populacao = new Populacao(50, true);
        }

        //Verificar se na Classe AlgoritmoGenetico é o melhor lugar para setar o parâmetro abaixo
        AlgoritmoGenetico.setElitismo(jCheckBoxElitismo.getState());

        //populacao = CaixeiroViajante.aplicaAlgoritmoGenetico(populacao);

        apresentaResultado(populacao);
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jButtonAdicionarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarCidadeActionPerformed

        try {
            String nome_cidade = JOptionPane.showInputDialog("Digite o nome da Cidade");
            String x = JOptionPane.showInputDialog("Informe a posição X da cidade (número inteiro)");
            String y = JOptionPane.showInputDialog("Informe a posição Y da cidade (número inteiro)");

            Cidade cidade = new Cidade(nome_cidade, Integer.parseInt(x), Integer.parseInt(y));
            GerenciadorRota.addCidade(cidade);
            jTextResultado.append(cidade.toString() + " - Inserida com sucesso! \n");
        } catch (Exception e) {
            jTextResultado.append("Houve um erro ao inserir a cidade, algum dado informado é inválido \n");
        }

    }//GEN-LAST:event_jButtonAdicionarCidadeActionPerformed

    private void jButtonRemoverCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverCidadeActionPerformed
        try {
            String indice = JOptionPane.showInputDialog("Digite o indice da cidade que deve ser removida");
            jTextResultado.append(GerenciadorRota.removeCidade(Integer.parseInt(indice)) + " - Removida com sucesso! \n");
        } catch (Exception e) {
            jTextResultado.append("Houve um erro ao remover a cidade \n");
        }
    }//GEN-LAST:event_jButtonRemoverCidadeActionPerformed

    /*Funções do sistema*/
    private void ativaBotoes(boolean ativa) {
        jButtonAdicionarCidade.setEnabled(ativa);
        jButtonRemoverCidade.setEnabled(ativa);
    }

    private void apresentaResultado(Populacao populacao) {        
        //Apresentação em forma de texto fica ativada sempre
        jTextResultado.append("Distância inicial: " + (int) populacao.getMelhorRota().getDistancia() + "\n");
        populacao = CaixeiroViajante.aplicaAlgoritmoGenetico(populacao);
        jTextResultado.append("Distância final: " + (int) populacao.getMelhorRota().getDistancia() + "\n");
        jTextResultado.append("Solução:" + "\n");
        jTextResultado.append(populacao.getMelhorRota().toString() + "\n");
        
        if (jCheckBoxApresentacaoGrafica.getState()) {
            //Apresentação Gráfica
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarCidade;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonRemoverCidade;
    private javax.swing.JCheckBoxMenuItem jCheckBoxApresentacaoGrafica;
    private javax.swing.JCheckBoxMenuItem jCheckBoxCidadesAleatorias;
    private javax.swing.JCheckBoxMenuItem jCheckBoxElitismo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextResultado;
    // End of variables declaration//GEN-END:variables
}
