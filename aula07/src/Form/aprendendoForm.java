/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

/**
 *
 * @author CAMARGO
 */
public class aprendendoForm extends javax.swing.JFrame {

    /**
     * Creates new form aprendendoForm
     */
    public aprendendoForm() {
        initComponents();
        Desabilitar();

    }
void Desabilitar(){ 
 txt_n1.setEditable(false); 
txt_n2.setEditable(false); 
 txt_res.setEditable(false); 
 
 } 
void Habilitar(){ 
txt_n1.setEditable(true); 
txt_n2.setEditable(true); 
 txt_res.setEditable(true); 
 
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_soma = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        btn_mult = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_ret = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_limp = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_comp = new javax.swing.JButton();
        txt_n1 = new javax.swing.JTextField();
        txt_n2 = new javax.swing.JTextField();
        txt_res = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Programação de Computadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tekton Pro", 2, 30))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("N1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 51, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("N2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Resultado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        btn_soma.setText("+");
        btn_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_somaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_soma, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 314, -1, -1));

        btn_sub.setText("-");
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 314, -1, -1));

        btn_mult.setText("*");
        btn_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 314, -1, -1));

        btn_div.setText("/");
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel1.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 314, -1, -1));

        btn_ret.setText("Retornar");
        btn_ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ret, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 314, -1, -1));

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 394, -1, -1));

        btn_limp.setText("Limpar");
        btn_limp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limp, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 394, -1, -1));

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 394, -1, -1));

        btn_comp.setText("Comparação");
        jPanel1.add(btn_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 394, -1, -1));
        jPanel1.add(txt_n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, -1));

        txt_n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_n2ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 150, -1));

        txt_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resActionPerformed(evt);
            }
        });
        jPanel1.add(txt_res, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_somaActionPerformed
        // TODO add your handling code here:  
        int x, y, z; // Variáveis de apoio  
        String r;  // R string para receber valor  

        x = Integer.parseInt(txt_n1.getText()); //Mesclando o Campo com a variável      
        y = Integer.parseInt(txt_n2.getText());

        z = x + y;//operação   
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja aceito  
        txt_res.setText(r);// Camppo de resposta recebendo valor  


    }//GEN-LAST:event_btn_somaActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
        int x, y, z; // Variáveis de apoio  
        String r;  // R string para receber valor  

        x = Integer.parseInt(txt_n1.getText()); //Mesclando o Campo com a variável      
        y = Integer.parseInt(txt_n2.getText());

        z = x - y;//operação   
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja aceito  
        txt_res.setText(r);// Camppo de resposta recebendo valor  


    }//GEN-LAST:event_btn_subActionPerformed

    private void btn_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multActionPerformed
        int x, y, z; // Variáveis de apoio  
        String r;  // R string para receber valor  

        x = Integer.parseInt(txt_n1.getText()); //Mesclando o Campo com a variável      
        y = Integer.parseInt(txt_n2.getText());

        z = x * y;//operação   
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja aceito  
        txt_res.setText(r);// Camppo de resposta recebendo valor  


    }//GEN-LAST:event_btn_multActionPerformed

    private void txt_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        int x, y, z; // Variáveis de apoio  
        String r;  // R string para receber valor  

        x = Integer.parseInt(txt_n1.getText()); //Mesclando o Campo com a variável      
        y = Integer.parseInt(txt_n2.getText());

        z = x / y;//operação   
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja aceito  
        txt_res.setText(r);// Camppo de resposta recebendo valor  


    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retActionPerformed
        abertura x = new abertura();

        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_retActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_limpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpActionPerformed
        txt_n1.setText("");
        txt_n2.setText("");
        txt_res.setText("");

    }//GEN-LAST:event_btn_limpActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
Habilitar();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void txt_n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_n2ActionPerformed

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
            java.util.logging.Logger.getLogger(aprendendoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aprendendoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aprendendoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aprendendoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aprendendoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comp;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_limp;
    private javax.swing.JButton btn_mult;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_ret;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_soma;
    private javax.swing.JButton btn_sub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_n1;
    private javax.swing.JTextField txt_n2;
    private javax.swing.JTextField txt_res;
    // End of variables declaration//GEN-END:variables
}
