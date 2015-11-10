
public class tri {

			
	
	
public int[] croissant(int tab[]){
	int n = tab.length ;
	for (int j=0;j<n;j++) {
		for (int i=1;i<n;i++) {
			if (tab[i]<tab[i-1]) { 
				int u = 0;
				u = tab[i];
				tab[i] = tab[i-1];
				tab[i-1] = u;
			}
		}
	}
	return tab;
	
	
}

public int[] decroissant(int tab[]){
	int n = tab.length ;
	for (int j=0;j<n;j++) {
		for (int i=1;i<n;i++) {
			if (tab[i]>tab[i-1]) { 
				int u = 0;
				u = tab[i];
				tab[i] = tab[i-1];
				tab[i-1] = u;
			}
		}
	}
	return tab;
	
	
}

public String toString(int tab[]){
	
	int n = tab.length;
	String d = new String();
	for (int i=0;i<n;i++) {
		d = d + tab[i] + " ";
	}
	
	return d;
	
}


}
