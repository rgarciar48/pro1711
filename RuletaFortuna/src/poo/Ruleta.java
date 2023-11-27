package poo;
import java.util.Random;
import java.util.Arrays;

public class Ruleta {
	
	String [] ruleta= {"100","75","25","Quiebra","200","25","50","Pierde turno","0","Comodin","500"};
	int indicador;
	
	Ruleta(){
		indicador=0; //La ruleta apunta a la primera posicion
		
	}
	
	String getValorActual(){
		
		return ruleta[indicador];
	}

/*
	public void lanzarRuleta() {
		Random numAle=new Random();
		indicador=numAle.nextInt(0,ruleta.length);
		
	}
*/
	public void lanzarRuleta() {
		int tiempoFuerza; //representa el tiempo que talda en pasar de una celda a otra
		Random numAle=new Random();
		tiempoFuerza=numAle.nextInt(100,300);
		
		System.out.println("La Ruleta empieza a girar ");
		System.out.print("--"+getValorActual()+"--");
		
		while(tiempoFuerza<800) {
			try {
				Thread.sleep(tiempoFuerza);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			indicador++;
			if(indicador>=ruleta.length) {
				indicador=0;
			}
			System.out.print("--"+getValorActual()+"--");
			tiempoFuerza+=40; //incrementamos el tiempo de paso 
			
		}
		
	}

}
