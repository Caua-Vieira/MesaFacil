/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Classes.Prato;
import Conexao.MySQL;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author cauas
 */
public class CadastroPrato extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Prato prato = new Prato();

    
    public CadastroPrato() {
        initComponents();
    }
   
   
    
    public void CadastrarPrato(Prato prato, String salada){
        this.conectar.conectaBanco();
        
        prato.setNumPrato((String) cbxNumPrato.getSelectedItem());
        prato.setBebida((String) cbxBebida.getSelectedItem());
        prato.setObs(txtObs.getText());
        prato.setCPF(txtCPF.getText());
        
        try{
            this.conectar.insertSQL("INSERT INTO Pratos ("
                    + "numPrato,"
                    + "salada,"
                    + "bebida,"
                    + "obs,"
                    + "CPF"
                  +") VALUES ("
                    + "'" + prato.getNumPrato()+ "',"
                    + "'" + salada + "',"
                    + "'" + prato.getBebida()+ "',"
                    + "'" + prato.getObs() + "',"
                    + "'" + prato.getCPF() + "'"
                + ");");
        }catch (Exception e){
            System.out.println("Erro ao cadastrar pedido" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar pedido!");
        }finally{
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Pedito realizado com sucesso!"
                    + "\nAo chegar no restaurante seu pedido começara a ser preparado");
        }
            
    }

    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        lbl_voltar = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxNumPrato = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbxBebida = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnSim = new javax.swing.JRadioButton();
        btnNao = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(116, 2, 2));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMinimumSize(new java.awt.Dimension(930, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(900, 120));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 120));
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

        btnCadastrar.setBackground(new java.awt.Color(116, 2, 2));
        btnCadastrar.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 320, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/PROXIMO.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 930, 140));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Número do prato desejado");
        jLabel1.setMaximumSize(new java.awt.Dimension(140, 15));
        jLabel1.setMinimumSize(new java.awt.Dimension(140, 15));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logo2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 340));

        cbxNumPrato.setBackground(new java.awt.Color(255, 255, 255));
        cbxNumPrato.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        cbxNumPrato.setForeground(new java.awt.Color(153, 153, 153));
        cbxNumPrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prato 01", "Prato 02", "Prato 03", "Prato 04" }));
        cbxNumPrato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbxNumPrato.setPreferredSize(new java.awt.Dimension(91, 25));
        jPanel1.add(cbxNumPrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 190, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/QTD.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Qual bebida deseja");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 120, -1));

        cbxBebida.setBackground(new java.awt.Color(255, 255, 255));
        cbxBebida.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        cbxBebida.setForeground(new java.awt.Color(153, 153, 153));
        cbxBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coca Cola lata R$ 4,50", "Sprite lata R$ 4,50", "Suco de laranja R$ 3.50", "Suco de morango R$ 3,50", "Suco de maracujá R$ 3,50", "Suco de uva R$ 3,50", " " }));
        cbxBebida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cbxBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 190, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/QTD.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 240, -1));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Insira seu CPF");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        btnSim.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup.add(btnSim);
        btnSim.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        btnSim.setForeground(new java.awt.Color(0, 0, 0));
        btnSim.setText("Sim");
        btnSim.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(btnSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        btnNao.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup.add(btnNao);
        btnNao.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        btnNao.setForeground(new java.awt.Color(0, 0, 0));
        btnNao.setText("Nao");
        btnNao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(btnNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Deseja salada como entrada?");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/QTD.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 240, -1));

        txtObs.setBackground(new java.awt.Color(255, 255, 255));
        txtObs.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txtObs.setRows(5);
        txtObs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txtObs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 420, 150));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Observações para a mesa");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/OBS.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 520, -1));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Especificações do Prato");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 450, 100));

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
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 180, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/QTD.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        VisualizacaoPratos prato = new VisualizacaoPratos();
        prato.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        btnGroup.add(btnNao);
        btnGroup.add(btnSim);
        String salada;
        
        if(btnNao.isSelected()) {
            salada = prato.setSalada("Não");
        } else {
            salada = prato.setSalada("Sim");
        }
        
        CadastrarPrato(prato, salada);
         
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JRadioButton btnNao;
    private javax.swing.JRadioButton btnSim;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxBebida;
    private javax.swing.JComboBox<String> cbxNumPrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_voltar;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextArea txtObs;
    // End of variables declaration//GEN-END:variables
}
