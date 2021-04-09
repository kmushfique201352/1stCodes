class MultiDim{
	public static void main(String[] args){
		MultiDim m=new MultiDim();
		m.matrix();
	}
	void matrix(){
		int[][] twoDim=new int[3][3];
		for(int row=0;row<3;row++)
			for(int col=0;col<3;col++)
				twoDim[row][col]=row+col;
		for(int row=0;row<=2;row++)
			for(int col=0;col<=2;col++)
				System.out.println(twoDim[row][col]);
	}
	public void mulArray(){
		int[][] myArray=new int[4][];
		myArray[0]=new int[2];
		myArray[1]=new int[4];
		myArray[2]=new int[6];
		myArray[3]=new int[8];
	}
}
