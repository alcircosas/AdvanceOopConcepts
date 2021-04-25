package softdes2;
public class Triangle extends GeometricFigure {
	
	private double area;
	
	public Triangle(int height, int width, String type)
	{
		super (height, width, type);
	}
	public double Area(int Height, int Width) {
		area = (double) (Height*Width)/2;
		return area;
	}

}

