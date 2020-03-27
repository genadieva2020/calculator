package calculator;

public class Pravoagalnik extends Shape{
	
	public Pravoagalnik(int width, int height){
		super(width, height);
	}

	public int CalculateSurface(){
		return getWidth()*getHeight();
		
	}
	
	

}
