/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package u1a7_powers;

/**
 *
 * @author Atul
 * Date: 2022-03-10
 * Name: Powers
 * Purpose: The purpose of this project is to better learn how to use custom functions/methods in Java to
 * achieve the desired outcome. In this case given a user inputted base and exponent, the program calculates
 * all the powers of the exponent up to the given exponent number.
 */
public class PowersGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form PowersGUI
     */
    public PowersGUI() {
        super ("Power Calculator");
        initComponents();
    }
    /**
     * Calculates the powers of a number from 1 to the inputted exponent,
     * then displays them
     * @param base
     * @param exponent 
     */
    public void ExponentCalculation(int base, int exponent) {
        //First, clear the box so previous outputs dont stay in the box
        OutputBox.setText("");
        //Using a for loop, calculate the powers starting from 1 up to the exponent input
        for (int i = 1; i <= exponent; i++) {
            double power = Math.pow(base,i);
            //Set the text to the output textarea to show the value of the powers
            OutputBox.append(base + " to the exponent " + i + " = " + power + "\n");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        BaseLabel = new javax.swing.JLabel();
        ExponentLabel = new javax.swing.JLabel();
        BaseInput = new javax.swing.JTextField();
        ExponentInput = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(204, 204, 0));
        Title.setText("Power!");

        BaseLabel.setText("Enter the Base:");

        ExponentLabel.setText("Enter the Exponent:");

        BaseInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaseInputActionPerformed(evt);
            }
        });

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jScrollPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        OutputBox.setColumns(20);
        OutputBox.setRows(5);
        OutputBox.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                OutputBoxAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(OutputBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExponentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ExponentInput)
                            .addComponent(BaseInput, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(177, Short.MAX_VALUE)
                        .addComponent(Title)
                        .addGap(17, 17, 17)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Calculate)
                    .addComponent(Exit))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaseLabel)
                    .addComponent(BaseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExponentLabel)
                    .addComponent(ExponentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void BaseInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaseInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BaseInputActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        //Getting input from the text areas, and passing it into the function
        int base = Integer.parseInt(BaseInput.getText());
        int exponent = Integer.parseInt(ExponentInput.getText());
        ExponentCalculation(base, exponent);
    }//GEN-LAST:event_CalculateActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        //Exits the program
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void OutputBoxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_OutputBoxAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_OutputBoxAncestorAdded

    private void jScrollPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1AncestorAdded

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
            java.util.logging.Logger.getLogger(PowersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PowersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PowersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PowersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PowersGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BaseInput;
    private javax.swing.JLabel BaseLabel;
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField ExponentInput;
    private javax.swing.JLabel ExponentLabel;
    private javax.swing.JTextArea OutputBox;
    private javax.swing.JLabel Title;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
