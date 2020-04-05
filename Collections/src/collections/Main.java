import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Artist> list = new ArrayList<>();
		
		Artist a1 = new Artist("Ed Sheeran","Singer","Male",sdf.parse("17-02-1991"));
		Artist a2 = new Artist("Steve Mac","Musician","Male",sdf.parse("15-01-1972"));
		Artist a3 = new Artist("Burruss","Singer","Female",sdf.parse("17-05-1976"));
		Artist a4 = new Artist("Beyonce","Singer","Male",sdf.parse("04-09-1981"));
		Artist a5 = new Artist("Zoey","Musician","Female",sdf.parse("10-10-1994"));
		Artist a6 = new Artist("Shawn Mendes","Singer","Male",sdf.parse("08-10-1998"));
		Artist a7 = new Artist("Frankie Dunne","Musician","Male",sdf.parse("10-09-1978"));
		Artist a8 = new Artist("Steve Mac","Musician","Male",sdf.parse("15-01-1972"));
		Artist a9 = new Artist("Beyonce","Singer","Female",sdf.parse("04-09-1981"));
		Artist a10 = new Artist("Frankie Dunne","Musician","Male",sdf.parse("10-09-1978"));
		
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		list.add(a7);
		list.add(a8);
		list.add(a9);
		list.add(a10);
		
		// apply your code here...

for(Artist x: list)		
{
System.out.println(x);
}
/*for(Artist x: new Sortbydob())		
{
System.out.println(x);
}
for(Artist x: Sortbygender())		
{
System.out.println(x);
}*/
Collections.sort(list, new Sortbydob()); 
        System.out.println("dob"); 
        for (int i=0; i<list.size(); i++) 
            System.out.println(list.get(i)); 
Collections.sort(list, new Sortbygender()); 
        System.out.println("gender"); 
        for (int i=0; i<list.size(); i++) 
            System.out.println(list.get(i)); 
}
}