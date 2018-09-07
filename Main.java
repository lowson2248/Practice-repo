import java.util.*;

class Main{
    public static void Main(String[] args){
        //ヤタガラスのインスタンス化
        Yatagarasu yataA = new Yatagarasu();
        Yatagarasu yataB = new Yatagarasu();
        
        //ゾンビのインスタンス化
        Zombie zombie = new Zombie();
        
        for(; yataB.getHP() > 0;){
            int damage = zombie.attack(yataB.getHp());
            yataB.setHp() = damage;
            if(yataB.getHp() <= 0){
                System.out.println("体力がゼロになりました");
            }
        }
    }
}
