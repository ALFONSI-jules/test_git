package com.excilys.kataspoker.solvers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.excilys.kataspoker.model.CardNotFoundException;
import com.excilys.kataspoker.model.Carte;
import com.excilys.kataspoker.model.Main;
import com.excilys.kataspoker.model.Valeur;

public class Utilitaires {
	
	public static List<Carte> trierParValeur(Main main) {
		return new ArrayList<Carte>();
	}

	public static boolean contientLeRoiDeCoeur(Main main) {

		return false;
	}
	
	public static Carte contientUneCarteSpecifique(Main main, Carte carteATrouver) throws CardNotFoundException{
		
		return null;
	}
	
	public static Carte trouveLaMeilleureCarteDansMain(Main main) {
		
		return null;
	}
	
	public static int calculeSommeValeurs(Main main) {
		
		return 0;
	}
	
	public static Map<Valeur, List<Carte>> groupeParValeur(Main main) {
		return new HashMap<Valeur, List<Carte>>();
	}
	
	public static String groupeLesValeursDansString(Main main) {
		return "";	
	}
	
	public static List<Carte> regrouperCartes(List<Main> mains) {
		return new ArrayList<Carte>();
	}
	
	public static List<Carte> regrouperEtTrierParValeur(List<Main> mains) {
		return new ArrayList<Carte>();
	}
}
