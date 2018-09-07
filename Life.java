public class Life {
		private int hp=100;

		public int getHp()
	    {
	        return hp;
	    }

		public void setHp(int hp) {
			this.hp = hp;
		}

	void dead(int hp) {
		if(hp<=0){
		System.out.println("死にました。");
		}
	}

}
