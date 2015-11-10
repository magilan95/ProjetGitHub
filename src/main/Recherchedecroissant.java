
public class Recherchedecroissant {
	public int recherche(int tab[], int chiffre){
	       int moitie = tab.length/2;
	       int top =tab.length;
	       if(tab[top-1]==chiffre) //verifie si la dernière case du tableau
	    	   return top-1;
	       
	       while(tab[moitie]!=chiffre){
	    	   if(tab[moitie]<chiffre){
	    		   top=moitie;
	    		   moitie=moitie/2;
	    		   		if(moitie==0 && tab[moitie]!=chiffre)
	    		   			return -1;
	    	   }
	    	   else if(tab[moitie]>chiffre){
	    		   moitie=(moitie+(top))/2;
	    	   		if(moitie==(moitie+(top))/2)
	    	   			return -1;
	    	   }
	    	}
	       return moitie;
	}
}
