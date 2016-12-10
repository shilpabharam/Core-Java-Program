class Shape{
	
	public void area(float r){
	  double circle =3.14*r*r;
	   System.out.println(circle);
	}
	
	public int area(int l,int r){
	   return l*r;
	   //System.out.println(rectange);
	}
	
	public static void main(String args[]){
		Shape  s = new Shape();
		
		s.area(13f);
		int result = s.area(12,12);		
		System.out.println(result);
	}

}




