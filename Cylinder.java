public class Cylinder extends Circle implements Volume{

    private double height;

    public Cylinder(double radius, double height,String name){
	super(radius,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public String toString(){
	return super.toString() + " with height " + height;
    }

    public double getVolume(){
	return super.getArea()*height;
    }
}
