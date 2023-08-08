package com.AbstractInterface;

	
	interface Baking{
		void bake(); 
		
	}
	class Strawberry implements Baking{
     
		int price;
		
		public Strawberry(int price) {
    	 this.price=price;
    	 System.out.println();
     }
	
public Strawberry() {
			// TODO Auto-generated constructor stub
	System.out.println(price);
		}
public static void main(String[]args) {
	Strawberry s=new Strawberry();
	s.bake();
	s.price(500);
}
	private void price(int i) {
		System.out.println("price of cake is :"+price);
	// TODO Auto-generated method stub
	
}

	@Override
	public void bake() {
		System.out.println("Strawberry cake");
		// TODO Auto-generated method stub
		
	}

	}
	
