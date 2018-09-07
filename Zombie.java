package model;

public class Zombie extends Monster implements Human {
	public void Run(){
		System.out.println("ゾンビが逃げた。");
	}

	public void attack(int hp){
		System.out.println("ゾンビがアタックした！");
	}
}