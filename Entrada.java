import java.util.Scanner;

public class Entrada {

	public static void main(String... entrada) {

		String nombre = "";

		while (!nombre.equals("Rafael")) {
			System.out.println("No eres Rafael");
			Scanner input = new Scanner(System.in);
			nombre = input.next();			
		}
		System.out.println("Hola Rafael");
	}
}
