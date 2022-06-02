/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sae;

import java.awt.event.WindowAdapter;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;
import javax.swing.plaf.FileChooserUI;

/**
 *
 * @author Loan
 */
public class Fenetre extends javax.swing.JFrame {
    
    Map m = new Map();
    JFileChooser fileChooser;
    
    

    /**
     * Creates new form Fenetre
     */
    public Fenetre() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
             
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        myinit();
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        subPanelChanger = new javax.swing.JPanel();
        labelMode = new javax.swing.JLabel();
        modeChooser = new javax.swing.JComboBox<>();
        subPanelInfo = new javax.swing.JPanel();
        colorFileLoading = new javax.swing.JPanel();
        labelFileLoading = new javax.swing.JLabel();
        colorLocating = new javax.swing.JPanel();
        labelLocating = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelAffichage = new javax.swing.JLabel();
        labelType = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        checkAffichVilles = new javax.swing.JCheckBox();
        labelNbrVilles = new javax.swing.JLabel();
        nbrVilles = new javax.swing.JLabel();
        checkAffichLoisirs = new javax.swing.JCheckBox();
        labelNbrLoisir = new javax.swing.JLabel();
        nbrLoisirs = new javax.swing.JLabel();
        checkAffichResto = new javax.swing.JCheckBox();
        labelNbrResto = new javax.swing.JLabel();
        nbrResto = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelNbrAutoroutes = new javax.swing.JLabel();
        nbrAutoroutes = new javax.swing.JLabel();
        labelNbrNationales = new javax.swing.JLabel();
        nbrNationales = new javax.swing.JLabel();
        nbrDepartementales = new javax.swing.JLabel();
        labelNbrDepartementales = new javax.swing.JLabel();
        checkAffichDepart = new javax.swing.JCheckBox();
        checkAffichAutoroutes = new javax.swing.JCheckBox();
        checkAffichNationales = new javax.swing.JCheckBox();
        carte = new sae.Carte();
        menuBar = new javax.swing.JMenuBar();
        menuFichier = new javax.swing.JMenu();
        itemOuvrir = new javax.swing.JMenuItem();
        menuEdition = new javax.swing.JMenu();
        itemRedispose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidePanel.setLayout(new java.awt.BorderLayout(10, 10));

        subPanelChanger.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 10));
        subPanelChanger.setLayout(new java.awt.GridLayout(1, 2));

        labelMode.setText("Mode");
        subPanelChanger.add(labelMode);

        modeChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information", "Item 2", "Item 3", "Item 4" }));
        modeChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeChooserActionPerformed(evt);
            }
        });
        subPanelChanger.add(modeChooser);

        sidePanel.add(subPanelChanger, java.awt.BorderLayout.PAGE_START);

        colorFileLoading.setBackground(new java.awt.Color(255, 255, 255));
        colorFileLoading.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout colorFileLoadingLayout = new javax.swing.GroupLayout(colorFileLoading);
        colorFileLoading.setLayout(colorFileLoadingLayout);
        colorFileLoadingLayout.setHorizontalGroup(
            colorFileLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        colorFileLoadingLayout.setVerticalGroup(
            colorFileLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelFileLoading.setText("Chargement du Fichier");

        colorLocating.setBackground(new java.awt.Color(255, 255, 255));
        colorLocating.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout colorLocatingLayout = new javax.swing.GroupLayout(colorLocating);
        colorLocating.setLayout(colorLocatingLayout);
        colorLocatingLayout.setHorizontalGroup(
            colorLocatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        colorLocatingLayout.setVerticalGroup(
            colorLocatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelLocating.setText("Positionnement");

        labelAffichage.setText("Affichage");

        labelType.setText("Type");

        labelNombre.setText("Nombre");

        checkAffichVilles.setSelected(true);
        checkAffichVilles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAffichVillesActionPerformed(evt);
            }
        });

        labelNbrVilles.setText("Villes");

        nbrVilles.setText("0");

        checkAffichLoisirs.setSelected(true);
        checkAffichLoisirs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAffichLoisirsActionPerformed(evt);
            }
        });

        labelNbrLoisir.setText("Centres de Loisirs");

        nbrLoisirs.setText("0");

        checkAffichResto.setSelected(true);
        checkAffichResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAffichRestoActionPerformed(evt);
            }
        });

        labelNbrResto.setText("Restaurants");

        nbrResto.setText("0");

        labelNbrAutoroutes.setText("Autoroutes");

        nbrAutoroutes.setText("0");

        labelNbrNationales.setText("Nationales");

        nbrNationales.setText("0");

        nbrDepartementales.setText("0");

        labelNbrDepartementales.setText("Départementales");

        checkAffichDepart.setSelected(true);
        checkAffichDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAffichDepartActionPerformed(evt);
            }
        });

        checkAffichAutoroutes.setSelected(true);
        checkAffichAutoroutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAffichAutoroutesActionPerformed(evt);
            }
        });

        checkAffichNationales.setSelected(true);
        checkAffichNationales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAffichNationalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanelInfoLayout = new javax.swing.GroupLayout(subPanelInfo);
        subPanelInfo.setLayout(subPanelInfoLayout);
        subPanelInfoLayout.setHorizontalGroup(
            subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelInfoLayout.createSequentialGroup()
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(subPanelInfoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colorFileLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(colorLocating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLocating)
                            .addComponent(labelFileLoading))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelInfoLayout.createSequentialGroup()
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subPanelInfoLayout.createSequentialGroup()
                                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(checkAffichVilles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkAffichLoisirs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkAffichResto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(subPanelInfoLayout.createSequentialGroup()
                                        .addComponent(labelNbrResto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nbrResto))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelInfoLayout.createSequentialGroup()
                                        .addComponent(labelNbrVilles)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nbrVilles))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelInfoLayout.createSequentialGroup()
                                        .addComponent(labelNbrLoisir)
                                        .addGap(46, 46, 46)
                                        .addComponent(nbrLoisirs))))
                            .addGroup(subPanelInfoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(subPanelInfoLayout.createSequentialGroup()
                                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(checkAffichNationales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkAffichDepart))
                                    .addComponent(checkAffichAutoroutes))
                                .addGap(31, 31, 31)
                                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(subPanelInfoLayout.createSequentialGroup()
                                        .addComponent(labelNbrNationales)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nbrNationales))
                                    .addGroup(subPanelInfoLayout.createSequentialGroup()
                                        .addComponent(labelNbrAutoroutes)
                                        .addGap(75, 75, 75)
                                        .addComponent(nbrAutoroutes))
                                    .addGroup(subPanelInfoLayout.createSequentialGroup()
                                        .addComponent(labelNbrDepartementales)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nbrDepartementales))))))
                    .addGroup(subPanelInfoLayout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(labelAffichage)
                        .addGap(18, 18, 18)
                        .addComponent(labelType)
                        .addGap(66, 66, 66)
                        .addComponent(labelNombre)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        subPanelInfoLayout.setVerticalGroup(
            subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelInfoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(subPanelInfoLayout.createSequentialGroup()
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colorFileLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFileLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colorLocating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelLocating))
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAffichage)
                            .addComponent(labelType)
                            .addComponent(labelNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkAffichVilles, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelNbrVilles)
                                .addComponent(nbrVilles)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNbrLoisir)
                            .addComponent(nbrLoisirs)))
                    .addComponent(checkAffichLoisirs, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbrResto)
                    .addComponent(checkAffichResto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNbrResto))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkAffichAutoroutes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNbrAutoroutes)
                        .addComponent(nbrAutoroutes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNbrNationales)
                        .addComponent(nbrNationales))
                    .addComponent(checkAffichNationales, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNbrDepartementales)
                        .addComponent(nbrDepartementales))
                    .addComponent(checkAffichDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        sidePanel.add(subPanelInfo, java.awt.BorderLayout.CENTER);

        getContentPane().add(sidePanel, java.awt.BorderLayout.EAST);

        carte.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout carteLayout = new javax.swing.GroupLayout(carte);
        carte.setLayout(carteLayout);
        carteLayout.setHorizontalGroup(
            carteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        carteLayout.setVerticalGroup(
            carteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        getContentPane().add(carte, java.awt.BorderLayout.CENTER);

        menuFichier.setText("Fichier");

        itemOuvrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemOuvrir.setText("Ouvrir csv");
        itemOuvrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOuvrirActionPerformed(evt);
            }
        });
        menuFichier.add(itemOuvrir);

        menuBar.add(menuFichier);

        menuEdition.setText("Edition");

        itemRedispose.setText("Redisposer");
        itemRedispose.setEnabled(false);
        itemRedispose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRedisposeActionPerformed(evt);
            }
        });
        menuEdition.add(itemRedispose);

        menuBar.add(menuEdition);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void myinit(){
        fileChooser = new JFileChooser();
        //fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setCurrentDirectory(new File("D:/COUR/2022/JAVA/sae-java"));
        
        carte.addColorIndicator(colorLocating);
        m.addColorIndicator(colorFileLoading);
        
        
       
    }
    private void itemOuvrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOuvrirActionPerformed
        
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            
            itemRedispose.setEnabled(true);
            File selectedFile = fileChooser.getSelectedFile();
            m.loadMap(selectedFile.getAbsolutePath());
            carte.setToDraw(m.listeVilles);
            carte.setToDrawLiens(m.listeRoutes);
            Thread newThread = new Thread(() -> {
            carte.init();
            });
            newThread.start();
            nbrLoisirs.setText(Integer.toString(m.getNbLoisirs()));
            nbrVilles.setText(Integer.toString(m.getNbVilles()));
            nbrResto.setText(Integer.toString(m.getNbRestaurants()));
            
            nbrAutoroutes.setText(Integer.toString(m.getNbAutoroutes()));
            nbrNationales.setText(Integer.toString(m.getNbNationales()));
            nbrDepartementales.setText(Integer.toString(m.getNbDepartementales()));
            
        }
    }//GEN-LAST:event_itemOuvrirActionPerformed

    private void itemRedisposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRedisposeActionPerformed
       
            carte.init();
      
    }//GEN-LAST:event_itemRedisposeActionPerformed

    private void modeChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeChooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeChooserActionPerformed

    private void checkAffichVillesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAffichVillesActionPerformed
              
        carte.setTypeToDraw("V", checkAffichVilles.isSelected());
    }//GEN-LAST:event_checkAffichVillesActionPerformed

    private void checkAffichLoisirsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAffichLoisirsActionPerformed
        carte.setTypeToDraw("L", checkAffichLoisirs.isSelected());
    }//GEN-LAST:event_checkAffichLoisirsActionPerformed

    private void checkAffichRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAffichRestoActionPerformed
        carte.setTypeToDraw("R", checkAffichResto.isSelected());
    }//GEN-LAST:event_checkAffichRestoActionPerformed

    private void checkAffichDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAffichDepartActionPerformed
        carte.setTypeToDrawLiens("D",checkAffichDepart.isSelected());
    }//GEN-LAST:event_checkAffichDepartActionPerformed

    private void checkAffichAutoroutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAffichAutoroutesActionPerformed
        carte.setTypeToDrawLiens("A",checkAffichAutoroutes.isSelected());
    }//GEN-LAST:event_checkAffichAutoroutesActionPerformed

    private void checkAffichNationalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAffichNationalesActionPerformed
        carte.setTypeToDrawLiens("N",checkAffichNationales.isSelected());
    }//GEN-LAST:event_checkAffichNationalesActionPerformed
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sae.Carte carte;
    private javax.swing.JCheckBox checkAffichAutoroutes;
    private javax.swing.JCheckBox checkAffichDepart;
    private javax.swing.JCheckBox checkAffichLoisirs;
    private javax.swing.JCheckBox checkAffichNationales;
    private javax.swing.JCheckBox checkAffichResto;
    private javax.swing.JCheckBox checkAffichVilles;
    private javax.swing.JPanel colorFileLoading;
    private javax.swing.JPanel colorLocating;
    private javax.swing.JMenuItem itemOuvrir;
    private javax.swing.JMenuItem itemRedispose;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAffichage;
    private javax.swing.JLabel labelFileLoading;
    private javax.swing.JLabel labelLocating;
    private javax.swing.JLabel labelMode;
    private javax.swing.JLabel labelNbrAutoroutes;
    private javax.swing.JLabel labelNbrDepartementales;
    private javax.swing.JLabel labelNbrLoisir;
    private javax.swing.JLabel labelNbrNationales;
    private javax.swing.JLabel labelNbrResto;
    private javax.swing.JLabel labelNbrVilles;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelType;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdition;
    private javax.swing.JMenu menuFichier;
    private javax.swing.JComboBox<String> modeChooser;
    private javax.swing.JLabel nbrAutoroutes;
    private javax.swing.JLabel nbrDepartementales;
    private javax.swing.JLabel nbrLoisirs;
    private javax.swing.JLabel nbrNationales;
    private javax.swing.JLabel nbrResto;
    private javax.swing.JLabel nbrVilles;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel subPanelChanger;
    private javax.swing.JPanel subPanelInfo;
    // End of variables declaration//GEN-END:variables
}
