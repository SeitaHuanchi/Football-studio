package Juego;


import Main.apuesta;
import Player;

public class Game {
	static int redteam;
	static int blueteam;
	Player jugador; 
	

	public Game(Juego.Player jugador) {
		this.jugador=jugador;
	}
	public void football() {
		 
		
		redteam= (int) (Math.random() * 12 + 2);
		blueteam= (int)(Math.random() * 12 + 2);
		
		Main opcion_main =new Main();
		int opcion = opcion_main.opcion();
		
		
		
		System.out.println("\n");
		Main apuesta_main = new Main();
		int apuesta = apuesta_main.apuesta(jugador);
		

		System.out.printf("\n\nEl resultado es: %s -- %s", redteam, blueteam);
        
        if (redteam == 11){
            System.out.println("\nEl '11' equivale a una Jota");
        } else if (redteam == 12){
            System.out.println("\nEl '12' equivale a una Reina");
        } else if (redteam == 13){
            System.out.println("\nEl '13' Equivale a un Rey");
        } else if (redteam == 14){
            System.out.println("\nEl '14' Equivale a un AS");
        }
        
        if (blueteam == 11){
            System.out.println("\nEl '11' equivale a una Jota");
        } else if (blueteam == 12){
            System.out.println("\nEl '12' equivale a una Reina");
        } else if (blueteam == 13){
            System.out.println("\nEl '13' Equivale a un Rey");
        } else if (blueteam == 14){
            System.out.println("\nEl '14' Equivale a un AS");
        }
        System.out.println("\n");
        
        //Profits pro = new Profits();
        
        if (opcion == 1 && redteam > blueteam) {
            System.out.println("Ganaste!, el equipo rojo es mayor.");
            jugador.sum(apuesta,2);
            
        }
        else if (opcion == 2 && redteam < blueteam) {
        	System.out.println("Ganaste!, el equipo azul es mayor");
        	jugador.sum(apuesta,2);
        	
        }
        else if (opcion == 3 && redteam == blueteam){
        	System.out.println("Felicidades!, es un empate");
        	jugador.sum(apuesta,11);
        	
        }
        else {
        	System.out.println("Pediste.");
        	System.out.println("Suerte para la proxima");
        	System.out.println("Su saldo es de: "+ jugador.saldo);
        }
	} 
	
	public static void main (String[] args) {
		//P_Game game = new P_Game();
		//game.football();
	}
}
