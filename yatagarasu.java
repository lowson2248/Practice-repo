java.util.*;
  
class Yatagarasu extends Monster implements Bird {
    public void run(){
        System.out.println("Birdは飛んだ");
    }
    
    public int attack(int hp){
        System.out.println("攻撃");
        hp -= 20;
        return hp;
    }
    
    public void dead(int hp){
        if(hp <= 0){
            System.out.println("HPが0になりました");
        }
    }
}
     
