
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int tab[]= {0,1,-5,2,4,11,6,3,21,13,45};
		
		tri k = new tri();
		
		System.out.println(k.toString(tab));
		
		tab = k.decroissant(tab);
		
		System.out.println(k.toString(tab));
				
		
		

	}

}
