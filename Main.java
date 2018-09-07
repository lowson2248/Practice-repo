java.util.*;

class Main{
    public class void main(String[] args){
        //八咫烏インスタンス化
        Yatagarasu yataA = new Yatagarasu();
        Yatagarasu yataB = new Yatagarasu();
        
        //ゾンビをインスタンス化
        Zombi zombi = new Zombi();
        
        for(yataB.getHp() > 0){
            int damage = zombi.attack(yataB.getHp);
            yataB.setHp(damage);
            yataB.dead(yataB.getHp());
            
        }
        
    }
}
