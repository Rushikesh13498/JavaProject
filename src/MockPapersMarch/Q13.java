package MockPapersMarch;

public class Q13 {
	public static void reverseEmpArray(Emp[] arr) {
	    int start = 0;
	    int end = arr.length - 1;

	    while (start < end) {
	        String temp = arr[start].name;
	        arr[start].name = arr[end].name;
	        arr[end].name = temp;

	        start++;
	        end--;
	    }
	}
	class Emp {
	    int id;
	    String name;
	    int sal;

	    public Emp(int id, String name, int sal) {
	        this.id = id;
	        this.name = name;
	        this.sal = sal;
	    }
	}
	public static void main(String[] args) {
	    Emp[] empArray = {
	        new Emp(1, "E1", 100),
	        new Emp(2, "E2", 200),
	        new Emp(3, "E3", 300)
	    };

	    reverseEmpArray(empArray);

	    
	    for (Emp emp : empArray) {
	        System.out.println("{" + emp.id + ", " + emp.name + ", " + emp.sal + "}");
	    }
	}

}



//O/P----->
//{1, E3, 100}
//{2, E2, 200}
//{3, E1, 300}

		
