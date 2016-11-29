import java.util.Scanner;

public class Burbuja {

	public static void main(String... burbuja) {
	
		String[] nombres = new String[3];

		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese nombre: ");
			nombres[i] = sc.next();
		}
		System.out.println("-----------------------");

		String aux;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2 - i; j++) {
				if (nombres[j].compareTo(nombres[j + 1]) > 0) {
					aux = nombres[j];
					nombres[j] = nombres[j + 1];
					nombres[j + 1] = aux;
				}
			}
		}

		for (String valor : nombres){
			System.out.println(valor);
		}
	}
}
