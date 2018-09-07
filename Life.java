public class Life {
		private int hp=100;

		public int getHp()
	    {
	        return hp;
	    }

	void dead() {
		if(hp>=0){
		System.out.println("死にました。");
		}
	}

}
