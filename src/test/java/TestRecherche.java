import org.junit.*;
public class TestRecherche {

	@Test
	public  void recherchecroissant() {
		int tab[]={1,2,3,4,5};
		Recherchecroissant z = new Recherchecroissant();
		int chiffre = z.recherche(tab,3);
		if(chiffre==-1)
			System.out.println("pas trouvé");
		else
			System.out.println(chiffre);
	}
	
	
	@Test
	public  void recherchedecroissant() {
		int tab[]={5,4,3,2,1};
		Recherchedecroissant x = new Recherchedecroissant();
		int chiffre2 = x.recherche(tab,6);
		if(chiffre2==-1)
			System.out.println("pas trouvé");
		else
			System.out.println(chiffre2);
	}

}
