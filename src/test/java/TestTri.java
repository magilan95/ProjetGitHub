import org.junit.*;
ok
public class TestTri{
	
	@Test
	public void canToString(){
	
		int tab[]= {0,1,-5,2,4,11,6,3,21,13,45};
		
		tri k = new tri();
		
		System.out.println(k.toString(tab));
		
	}
	@Test
	public void canConsTriDecroissant(){
			
		int tab[]= {0,1,-5,2,4,11,6,3,21,13,45};
		
		tri k = new tri();
		
		System.out.println(k.toString(tab));
		tab = k.decroissant(tab);
		
		System.out.println(k.toString(tab));

	}	
	
	@Test
	public void canConsTriCroisssant(){
		
		int tab[]= {0,1,-5,2,4,11,6,3,21,13,45};
		
		tri k = new tri();
		
		System.out.println(k.toString(tab));
		tab = k.croissant(tab);
		
		System.out.println(k.toString(tab));
		
	}

}


	
