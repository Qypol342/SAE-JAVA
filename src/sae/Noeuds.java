/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sae;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Loan
 */
public class Noeuds  {
    String typeNoeuds;
    String nomNoeuds;
    ArrayList<Liens> connection;
    int vPosX;
    int vPosY;
    int width =50;
    JLabel labelNoeuds;
 
    Noeuds(String newtypeNoeuds, String newnomNoeuds) throws Exception{
        newtypeNoeuds = newtypeNoeuds.toUpperCase();
        if (newtypeNoeuds.equals("V")  || newtypeNoeuds.equals("R") || newtypeNoeuds.equals("L") )
        {
            typeNoeuds = newtypeNoeuds;
            nomNoeuds = newnomNoeuds;
            connection = new ArrayList<>();
        }else{
            throw new TypeNotSupportedException();
        }
        
    }
    
    Noeuds(String newtypeNoeuds, String newnomNoeuds, int x, int y) throws Exception{
        newtypeNoeuds = newtypeNoeuds.toUpperCase();
        if (newtypeNoeuds.equals("V")  || newtypeNoeuds.equals("R") || newtypeNoeuds.equals("L") )
        {
            typeNoeuds = newtypeNoeuds;
            nomNoeuds = newnomNoeuds;
            connection = new ArrayList<>();
            vPosX = x;
            vPosY= y;
        }else{
            throw new TypeNotSupportedException();
        }
        labelNoeuds = new JLabel(newnomNoeuds);
        labelNoeuds.setBounds(0, 0, 70, 20);
        labelNoeuds.setLocation(x, y);
        
    }
    
    Noeuds(String newtypeNoeuds, String newnomNoeuds, JFrame pan) throws Exception{
        newtypeNoeuds = newtypeNoeuds.toUpperCase();
        Random random = new Random();
        System.out.println( pan.getSize().width);
        int x = random.nextInt(0, pan.getSize().width);
        int y = random.nextInt(0, pan.getSize().height);
        if (newtypeNoeuds.equals("V")  || newtypeNoeuds.equals("R") || newtypeNoeuds.equals("L") )
        {
            typeNoeuds = newtypeNoeuds;
            nomNoeuds = newnomNoeuds;
            connection = new ArrayList<>();
            vPosX = x;
            vPosY= y;
        }else{
            throw new TypeNotSupportedException();
        }
        labelNoeuds = new JLabel(newnomNoeuds);
        labelNoeuds.setBounds(0, 0, 70, 20);
        labelNoeuds.setLocation(x, y);
        
        
    }
    
    
    @Override
    public String toString(){
        return ("Noeuds : "+typeNoeuds+" "+nomNoeuds);
    }
    
    public String getNom(){
        return nomNoeuds;
    }
    public String getType(){
        return typeNoeuds;
    }
    public void updateLabelPos(){
        labelNoeuds.setLocation(vPosX-30,vPosY);
        
    }

    public JLabel getLabelNoeuds() {
        this.updateLabelPos();
        return labelNoeuds;
    }

    public ArrayList<Liens> getConnection() {
        return connection;
    }
    
    public boolean containsConnection(Liens tmp){
        return connection.contains(tmp);
    }
    public boolean addConnection(Liens tmp){
        if (!this.connection.contains(tmp)){
            this.connection.add(tmp);
            return true;
        }
        return false;
    }
    
    public ArrayList<Noeuds> getVoisin(){
        ArrayList<Noeuds> voi = new ArrayList<>();
        for(Liens tmp : this.connection){
            voi.add(tmp.getOppose(this));
        }
        return voi;
    }
    public boolean estVoisin(Noeuds autre){
        for (Liens tmp : this.connection){
            if( tmp.getOppose(this).equals(autre)){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
            
        }
        if ( obj.getClass() != getClass() ){
            return false;
        }
        final Noeuds other  = (Noeuds)obj;
        return (this.getNom().equals(other.getNom())&&this.getType().equals(other.getType()));
         
    }

    public int getPosX() {
        return vPosX;
    }

    public void setPosX(int vPosX) {
        this.vPosX = vPosX;
    }
    
    public void setPosX(int vPosX, int max) {
        this.vPosX = Math.abs(vPosX%(max-(width)));
    }

    public int getPosY() {
        return vPosY;
    }

    public void setPosY(int vPosY) {
        this.vPosY = vPosY;
    }
    
    public void setPosY(int vPosY, int max) {
        this.vPosY = Math.abs(vPosY%(max-(width))) ;
    }
    
    public double getDeltaX(Noeuds tmpVoisin, int goal){
        int dX = tmpVoisin.getPosX()- this.getPosX();
        int dY = tmpVoisin.getPosY()- this.getPosY();
        int direction =0;
        if (Math.sqrt((dX*dX)+(dY*dY))> 1.05*goal)//a changer
        {
            direction = -1;
        }else if (Math.sqrt((dX*dX)+(dY*dY))< 0.95*goal){
            direction = 1;
        }
        return (dX-goal)*direction*0.0125;
        
    }
    
    public double getDeltaY(Noeuds tmpVoisin, int goal){
        int dX = tmpVoisin.getPosX()- this.getPosX();
        int dY = tmpVoisin.getPosY()- this.getPosY();
        int direction =0;
        if (Math.sqrt((dX*dX)+(dY*dY))> 1.05*goal)//a changer
        {
            direction = -1;
        }else if (Math.sqrt((dX*dX)+(dY*dY))< 0.95*goal){
            direction = 1;
        }
        return (dY-goal)*direction*0.0125;
        
    }
    
    public double getPosDeltaX(Noeuds tmpVoisin, int goal){
        if(tmpVoisin.equals(this)){
            return 0.0;
        }
        int dX = tmpVoisin.getPosX()- this.getPosX();
        int dY = tmpVoisin.getPosY()- this.getPosY();
        int direction =0;
        
        if (Math.sqrt((dX*dX)+(dY*dY))< 0.95*goal){
            System.out.println("x "+Math.sqrt((dX*dX)+(dY*dY))+" ; "+0.95*goal+ " ; "+(dX-goal)*direction*0.05);
            direction = 1;
        }
        return (dX-goal)*direction*0.05;
    }
    public double getPosDeltaY(Noeuds tmpVoisin, int goal){
        if(tmpVoisin.equals(this)){
            return 0.0;
        }
        int dX = tmpVoisin.getPosX()- this.getPosX()+(tmpVoisin.width/2)-(this.width/2);
        int dY = tmpVoisin.getPosY()- this.getPosY()+(tmpVoisin.width/2)-(this.width/2);
        int direction =0;
        
        if (Math.sqrt((dX*dX)+(dY*dY))< 0.95*goal){
            System.out.println("y "+Math.sqrt((dX*dX)+(dY*dY))+" ; "+0.95*goal+ " ; "+(dY-goal)*direction*0.05);
            direction = 1;
        }
        return (dY-goal)*direction*0.05;
    }
    
    public float getDistanceFromVoisin(Noeuds tmpVoisin){
        for( Liens tmpLiens : this.connection){
            if (tmpLiens.getOppose(this).equals(tmpVoisin)){
                return tmpLiens.getPoidsLiens();
            }
        }
        return 0;
    }
    
}
