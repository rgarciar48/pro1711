package poo;

import java.util.Scanner;

public class Panel {
	
	String pista;
	String textoAdivinar;
	char [] estadoCasillas;
	
	Panel(String p,String texto){
		pista=p.toUpperCase();
		textoAdivinar=texto.toUpperCase();
		
		estadoCasillas=textoAdivinar.toCharArray();
		//Sustituimos los caracteres
		for(int i=0;i<estadoCasillas.length;i++) {
			char caracter=estadoCasillas[i];
			if (caracter!=' ' && caracter!='\n') {
				estadoCasillas[i]='-';
			}
		}		
	}
	public void estadoActualPanel() {
		System.out.println(pista);
		System.out.println("____________________________\n");
		
		System.out.println(estadoCasillas);
		
	}
	
	public int comprobarLetra(char letra){
		int aciertos=0;
		//Me aseguro de que la letra esta en mayúscula
		
		letra=Character.toUpperCase(letra);

		for(int i=0;i<textoAdivinar.length();i++) {
			if(textoAdivinar.charAt(i)==letra) {
				estadoCasillas[i]=letra;
				aciertos++;
			}
		}
		return aciertos;
	}
}
