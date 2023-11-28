package Entornos;

public class Ejercicio2{
	//n ->5
	//sum ->0, 1, 3, 6, 10, 15
	//i ->1, 2, 3, 4, 5
	/*pantalla ->15
	 * valor i=1, 2, 3, 4, 5
	 * valor sum=1, 3, 6, 10, 15
	 * 
	 */
	 public static void main(String[] args) {
	 int n = 5;
	 int sum = 0;
	 for (int i = 1; i <= n; i++) {
	 sum += i;
	 System.out.println("Valor de 'i': " + i);
	 System.out.println("Valor de 'sum': " + sum);
	 }
	 System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
	}

}
