package simondiceclase;
import java.util.Random;
import java.util.Scanner;

public class Juego {
	
	String cadena="";
	int temp=1000;
	String resultado="";
	Scanner teclado=new Scanner(System.in);
	int maximoAciertos=0;
	
	public int crearColor() {
		Random numAle=new Random();
		int caracter=numAle.nextInt(1,5);
		return caracter;
		}
	public void mostrarCadena() {
		cadena=cadena+ crearColor();
		// Mostramos los caracteres de la cadena uno por uno
		for(int i=0;i<cadena.length();i++) {
			char caracter=cadena.charAt(i);
			System.out.print(caracter);
			try {
				Thread.sleep(temp);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.print("\b");			
		}
		
//		System.out.print("\n\n\n\n");
		
	}


	public void setTemp(int valor) {
		temp=valor;
	}
	
	
	public void Juego() {
		boolean boo=false;
		int aciertos;
		while(boo==false) {
			System.out.println("1 - Nueva partida");
			System.out.println("2 - Modificar tiempo espera entre valor (actual 1000)");
			System.out.println("3 - Ver número máximo de aciertos en la actual ejecución");
			System.out.println("4- Salir");
			Scanner teclado2=new Scanner(System.in);
			int hacer=teclado2.nextInt();
			if(hacer==1) {

				cadena="";
				aciertos=0;
				boolean ope=false;
				while(ope==false) {
					mostrarCadena();
					// Le pido al usuario que teclee el dato
					resultado=teclado.nextLine();
					
					if (cadena.equals(resultado)) {
						aciertos=aciertos+1;
					}
					else {
						ope=true;
						System.out.println("Has fallado");
					}
				}
				
				if(aciertos>maximoAciertos)
					maximoAciertos=aciertos;
			}
			if (hacer==2) {
				System.out.println("Pon el tiempo en ms:");
				Scanner teclado3=new Scanner(System.in);
				int tiempo=teclado3.nextInt();
				this.setTemp(tiempo);
				
			}
			if(hacer==3) {
				System.out.println("tu número de aciertos máximo: "+ maximoAciertos);
			}
			if (hacer==4) {
				boo=true;
			}
		}
	}
}
