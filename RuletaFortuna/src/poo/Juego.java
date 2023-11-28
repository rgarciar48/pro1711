package poo;
import java.util.Random;
import java.util.Arrays;

public class Juego {

	final int NUM_JUGADORES=3;
	final int NUM_PANELES=4;
	Jugador[] jugadores;
	int turnoActual;
	
	
	Juego(){
		
		jugadores=new Jugador[NUM_JUGADORES];
		
		//asignamos el turno inicial aleotoriamente
		Random numAleatorio=new Random();
		turnoActual=numAleatorio.nextInt(0,NUM_JUGADORES);
		
		
	}
	void cambiarTurno() {
		turnoActual++;
		if (turnoActual>=NUM_JUGADORES) {
			turnoActual=0;
		}
	}
	void partida() {
		
		for(int i=0;i<NUM_PANELES;i++) {
			//crear panel
			Panel miPanel=new Panel("hola buenos dias", "todos los \n dias");
			//mostramos panel
			miPanel.estadoActualPanel();
			//preguntar jugador si quiere resolver, comprar vocal o tirar ruleta
				
			
		}
	}
	
}
