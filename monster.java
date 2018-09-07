java.util.*;
class Monster extends Life {
    public int attack(int hp){
	System.out.println("攻撃!");
	hp = hp - 20;
	return hp;
    }
}
