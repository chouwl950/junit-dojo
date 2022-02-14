package Parameterized;

public class Fibo {

	//フィボナッチ数列：1つ前と2つ前の数字を足していく　最初は0と1

	public int fibo(int idx) {
		int L = 0;
		if (idx == 0) {
			return (0);
		}

		if (idx == 1 || idx == 2) {
			return (1);
		} else {
			L = fibo(idx - 1) + fibo(idx - 2);
			// printf("return Fib(%d)=%ld\n",N,L);
			return (L);
		}

	}
}