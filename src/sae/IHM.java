/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sae;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Loan
 */
public class IHM extends JFrame{
    
    JLabel nomVille1;
    JLabel nomVille2;
    
    ArrayList<Noeud> toDraw;
    ArrayList<Lien> toDrawLiens;
    Noeud tmpVV1;
    
    Carte fondDeCarte = new Carte();

    public IHM() throws HeadlessException, Exception {
        
        this.setTitle("IHM");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        this.toDraw = new ArrayList<>();
        this.toDrawLiens = new ArrayList<>();
        tmpVV1 = new Noeud("V","Lyon", this);//0
        toDraw.add(tmpVV1);
        toDraw.add(new Noeud("L","Place ..", this));//1
        toDraw.add(new Noeud("R","Resto", this));//2
        toDraw.add(new Noeud("V","Montpellier", this));//3
        toDraw.add(new Noeud("V","Marseille", this));//4
        toDrawLiens.add(new Lien("A",tmpVV1,toDraw.get(1),220.f));//0
        toDrawLiens.add(new Lien("D",toDraw.get(1),toDraw.get(2),150.f));//1
        toDrawLiens.add(new Lien("A",toDraw.get(0),toDraw.get(3),180.f));//2
        toDrawLiens.add(new Lien("A",toDraw.get(3),toDraw.get(4),120.f));//3
        toDrawLiens.add(new Lien("A",toDraw.get(4),toDraw.get(0),200.f));//4
        toDraw.get(0).addConnection(toDrawLiens.get(0));
        toDraw.get(0).addConnection(toDrawLiens.get(2));
        toDraw.get(0).addConnection(toDrawLiens.get(4));

        toDraw.get(1).addConnection(toDrawLiens.get(0));
        toDraw.get(1).addConnection(toDrawLiens.get(1));
        toDraw.get(2).addConnection(toDrawLiens.get(1));
        
        toDraw.get(3).addConnection(toDrawLiens.get(3));
        toDraw.get(3).addConnection(toDrawLiens.get(2));
        
        toDraw.get(4).addConnection(toDrawLiens.get(4));
        toDraw.get(4).addConnection(toDrawLiens.get(3));
   
        
        
        
        this.initContent();
        this.setVisible(true);
        
        fondDeCarte.init();
        
    }
    
    public IHM(ArrayList<Noeud> toDraw, ArrayList<Lien> toDrawLiens) throws HeadlessException, Exception {
        
        this.setTitle("IHM");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.toDraw = toDraw;
        this.toDrawLiens = toDrawLiens;
        
        this.initContent();
        this.setVisible(true);
        
        fondDeCarte.init();
        fondDeCarte.run();
        
    }
    
    private void initContent(){
        
        
        this.setContentPane(fondDeCarte);
        this.setLayout(null );
        
        
        fondDeCarte.setToDraw(toDraw);
        fondDeCarte.setToDrawLiens(toDrawLiens);
        
        
  
        
        
    }
    
    
}
