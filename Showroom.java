package pro;
import java.util.ArrayList;
import java.util.HashMap;

public class Showroom {
	public static void main(String[] args) {
		
		Cars c1=new Cars("AUDI","HYD","Q01","BLACK");
		Cars c2=new Cars("AUDI","HYD","Q02","BLUE");
		Cars c3=new Cars("AUDI","HYD","Q03","BROWN");
		Cars c4=new Cars("MARUTI","BNG","Q03","BROWN");
		Cars c5=new Cars("MARUTI","BNG","Q03","BROWN");
		Cars c6=new Cars("MARUTI","BNG","Q03","BROWN");
		
		
		
		ArrayList<Cars> sname=new ArrayList<>();

		sname.add(c1);
		sname.add(c2);
		sname.add(c3);
		
		
		ArrayList<Cars> sname2=new ArrayList<>();

		sname2.add(c4);
		sname2.add(c5);
		sname2.add(c6);
		
		HashMap<String, ArrayList<Cars>> car=new HashMap();


		car.put("AUDI", sname);
		car.put("MARUTI", sname2);


		ArrayList<Cars> getSname=car.get("AUDI");


		for(Cars s:getSname)
		{
		System.out.println(s);
		}

		ArrayList<Cars> getSname2=car.get("MARUTI");
		for(Cars s1:getSname2)
		{
		System.out.println(s1);
		}

		}
		}

		
		
		
		
		
		
		
		
		
		
		