package org.marcelo.sw.gui;

public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
        Hilo1 h= new Hilo1();
        Hilo2 h2=new Hilo2();
        Hilo3 h3=new Hilo3();
        h.start();
        h2.start();
        h3.start();
        
        
        
        
    }

    public class Hilo1 extends Thread {

        private int contador;

        @Override
        public void run() {
            contador = 0;
            while (true) {
                contador++;
                lblNum1.setText(String.valueOf(contador));
                try {

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
        }

    }
    
        public class Hilo2 extends Thread {

        private int contador;

        @Override
        public void run() {
            contador = 0;
            while (true) {
                contador++;
                lblNum2.setText(String.valueOf(contador));
                try {

                    Thread.sleep(1500);
                } catch (InterruptedException ex) {

                }
            }
        }

    }
        
            public class Hilo3 extends Thread {

        private int contador;

        @Override
        public void run() {
            contador = 0;
            while (true) {
                contador++;
                lblNum3.setText(String.valueOf(contador));
                try {

                    Thread.sleep(2000);
                } catch (InterruptedException ex) {

                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNum2 = new javax.swing.JLabel();
        lblNum1 = new javax.swing.JLabel();
        lblNum3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNum2.setText("num2");

        lblNum1.setText("num1");

        lblNum3.setText("num3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNum3)
                    .addComponent(lblNum1)
                    .addComponent(lblNum2))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lblNum1)
                .addGap(18, 18, 18)
                .addComponent(lblNum2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNum3)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblNum3;
    // End of variables declaration//GEN-END:variables
}
