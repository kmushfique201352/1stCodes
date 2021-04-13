
public class ABC {
	int a,b,c;
	
	public void setValue() {
		a=2;
		b=4;
		c=6;
		System.out.println("1."+" a: "+a+" b: "+b+" c: "+c);
	}
	
	public void setValue(int a) {
		this.a=a;
		b=4;
		c=6;
		System.out.println("2."+" a: "+a+" b: "+b+" c: "+c);
	}

	public void setValue(int a,int b) {
		this.a=a;
		this.b=b;
		c=6;
		System.out.println("3."+" a: "+a+" b: "+b+" c: "+c);
	}

	public void setValue(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		int z=a+b+c;
		System.out.println(z);
	}
	
}
