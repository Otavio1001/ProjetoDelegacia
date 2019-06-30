/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpdms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author 3855-1169
 */
public class Janela_Casos_pendentes extends javax.swing.JInternalFrame {

    
public Janela_Casos_pendentes() {
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        initComponents();
        
        lista_casos.setRowHeight(30);
        // deixar visiveis apenas as colunas ID_Caso, ID_Ocorrêcnia, Prioridade e Condição
        
        escondeColuna(2);
        escondeColuna(3);
        escondeColuna(4);
        escondeColuna(7);
        
    }
    private static Janela_Casos_pendentes myInstance;// Abre uma mesma janela por vez
    
    public static Janela_Casos_pendentes getInstance() {
        if (myInstance == null) {
        myInstance = new Janela_Casos_pendentes();
    }
    return myInstance;
   }
    
    public void centralizarJanela(JInternalFrame jif){
        
        Dimension desktopSize = getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
            jif.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height- jInternalFrameSize.height)/2);
        jif.setVisible(true);
    }
    
    public void escondeColuna(int indice){
        lista_casos.getColumnModel().getColumn(indice).setMinWidth(0);
        lista_casos.getColumnModel().getColumn(indice).setMaxWidth(0);
        lista_casos.getColumnModel().getColumn(indice).setWidth(0);
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
        botão_pendentes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        botão_encerrados = new javax.swing.JButton();
        botão_arquivados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_casos = new javax.swing.JTable();
        Adicionar = new javax.swing.JButton();
        Arquivar = new javax.swing.JButton();
        Encerrar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();

        setBackground(new java.awt.Color(165, 165, 157));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210), null, null));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(535, 498));

        jPanel1.setBackground(new java.awt.Color(115, 116, 111));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63), new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210)));
        jPanel1.setPreferredSize(new java.awt.Dimension(523, 480));
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
        jPanel2.setPreferredSize(new java.awt.Dimension(622, 30));
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
        Sobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/icon_casos_mini.png"))); // NOI18N
        Sobre.setText("  Casos Documentados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(Sobre)
                .addContainerGap(115, Short.MAX_VALUE))
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
        Botão_X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão_XActionPerformed(evt);
            }
        });

        botão_pendentes.setBackground(new java.awt.Color(115, 116, 111));
        botão_pendentes.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        botão_pendentes.setForeground(new java.awt.Color(240, 240, 240));
        botão_pendentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/icon_casos_pendentes.png"))); // NOI18N
        botão_pendentes.setText("<html><u>Pendentes");
        botão_pendentes.setBorder(null);
        botão_pendentes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botão_pendentes.setOpaque(false);
        botão_pendentes.setPreferredSize(new java.awt.Dimension(231, 231));
        botão_pendentes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel3.setBackground(new java.awt.Color(81, 81, 79));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setPreferredSize(new java.awt.Dimension(345, 173));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botão_encerrados.setBackground(new java.awt.Color(81, 81, 79));
        botão_encerrados.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        botão_encerrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/icon_casos_encerrados.png"))); // NOI18N
        botão_encerrados.setText("<html><u>Encerrados");
        botão_encerrados.setBorder(null);
        botão_encerrados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botão_encerrados.setOpaque(false);
        botão_encerrados.setPreferredSize(new java.awt.Dimension(231, 231));
        botão_encerrados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botão_encerrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão_encerradosActionPerformed(evt);
            }
        });
        jPanel3.add(botão_encerrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 0, 173, 173));

        botão_arquivados.setBackground(new java.awt.Color(81, 81, 79));
        botão_arquivados.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        botão_arquivados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/icon_casos_arquivados.png"))); // NOI18N
        botão_arquivados.setText("<html><u>Arquivados");
        botão_arquivados.setBorder(null);
        botão_arquivados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botão_arquivados.setOpaque(false);
        botão_arquivados.setPreferredSize(new java.awt.Dimension(231, 231));
        botão_arquivados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botão_arquivados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão_arquivadosActionPerformed(evt);
            }
        });
        jPanel3.add(botão_arquivados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 173, 173));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(475, 207));

        lista_casos.setAutoCreateRowSorter(true);
        lista_casos.setFont(new java.awt.Font("RE3", 0, 18)); // NOI18N
        lista_casos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Caso", "ID Ocorrência", "Policial responsável", "Civil responsável", "Suspeito", "Prioridade", "Condição", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lista_casos.setMinimumSize(new java.awt.Dimension(120, 64));
        lista_casos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista_casosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista_casos);

        Adicionar.setFont(new java.awt.Font("RE3", 0, 18)); // NOI18N
        Adicionar.setText("Adicionar");
        Adicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Adicionar.setPreferredSize(new java.awt.Dimension(98, 34));
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });

        Arquivar.setFont(new java.awt.Font("RE3", 0, 18)); // NOI18N
        Arquivar.setText("Arquivar");
        Arquivar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Arquivar.setPreferredSize(new java.awt.Dimension(98, 34));
        Arquivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArquivarMouseClicked(evt);
            }
        });
        Arquivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArquivarActionPerformed(evt);
            }
        });

        Encerrar.setFont(new java.awt.Font("RE3", 0, 18)); // NOI18N
        Encerrar.setText("Encerrar");
        Encerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Encerrar.setPreferredSize(new java.awt.Dimension(98, 34));
        Encerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncerrarMouseClicked(evt);
            }
        });
        Encerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncerrarActionPerformed(evt);
            }
        });

        Editar.setFont(new java.awt.Font("RE3", 0, 18)); // NOI18N
        Editar.setText("Editar");
        Editar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Editar.setPreferredSize(new java.awt.Dimension(98, 34));
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(Arquivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Encerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Botão_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botão_pendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botão_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botão_pendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Encerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Arquivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addGap(4, 4, 4))
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
            Logger.getLogger(Janela_Casos_pendentes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();
        this.getDesktopPane().remove(this);
        
    }//GEN-LAST:event_Botão_XActionPerformed
            
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

    private void lista_casosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_casosMouseClicked
       int index = lista_casos.getSelectedRow();
        
        TableModel modelo = lista_casos.getModel();
        
        if(evt.getClickCount()==2){
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/lista_folha.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
        
        String id_caso = modelo.getValueAt(index, 0).toString();
        String id_ocorrencia = modelo.getValueAt(index, 1).toString();
        String nome_policial = modelo.getValueAt(index, 2).toString();
        String nome_civil = modelo.getValueAt(index, 3).toString();
        String suspeito = modelo.getValueAt(index, 4).toString();
        String prio = modelo.getValueAt(index, 5).toString();
        String condição = modelo.getValueAt(index, 6).toString();
        String descrição = modelo.getValueAt(index, 7).toString();
        
        Caso caso = Caso.getInstance();
        caso.case_closed.setVisible(false);
        caso.Salvar.setVisible(false);
        caso.setVisible(true);
        caso.pack();
        caso.setLocationRelativeTo(null);
        caso.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        caso.text_NCaso.setText(id_caso);
        caso.text_NOcorrencia.setText(id_ocorrencia);
        caso.text_nomePolicial.setText(nome_policial);
        caso.text_nomeCivil.setText(nome_civil);
        caso.text_nomeSuspeito.setText(suspeito);
        caso.text_prio.setText(prio);
        caso.text_condição.setText(condição);
        caso.text_descrição.setText(descrição);
        }
        
    }//GEN-LAST:event_lista_casosMouseClicked

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        final DefaultTableModel modelo = (DefaultTableModel)lista_casos.getModel();
        
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_select.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
        
        final Caso caso = Caso.getInstance();
        caso.case_closed.setVisible(false);
        caso.text_condição.setText("Pendente");
        caso.setVisible(true);
        
        caso.text_NCaso.setEditable(true);
        caso.text_NOcorrencia.setEditable(true);
        caso.text_nomePolicial.setEditable(true);
        caso.text_nomeCivil.setEditable(true);
        caso.text_nomeSuspeito.setEditable(true);
        caso.text_prio.setEditable(true);
        caso.text_descrição.setEditable(true);
        
        final Object[] linha = new Object[8];
        
        caso.Salvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try {
                    AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_select.wav"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(as);
                    clip.start( );
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Erro");
                }
                
                linha[0] = caso.text_NCaso.getText();
                linha[1] = caso.text_NOcorrencia.getText();
                linha[2] = caso.text_nomePolicial.getText();
                linha[3] = caso.text_nomeCivil.getText();
                linha[4] = caso.text_nomeSuspeito.getText();
                linha[5] = caso.text_prio.getText();
                linha[6] = caso.text_condição.getText();
                linha[7] = caso.text_descrição.getText();
                modelo.addRow(linha);
                caso.dispose();
            }
        });
    }//GEN-LAST:event_AdicionarActionPerformed

    private void botão_arquivadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão_arquivadosActionPerformed
        Janela_Casos_arquivados casos = Janela_Casos_arquivados.getInstance();
        
        casos.pack();
        
        if(casos.isVisible()){
            
        } else {
            getParent().add(casos);
            casos.setVisible(true);
        }
        
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_select.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
        
        String user = Janela_Login.Campo_Nome.getText();
        String pass = new String(Janela_Login.Campo_Senha.getPassword());
        
        if(user.equals("Brian Irons") && pass.equals("2236")){
            
           casos.Retomar.setVisible(true);
        }else{
           casos.Retomar.setVisible(false);
        }
        
        centralizarJanela(casos);
        
        dispose();
        this.getDesktopPane().remove(this);
    }//GEN-LAST:event_botão_arquivadosActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        int index = lista_casos.getSelectedRow();
        final TableModel modelo = lista_casos.getModel();
        
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_select.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
        
        String id_caso = modelo.getValueAt(index, 0).toString();
        String id_ocorrencia = modelo.getValueAt(index, 1).toString();
        String nome_policial = modelo.getValueAt(index, 2).toString();
        String nome_civil = modelo.getValueAt(index, 3).toString();
        String suspeito = modelo.getValueAt(index, 4).toString();
        String prio = modelo.getValueAt(index, 5).toString();
        String condição = modelo.getValueAt(index, 6).toString();
        String descrição = modelo.getValueAt(index, 7).toString();
        
        final Caso caso = Caso.getInstance();
        caso.case_closed.setVisible(false);
        caso.setVisible(true);
        caso.pack();
        caso.setLocationRelativeTo(null);
        caso.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        caso.text_NCaso.setEditable(true);
        caso.text_NOcorrencia.setEditable(true);
        caso.text_nomePolicial.setEditable(true);
        caso.text_nomeCivil.setEditable(true);
        caso.text_nomeSuspeito.setEditable(true);
        caso.text_prio.setEditable(true);
        caso.text_condição.setEditable(true);
        caso.text_descrição.setEditable(true);
        
        caso.text_NCaso.setText(id_caso);
        caso.text_NOcorrencia.setText(id_ocorrencia);
        caso.text_nomePolicial.setText(nome_policial);
        caso.text_nomeCivil.setText(nome_civil);
        caso.text_nomeSuspeito.setText(suspeito);
        caso.text_prio.setText(prio);
        caso.text_condição.setText(condição);
        caso.text_descrição.setText(descrição);
        
        caso.Salvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try {
                    AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_select.wav"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(as);
                    clip.start( );
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Erro");
                }
                
                int i = lista_casos.getSelectedRow();
                
                modelo.setValueAt(caso.text_NCaso.getText(), i, 0);
                modelo.setValueAt(caso.text_NOcorrencia.getText(), i, 1);
                modelo.setValueAt(caso.text_nomePolicial.getText(), i, 2);
                modelo.setValueAt(caso.text_nomeCivil.getText(), i, 3);
                modelo.setValueAt(caso.text_nomeSuspeito.getText(), i, 4);
                modelo.setValueAt(caso.text_prio.getText(), i, 5);
                modelo.setValueAt(caso.text_condição.getText(), i, 6);
                modelo.setValueAt(caso.text_descrição.getText(), i, 7);
                caso.dispose();
            }
        });
    }//GEN-LAST:event_EditarActionPerformed

    private void ArquivarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArquivarMouseClicked
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_select.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
    }//GEN-LAST:event_ArquivarMouseClicked

    private void ArquivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArquivarActionPerformed
        Janela_Casos_arquivados caso = Janela_Casos_arquivados.getInstance();
        
        int index = lista_casos.getSelectedRow();

        DefaultTableModel modelo = (DefaultTableModel)lista_casos.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel)Janela_Casos_arquivados.lista_casos.getModel();

        String id_caso = modelo.getValueAt(index, 0).toString();
        String id_ocorrencia = modelo.getValueAt(index, 1).toString();
        String nome_policial = modelo.getValueAt(index, 2).toString();
        String nome_civil = modelo.getValueAt(index, 3).toString();
        String suspeito = modelo.getValueAt(index, 4).toString();
        String prio = modelo.getValueAt(index, 5).toString();
        String condição = "Arquivado";
        String descrição = modelo.getValueAt(index, 7).toString();
        

        Object linha[] = new Object[8];

        linha[0] = id_caso;
        linha[1] = id_ocorrencia;
        linha[2] = nome_policial;
        linha[3] = nome_civil;
        linha[4] = suspeito;
        linha[5] = prio;
        linha[6] = condição;
        linha[7] = descrição;
        
        modelo2.addRow(linha);
        modelo.removeRow(index);
        
        mensagem m = mensagem.getInstance();
        getParent().add(m);
        m.toFront();
        m.setVisible(true);
        m.descrição.setForeground(new Color(51,204,0));
        m.descrição.setText("<html><b><font color='WHITE'>Caso </font>Arquivado<font color='WHITE'> !</font>");
        centralizarJanela(m);
        
        caso.dispose();
        caso.getDesktopPane().remove(caso);
    }//GEN-LAST:event_ArquivarActionPerformed

    private void botão_encerradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão_encerradosActionPerformed
        Janela_Casos_encerrados caso = Janela_Casos_encerrados.getInstance();
        
        caso.pack();
        
        if(caso.isVisible()){
            
        }else{
            getParent().add(caso);
            caso.setVisible(true);
        }
        
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_select.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
        
        String user = Janela_Login.Campo_Nome.getText();
        String pass = new String(Janela_Login.Campo_Senha.getPassword());
        
        if(user.equals("Brian Irons") && pass.equals("2236")){
            
           caso.Remover.setVisible(true);
        }else{
           caso.Remover.setVisible(false);
        }
        
        centralizarJanela(caso);
        
        dispose();
        this.getDesktopPane().remove(this);
    }//GEN-LAST:event_botão_encerradosActionPerformed

    private void EncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncerrarActionPerformed
        Janela_Casos_encerrados caso = Janela_Casos_encerrados.getInstance();
        
        int index = lista_casos.getSelectedRow();

        DefaultTableModel modelo = (DefaultTableModel)lista_casos.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel)Janela_Casos_encerrados.lista_casos.getModel();

        String id_caso = modelo.getValueAt(index, 0).toString();
        String id_ocorrencia = modelo.getValueAt(index, 1).toString();
        String nome_policial = modelo.getValueAt(index, 2).toString();
        String nome_civil = modelo.getValueAt(index, 3).toString();
        String suspeito = modelo.getValueAt(index, 4).toString();
        String prio = modelo.getValueAt(index, 5).toString();
        String condição = "Encerrado";
        String descrição = modelo.getValueAt(index, 7).toString();

        Object linha[] = new Object[8];

        linha[0] = id_caso;
        linha[1] = id_ocorrencia;
        linha[2] = nome_policial;
        linha[3] = nome_civil;
        linha[4] = suspeito;
        linha[5] = prio;
        linha[6] = condição;
        linha[7] = descrição;
        
        modelo2.addRow(linha);
        modelo.removeRow(index);
        
        mensagem m = mensagem.getInstance();
        getParent().add(m);
        m.toFront();
        m.setVisible(true);
        m.descrição.setForeground(new Color(51,204,0));
        m.descrição.setText("<html><b><font color='WHITE'>Caso </font>Encerrado<font color='WHITE'> !</font>");
        centralizarJanela(m);
    }//GEN-LAST:event_EncerrarActionPerformed

    private void EncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncerrarMouseClicked
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_select.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
    }//GEN-LAST:event_EncerrarMouseClicked
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Adicionar;
    public static javax.swing.JButton Arquivar;
    public static javax.swing.JButton Botão_X;
    public static javax.swing.JButton Editar;
    public static javax.swing.JButton Encerrar;
    private javax.swing.JLabel Sobre;
    private javax.swing.JButton botão_arquivados;
    private javax.swing.JButton botão_encerrados;
    private javax.swing.JButton botão_pendentes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable lista_casos;
    // End of variables declaration//GEN-END:variables
}
