/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package u1a6_mathmethods_atulr;
import java.text.DecimalFormat;
import java.math.RoundingMode;

/**
 *
 * @author Atul
 * Date: 2022-03-02
 * Name: Math Methods
 * Purpose: The purpose of this assignment is to implement the Math Class in Java in order to calculate various things.
 * The project helps us learn the different classes and features that java has, as well as how to implement them in creative
 * ways to help get the desired result.
 */
public class mathMethodsGUI extends javax.swing.JFrame {
        //Creating a new instance of the DecimalFormat class, to round decimal numbers
        DecimalFormat df = new DecimalFormat("#.##");
        
        
    /**
    * Finds the perimeter of a right triangle
    * @param numstring
    * @param num1
    * @param num2
    */
    public void trianglePerimeter(String[] numstring, double num1, double num2) {
        // Creating a decimal format so that bigger numbers get rounded to 2 decimal places
        df.setRoundingMode(RoundingMode.CEILING);
        //Finding the hypotenuse, which is the third side
        double hypot = (Math.hypot(num1, num2));
        
        //Adding them all up to find the perimeter, and make it a string so it can be displayed.
        String perimeter = String.valueOf(df.format(num1 + num2 + hypot));
        PerimeterOutput.setText(perimeter);   
    }
    /**
     * Rounds the numbers to a whole number, then multiplies them
     * @param numstring 
     * @param num1
     * @param num2
     * @return multiply, the multiplied integers
     */
    public static String roundedMultiplication(String[] numstring, double num1, double num2) {
        //Rounds the two numbers to whole numbers
        double round1 = Math.round(num1);
        double round2 = Math.round(num2);
        //Then multiplies them, and returns the value
        String multiply = String.valueOf(round1 * round2);
        return (multiply);
        
    }
    
    /**
     * Creates new form mathMethodsGUI
     * 
     */ 
    public mathMethodsGUI() {
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

        Title = new javax.swing.JLabel();
        InputLabelText = new javax.swing.JLabel();
        ExampleInput = new javax.swing.JLabel();
        InputNumberField = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        MinLabel = new javax.swing.JLabel();
        MaxLabel = new javax.swing.JLabel();
        MinOutput = new javax.swing.JTextField();
        MaxOutput = new javax.swing.JTextField();
        SineLabel = new javax.swing.JLabel();
        PowerLabel = new javax.swing.JLabel();
        SineOutput = new javax.swing.JTextField();
        PowerOutput = new javax.swing.JTextField();
        PerimeterLabel = new javax.swing.JLabel();
        RoundMultiplyLabel = new javax.swing.JLabel();
        PerimeterOutput = new javax.swing.JTextField();
        RoundMultiplyOutput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 51, 255));
        Title.setText("Math Methods");

        InputLabelText.setText("Input 2 Numbers");

        ExampleInput.setText("ex: \"1.1 2.3\"");

        InputNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNumberFieldActionPerformed(evt);
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

        MinLabel.setText("Smallest Number (Math.min)");

        MaxLabel.setText("Biggest Number (Math.max)");

        MinOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinOutputActionPerformed(evt);
            }
        });

        MaxOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxOutputActionPerformed(evt);
            }
        });

        SineLabel.setText("Round Numbers (Math.round)");

        PowerLabel.setText("First Number to the Power of Second Number (Math.pow)");

        SineOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SineOutputActionPerformed(evt);
            }
        });

        PowerOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerOutputActionPerformed(evt);
            }
        });

        PerimeterLabel.setText("Find Perimeter of a Right Triangle");

        RoundMultiplyLabel.setText("Round Numbers, then multiply");

        PerimeterOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerimeterOutputActionPerformed(evt);
            }
        });

        RoundMultiplyOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoundMultiplyOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(188, 188, 188))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InputLabelText, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(ExampleInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(InputNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit)
                    .addComponent(Calculate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MinOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(367, 402, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SineOutput)
                        .addGap(361, 361, 361))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SineLabel)
                                    .addComponent(PerimeterLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PerimeterOutput)
                                .addGap(41, 41, 41)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RoundMultiplyOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaxLabel)
                            .addComponent(PowerLabel)
                            .addComponent(PowerOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaxOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoundMultiplyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputLabelText)
                    .addComponent(InputNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExampleInput)
                    .addComponent(Exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MinLabel)
                    .addComponent(MaxLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MinOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaxOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SineLabel)
                    .addComponent(PowerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SineOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PowerOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PerimeterLabel)
                    .addComponent(RoundMultiplyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PerimeterOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoundMultiplyOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void InputNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNumberFieldActionPerformed
    
    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        //Setting the rounding format
        df.setRoundingMode(RoundingMode.CEILING);
        
        //Taking input, and splitting it to be two seperate numbers
        String[] numstring = InputNumberField.getText().split(" ");
        double num1 = Double.parseDouble(numstring[0]);
        double num2 = Double.parseDouble(numstring[1]);
        
        // Finding the smallest and biggest values from the input
        String minimum = String.valueOf(Math.min(num1,num2));
        String maximum = String.valueOf(Math.max(num1,num2));
        
        //Finding the sine values of the input
        String sine1 = String.valueOf(df.format(Math.sin(num1)));
        String sine2 = String.valueOf(df.format(Math.sin(num2)));
        
        //Finding the first number to the power of the second number
        String power = String.valueOf(df.format(Math.pow(num1,num2)));
       
        //Displaying all the calculated numbers
        MinOutput.setText(minimum);
        MaxOutput.setText(maximum);
        SineOutput.setText(sine1 + ", " + sine2);
        PowerOutput.setText(power);
        
        //Calling upon the trianglePerimeter function, which then displays the perimeter
        trianglePerimeter(numstring,num1,num2);
        
        //Setting the return value of the roundedMultiplication function to a string
        String RoundOutput = roundedMultiplication(numstring,num1,num2);
        //Then displaying it on the GUI
        RoundMultiplyOutput.setText(RoundOutput);
        
        
    }//GEN-LAST:event_CalculateActionPerformed

    private void MinOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinOutputActionPerformed

    private void MaxOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaxOutputActionPerformed

    private void SineOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SineOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SineOutputActionPerformed

    private void PowerOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PowerOutputActionPerformed

    private void PerimeterOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerimeterOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerimeterOutputActionPerformed

    private void RoundMultiplyOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoundMultiplyOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoundMultiplyOutputActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        //Exits the program
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(mathMethodsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mathMethodsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mathMethodsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mathMethodsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mathMethodsGUI().setVisible(true);
            }
        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JLabel ExampleInput;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel InputLabelText;
    private javax.swing.JTextField InputNumberField;
    private javax.swing.JLabel MaxLabel;
    private javax.swing.JTextField MaxOutput;
    private javax.swing.JLabel MinLabel;
    private javax.swing.JTextField MinOutput;
    private javax.swing.JLabel PerimeterLabel;
    private javax.swing.JTextField PerimeterOutput;
    private javax.swing.JLabel PowerLabel;
    private javax.swing.JTextField PowerOutput;
    private javax.swing.JLabel RoundMultiplyLabel;
    private javax.swing.JTextField RoundMultiplyOutput;
    private javax.swing.JLabel SineLabel;
    private javax.swing.JTextField SineOutput;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
