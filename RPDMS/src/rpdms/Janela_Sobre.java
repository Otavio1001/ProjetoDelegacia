/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpdms;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author 3855-1169
 */
public class Janela_Sobre extends javax.swing.JInternalFrame {

    
    public Janela_Sobre() {
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        initComponents();
    }
    
    private static Janela_Sobre myInstance; // Abre uma mesma janela por vez

    public static Janela_Sobre getInstance() {
        if (myInstance == null) {
        myInstance = new Janela_Sobre();
    }else{
            myInstance.dispose();
            myInstance = new Janela_Sobre();
        }
    return myInstance;
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
        jPanel2 = new javax.swing.JPanel();
        Sobre = new javax.swing.JLabel();
        Botão_X = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrição = new javax.swing.JTextArea();
        história = new javax.swing.JLabel();

        setBackground(new java.awt.Color(165, 165, 157));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210), null, null));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(115, 116, 111));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63), new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(230, 227, 218));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210), new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210), new java.awt.Color(67, 68, 63), new java.awt.Color(68, 67, 63))));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });

        Sobre.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        Sobre.setText("Sobre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(Sobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sobre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Botão_X.setBackground(new java.awt.Color(204, 0, 0));
        Botão_X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botão_X.setForeground(new java.awt.Color(210, 210, 210));
        Botão_X.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0))));
        Botão_X.setLabel("X");
        Botão_X.setPreferredSize(new java.awt.Dimension(34, 34));
        Botão_X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botão_XMouseClicked(evt);
            }
        });
        Botão_X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão_XActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        descrição.setEditable(false);
        descrição.setBackground(new java.awt.Color(188, 189, 184));
        descrição.setColumns(5);
        descrição.setFont(new java.awt.Font("RE3", 0, 18)); // NOI18N
        descrição.setLineWrap(true);
        descrição.setRows(15);
        descrição.setText("     O Departamento de Policia de Raccoon City foi fundado em 1969,\n quando a rápida expansão da cidade necessitou de uma força policial\n dedicada, indo além do Departamento de Xerife do condado de Arklay. \n     O Museu de artes de Raccoon City, no qual havia fechado, foi então\n comprado pela R.P.D. no mesmo ano para ser usado como sua base de \n operações, a Delegacia de Policia de Raccoon.\n     Quando o prefeito Michael Warren começou com os preparativos para\n o projeto \"Bright Raccoon 21\" no início dos anos de 1990, a força policial\n recebeu investimentos extras de várias companhias locais, incluindo a\n Umbrella USA, que queria garantir que a R.P.D. pudesse cuidar das\n crescentes taxas de crimes e as ameaças de terrorismo doméstico.\n Através desse investimento, o Serviço de Táticas e Resgate Especiais\n foi estabelecido.\n      Apesar dos S.T.A.R.S. não fosse parte da R.P.D., foi baseado dentro\n da Delegacia de Policia de Raccoon e seus oficiais mantinham o poder\n de prender assim como a policia local.");
        descrição.setToolTipText("");
        descrição.setWrapStyleWord(true);
        descrição.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210), null, null));
        jScrollPane1.setViewportView(descrição);

        história.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        história.setForeground(new java.awt.Color(240, 240, 240));
        história.setText("História");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(Botão_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(história)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botão_X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(história, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botão_XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botão_XActionPerformed

        MenuPrincipal.botão_umbrella.setEnabled(true);
        MenuPrincipal.Iniciar.setEnabled(true);
        
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/InterfaceSFX/Botão_sair.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        };
        
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Janela_Sobre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();
        this.getDesktopPane().remove(this);
        
    }//GEN-LAST:event_Botão_XActionPerformed
        
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    }//GEN-LAST:event_formMouseDragged
    
//Permite movimentar tela
    
    int posx,posy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        posx = evt.getX();
        posy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getX() + evt.getX() - posx, this.getY() + evt.getY() - posy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        posx = evt.getX();
        posy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(this.getX() + evt.getX() - posx, this.getY() + evt.getY() - posy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void Botão_XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botão_XMouseClicked
        
    }//GEN-LAST:event_Botão_XMouseClicked
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Botão_X;
    private javax.swing.JLabel Sobre;
    private javax.swing.JTextArea descrição;
    private javax.swing.JLabel história;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
