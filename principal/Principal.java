package clase11.practica2.principal;

import java.io.FileNotFoundException;

import clase11.practica2.logica.Gestor;
import clase11.practica2.ui.CapaPresentacion;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException {
		CapaPresentacion presentacion = new CapaPresentacion();
		Gestor gestor = new Gestor();
		
		int opcion = 0;
		do {
			presentacion.showMenu();
			opcion = presentacion.leerValorEntero("Introduzca la opcion: ");
			gestor.ejecutarOpcion(opcion);
		} while (opcion != 3);

	}

}
