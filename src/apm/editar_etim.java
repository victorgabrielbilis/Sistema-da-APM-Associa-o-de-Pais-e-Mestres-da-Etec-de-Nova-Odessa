/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apm;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

/**
 *
 * @author V
 */
public class editar_etim extends javax.swing.JFrame {

    public String res = "";
    public String modalidade = "";
    public String curso2 = "";
    int i = 0;
    JTextField[] ed = new JTextField[13];
    /**
     * Creates new form editar
     */
    public editar_etim() {
        initComponents();
        this.setLocationRelativeTo(null);
        URL url = this.getClass().getResource("icone.png");  
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        resp = new javax.swing.JTextField();
        data_insc = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        pago = new javax.swing.JTextField();
        receber = new javax.swing.JTextField();
        data_1 = new javax.swing.JTextField();
        data_2 = new javax.swing.JTextField();
        rec_1 = new javax.swing.JTextField();
        resp_1 = new javax.swing.JTextField();
        rec_2 = new javax.swing.JTextField();
        resp_2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        curso = new javax.swing.JComboBox();
        mod = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel1.setText("Nº:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel3.setText("Responsável:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, -1, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel4.setText("Data de inscrição:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, -1, -1));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel5.setText("Valor - APM/Camiseta:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, -1, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel6.setText("Pago:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, -1, -1));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel7.setText("A receber:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 275, -1, -1));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel8.setText("Data 1º pagamento:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 301, -1, -1));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel9.setText("Data 2º pagamento:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 327, -1, -1));

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel10.setText("Recebimento 1º pagamento:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 353, -1, -1));

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel11.setText("Resp. pelo recebimento:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 379, -1, -1));

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel12.setText("Recebimento 2º pagamento:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 405, -1, -1));

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel13.setText("Resp. pelo recebimento:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 431, -1, -1));

        num.setEditable(false);
        getContentPane().add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 58, 244, -1));
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 141, 243, -1));
        getContentPane().add(resp, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 167, 243, -1));
        getContentPane().add(data_insc, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 193, 243, -1));
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 219, 243, -1));
        getContentPane().add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 245, 243, -1));
        getContentPane().add(receber, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 271, 243, -1));
        getContentPane().add(data_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 297, 243, -1));
        getContentPane().add(data_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 323, 243, -1));
        getContentPane().add(rec_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 349, 243, -1));
        getContentPane().add(resp_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 375, 243, -1));

        rec_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rec_2ActionPerformed(evt);
            }
        });
        getContentPane().add(rec_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 401, 243, -1));
        getContentPane().add(resp_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 427, 243, -1));

        jButton1.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jButton1.setText("EDITAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel14.setText("Curso:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, -1, -1));

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel15.setText("Modalidade:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, -1, -1));

        getContentPane().add(curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 84, 244, -1));

        mod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Etim", "Técnico" }));
        getContentPane().add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 244, -1));

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel16.setText("EDITAR ADESÃO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        functions func = new functions();
        int cod = Integer.parseInt(num.getText());
        func.sql2("DELETE FROM adesao_etim WHERE cod=" + cod + ";");
        func.sql("INSERT INTO adesao_etim VALUES(" + cod + ",'" + mod.getSelectedItem() + "',"
                + "'" + curso.getSelectedItem() + "',"
                + "'" + nome.getText() + "',"
                + "'" + resp.getText() + "',"
                + "'" + data_insc.getText() + "',"
                + "'" + valor.getText() + "',"
                + "'" + pago.getText() + "',"
                + "'" + receber.getText() + "',"
                + "'" + data_1.getText() + "',"
                + "'" + data_2.getText() + "',"
                + "'" + rec_1.getText() + "',"
                + "'" + resp_1.getText() + "',"
                + "'" + rec_2.getText() + "',"
                + "'" + resp_2.getText() + "');");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rec_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rec_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rec_2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fill();       
        ed[0] = num;
        ed[1] = nome;
        ed[2] = resp;
        ed[3] = data_insc;
        ed[4] = valor;
        ed[5] = pago;
        ed[6] = receber;
        ed[7] = data_1;
        ed[8] = data_2;
        ed[9] = rec_1;
        ed[10] = resp_1;
        ed[11] = rec_2;
        ed[12]= resp_2;
        String partes[] = res.split(";");
        while(i < partes.length)
        {
            ed[i].setText(partes[i]);
            i++;
        }
        mod.setSelectedItem(modalidade);
        curso.setSelectedItem(curso2);
        
        
    }//GEN-LAST:event_formWindowOpened
    public void fill() {
        try {
            functions func = new functions();
            DefaultComboBoxModel lista = new DefaultComboBoxModel();
            String res = func.listCurso("SELECT * FROM curso ORDER BY nome ASC;");
            String partes[] = res.split("&");
            int i = 0;
            while (i < partes.length) {
                lista.addElement(partes[i]);
                i++;
            }

            curso.setModel(lista);
        } catch (Exception e) {
            System.out.println(e);
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
            java.util.logging.Logger.getLogger(editar_etim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editar_etim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editar_etim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editar_etim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editar_etim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox curso;
    private javax.swing.JTextField data_1;
    private javax.swing.JTextField data_2;
    private javax.swing.JTextField data_insc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox mod;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField num;
    private javax.swing.JTextField pago;
    private javax.swing.JTextField rec_1;
    private javax.swing.JTextField rec_2;
    private javax.swing.JTextField receber;
    private javax.swing.JTextField resp;
    private javax.swing.JTextField resp_1;
    private javax.swing.JTextField resp_2;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
