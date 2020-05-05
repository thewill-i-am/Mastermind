package clase11.practica2.logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestor {

	ArrayList<Persona> listaPersonas;

	public Gestor(){
		this.listaPersonas = new ArrayList<>();
	}

	public void cargarPersonas() throws FileNotFoundException {
		Scanner lector = new Scanner(new File("C:\\Users\\Mario\\workspace\\Clase11Practica2\\src\\datos.csv"));
		while (lector.hasNextLine()) {
			String currentLine = lector.nextLine();
			String[] datos = currentLine.split(",");
			Persona nuevaPersona = new Persona();
			nuevaPersona.setNombre(datos[0]);
			nuevaPersona.setApellido(datos[1]);
			nuevaPersona.setEstatura(Double.parseDouble(datos[2]));
			nuevaPersona.setProvincia(datos[3]);
			listaPersonas.add(nuevaPersona);
		}
		lector.close();
	}

	public void imprimirPersonas() {
		for (int i = 0; i < listaPersonas.size(); i++) {
			//aqui deberiamos usar un objeto de capa de presentacion.. pero para salvar tiempo
			System.out.println(listaPersonas.get(i));

		}
	}

	public void ejecutarOpcion(int opcion) throws FileNotFoundException {
		switch(opcion){
			case 1:
				this.cargarPersonas();
				break;
			case 2:
				this.imprimirPersonas();
				break;
			case 3:
				//aqui deberiamos usar el objeto de capa de presentacion
				System.out.println("Gracias");
				break;
			default:
				//aqui deberiamos usar el objeto de capa de presentacion
				System.out.println("Opcion desconocida");
		}
	}

}
