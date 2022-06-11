
package yazlab23;

import java.util.ArrayList;

public class Yazlab23 {
       static int[][] harita=new int[5][5];
       static int ekli_i;
       static int ekli_j;
    public static void main(String[] args) {
       ArrayList<musluk> musluklar =new ArrayList<>();
        musluk musluk1 =new musluk(1);
        musluk musluk2 =new musluk(2);
        musluk musluk3 =new musluk(3);
        musluk1.baglanti.add(musluk2);
        musluk1.baglanti.add(musluk3);
        musluk2.baglanti.add(musluk3);
        musluklar.add(new musluk(1));
        musluklar.add(new musluk(2));
        musluklar.add(new musluk(3));
    

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
            harita[i][j]=0;
            }
        }
        
        for(musluk i:musluklar){
        
            if(ekli_mi(i.id)){
            
            }else{
                if(i.id==1){
                  harita[1][1]=i.id;
                  for(musluk j:i.baglanti){
                      if(harita[1][2]==0){//sağ 
                      
                      }else if(harita[2][1]==0){//aşağı 
                      
                      }else if(harita[0][2]==0){//sağ üst 
                      
                      }else if(harita[2][2]==0){//aşağı alt
                      
                      }else if(harita[1][0]==0){//sol
                      
                      }else if(harita[0][0]==0){//sol üst
                      
                      }
                  }
                
                }
            }
        
        }
        
        
    }
    public static void haritaOlustur(){
    
    
    
    }
    public static boolean ekli_mi(int musluk_ID){
    
        for(int i=1;i<4;i++){
            for(int j=1;j<4;j++){
                if(musluk_ID==harita[i][j]){
                   ekli_i=i;
                   ekli_j=j;
                return true;
                }
            }
        
        }
        
        
    return false;
    }
}
