/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Classes.Mesa;
import Conexao.MySQL;
import javax.swing.JOptionPane;

/**
 *
 * @author cauas
 */
public class CadastroMesa extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Mesa mesa = new Mesa(); 
    VisualizacaoPratos pratos = new VisualizacaoPratos();
    
    public CadastroMesa() {
        initComponents();
    }
    
    public void CadastrarMesa(Mesa mesa){
        this.conectar.conectaBanco();
        
        mesa.setQtdLugares((String) cbxQtdLugares.getSelectedItem());
        mesa.setObs(txtObs.getText());
        mesa.setNumMesa((String) cbxMesa.getSelectedItem());
        mesa.setCPF(txtCPF.getText());
        
        try{
            this.conectar.insertSQL("INSERT INTO Mesas ("
                    + "qtdLugares,"
                    + "numMesa,"
                    + "obs,"
                    + "CPF"
                  +") VALUES ("
                    + "'" + mesa.getQtdLugares()+ "',"
                    + "'" + mesa.getNumMesa()+ "',"
                    + "'" + mesa.getObs() + "',"
                    + "'" + mesa.getCPF() + "'"
                + ");");
        }catch (Exception e){
            System.out.println("Erro ao cadastrar mesa" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar mesa!");
        }finally{
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Mesa reservada com sucesso!");
        }
            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        lbl_voltar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxMesa = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxQtdLugares = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(116, 2, 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel2.setMinimumSize(new java.awt.Dimension(900, 120));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(116, 2, 2));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 320, 60));

        lbl_voltar.setForeground(new java.awt.Color(116, 2, 2));
        lbl_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/VOLTAR.png"))); // NOI18N
        lbl_voltar.setToolTipText("");
        lbl_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(lbl_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(116, 2, 2));
        jButton1.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 320, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/PROXIMO.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 930, 140));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Especificações da Mesa");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 450, 100));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Quantidade de lugares");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        cbxMesa.setBackground(new java.awt.Color(255, 255, 255));
        cbxMesa.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        cbxMesa.setForeground(new java.awt.Color(153, 153, 153));
        cbxMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 01", "Mesa 02", "Mesa 03", "Mesa 04", " " }));
        cbxMesa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cbxMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 190, 40));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Mesa a reservar");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/QTD.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        cbxQtdLugares.setBackground(new java.awt.Color(255, 255, 255));
        cbxQtdLugares.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        cbxQtdLugares.setForeground(new java.awt.Color(153, 153, 153));
        cbxQtdLugares.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 lugar\t", "2 lugares", "3 lugares", "4 lugares", "5 lugares", "6 lugares", "7 lugares", "8 lugares", " " }));
        cbxQtdLugares.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cbxQtdLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 190, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/QTD.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Observações para a mesa");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        txtObs.setBackground(new java.awt.Color(255, 255, 255));
        txtObs.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txtObs.setRows(5);
        txtObs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txtObs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 410, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/OBS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 510, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logo2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 340));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Insira seu CPF");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        txtCPF.setBackground(new java.awt.Color(255, 255, 255));
        txtCPF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 180, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/QTD.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CadastrarMesa(mesa);
        pratos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        VisualizacaoMesas mesas = new VisualizacaoMesas();
        mesas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    
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
            java.util.logging.Logger.getLogger(CadastroMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxMesa;
    private javax.swing.JComboBox<String> cbxQtdLugares;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_voltar;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextArea txtObs;
    // End of variables declaration//GEN-END:variables
}
