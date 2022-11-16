import java.util.Scanner;

public class EstructuresRepetitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		int opcio = -1;
		double Notes,NumNotes,Suma;
		int altura,i,x;
		while (opcio != 0) {
			System.out.println("");
			System.out.println("          MENÚ D'OPCIONS");
			System.out.println("");
			System.out.println("0. Sortir");
			System.out.println("1. Calcular la mitjana de notes d'un grup d'alumnes");
			System.out.println("2. Dibuixar triangles (1)");
			System.out.println("3. Dibuixar triangles (2)");
			System.out.println("4. Dibuixar piràmides");
			System.out.println("");
			System.out.println("Escull una opció");
			opcio = reader.nextInt();
			switch (opcio) {
			case 0:
				opcio = 0;
				break;
			case 1:
				System.out.println("1. Calcular la mitjana de notes d'un grup d'alumnes");
				Notes = 0;
				NumNotes = 0;
				Suma = 0;
				System.out.println("Digues la nota de l'alumne");
				while (Notes != -1) {
					Notes = reader.nextDouble();
					Suma = Suma + Notes;
					NumNotes = NumNotes +1;
				}
				System.out.println("La mitjana de classe és de..." + (Suma +1)/(NumNotes -1));
				break;
			case 2:
				System.out.println("2. Dibuixar triangles (1)");
				System.out.println("Entra l'alçada del triangle");
				altura = reader.nextInt();
				for (i=1;i<=altura;i++) {
					for (x=i;x<=1;x++) {
						System.out.print(x+"");
					}
					System.out.println("");
				} 
				break;
			case 3:
				System.out.println("3. Dibuixar triangles (2)");
				System.out.println("Entra l'alçada del triangle");
				altura = reader.nextInt();
				for (i=1;i<=altura;i++) {
					for (x=1;x<=i;x++) {
						System.out.print(x+"");
					}
					System.out.println("");
				} 
				break;
			case 4:
				System.out.println("4. Dibuixar priàmides");
				break;
			}
			
		}
		
		reader.close();
	}
}
