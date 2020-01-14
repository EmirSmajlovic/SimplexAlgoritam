import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimplexAlogritam {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		/* uvest nacin za pravljenje nejednakosti, slobodnih koeficijenata,
		 * uvest nacin za dopunske varijable
		 * prec na tabelu 
		 * grafikon
		 */
		
		
		
		
		
		
		// funkcija cilja
		System.out.println("Unesite funkciju cilja: ");
		List<Integer> funkcijaCilja = new ArrayList<Integer>();
		do {
			funkcijaCilja.add((unos.nextInt()));
		} while (unos.nextInt() != -1);
		
		// ogranicenja
		
		System.out.println("Unesite broj ogranicenja:");
		int brojRedova = unos.nextInt();
		System.out.println("Unesite broj varijabli: ");
		int brojKolona = unos.nextInt();
		System.out.println("Unesite koeficijente uz ogranicenja u vasu matricu: ");
		double[][] matricaOgranicenja = new double[brojRedova][brojKolona];
		for (int i = 0; i < brojRedova; i++) {
			for (int j = 0; j < brojKolona; j++) {
				matricaOgranicenja[i][j] = unos.nextDouble();
			}
		}
		System.out.println("Matrica je trenuto sljedeceg izgleda: ");
		for (int i = 0; i < brojRedova; i++) {
			for (int j = 0; j < brojKolona; j++) {
				System.out.print(matricaOgranicenja[i][j] + " ");
				if (j == brojKolona - 1) {System.out.println();}
			}
			
		}
		unos.close();
	}

}
