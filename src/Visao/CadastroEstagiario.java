package Visao;

import Controle.ControleEstagiario;
import javax.swing.JOptionPane;
import Modelo.Estagiario;
import aulaqualidade.AulaQualidade;
import java.util.ArrayList;
import java.sql.SQLException;

public class CadastroEstagiario extends javax.swing.JPanel {

    ControleEstagiario acessoEstagiario = new ControleEstagiario();

    public CadastroEstagiario() {
        initComponents();
        acessoEstagiario.Pesquisar();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelCurso = new javax.swing.JLabel();
        jLabelPeriodo = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldMatricula = new javax.swing.JTextField();
        jTextFieldCurso = new javax.swing.JTextField();
        jTextFieldPeriodo = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstagiario = new javax.swing.JTable();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setText("Estagiários");

        jLabelNome.setText("Nome");

        jLabelMatricula.setText("Matrícula");

        jLabelCurso.setText("Curso");

        jLabelPeriodo.setText("Período");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jTableEstagiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableEstagiario);

        jButtonPrimeiro.setText("Primeiro");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setText("Próximo");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonUltimo.setText("Último");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPeriodo)
                            .addComponent(jLabelCurso)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelMatricula)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(jTextFieldCurso)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldMatricula))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMatricula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCurso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeriodo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonVoltar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrimeiro)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonUltimo))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        String matricula = jTextFieldMatricula.getText();
        String nome = jTextFieldNome.getText();
        String curso = jTextFieldCurso.getText();
        String periodo = jTextFieldPeriodo.getText();

        Estagiario estagiario = new Estagiario(matricula, nome, curso, periodo);

        try {
            acessoEstagiario.InserirEstagiario(estagiario);

        } catch (Exception e) {
            e.printStackTrace();
        }

        jTextFieldMatricula.setText("");
        jTextFieldNome.setText("");
        jTextFieldCurso.setText("");
        jTextFieldPeriodo.setText("");

        JOptionPane.showMessageDialog(null, "Estagiário Cadastrado");
        AulaQualidade.janela.setContentPane(AulaQualidade.CadastroEstagiario);
        AulaQualidade.janela.setVisible(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
        String matricula = jTextFieldMatricula.getText();
        String nome = jTextFieldNome.getText();
        String curso = jTextFieldCurso.getText();
        String periodo = jTextFieldPeriodo.getText();

        Estagiario estagiario = new Estagiario(matricula, nome, curso, periodo);

        try {
            acessoEstagiario.UpdateEstagiario(estagiario);
        } catch (Exception e) {
            e.printStackTrace();
        }

        jTextFieldMatricula.setText("");
        jTextFieldNome.setText("");
        jTextFieldCurso.setText("");
        jTextFieldPeriodo.setText("");

        JOptionPane.showMessageDialog(null, "Estagiário Atualizado!");
        AulaQualidade.janela.setContentPane(AulaQualidade.CadastroEstagiario);
        AulaQualidade.janela.setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        String matricula = jTextFieldMatricula.getText();
        String nome = jTextFieldNome.getText();
        String curso = jTextFieldCurso.getText();
        String periodo = jTextFieldPeriodo.getText();

        Estagiario estagiario = new Estagiario(matricula, nome, curso, periodo);

        try {
            acessoEstagiario.DeletaEstagiario(estagiario);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "Estagiário Excluído!");
        AulaQualidade.janela.setContentPane(AulaQualidade.CadastroEstagiario);
        AulaQualidade.janela.setVisible(true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        AulaQualidade.janela.setContentPane(AulaQualidade.MenuAluno);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
        try {
            acessoEstagiario.result.isFirst();
            jTextFieldMatricula.setText(acessoEstagiario.result.getString("matricula"));
            jTextFieldNome.setText(acessoEstagiario.result.getString("nome"));
            jTextFieldCurso.setText(acessoEstagiario.result.getString("curso"));
            jTextFieldPeriodo.setText(acessoEstagiario.result.getString("periodo"));

            if (acessoEstagiario.result.isFirst()) {
                jButtonPrimeiro.setEnabled(true);
                jButtonProximo.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        try {
            acessoEstagiario.result.previous();
            jTextFieldMatricula.setText(acessoEstagiario.result.getString("matricula"));
            jTextFieldNome.setText(acessoEstagiario.result.getString("nome"));
            jTextFieldCurso.setText(acessoEstagiario.result.getString("curso"));
            jTextFieldPeriodo.setText(acessoEstagiario.result.getString("periodo"));

            if (acessoEstagiario.result.previous()) {
                jButtonProximo.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
        try {
            while (acessoEstagiario.result.next()) {
                jTextFieldMatricula.setText(acessoEstagiario.result.getString("matricula"));
                jTextFieldNome.setText(acessoEstagiario.result.getString("nome"));
                jTextFieldCurso.setText(acessoEstagiario.result.getString("curso"));
                jTextFieldPeriodo.setText(acessoEstagiario.result.getString("periodo"));
                if (acessoEstagiario.result.next()) {
                    jButtonProximo.setEnabled(false);
                }
                jButtonAnterior.setEnabled(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // TODO add your handling code here:
        try {
            while (acessoEstagiario.result.isLast()) {
                jTextFieldMatricula.setText(acessoEstagiario.result.getString("matricula"));
                jTextFieldNome.setText(acessoEstagiario.result.getString("nome"));
                jTextFieldCurso.setText(acessoEstagiario.result.getString("curso"));
                jTextFieldPeriodo.setText(acessoEstagiario.result.getString("periodo"));
                if (acessoEstagiario.result.isLast()) {
                    jButtonUltimo.setEnabled(false);
                }
                jButtonAnterior.setEnabled(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    public void preencherTabela() {
        ArrayList dados = new ArrayList();
        String[] colunas = {"Matrícula", "Nome", "Curso", "Período"};
        try {
            while (acessoEstagiario.result.next()) {
                dados.add(new Object[]{acessoEstagiario.result.getString("matricula"),
                    acessoEstagiario.result.getString("nome"),
                    acessoEstagiario.result.getString("curso"),
                    acessoEstagiario.result.getString("periodo")});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableEstagiario.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstagiario;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeriodo;
    // End of variables declaration//GEN-END:variables
}