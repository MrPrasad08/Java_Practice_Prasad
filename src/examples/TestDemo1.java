package examples;

public class TestDemo1 {
	static int x = 10;
	int y = 20;
	static {
		x += 5;
	}
	
	{
		y += x;
	}

	public static void main(String[] args) {
		TestDemo1 a = new TestDemo1();
		TestDemo1 b = new TestDemo1();
		System.out.println(x+" "+a.y+" "+a.y);
	}
}
