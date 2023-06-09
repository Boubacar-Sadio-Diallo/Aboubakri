package tortue;


/**
 * 
 */

/**
 * @author diallo2210
 * Interface représentant une tortue qui dessine
 */
public interface InterfaceTortue {
		/**
		 * Bouger en avant par une distance
		 */
		public void avancerSansTracer(int longueur);
		/**
		 * Bouger par distance en traçant
		 */
		 public void avancerEtTracer(int longueur);
		 /**
		  * Tourner contre le sens de l'aiguille
		 * @return 
		  */
		 public void tourner(double angle) ;

		 /**
		  *Ne fait rien 
		  */
		 public void stay() ;
		 
		 /**
		  * Sauvegarder l'état de la tortue
		  */
		 public void sauverPosition() ;
		 
		 /**
		  * Reprend l'état de la tortue en haut de la pile
		  */
		 public void restaurerPosition() ;
		 
		
		
}

