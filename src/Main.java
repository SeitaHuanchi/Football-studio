package Juego;

import javax.swing.JOptionPane;
import Player;


public class Main {
	public int apuesta(Player jugador){


		System.out.println("Cuanto desea apostar: ");
		int apuesta= Integer.parseInt(JOptionPane.showInputDialog(""));
		jugador.rest(apuesta);
		System.out.print(apuesta);

		if (apuesta <= 0 ) {
			System.out.println("Ingrese una apuesta coherente");
		}
		return (apuesta);
	}
	public int opcion() {
		System.out.print("\nIngrese el Equipo ganador: ");
        System.out.println("\n1. Equipo rojo (X2)");
        System.out.println("2. Equipo azul X2)");
        System.out.println("3. Empate X11)");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(""));
        if (opcion == 1 || opcion == 2 || opcion == 3){
    		
    		System.out.println("usted aposto a: "+opcion);
    	}
		return opcion;
	}
    public static void main(String[] args) {
    	
    	String nombre = JOptionPane.showInputDialog("Cual es su nombre?");
    	Player jugador = new Player(nombre);
    	
		System.out.println("\nBienvenid@ "+ jugador.name);
		System.out.println("su saldo es de $10.000");
    	
		while (true) {
			
			Game game = new Game(jugador);
			game.football();
			
			
			System.out.println("\n==============");
			String input = JOptionPane.showInputDialog("Quiere continuar?: s/n");
			if (input.equals("n")) {
				break;
			}
		}	
    }
}