public class triangledraw {
	public static void drawtriangle(int N){
		for (int i = 1; i < N + 1; i = i + 1){
			for (int j =1; j < i ; j = j + 1){
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	public static void main(String[] args){
    drawtriangle(10);
	}
}