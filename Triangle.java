public class Triangle {
	public static void main(String[] args){
		for (int i = 1; i < 6; i = i + 1){
			for (int j = 1; j < i; j = j + 1){
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}