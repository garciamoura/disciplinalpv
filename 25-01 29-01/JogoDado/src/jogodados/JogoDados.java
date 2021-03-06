/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodados;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriela
 */
public class JogoDados extends javax.swing.JFrame {
    int dado1, dado2, soma;
    
    public JogoDados() {
        initComponents();
        painel_aposta.setVisible(false);
        painel_resultado.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_lancardado = new javax.swing.JButton();
        painel_aposta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fld_aposta = new javax.swing.JTextField();
        bt_jogar = new javax.swing.JButton();
        painel_resultado = new javax.swing.JPanel();
        scrollpane_resultado = new javax.swing.JScrollPane();
        txtarea_resultado = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_lancardado.setFont(new java.awt.Font("BatmanForeverAlternate", 1, 14)); // NOI18N
        bt_lancardado.setText("LANÇAR DADOS");
        bt_lancardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lancardadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Aposta:");

        bt_jogar.setFont(new java.awt.Font("BatmanForeverAlternate", 1, 14)); // NOI18N
        bt_jogar.setText("JOGAR");
        bt_jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_jogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_apostaLayout = new javax.swing.GroupLayout(painel_aposta);
        painel_aposta.setLayout(painel_apostaLayout);
        painel_apostaLayout.setHorizontalGroup(
            painel_apostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_apostaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(fld_aposta)
                .addContainerGap())
            .addGroup(painel_apostaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(bt_jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        painel_apostaLayout.setVerticalGroup(
            painel_apostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_apostaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(painel_apostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fld_aposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(bt_jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        txtarea_resultado.setColumns(20);
        txtarea_resultado.setRows(5);
        scrollpane_resultado.setViewportView(txtarea_resultado);

        jButton1.setFont(new java.awt.Font("BatmanForeverAlternate", 1, 14)); // NOI18N
        jButton1.setText("NOVO JOGO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_resultadoLayout = new javax.swing.GroupLayout(painel_resultado);
        painel_resultado.setLayout(painel_resultadoLayout);
        painel_resultadoLayout.setHorizontalGroup(
            painel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_resultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpane_resultado)
                .addContainerGap())
            .addGroup(painel_resultadoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        painel_resultadoLayout.setVerticalGroup(
            painel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_resultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpane_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painel_aposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_lancardado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addComponent(painel_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painel_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(bt_lancardado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painel_aposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_lancardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lancardadoActionPerformed
        dado1 =  (int) ((Math.random()*6)) + 1;
        dado2 =  (int) ((Math.random()*6)) + 1;
        soma = dado1+dado2;
        
        painel_aposta.setVisible(true);
        
    }//GEN-LAST:event_bt_lancardadoActionPerformed

    private void bt_jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_jogarActionPerformed
        int aposta = Integer.parseInt(fld_aposta.getText());
        if((aposta == dado1) || (aposta == dado2) || (aposta == soma)){
            JOptionPane.showMessageDialog(null, "PARABÉS, VOCÊ ACERTOU \n");
       
        }else
        {
            JOptionPane.showMessageDialog(null,"VOCÊ ERROU, TENTE NOVAMENTE");
            
        }
        adicionaTextArea();      
    }//GEN-LAST:event_bt_jogarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        novoJogo();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void novoJogo(){
        painel_aposta.setVisible(false);
        fld_aposta.setText("");
        txtarea_resultado.setText("");
        painel_resultado.setVisible(false);
    }
    
    private void adicionaTextArea(){
        txtarea_resultado.setText("Soma: "+soma + "\n"
                + "Face1: " + dado1 + "\n"
                        + "Face2: " + dado2 + "\n");
        painel_resultado.setVisible(true);
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
            java.util.logging.Logger.getLogger(JogoDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_jogar;
    private javax.swing.JButton bt_lancardado;
    private javax.swing.JTextField fld_aposta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel painel_aposta;
    private javax.swing.JPanel painel_resultado;
    private javax.swing.JScrollPane scrollpane_resultado;
    private javax.swing.JTextArea txtarea_resultado;
    // End of variables declaration//GEN-END:variables
}
