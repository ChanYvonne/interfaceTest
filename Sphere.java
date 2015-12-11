public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public String toString(){
	return super.toString();
    }

    public double getVolume(){
	return (4/3)*super.getArea()*super.getRadius();
    }
}
