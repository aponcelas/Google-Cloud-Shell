import java.util.Scanner;

public class NúmeroAleatori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int jugador,ordinador,limit;
		System.out.println("Digues un numero");
		jugador = reader.nextInt();
		ordinador = (int)(Math.random()* 6 + 1);
		limit = 7;
		if (jugador >= limit) {
			System.out.println("El número a sobrepassat el límit del dau.");
		}
		else if (jugador == ordinador) {
			System.out.println("El jugador a guanyat.");
		}
		else {
			System.out.println("L'ordinador a guanyat");
		}
		
		reader.close();
	}

}
