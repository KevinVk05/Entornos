package Entornos;

public class Ejercicio1 {
	//n ->5
	//i ->1, 2, 3, 4, 5
	//sum ->1, 3,  6, 10, 15
	// pantalla -> 15
	 public static void main(String[] args) {
		 int n = 5;
		 int sum = 0;
		 for (int i = 1; i <= n; i++) {
			 sum += i;
	 }
	 System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
	}

}
