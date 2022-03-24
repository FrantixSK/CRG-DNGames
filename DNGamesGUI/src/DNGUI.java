/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fero
 */
public class DNGUI extends javax.swing.JFrame {

    /**
     * Creates new form DNGUI
     */
    public DNGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    //aby som sa dostal von zo settings do toho menu z ktoreho som ich zapol
    boolean stlacenieBackNaGameMenu = false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DNGamesTabbedPane = new javax.swing.JTabbedPane();
        baseMenuPanel = new javax.swing.JPanel();
        gameSelectionMenuButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        gameSelectionPanel = new javax.swing.JPanel();
        game1PlayButton = new javax.swing.JButton();
        game2PlayButton = new javax.swing.JButton();
        backFromGamesButton = new javax.swing.JButton();
        gameMenuToSettingsButton = new javax.swing.JButton();
        settingsPanel = new javax.swing.JPanel();
        musicVolumeSetting = new javax.swing.JSlider();
        SFXVolumeSetting = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backFromSettingsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        baseMenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baseMenuPanelMouseClicked(evt);
            }
        });

        gameSelectionMenuButton.setText("Play game");
        gameSelectionMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameSelectionMenuButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        settingsButton.setText("Settings");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout baseMenuPanelLayout = new javax.swing.GroupLayout(baseMenuPanel);
        baseMenuPanel.setLayout(baseMenuPanelLayout);
        baseMenuPanelLayout.setHorizontalGroup(
            baseMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseMenuPanelLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(baseMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameSelectionMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(baseMenuPanelLayout.createSequentialGroup()
                .addComponent(settingsButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        baseMenuPanelLayout.setVerticalGroup(
            baseMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseMenuPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(gameSelectionMenuButton)
                .addGap(96, 96, 96)
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(settingsButton))
        );

        DNGamesTabbedPane.addTab("tab1", baseMenuPanel);

        game1PlayButton.setText("play g1");

        game2PlayButton.setText("play g2");

        backFromGamesButton.setText("Back");
        backFromGamesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backFromGamesButtonActionPerformed(evt);
            }
        });

        gameMenuToSettingsButton.setText("Settings");
        gameMenuToSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameMenuToSettingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameSelectionPanelLayout = new javax.swing.GroupLayout(gameSelectionPanel);
        gameSelectionPanel.setLayout(gameSelectionPanelLayout);
        gameSelectionPanelLayout.setHorizontalGroup(
            gameSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameSelectionPanelLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(game1PlayButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(game2PlayButton)
                .addGap(114, 114, 114))
            .addGroup(gameSelectionPanelLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(backFromGamesButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(gameSelectionPanelLayout.createSequentialGroup()
                .addComponent(gameMenuToSettingsButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gameSelectionPanelLayout.setVerticalGroup(
            gameSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameSelectionPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(gameSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(game1PlayButton)
                    .addComponent(game2PlayButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(backFromGamesButton)
                .addGap(17, 17, 17)
                .addComponent(gameMenuToSettingsButton))
        );

        DNGamesTabbedPane.addTab("tab2", gameSelectionPanel);

        jLabel1.setText("music volume");

        jLabel2.setText("SFX volume");

        backFromSettingsButton.setText("Back");
        backFromSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backFromSettingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SFXVolumeSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musicVolumeSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addComponent(backFromSettingsButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(musicVolumeSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(75, 75, 75)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFXVolumeSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(backFromSettingsButton))
        );

        DNGamesTabbedPane.addTab("tab3", settingsPanel);

        getContentPane().add(DNGamesTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 580, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void gameSelectionMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameSelectionMenuButtonActionPerformed
        DNGamesTabbedPane.setSelectedIndex(1);
        stlacenieBackNaGameMenu = true;
    }//GEN-LAST:event_gameSelectionMenuButtonActionPerformed
    
    
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
         System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    
    
    private void backFromGamesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backFromGamesButtonActionPerformed
        DNGamesTabbedPane.setSelectedIndex(0);
        stlacenieBackNaGameMenu = false;
    }//GEN-LAST:event_backFromGamesButtonActionPerformed
    
    
    
    private void baseMenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baseMenuPanelMouseClicked

    }//GEN-LAST:event_baseMenuPanelMouseClicked

    
    
    private void gameMenuToSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameMenuToSettingsButtonActionPerformed
DNGamesTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_gameMenuToSettingsButtonActionPerformed

    
    
    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        DNGamesTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_settingsButtonActionPerformed

    
    
    private void backFromSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backFromSettingsButtonActionPerformed
        if(stlacenieBackNaGameMenu == false){
            DNGamesTabbedPane.setSelectedIndex(0);
        }else{
        DNGamesTabbedPane.setSelectedIndex(1);
        }
    }//GEN-LAST:event_backFromSettingsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DNGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DNGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DNGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DNGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DNGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane DNGamesTabbedPane;
    private javax.swing.JSlider SFXVolumeSetting;
    private javax.swing.JButton backFromGamesButton;
    private javax.swing.JButton backFromSettingsButton;
    private javax.swing.JPanel baseMenuPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton game1PlayButton;
    private javax.swing.JButton game2PlayButton;
    private javax.swing.JButton gameMenuToSettingsButton;
    private javax.swing.JButton gameSelectionMenuButton;
    private javax.swing.JPanel gameSelectionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider musicVolumeSetting;
    private javax.swing.JButton settingsButton;
    private javax.swing.JPanel settingsPanel;
    // End of variables declaration//GEN-END:variables
}