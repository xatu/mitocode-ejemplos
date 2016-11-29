import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

	public static void main(String... zatu) throws IOException {
	
		PrintWriter printer = null;
		
		try (FileWriter archivo = new FileWriter("/home/knapp/mitocode/file.txt", true)) { 
			printer = new PrintWriter(archivo);
			printer.println("Hola Mundo");		
		} catch (Exception e) {
			//Exception e
		}

	}
}
