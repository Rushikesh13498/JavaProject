package com.encapsulation;

class Address{
		int pincode;
		String cityname;
		String state;
		
		public Address(int pincode,String cityname,String state) {
			this.pincode=pincode;
			this.cityname=cityname;
			this.state=state;
			
		}
		public void showAdd() {
			System.out.println(pincode+" "+cityname+" "+state);
		}
	}
	public class Person {
		int id;
		String name;
		Address Add;
		
		public Person(int id,String name,Address Add) {
			this.id=id;
			this.name=name;
			this.Add=Add;
		}	
			public void showPerson()
			{
			System.out.println(id+" "+name+" ");	
			Add.showAdd();
			
		}
		
	public static void main(String[] args) {
	    
		Person p1=new Person(23,"Don",new Address(411038,"Pune","Maharashtra"));
		
		System.out.println(p1);
		p1.showPerson();
		
		
		
	}

}
