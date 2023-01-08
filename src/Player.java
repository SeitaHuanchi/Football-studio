package Juego;


public class Player {
	int saldo =10000;
	String name ="";
	
	public Player(String user_name) {
		this.name= user_name;
	}
	
	public void rest(int monto) {
		if (this.saldo>=monto) {
			this.saldo-=monto;
			
		}
		else {
			System.out.println("No tiene suficiente dinero para apostar");
		}
	}
	public void sum(int monto,int multiplicador ) {
		int ganancia = monto * multiplicador;
		this.saldo = this.saldo+ganancia;
		System.out.println("Su ganancia es de: "+ ganancia);
		System.out.println("su nuevo saldo es de: "+ this.saldo);
	}
	
}
