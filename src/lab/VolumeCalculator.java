package lab;

	public class VolumeCalculator {
	    public double calculateVolume(double radius, double height) {
	        double volume = 3.14 * radius * radius * height;
	        return volume;
	    }
	    
	    public double calculateVolume(int length, int breadth, int height) {
	        double volume = length * breadth * height;
	        return volume;
	    }
	
	public static void main(String[] args) {
	    VolumeCalculator test = new VolumeCalculator();
	    
	   
	    double cylinderVolume = test.calculateVolume(3.0, 5.0);
	    System.out.println("Volume of Cylinder is : " + cylinderVolume);
	    
	    
	    double cuboidVolume = test.calculateVolume(4, 5, 6);
	    System.out.println("Volume of Cuboid is : " + cuboidVolume);
	}
	}

