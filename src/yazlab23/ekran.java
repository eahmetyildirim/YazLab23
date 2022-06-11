/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazlab23;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ahmet
 */
public class ekran extends JFrame implements ActionListener{
       private ArrayList<JButton> MuslukBtn =new ArrayList<>();
       private  ArrayList<musluk> musluklar =new ArrayList<>();
       private ArrayList<Integer> harita_y=new ArrayList<>();
       private ArrayList<Integer> harita_x=new ArrayList<>();
       private ArrayList<Integer> edge_x1=new ArrayList<>();
       private ArrayList<Integer> edge_x2=new ArrayList<>();
       private ArrayList<Integer> edge_y1=new ArrayList<>();
       private ArrayList<Integer> edge_y2=new ArrayList<>();
       
    public ekran() throws HeadlessException {
        setSize(1900,1000);     
        musluklar.add(new musluk(1));
        musluklar.add(new musluk(2));
        musluklar.add(new musluk(3));
        musluklar.add(new musluk(4));
       
    //    musluklar.add(new musluk(5));
       /* musluklar.add(new musluk(6));
        musluklar.add(new musluk(7));
        musluklar.add(new musluk(8));
        musluklar.add(new musluk(9));
        musluklar.add(new musluk(10));
        musluklar.add(new musluk(11));
        musluklar.add(new musluk(12));
         musluklar.add(new musluk(13));
        musluklar.add(new musluk(14));
        musluklar.add(new musluk(15));
        musluklar.add(new musluk(16));
        musluklar.add(new musluk(17));
        musluklar.add(new musluk(18));
        musluklar.add(new musluk(19));
        musluklar.add(new musluk(20));*/
        setMusluklar(musluklar);
        ekranaYaz();
        setLayout(null);  
    
    }

    public void setMusluklar(ArrayList<musluk> musluklar) {
        this.musluklar = musluklar;
        for(int i=0;i<musluklar.size();i++){
            
            MuslukBtn.add(new JButton((i+1)+""));
        
        }
    }
    
    public void ekranaYaz(){

        grafYaz();
     
     
    }   
    public void grafYaz(){
       for(int i=0;i<MuslukBtn.size();i++){
         Random random=new Random(); //random sınıfı
         int y=0,x=0;
         while(true){
       
            x=random.nextInt(1700);
            y=random.nextInt(800);
            int say=0;
            // System.out.println(harita_i.size());
            if(harita_y!=null){
            
                for(int j=0;j<harita_y.size();j++){
                    int x_fark=harita_x.get(j)-x;
                    int y_fark=harita_y.get(j)-y;
                    if(x_fark<0){
                        x_fark=-1*x_fark;
                    }
                    if(y_fark<0){
                        y_fark=-1*y_fark;
                    }
                   
                int aralik=0;
                if(musluklar.size()<=10){
                aralik=300;
                }else{
                aralik=200;
                
                }
                if(x_fark<aralik && x_fark<aralik){
                          System.out.println("say++");
                say++;
                }
                
                }
                if(say==0){
                break;
                }
            }else{
            break;
            }
         }
                MuslukBtn.get(i).setBounds(x+50,y+50,50,50);
                System.out.println("Musluk-"+musluklar.get(i).id+" y:"+y+" x:"+x);
               harita_x.add(x);
                harita_y.add(y);
         
               add(MuslukBtn.get(i));
        }// MUSLUKLAR EKLENDİ.
     
    
    }
    public void edgeYaz(){
    
    
    
    
    
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[]){
    
       
        ekran Ekran=new ekran();
        Ekran.setVisible(true);
     
    }
}
