package model;

public class Zombie extends Monster implements Human {
	public void Run(){
		System.out.println("�]���r���������B");
	}

	public void attack(int hp){
		System.out.println("�]���r���A�^�b�N�����I");
	}
}