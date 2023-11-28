package Entornos;

public class Ejercicio3 {
	//n ->10
	//a ->0, 1, 13
	//b ->1, 1, 21
	//i -> 2, 3, 9, 10(no se hace)
	//temp ->1, 2 , 34
	//pantalla -> 1,2, 34, termina(10 no se hace)
	public static void main(String[] args) {
		
		int n = 10;
		int a = 0, b = 1;
		System.out.print(a + ", " + b);
		for (int i = 2; i < n; i++) {
			int temp = a + b;
			System.out.print(", " + temp);
			a = b;
			b = temp;
		}
	}
}
