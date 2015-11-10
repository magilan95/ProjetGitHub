
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tab[]={5,4,3,2,1};
		//Recherchecroissant z = new Recherchecroissant();
		Recherchedecroissant x = new Recherchedecroissant();
		//int chiffre = z.recherche(tab,3);
		int chiffre2 = x.recherche(tab,6);
		if(chiffre2==-1)
			System.out.println("pas trouvé");
		else
			System.out.println(chiffre2);
	}

}
