package clase11.practica2.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class CapaPresentacion {

	private Scanner input;
	private PrintStream output;
	
	public CapaPresentacion(){
		this.input = new Scanner(System.in);
		this.output = new PrintStream(System.out);
	}

	public void showMenu() {
		output.println("Escoja la opcion:");
		output.println("1. Cargar Objetos");
		output.println("2. Listar"); 
		output.println("3. Salir");
	}

	public int leerValorEntero(String string) {
		output.println(string);
		int valor = input.nextInt();
		input.skip("[\r\n]");
		return valor;
	}

}
