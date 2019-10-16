public class findmax{
	public static int max(int[] m) {
		int k = m.length;
		int v = m[0];
		for (int i = 0; i < k - 1; i = i + 1){
			if (m[i] < m[i + 1])
				v = m[i + 1];
		}
		return v;
	}
	public static void main(String[] args){
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
	}
}