package lesFondamentauxDuLangage;

import java.time.LocalDate;

public class LesDatesEtLesHeures {

	public static void main(String[] args) {

		/*
		 * of : retourne une instance de la classe initialisee avec les differentes
		 * valeurs passes comme parametres
		 */

		LocalDate noel;
		noel = LocalDate.of(2019, 12, 25);
		System.out.println(noel);
	}

}
