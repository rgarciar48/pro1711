package MisClases;

import java.util.Scanner;

public class Agenda {
	
	//Atributos
	DatosPersona[] agenda;
	
	Agenda(int numEntradas) {
		
		agenda=new DatosPersona[numEntradas];
		
	}
	
	
	
	int insertarEntrada() {
		
		boolean encontrado=false;
		int i=0;
		// Buscamos el primer hueco vacío en la agenda
		for(i=0; i < agenda.length; i++) {
			if(agenda[i]==null) {
				encontrado=true;
				break;
			}
		}
		
		if(encontrado==true) {
			// He encontrado el elemento

			// Le pedimos al usuario los datos del nuevo registro
			Scanner teclado=new Scanner(System.in);
			
			System.out.println("Introduce el nombre");
			String nombre=teclado.nextLine();
			System.out.println("Introduce la direccion");
			String direccion=teclado.nextLine();
			System.out.println("Introduce el número fijo");
			String fijo=teclado.nextLine();
			System.out.println("Introduce el número móvil");
			String movil=teclado.nextLine();
			System.out.println("Introduce el email");
			String eMail=teclado.nextLine();
			
			// Creamos un objeto de la clase DatosPersona
			DatosPersona nuevoRegistro=new DatosPersona(nombre,direccion,fijo,movil,eMail);

			// Inserto el objeto en la posición buscada en la agenda
			agenda[i]=nuevoRegistro;
			return i;
			
			
		}
		else {
			// La agenda estaba llena
			return -1;
		}
				
	}
	
	
	 public void mostrasEntradasAgenda() {
		 System.out.println("-------------------------------------\n");
		 for(int i=0; i < agenda.length; i++) {
			 if(agenda[i]!=null) {
				 System.out.println(i+" - "+agenda[i].formatoCorto());
			 }
		 }
		 System.out.println("-------------------------------------\n");
	 }
	
	 public int borrarEntrada() {
		 int entradaBorrada=-1;
		 Scanner teclado=new Scanner(System.in);
		 System.out.println("Introduce el índice de la entrada a borrar :");
		 int indice=teclado.nextInt();
		 teclado.nextLine();
		 if (agenda[indice]!=null) {
			 agenda[indice]=null;
			 entradaBorrada=indice;
			 System.out.println("La entrada "+indice+ " se ha borrado correctamente");
		 }
		 else {
			 System.out.println("La entrada seleccionada no tiene datos");
		 }
		 System.out.println("-------------------------------------\n");
		 
		// teclado.close();
		 return entradaBorrada;
		 
	 }
	 public int modificarEntrada(){
		 int entradaModificada=-1;
		 Scanner teclado=new Scanner(System.in);
		 System.out.println("Introduce el índice de la entrada a borrar :");
		 int indice=teclado.nextInt();
		 teclado.nextLine();
		 if (agenda[indice]!=null) {
			System.out.println("Introduce el nuevo nombre : "+agenda[indice].getNombre());
			String nombre=teclado.nextLine();
			if (!nombre.isEmpty()) {
				//Metodo  nombre.isEmpty()==false es lo mismo que esto
				agenda[indice].setNombre(nombre);
			}
			
			System.out.println("Introduce la direccion nueva "+agenda[indice].getDireccion());
			String direccion=teclado.nextLine();
			if (!direccion.isEmpty()) {
				//Metodo  nombre.isEmpty()==false es lo mismo que esto
				agenda[indice].setDireccion(direccion);
			}
				
			System.out.println("Introduce el nueva número fijo");
			String fijo=teclado.nextLine();
			if (!fijo.isEmpty()) {
				agenda[indice].setNumFijo(fijo);
			}

			System.out.println("Introduce el nueva número móvil");
			String movil=teclado.nextLine();
			if (!movil.isEmpty()) {
				agenda[indice].setNumMovil(movil);
			}
			System.out.println("Introduce el nueva email");
			String eMail=teclado.nextLine();
			if (!eMail.isEmpty()) {
				agenda[indice].seteMail(eMail);
			}

			 
		 }
		 else {
			 System.out.println("La entrada seleccionada no tiene datos");
		 }
		 System.out.println("-------------------------------------\n");
		 
		// teclado.close();
		 return entradaModificada;
		
	 }
}
