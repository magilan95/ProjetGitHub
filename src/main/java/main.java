

public class main {

	
	public static void main(String[] args) {
		int tab[]={-10,5,74,1,4,4,23,74};
		
		tri tr = new tri();
		
		int x=1;
		
		Recherchecroissant cr = new Recherchecroissant();
		
		Recherchedecroissant dc = new Recherchedecroissant();
		
	
		int chiffre=0;
		if(x==1){
			tr.croissant(tab);
			chiffre= cr.recherche(tab,6);
			}
		
		
		if(x==2){
			tr.decroissant(tab);
			chiffre= dc.recherche(tab,3);
			}
			
		if(chiffre==-1)
			System.out.println("pas trouvé");
		else
			System.out.println(chiffre);
		}

}
