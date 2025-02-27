/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Designer;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Jadhav
 */
public class Paint extends javax.swing.JFrame implements MouseMotionListener, ChangeListener {
    private Color color = Color.BLACK;
    int bsize = 3;    
    int esize = 3;
    private boolean brush = true;
    private boolean eraser = false;
    
    /**
     * Creates new form Paint
     */
    public Paint() {
        initComponents();
        jPanel3.addMouseMotionListener (this); 
        BrushSlider.addChangeListener(this);
        EraserSlider.addChangeListener(this);
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
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        BrushBtn = new javax.swing.JButton();
        EraserBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Colors = new javax.swing.JButton();
        newCanvas = new javax.swing.JButton();
        BrushSlider = new javax.swing.JSlider();
        EraserSlider = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PAINT");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        jButton2.setText("Home");
        jButton2.setToolTipText("HOME");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Brush Size");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 px ", "03 px", "05 px", "08 px", "10 px", "15 px", "18 px", "20 px" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        BrushBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BrushBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/brush.png"))); // NOI18N
        BrushBtn.setText("Brush");
        BrushBtn.setToolTipText("Brush");
        BrushBtn.setContentAreaFilled(false);
        BrushBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BrushBtn.setIconTextGap(-4);
        BrushBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BrushBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BrushBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrushBtnActionPerformed(evt);
            }
        });

        EraserBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EraserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eraser.png"))); // NOI18N
        EraserBtn.setText("Eraser");
        EraserBtn.setToolTipText("Eraser");
        EraserBtn.setContentAreaFilled(false);
        EraserBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EraserBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EraserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EraserBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Brush Size");
        jLabel2.setToolTipText("Brush Size");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Eraser Size");
        jLabel3.setToolTipText("Eraser Size");

        Colors.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Colors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/colors3.jpg"))); // NOI18N
        Colors.setText("Colors");
        Colors.setToolTipText("Choose Brush Color");
        Colors.setContentAreaFilled(false);
        Colors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Colors.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Colors.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Colors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorsActionPerformed(evt);
            }
        });

        newCanvas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newCanvas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new.png"))); // NOI18N
        newCanvas.setText("New Canvas");
        newCanvas.setToolTipText("New Canvas");
        newCanvas.setContentAreaFilled(false);
        newCanvas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newCanvas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newCanvas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newCanvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCanvasActionPerformed(evt);
            }
        });

        BrushSlider.setBackground(new java.awt.Color(255, 255, 255));
        BrushSlider.setMajorTickSpacing(3);
        BrushSlider.setMaximum(20);
        BrushSlider.setMinimum(2);
        BrushSlider.setMinorTickSpacing(3);
        BrushSlider.setPaintLabels(true);
        BrushSlider.setPaintTicks(true);
        BrushSlider.setToolTipText("Slide to Preffered Brush Size");
        BrushSlider.setValue(2);
        BrushSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        EraserSlider.setBackground(new java.awt.Color(255, 255, 255));
        EraserSlider.setMajorTickSpacing(3);
        EraserSlider.setMaximum(20);
        EraserSlider.setMinimum(2);
        EraserSlider.setMinorTickSpacing(3);
        EraserSlider.setPaintLabels(true);
        EraserSlider.setPaintTicks(true);
        EraserSlider.setToolTipText("Slide to Preffered Eraser Size");
        EraserSlider.setValue(2);
        EraserSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(BrushBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EraserBtn)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EraserSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BrushSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(Colors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(BrushSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Colors)
                    .addComponent(newCanvas)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(EraserBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(BrushBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EraserSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 930, 480));

        jPanel2.setBackground(new java.awt.Color(255, 202, 212));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Info.png"))); // NOI18N
        jButton1.setToolTipText("About Paint ");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editor.png"))); // NOI18N
        jButton3.setToolTipText("Go to Designer");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 70, 600));

        setSize(new java.awt.Dimension(1016, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        WelcomePage wp = new WelcomePage();
        wp.show();
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Editor ed = new Editor();
        ed.show();
        
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

  
    
    private void BrushBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrushBtnActionPerformed
        brush = true;
        eraser = false;
        jPanel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
//        Cursor c = null;
//        try {
//            c = Cursor.getSystemCustomCursor("Invalid.16x16");
//        } catch (AWTException | HeadlessException ex) {
//            Logger.getLogger(Paint.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        BrushBtn.setCursor(c);
    }//GEN-LAST:event_BrushBtnActionPerformed

    private void EraserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EraserBtnActionPerformed
        brush = false;
        eraser = true;
        jPanel3.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }//GEN-LAST:event_EraserBtnActionPerformed

    private void newCanvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCanvasActionPerformed
        Graphics g = jPanel3.getGraphics();    
        g.setColor(Color.white);    
        g.fillRect(0,0,920,480);
    }//GEN-LAST:event_newCanvasActionPerformed

    private void ColorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorsActionPerformed
        color = JColorChooser.showDialog(this, "Select a Color", color);
        
        if(color == null){
            color = Color.WHITE;
        }
    }//GEN-LAST:event_ColorsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JOptionPane.showMessageDialog(this, "Welcome to PAINT \n"
               + "The Cursor chnages to HAND CURSOR when using brush \n"
               + "The Cursor chnages to CROSSHAIR CURSOR when using eraser \n"
               + "To Change the Color of the brush click on COLOR button \n"
               + "To Open new Canvas click on NEW CANVAS button");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrushBtn;
    private javax.swing.JSlider BrushSlider;
    private javax.swing.JButton Colors;
    private javax.swing.JButton EraserBtn;
    private javax.swing.JSlider EraserSlider;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton newCanvas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseDragged(MouseEvent e) {
        if (brush){
            Graphics g = jPanel3.getGraphics();    
            g.setColor (color);    
            g.fillOval (e.getX(), e.getY(), bsize, bsize);  
        }
        else if(eraser){
            Graphics g = jPanel3.getGraphics();    
            g.setColor (Color.WHITE);    
            g.fillOval (e.getX(), e.getY(), esize, esize); 
        }
        
    
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
//        System.out.println("This is getting executed!!1");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        @Override
        public void stateChanged(ChangeEvent e)
        {
            bsize = (int)BrushSlider.getValue();        
            esize = (int)EraserSlider.getValue();
        }
    }
  

