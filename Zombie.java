package model;
java.util.Random;
	java.lang.Math;

public class Zombie extends Monster implements Human {
	public void Run(){
		System.out.println("�]���r���������B");
	}

	public void attack(int hp){
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println("�]���r���A�^�b�N�����I");
	}
}