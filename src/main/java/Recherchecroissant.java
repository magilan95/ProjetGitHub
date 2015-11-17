
public class Recherchecroissant {
	public int recherche(int tab[], int chiffre){
	       int moitie = tab.length/2;
	       int top =tab.length;
	       if(tab[top-1]==chiffre) //
	    	   return top-1;
	       
	       while(tab[moitie]!=chiffre){
	    	   if(tab[moitie]>chiffre){
	    		   top=moitie;
	    		   moitie=moitie/2;
	    	   }
	    	   if(tab[moitie]<chiffre){
	    		   moitie=(moitie+(top))/2;
	    	   		if(moitie==(moitie+(top))/2)
	    	   			return (-1);
	    	   }
	    	}
	       return(moitie);
	}
}
