import java.util.Scanner;

public class main {

	
	public static void main(String[] args) {
		int tab[]={-10,5,74,1,4,4,23,74};
		
		tri tr = new tri();
		
		int x;
		
		Recherchecroissant cr = new Recherchecroissant();
		
		Recherchedecroissant dc = new Recherchedecroissant();
		
		System.out.println("entrer 1 pour les ranger par ordre croissant/n entrer 2 pour ranger par ordre decroissant");
		
		Scanner sc = new Scanner(System.in);
		
		x= sc.nextInt();
		
		while(x!= 1 && x!= 2 ){
			System.out.println("entrer 1 pour les ranger par ordre croissant/n entrer 2 pour ranger par ordre decroissant");
			
			x= sc.nextInt();
		}
		int chiffre=0;
		if(x==1){
			tr.croissant(tab);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrer le numéro à rechercher !");
			int nb=sc2.nextInt();
			chiffre= cr.recherche(tab,nb);
			}
		
		
		if(x==2){
			tr.decroissant(tab);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrer le numéro à rechercher !");
			int nb=sc2.nextInt();
			chiffre= dc.recherche(tab,nb);
			}
			
		if(chiffre==-1)
			System.out.println("pas trouvé");
		else
			System.out.println(chiffre);
		}

}
