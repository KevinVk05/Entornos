package Entornos;

public class Ejercicio6 {
	// n ->100
	// sum ->1, 3,  7881299347898061, 15762598695796322
	// i -> 1, 2, 99, 100
	/* pantalla -> -414
	 * i=1, 2, 99, 100
	 * sum=1, 3,  7881299347898061, 15762598695796322
	 */
	public static void main(String[] args) {

		int n = 100;
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i % 2 == 0) {
				sum *= 2;
			}
			System.out.println("Valor de 'i': " + i);
			System.out.println("Valor de 'sum': " + sum);
		}

		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
	}
}