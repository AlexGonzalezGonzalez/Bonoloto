/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25;

import java.awt.Point;

/**
 *
 * @author estudios
 */
public class Boletin25 extends javax.swing.JFrame {

    String cadena = "";
    String[] c = new String[6];
    int[] randoms = new int[6];
    int conta = 0;
    String[] split = new String[7];
    boolean aciertos=false;

    /**
     * Creates new form Boletin25
     */
    public Boletin25() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumeros = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNumeros.setEditable(false);
        txtNumeros.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "1", "2", "3", "4"},
                {"5", "6", "7", "8", "9"},
                {"10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19"},
                {"20", "21", "22", "23", "24"},
                {"25", "26", "27", "28", "29"},
                {"30", "31", "32", "33", "34"},
                {"35", "36", "37", "38", "39"},
                {"40", "41", "42", "43", "44"},
                {"45", "46", "47", "48", "49"}
            },
            new String [] {
                "", "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        c = cadena.split(" ");
        if (c.length != 7) {
            Point pr = this.jTable2.getMousePosition();
            int row = this.jTable2.rowAtPoint(pr);
            int colum = this.jTable2.columnAtPoint(pr);
            cadena = cadena + " " + (String) this.jTable2.getValueAt(row, colum);
            this.txtNumeros.setText(cadena);
        } else {
            this.jTable2.setEnabled(false);
            randoms = random();
            comparacion(randoms);
        }

    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(Boletin25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boletin25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boletin25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boletin25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boletin25().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable2;
    public javax.swing.JTextField txtNumeros;
    // End of variables declaration//GEN-END:variables
public int[] random() {
        for (int i = 0; i < 6; i++) {

            randoms[i] = (int) Math.floor(Math.random() *(50)+1);
        }

        return randoms;
    }

    public void comparacion(int[] randoms) {

        split = cadena.split(" ");
        
        

            for (int i = 0; i < randoms.length; i++) {
            
        

            if (randoms[i] == Integer.parseInt(split[1])) {
                conta++;
            }
            if (randoms[i] == Integer.parseInt(split[2])) {
                conta++;
            }
            if (randoms[i] == Integer.parseInt(split[3])) {
                conta++;
            }
            if (randoms[i] == Integer.parseInt(split[4])) {
                conta++;
            }
            if (randoms[i] == Integer.parseInt(split[5])) {
                conta++;
            }
            if (randoms[i] == Integer.parseInt(split[6])) {
                conta++;
            }
            }
            System.out.println("Has acertado "+conta+" numeros");
        
        for (int i = 0; i < randoms.length; i++) {
            System.out.println(randoms[i]);
        }

}
}
