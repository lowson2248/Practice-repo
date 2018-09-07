import java.util.Random;

public class Zombie extends Monster implements Human {
	public void Run(){
		System.out.println("ゾンビが逃げた！！");
	}

	public int attack(int hp){
		Random rnd = new Random();
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println("ゾンビがかみついた！！");
		return hp;
	}

    public void dead(int hp){
        if(hp <= 0){
            System.out.println("HPが0になりました");
        }
    }
}