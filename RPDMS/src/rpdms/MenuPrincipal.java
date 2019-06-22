/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpdms;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.font.TrueTypeFont;

/**
 *
 * @author 3855-1169
 */
public final class MenuPrincipal extends javax.swing.JFrame {
    

    
    public MenuPrincipal() {
        this.setUndecorated(true);  //Remove abas da janela
        this.setAlwaysOnTop(false);  //A janela sempre estará na frente das aplicações
        this.setResizable(true); //Nâo é redimensionável
        this.setVisible(true);// Criar e usar fonte customizada
        
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
            int xsize = (int) tk.getScreenSize().getWidth();
            int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        showTime(); //Chama função showTime
        showDate(); //Chama função showDate
        tocarMusica();  //Chama função tocarMusica
        
        
        //Redimenciona imagens de acordo com o tamanho do Label
        
        
        //Menu Principal
        
            //Logo R.P.D.

        ImageIcon rpdlogo=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/RPD_logo.png")));
        Image rpdlogo1=rpdlogo.getImage();
        Image rpdlogo2=rpdlogo1.getScaledInstance(logo_RPD.getWidth(), logo_RPD.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon irpd=new ImageIcon (rpdlogo2);
        
        logo_RPD.setIcon(irpd);
        //centralizarLabels(logo_RPD);
        
            //Logo Umbrella
        
        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/umbrella2.png")));
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(logoUmbrella.getWidth(), logoUmbrella.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon (img2);
        
        logoUmbrella.setIcon(i);
        centralizarLabels(logoUmbrella);
        
        // Inicializa janela Login junto com o Desktop
        
        Janela_Login janela1 = new Janela_Login();
        jDesktopPane1.add(janela1);
        try {                       //Inicializa já selecionado
            janela1.setSelected(true);
            janela1.setPosicao();
        } catch (PropertyVetoException ex) {

        }
        
        //Redimenciona a janela Login automáticamente para o centro
        
        centralizarJanela(janela1);

        setInvisibleLogin();
    }
    
    
    public void centralizarJanela(JInternalFrame jif){
        
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension jInternalFrameSize = jif.getSize();
            jif.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height- jInternalFrameSize.height)/2);
        jif.setVisible(true);
    }
    
    public void centralizarLabels(JLabel jl){
        
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension jInternalFrameSize = jl.getSize();
            jl.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height- jInternalFrameSize.height)/2);
        jl.setVisible(true);
    }
    
    void showTime(){    //Mostra o horário atual
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d= new Date();
                SimpleDateFormat s= new SimpleDateFormat("hh:mm a");
                Tempo.setText(s.format(d));
            }
        }
        ).start();
     }
    
    void showDate(){    // mostra o dia específico
        Date d= new Date();
        SimpleDateFormat s= new SimpleDateFormat("28-09-1998"); //dia específico
        Data.setText(s.format(d));
    }
    
    
    public void setInvisibleLogin(){    
        jPanel1.setVisible(false);
        menuIni.setVisible(false);
        botão_viatura.setVisible(false);
        botão_casos.setVisible(false);
        botão_docpessoais.setVisible(false);
        botão_relatorios.setVisible(false);
        botão_umbrella.setVisible(false);
        botão_cctv.setVisible(false);
        botão_perfil.setVisible(false);
    }
    
    Clip clip;
    //Função para tocar música na tela
    public void tocarMusica(){
        
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/Telas/RPD_menu.wav"));
            clip = AudioSystem.getClip();
            clip.open(as);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/background.jpg"));
        final Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        logo_RPD = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logoUmbrella = new javax.swing.JLabel();
        Distribuido_por = new javax.swing.JLabel();
        Sobre = new javax.swing.JButton();
        Data = new javax.swing.JLabel();
        Tempo = new javax.swing.JLabel();
        Iniciar = new javax.swing.JToggleButton();
        menuIni = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        botão_viatura = new javax.swing.JButton();
        botão_casos = new javax.swing.JButton();
        botão_docpessoais = new javax.swing.JButton();
        botão_relatorios = new javax.swing.JButton();
        botão_umbrella = new javax.swing.JButton();
        botão_cctv = new javax.swing.JButton();
        botão_perfil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(34, 52, 90));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 165, 157), 8), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63))), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63))));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1366, 768));

        logo_RPD.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jDesktopPane1.add(logo_RPD);
        logo_RPD.setBounds(398, 19, 594, 660);

        jPanel1.setBackground(new java.awt.Color(165, 165, 157));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63), new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210), new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63))));
        jPanel1.setPreferredSize(new java.awt.Dimension(1014, 60));

        Distribuido_por.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        Distribuido_por.setForeground(new java.awt.Color(240, 240, 240));
        Distribuido_por.setText("Distribuido por");
        Distribuido_por.setPreferredSize(new java.awt.Dimension(153, 36));

        Sobre.setBackground(new java.awt.Color(165, 165, 157));
        Sobre.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        Sobre.setText("Sobre");
        Sobre.setBorder(null);
        Sobre.setContentAreaFilled(false);
        Sobre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sobre.setPreferredSize(new java.awt.Dimension(60, 30));
        Sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SobreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SobreMouseEntered(evt);
            }
        });
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });

        Data.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        Data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Data.setText(" ");
        Data.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210), new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63)));
        Data.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Data.setPreferredSize(new java.awt.Dimension(135, 30));

        Tempo.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        Tempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tempo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210), new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63)));
        Tempo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tempo.setPreferredSize(new java.awt.Dimension(110, 30));

        Iniciar.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        Iniciar.setText("Iniciar");
        Iniciar.setBorder(null);
        Iniciar.setContentAreaFilled(false);
        Iniciar.setPreferredSize(new java.awt.Dimension(73, 30));
        Iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IniciarMouseEntered(evt);
            }
        });
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Sobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(436, 436, 436)
                .addComponent(Tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(Distribuido_por, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoUmbrella, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Distribuido_por, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(logoUmbrella, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Iniciar, Sobre});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Data, Distribuido_por, Tempo});

        jDesktopPane1.add(jPanel1);
        jPanel1.setBounds(8, 697, 1350, 64);

        menuIni.setBackground(new java.awt.Color(165, 165, 157));
        menuIni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(210, 210, 210), new java.awt.Color(210, 210, 210), new java.awt.Color(68, 67, 63), new java.awt.Color(68, 67, 63)));

        logout.setBackground(new java.awt.Color(165, 165, 157));
        logout.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        logout.setText("Logout");
        logout.setBorder(null);
        logout.setContentAreaFilled(false);
        logout.setPreferredSize(new java.awt.Dimension(86, 30));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        sair.setText("Sair");
        sair.setBorder(null);
        sair.setContentAreaFilled(false);
        sair.setPreferredSize(new java.awt.Dimension(86, 30));
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sairMouseEntered(evt);
            }
        });
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuIniLayout = new javax.swing.GroupLayout(menuIni);
        menuIni.setLayout(menuIniLayout);
        menuIniLayout.setHorizontalGroup(
            menuIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuIniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuIniLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {logout, sair});

        menuIniLayout.setVerticalGroup(
            menuIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuIniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuIniLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {logout, sair});

        jDesktopPane1.add(menuIni);
        menuIni.setBounds(9, 600, 110, 97);

        botão_viatura.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        botão_viatura.setForeground(new java.awt.Color(210, 210, 210));
        botão_viatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/icon_viatura.png"))); // NOI18N
        botão_viatura.setText("<html><center>Viaturas</html>");
        botão_viatura.setBorder(null);
        botão_viatura.setContentAreaFilled(false);
        botão_viatura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botão_viatura.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botão_viatura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botão_viatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão_viaturaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(botão_viatura);
        botão_viatura.setBounds(50, 560, 110, 100);

        botão_casos.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        botão_casos.setForeground(new java.awt.Color(210, 210, 210));
        botão_casos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/icon_casos.png"))); // NOI18N
        botão_casos.setText("<html><center>Casos<br>Documentados</html>");
        botão_casos.setBorder(null);
        botão_casos.setContentAreaFilled(false);
        botão_casos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botão_casos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botão_casos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botão_casos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão_casosActionPerformed(evt);
            }
        });
        jDesktopPane1.add(botão_casos);
        botão_casos.setBounds(30, 380, 150, 130);

        botão_docpessoais.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        botão_docpessoais.setForeground(new java.awt.Color(210, 210, 210));
        botão_docpessoais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/icon_docpessoais.png"))); // NOI18N
        botão_docpessoais.setText("<html><center>Documentos<br>pessoais</html>");
        botão_docpessoais.setBorder(null);
        botão_docpessoais.setContentAreaFilled(false);
        botão_docpessoais.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botão_docpessoais.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botão_docpessoais.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jDesktopPane1.add(botão_docpessoais);
        botão_docpessoais.setBounds(1090, 420, 130, 130);

        botão_relatorios.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        botão_relatorios.setForeground(new java.awt.Color(210, 210, 210));
        botão_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/icon_relatorios.png"))); // NOI18N
        botão_relatorios.setText("<html><center>Relatórios</html>");
        botão_relatorios.setBorder(null);
        botão_relatorios.setContentAreaFilled(false);
        botão_relatorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botão_relatorios.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botão_relatorios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jDesktopPane1.add(botão_relatorios);
        botão_relatorios.setBounds(1160, 240, 100, 110);

        botão_umbrella.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        botão_umbrella.setForeground(new java.awt.Color(210, 210, 210));
        botão_umbrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/icon_umbrella.png"))); // NOI18N
        botão_umbrella.setText("<html><center>Umbrella Inc.</html>");
        botão_umbrella.setBorder(null);
        botão_umbrella.setContentAreaFilled(false);
        botão_umbrella.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botão_umbrella.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botão_umbrella.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botão_umbrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão_umbrellaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(botão_umbrella);
        botão_umbrella.setBounds(1140, 80, 140, 120);

        botão_cctv.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        botão_cctv.setForeground(new java.awt.Color(210, 210, 210));
        botão_cctv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/icon_cctv.png"))); // NOI18N
        botão_cctv.setText("<html><center>Sistema<br>CCTV</html>");
        botão_cctv.setBorder(null);
        botão_cctv.setContentAreaFilled(false);
        botão_cctv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botão_cctv.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botão_cctv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jDesktopPane1.add(botão_cctv);
        botão_cctv.setBounds(60, 200, 90, 120);

        botão_perfil.setFont(new java.awt.Font("RE3", 0, 24)); // NOI18N
        botão_perfil.setForeground(new java.awt.Color(210, 210, 210));
        botão_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/icon_perfil.png"))); // NOI18N
        botão_perfil.setText("<html><center>Perfís de<br>Usuário</html>");
        botão_perfil.setBorder(null);
        botão_perfil.setContentAreaFilled(false);
        botão_perfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botão_perfil.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botão_perfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botão_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botão_perfilMouseClicked(evt);
            }
        });
        botão_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão_perfilActionPerformed(evt);
            }
        });
        jDesktopPane1.add(botão_perfil);
        botão_perfil.setBounds(50, 40, 110, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        
        Janela_Sobre sobre1 = Janela_Sobre.getInstance();
        
        sobre1.pack();
        
        if (sobre1.isVisible()){
            
        } else {
            jDesktopPane1.add(sobre1);
            sobre1.setVisible(true);
            Iniciar.setEnabled(false);
        }
        
        centralizarJanela(sobre1);
        
        
    }//GEN-LAST:event_SobreActionPerformed

    private void SobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreMouseEntered
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_mouse.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
    }//GEN-LAST:event_SobreMouseEntered

    private void SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreMouseClicked
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
        
        if(evt.getSource()==Sobre){
            Iniciar.setSelected(false);
            menuIni.setVisible(false);
        }
    }//GEN-LAST:event_SobreMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        
        Janela_Login janela1 = new Janela_Login();
        jDesktopPane1.add(janela1);
        try {                       //Inicializa já selecionado
            janela1.setSelected(true);
            janela1.setPosicao();
        } catch (PropertyVetoException ex) {
   
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        if(Iniciar.isSelected()){
            menuIni.setVisible(true);
        }else{
            menuIni.setVisible(false);
        }
    }//GEN-LAST:event_IniciarActionPerformed

    private void IniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseEntered
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_mouse.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
    }//GEN-LAST:event_IniciarMouseEntered

    private void IniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseClicked
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
    }//GEN-LAST:event_IniciarMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_mouse.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
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
        
        if(evt.getSource()==logout){
            
            Iniciar.setSelected(false);
            menuIni.setVisible(false);
        }
        setInvisibleLogin();
        
    }//GEN-LAST:event_logoutMouseClicked

    private void sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseEntered
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_mouse.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
    }//GEN-LAST:event_sairMouseEntered

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
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
    }//GEN-LAST:event_sairMouseClicked

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/Sounds/interfaceSFX/Botão_sair.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start( );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro");
        }
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void botão_casosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão_casosActionPerformed
        
    }//GEN-LAST:event_botão_casosActionPerformed

    private void botão_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão_perfilActionPerformed
        Janela_Perfil_STARS perfil = Janela_Perfil_STARS.getInstance();
        
        perfil.pack();
        
        if (perfil.isVisible()){
            
        } else {
            jDesktopPane1.add(perfil);
            perfil.setVisible(true);
        }
        
        String user = Janela_Login.Campo_Nome.getText();
        String pass = new String(Janela_Login.Campo_Senha.getPassword());
        
        if(user.equals("Brian Irons") && pass.equals("2236")){
            
           Janela_Perfil_STARS.adicionar.setVisible(true);
           Janela_Perfil_STARS.editar.setVisible(true);
           Janela_Perfil_STARS.remover.setVisible(true);
        }else{
           Janela_Perfil_STARS.adicionar.setVisible(false);
           Janela_Perfil_STARS.editar.setVisible(false);
           Janela_Perfil_STARS.remover.setVisible(false);
        }
        
        centralizarJanela(perfil);
    }//GEN-LAST:event_botão_perfilActionPerformed

    private void botão_perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botão_perfilMouseClicked
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
    }//GEN-LAST:event_botão_perfilMouseClicked
int counter = 10;
    private void botão_umbrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão_umbrellaActionPerformed
        Janela_Umbrella umbrella = Janela_Umbrella.getInstance();
        
        umbrella.pack();
        
        if (umbrella.isVisible()){
            
        } else {
            jDesktopPane1.add(umbrella);
            umbrella.setVisible(true);
            clip.close();
            
        }
        
        centralizarJanela(umbrella);
        setInvisibleLogin();
        
    }//GEN-LAST:event_botão_umbrellaActionPerformed

    private void botão_viaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão_viaturaActionPerformed
        Janela_Viaturas viatura = Janela_Viaturas.getInstance();
        
        viatura.pack();
        
        if (viatura.isVisible()){
            
        } else {
            jDesktopPane1.add(viatura);
            viatura.setVisible(true);
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
        
        centralizarJanela(viatura);
    }//GEN-LAST:event_botão_viaturaActionPerformed

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Distribuido_por;
    public static javax.swing.JToggleButton Iniciar;
    private javax.swing.JButton Sobre;
    private javax.swing.JLabel Tempo;
    public static javax.swing.JButton botão_casos;
    public static javax.swing.JButton botão_cctv;
    public static javax.swing.JButton botão_docpessoais;
    public static javax.swing.JButton botão_perfil;
    public static javax.swing.JButton botão_relatorios;
    public static javax.swing.JButton botão_umbrella;
    public static javax.swing.JButton botão_viatura;
    private javax.swing.JDesktopPane jDesktopPane1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoUmbrella;
    private javax.swing.JLabel logo_RPD;
    private javax.swing.JButton logout;
    private javax.swing.JPanel menuIni;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
