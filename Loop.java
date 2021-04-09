public class Loop{
	public void loop(){
		int x,i;
		for(i=1;i<=50;i++){
			if(i%3==0&&i%5==0){
				System.out.println(i+"_baz");
			}
			else if(i%3==0){
				System.out.println(i+"_foo");
			}
			else if(i%5==0){
				System.out.println(i+"_bar");
			}
		}
	}
	public static void main(String[] args){
		Loop lp=new Loop();
		lp.loop();
	}
}
