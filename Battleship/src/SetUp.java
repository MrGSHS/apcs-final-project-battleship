
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author maorgozalzani
 */
public class SetUp extends javax.swing.JFrame {

    private String speed, size, row, col, patternW, patternL;
    Rectangle r1, r2, r3, r4, r5, r6;
    Battleship b1, b2, b3, b4, b5, b6;

    /**
     * Creates new form SetUp
     */
    public SetUp() {
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

        jPanel1 = new javax.swing.JPanel();
        SizeLabel = new javax.swing.JLabel();
        SpeedLabel = new javax.swing.JLabel();
        SpeedText = new javax.swing.JTextField();
        SizeText = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        bRow = new javax.swing.JLabel();
        RowText = new javax.swing.JTextField();
        bColLabel = new javax.swing.JLabel();
        ColText = new javax.swing.JTextField();
        PWidthLabel = new javax.swing.JLabel();
        PWidthText = new javax.swing.JTextField();
        PLengthLabel = new javax.swing.JLabel();
        PLengthText = new javax.swing.JTextField();
        AddShipButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SizeLabel.setText("Enter Size:");

        SpeedLabel.setText("Enter Speed");

        SpeedText.setText("          ");
        SpeedText.setToolTipText("Enter Speed");
        SpeedText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpeedTextMouseClicked(evt);
            }
        });
        SpeedText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeedTextActionPerformed(evt);
            }
        });
        SpeedText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SpeedTextKeyPressed(evt);
            }
        });

        SizeText.setText("          ");
        SizeText.setToolTipText("Enter size");
        SizeText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SizeTextMouseClicked(evt);
            }
        });
        SizeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeTextActionPerformed(evt);
            }
        });
        SizeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SizeTextKeyPressed(evt);
            }
        });

        bRow.setText("Enter Ship's Row:");

        RowText.setText("          ");
        RowText.setToolTipText("Enter Row");
        RowText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RowTextMouseClicked(evt);
            }
        });
        RowText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RowTextActionPerformed(evt);
            }
        });
        RowText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RowTextKeyPressed(evt);
            }
        });

        bColLabel.setText("Enter Ship's Col:");

        ColText.setText("          ");
        ColText.setToolTipText("Enter Column");
        ColText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ColTextMouseClicked(evt);
            }
        });
        ColText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColTextActionPerformed(evt);
            }
        });
        ColText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ColTextKeyPressed(evt);
            }
        });

        PWidthLabel.setText("Enter Pattern's Width:");

        PWidthText.setText("          ");
        PWidthText.setToolTipText("Enter Pattern's Width");
        PWidthText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PWidthTextMouseClicked(evt);
            }
        });
        PWidthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWidthTextActionPerformed(evt);
            }
        });
        PWidthText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PWidthTextKeyPressed(evt);
            }
        });

        PLengthLabel.setText("Enter Pattern's length:");

        PLengthText.setText("          ");
        PLengthText.setToolTipText("Enter Pattern Length");
        PLengthText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PLengthTextMouseClicked(evt);
            }
        });
        PLengthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLengthTextActionPerformed(evt);
            }
        });
        PLengthText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PLengthTextKeyPressed(evt);
            }
        });

        AddShipButton.setText("Add Ship");
        AddShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddShipButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SizeLabel)
                            .addComponent(SpeedLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpeedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PWidthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PWidthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddShipButton)
                            .addComponent(PLengthLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bRow)
                            .addComponent(bColLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ColText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RowText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SizeLabel)
                    .addComponent(SizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpeedLabel)
                    .addComponent(SpeedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bRow)
                    .addComponent(RowText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bColLabel)
                    .addComponent(ColText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PWidthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PWidthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PLengthLabel)
                    .addComponent(PLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddShipButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SpeedTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeedTextActionPerformed
        // TODO add your handling code here:
        speed = this.SpeedText.getText();
    }//GEN-LAST:event_SpeedTextActionPerformed

    private void SizeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeTextActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_SizeTextActionPerformed

    private void AddShipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddShipButtonActionPerformed
        // TODO add your handling code here:
        if (b1.getSize() == 0) {
            r1 = new Rectangle(Integer.parseInt(row), Integer.parseInt(col), Integer.parseInt(patternW), Integer.parseInt(patternL));
            b1 = new Battleship(Integer.parseInt(size), Integer.parseInt(speed), r1, Integer.parseInt(row), Integer.parseInt(col));
        }
        SizeText.setText("");
        SpeedText.setText("");
        RowText.setText("");
        ColText.setText("");
        PWidthText.setText("");
        PLengthText.setText("");

    }//GEN-LAST:event_AddShipButtonActionPerformed

    private void RowTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RowTextActionPerformed
        // TODO add your handling code here:
        row = RowText.getText();
    }//GEN-LAST:event_RowTextActionPerformed

    private void ColTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColTextActionPerformed
        // TODO add your handling code here:
        col = ColText.getText();
    }//GEN-LAST:event_ColTextActionPerformed

    private void PWidthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWidthTextActionPerformed
        // TODO add your handling code here:
        patternW = PWidthText.getText();
    }//GEN-LAST:event_PWidthTextActionPerformed

    private void PLengthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLengthTextActionPerformed
        // TODO add your handling code here:
        patternL = PLengthText.getText();
    }//GEN-LAST:event_PLengthTextActionPerformed

    private void SizeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SizeTextKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            size = this.SizeText.getText();
        }
    }//GEN-LAST:event_SizeTextKeyPressed

    private void SizeTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SizeTextMouseClicked
        // TODO add your handling code here:
        SizeText.requestFocusInWindow();
    }//GEN-LAST:event_SizeTextMouseClicked

    private void SpeedTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpeedTextMouseClicked
        // TODO add your handling code here:
        SpeedText.requestFocusInWindow();
    }//GEN-LAST:event_SpeedTextMouseClicked

    private void SpeedTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SpeedTextKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            speed = this.SpeedText.getText();
        }
    }//GEN-LAST:event_SpeedTextKeyPressed

    private void RowTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RowTextMouseClicked
        // TODO add your handling code here:
        RowText.requestFocusInWindow();
    }//GEN-LAST:event_RowTextMouseClicked

    private void RowTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RowTextKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            row = this.RowText.getText();
        }
    }//GEN-LAST:event_RowTextKeyPressed

    private void ColTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColTextMouseClicked
        // TODO add your handling code here:
        ColText.requestFocusInWindow();
    }//GEN-LAST:event_ColTextMouseClicked

    private void ColTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ColTextKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            col = this.ColText.getText();
        }
    }//GEN-LAST:event_ColTextKeyPressed

    private void PWidthTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PWidthTextMouseClicked
        // TODO add your handling code here:
        PWidthText.requestFocusInWindow();
    }//GEN-LAST:event_PWidthTextMouseClicked

    private void PWidthTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PWidthTextKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            patternW = this.PWidthText.getText();
        }
    }//GEN-LAST:event_PWidthTextKeyPressed

    private void PLengthTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PLengthTextMouseClicked
        // TODO add your handling code here:
        PLengthText.requestFocusInWindow();
    }//GEN-LAST:event_PLengthTextMouseClicked

    private void PLengthTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PLengthTextKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            patternL = this.PLengthText.getText();
        }
    }//GEN-LAST:event_PLengthTextKeyPressed

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
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddShipButton;
    private javax.swing.JTextField ColText;
    private javax.swing.JLabel PLengthLabel;
    private javax.swing.JTextField PLengthText;
    private javax.swing.JLabel PWidthLabel;
    private javax.swing.JTextField PWidthText;
    private javax.swing.JTextField RowText;
    private javax.swing.JLabel SizeLabel;
    private javax.swing.JTextField SizeText;
    private javax.swing.JLabel SpeedLabel;
    private javax.swing.JTextField SpeedText;
    private javax.swing.JLabel bColLabel;
    private javax.swing.JLabel bRow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
