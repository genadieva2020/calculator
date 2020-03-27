package calculator;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Pravoagalnik p1=new Pravoagalnik(5,10);
		Pravoagalnik t1=new Pravoagalnik(7,8);
		Pravoagalnik k1=new Pravoagalnik(9,9);
		
		System.out.print(p1.CalculateSurface());
		
		ArrayList<Integer>list=new ArrayList<>();
		list.add(p1.CalculateSurface());
		list.add(t1.CalculateSurface());
		list.add(k1.CalculateSurface());
		
		int sum=0;
		for(int i=0;i<list.size();i++){
			sum=sum+list.get(i);
		}
		
		System.out.print("SUMATA E:"+sum);

	}

}
