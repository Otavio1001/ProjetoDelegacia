/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpdms;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 3855-1169
 */
public class Caso extends javax.swing.JFrame {

    /**
     * Creates new form Perfil
     */
    public Caso() {
        this.setUndecorated(true);
        this.setBackground(new Color(0,0,0,0));
        initComponents();
    }
    
private static Caso myInstance; // Abre uma mesma janela por vez

    public static Caso getInstance() {
        if (myInstance == null) {
        myInstance = new Caso();
    }else{
            myInstance.dispose();
            myInstance = new Caso();
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
        text_nomeSuspeito = new javax.swing.JTextField();
        text_nomeCivil = new javax.swing.JTextField();
        text_nomePolicial = new javax.swing.JTextField();
        text_prio = new javax.swing.JTextField();
        text_condição = new javax.swing.JTextField();
        text_NOcorrencia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_descrição = new javax.swing.JTextArea();
        Salvar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        text_NCaso = new javax.swing.JTextField();
        case_closed = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_nomeSuspeito.setEditable(false);
        text_nomeSuspeito.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        text_nomeSuspeito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_nomeSuspeito.setBorder(null);
        text_nomeSuspeito.setOpaque(false);
        text_nomeSuspeito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_nomeSuspeitoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_nomeSuspeitoKeyTyped(evt);
            }
        });
        jPanel1.add(text_nomeSuspeito, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 379, 321, 20));

        text_nomeCivil.setEditable(false);
        text_nomeCivil.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        text_nomeCivil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_nomeCivil.setBorder(null);
        text_nomeCivil.setOpaque(false);
        text_nomeCivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_nomeCivilKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_nomeCivilKeyTyped(evt);
            }
        });
        jPanel1.add(text_nomeCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 296, 20));

        text_nomePolicial.setEditable(false);
        text_nomePolicial.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        text_nomePolicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_nomePolicial.setBorder(null);
        text_nomePolicial.setOpaque(false);
        text_nomePolicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_nomePolicialKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_nomePolicialKeyTyped(evt);
            }
        });
        jPanel1.add(text_nomePolicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 302, 275, 20));

        text_prio.setEditable(false);
        text_prio.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        text_prio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_prio.setBorder(null);
        text_prio.setOpaque(false);
        text_prio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_prioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_prioKeyTyped(evt);
            }
        });
        jPanel1.add(text_prio, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 418, 80, 20));

        text_condição.setEditable(false);
        text_condição.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        text_condição.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_condição.setBorder(null);
        text_condição.setOpaque(false);
        text_condição.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_condiçãoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_condiçãoKeyTyped(evt);
            }
        });
        jPanel1.add(text_condição, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 418, 103, 20));

        text_NOcorrencia.setEditable(false);
        text_NOcorrencia.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        text_NOcorrencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_NOcorrencia.setBorder(null);
        text_NOcorrencia.setOpaque(false);
        text_NOcorrencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_NOcorrenciaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_NOcorrenciaKeyTyped(evt);
            }
        });
        jPanel1.add(text_NOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 263, 80, 20));

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(164, 20));

        text_descrição.setEditable(false);
        text_descrição.setBackground(new java.awt.Color(226, 212, 185));
        text_descrição.setColumns(20);
        text_descrição.setLineWrap(true);
        text_descrição.setWrapStyleWord(true);
        text_descrição.setPreferredSize(new java.awt.Dimension(160, 20));
        text_descrição.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_descriçãoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_descriçãoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(text_descrição);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 500, 454, 180));

        Salvar.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        Salvar.setText("SALVAR");
        Salvar.setBorder(null);
        Salvar.setContentAreaFilled(false);
        jPanel1.add(Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 70, 60, 30));

        Fechar.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        Fechar.setText("FECHAR");
        Fechar.setBorder(null);
        Fechar.setContentAreaFilled(false);
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        jPanel1.add(Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 70, 60, 30));

        text_NCaso.setEditable(false);
        text_NCaso.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        text_NCaso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_NCaso.setBorder(null);
        text_NCaso.setOpaque(false);
        text_NCaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_NCasoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_NCasoKeyTyped(evt);
            }
        });
        jPanel1.add(text_NCaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 29, 100, 30));

        case_closed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/case_closed.png"))); // NOI18N
        jPanel1.add(case_closed, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 140, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/perfil_e_casos2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
// Permite movimentar a tela 
    
    int posx,posy;
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        posx = evt.getX();
        posy = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        this.setLocation(this.getX() + evt.getX() - posx, this.getY() + evt.getY() - posy);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
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
        this.remove(this);
    }//GEN-LAST:event_FecharActionPerformed

    private void text_nomePolicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_nomePolicialKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_backspace.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }else{
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }
    }//GEN-LAST:event_text_nomePolicialKeyTyped

    private void text_prioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_prioKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_backspace.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }else{
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }
    }//GEN-LAST:event_text_prioKeyTyped

    private void text_condiçãoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_condiçãoKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_backspace.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }else{
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }
    }//GEN-LAST:event_text_condiçãoKeyTyped

    private void text_NOcorrenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_NOcorrenciaKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_backspace.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }else{
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }
    }//GEN-LAST:event_text_NOcorrenciaKeyTyped

    private void text_descriçãoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_descriçãoKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_backspace.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }else{
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }
    }//GEN-LAST:event_text_descriçãoKeyTyped

    private void text_nomePolicialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_nomePolicialKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_espaço.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro");
            }

        }
    }//GEN-LAST:event_text_nomePolicialKeyPressed

    private void text_prioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_prioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_espaço.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro");
            }

        }
    }//GEN-LAST:event_text_prioKeyPressed

    private void text_condiçãoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_condiçãoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_espaço.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro");
            }

        }
    }//GEN-LAST:event_text_condiçãoKeyPressed

    private void text_NOcorrenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_NOcorrenciaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_espaço.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro");
            }

        }
    }//GEN-LAST:event_text_NOcorrenciaKeyPressed

    private void text_descriçãoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_descriçãoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_espaço.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro");
            }

        }
    }//GEN-LAST:event_text_descriçãoKeyPressed

    private void text_nomeCivilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_nomeCivilKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_espaço.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro");
            }

        }
    }//GEN-LAST:event_text_nomeCivilKeyPressed

    private void text_nomeCivilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_nomeCivilKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_backspace.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }else{
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }
    }//GEN-LAST:event_text_nomeCivilKeyTyped

    private void text_nomeSuspeitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_nomeSuspeitoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_espaço.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro");
            }

        }
    }//GEN-LAST:event_text_nomeSuspeitoKeyPressed

    private void text_nomeSuspeitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_nomeSuspeitoKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_backspace.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }else{
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }
    }//GEN-LAST:event_text_nomeSuspeitoKeyTyped

    private void text_NCasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_NCasoKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_backspace.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }else{
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro");
            }
        }
    }//GEN-LAST:event_text_NCasoKeyTyped

    private void text_NCasoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_NCasoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_SPACE){
            try {
                AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Digito_espaço.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start( );
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro");
            }

        }
    }//GEN-LAST:event_text_NCasoKeyPressed

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
            java.util.logging.Logger.getLogger(Caso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fechar;
    public javax.swing.JButton Salvar;
    public javax.swing.JLabel case_closed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField text_NCaso;
    public javax.swing.JTextField text_NOcorrencia;
    public javax.swing.JTextField text_condição;
    public javax.swing.JTextArea text_descrição;
    public javax.swing.JTextField text_nomeCivil;
    public javax.swing.JTextField text_nomePolicial;
    public javax.swing.JTextField text_nomeSuspeito;
    public javax.swing.JTextField text_prio;
    // End of variables declaration//GEN-END:variables
}
