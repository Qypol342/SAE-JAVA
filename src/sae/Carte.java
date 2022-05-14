/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sae;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Loan
 */
public class Carte extends JPanel{
    ArrayList<Noeuds> toDraw;
    ArrayList<Liens> toDrawLiens;

    public Carte() {
        this.toDraw = new ArrayList<>();
        this.toDrawLiens = new ArrayList<>();
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.setColor(this.getBackground());
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        
        g.setColor(Color.BLACK);
        int width = 50;
        for(int i=0; i<toDrawLiens.size();i++){
            Noeuds noeudsUn = toDrawLiens.get(i).getNoeuds1();
            Noeuds noeudsDeux = toDrawLiens.get(i).getNoeuds2();
            
            
            g.drawLine(noeudsUn.getPosX()+(width/2), noeudsUn.getPosY()+(width/2)
                    , noeudsDeux.getPosX()+(width/2)
                    , noeudsDeux.getPosY()+(width/2));
        }
        for(Noeuds tmp: toDraw){
            Color tmpColor = Color.red;
            if(tmp.getType().equals("R"))
                tmpColor = Color.GREEN;
            if(tmp.getType().equals("L"))
                tmpColor = Color.BLUE;
                
            g.setColor(tmpColor);
            g.fillOval(tmp.getPosX(), tmp.getPosY(), width, width);
        }
        this.paintLabel();
    }
    
    public void paintLabel(){
        for(Noeuds tmp: toDraw){
            this.add(tmp.getLabelNoeuds());
            
        }
        
    }

    public ArrayList<Noeuds> getToDraw() {
        return toDraw;
    }

    public void setToDraw(ArrayList<Noeuds> toDraw) {
        this.toDraw = toDraw;
    }
    public void addToDraw(Noeuds toDraw) {
        this.toDraw.add(toDraw);
    }
    public void setToDrawLiens(ArrayList<Liens> toDrawLiens){
        this.toDrawLiens = toDrawLiens;
    }
    
    public void init(){
        boolean edit = false;
        
        for(int i=0; i<1000; i++){
            for(Noeuds tmp : toDraw){
            int tmpPosX =0;
            int tmpPosY =0;
            int goal = 150;
            int minSpace = 100;
            edit = false;
            
            for(Noeuds tmpNoeuds2 : toDraw){
                tmpPosX += tmp.getPosDeltaX(tmpNoeuds2, minSpace);
                tmpPosY += tmp.getPosDeltaY(tmpNoeuds2, minSpace); 
            }
            for(Noeuds tmpNoeuds : tmp.getVoisin()){
                
                //System.out.println(" diresction "+direction+" dsiatnce "+(Math.sqrt(dX*dX)+(dY*dY)));
                tmpPosX += tmp.getDeltaX(tmpNoeuds,(int) tmp.getDistanceFromVoisin(tmpNoeuds));
                tmpPosY += tmp.getDeltaY(tmpNoeuds, (int) tmp.getDistanceFromVoisin(tmpNoeuds));
            }
            
            if (tmpPosX+tmpPosY !=0){
                /*
                System.out.println(tmp+" "+tmpPosX +" "+tmpPosY);
                System.out.println("    |_>"+( - (int) tmpPosX)+" "+
                        ( - (int) tmpPosY));
                */
                System.out.println(tmp.getNom());
                edit = true;
                
            }
            
     
 
            tmp.setPosX((int) ((tmp.getPosX()) - (int) tmpPosX),this.getSize().width);
            tmp.setPosY((int) ((tmp.getPosY()) - (int) tmpPosY),this.getSize().height);
    
            
            
        }
            if (edit)
                System.out.println("==");
            /*for(Noeuds tmp: toDraw){
            tmp.setPosX((tmp.getPosX())+1+(tmp.getPosY()/100));
            }*/
            this.repaint();
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(IHM.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
    }
    
    
    
}