public class BreakContinue {
	public static void windowPosSum(int[] a, int n){
		for (int i = 0; i < a.length; i = i + 1){
			if (a[i] < 0){
				continue;
			}
			for (int j = i + 1; j < i + n + 1; j = j + 1){
				if (j > a.length - 1){
					break;
				}
            a[i] = a[i] + a[j];
			}
		}

	}

	public static void main(String[] args){
		int[] a = {1, 2, -3, 4, 5, 4};
		int n =3;
		windowPosSum(a, n);

		System.out.println(java.util.Arrays.toString(a));
	}
}