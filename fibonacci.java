public class fibonacci{
	public static int fib2(int n, int f0, int f1){
		if (n == 1){
			return f0;
		}
		else if (n == 2){
			return f1;
		}
		else return fib2(n - 1, f0, f1) + fib2(n - 2, f0, f1);
	}

	public static void main(String[] args){
		System.out.println(fib2(5, 0, 1));
	}
}