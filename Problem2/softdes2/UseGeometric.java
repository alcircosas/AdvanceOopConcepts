package softdes2;
public class UseGeometric {

	public static void main (String[] args)
	{
		double area;
		int Height,Width;
		
		String figureType;
		GeometricFigure[] figure = new GeometricFigure[2];
		Square figure0 = new Square (3,3, "Square");
		Triangle figure1 = new Triangle (7,13, "Triangle");
		
		figure [0] = figure0;
		figure [1] = figure1;
		
		for (int i = 0; i<figure.length; i++)
		{
			Height = figure[i].getHeight();
			Width = figure[i].getWidth();
			figureType = figure[i].getType();
			area = figure[i].Area(Height,Width);
			System.out.println("The Figure Type is " + figureType + ","+" Height:" + 
								Height + " Width:" + Width + " Area:" + 
								area + "\n");
		}
	}
}