public class Matrix{
	public static void main(String[] args){
		int[][][] mat=new int[6][][];
		mat[0]=new int[2][2];
		mat[1]=new int[3][2];
		mat[2]=new int[4][2];
		mat[3]=new int[4][2];	
		mat[4]=new int[3][2];
		mat[5]=new int[2][2];

		for(int i=0;i<=5;i++)
			switch(i){
				case 0: for(int j=0;j<2;j++)
						for(int k=0;k<2;k++)
							mat[i][j][k]=i+j+k+1;
				case 1: for(int j=0;j<3;j++)
						for(int k=0;k<2;k++)
							mat[i][j][k]=i+j+k+10;
				case 2: for(int j=0;j<4;j++)
						for(int k=0;k<2;k++)
							mat[i][j][k]=i+j+k+100;
				case 3: for(int j=0;j<4;j++)
						for(int k=0;k<2;k++)
							mat[i][j][k]=i+j+k+1000;				
				case 4: for(int j=0;j<3;j++)
						for(int k=0;k<2;k++)
							mat[i][j][k]=i+j+k+10000;
				case 5: for(int j=0;j<2;j++)
						for(int k=0;k<2;k++)
							mat[i][j][k]=i+j+k+100000;				
			}
		for(int i=0;i<=5;i++)
			switch(i){
				case 0: for(int j=0;j<2;j++)
						for(int k=0;k<2;k++)
							System.out.print(mat[i][j][k]+"\t");
				case 1: for(int j=0;j<3;j++)
						for(int k=0;k<2;k++)
							System.out.print(mat[i][j][k]+"\t");
				case 2: for(int j=0;j<4;j++)
						for(int k=0;k<2;k++)
							System.out.print(mat[i][j][k]+"\t");
				case 3: for(int j=0;j<4;j++)
						for(int k=0;k<2;k++)
							System.out.print(mat[i][j][k]+"\t");
				case 4: for(int j=0;j<3;j++)
						for(int k=0;k<2;k++)
							System.out.print(mat[i][j][k]+"\t");
				case 5: for(int j=0;j<2;j++)
						for(int k=0;k<2;k++)
							System.out.print(mat[i][j][k]+"\t");
			}
	}
}
