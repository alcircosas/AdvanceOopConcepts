package softdes2;

public abstract class GeometricFigure {

	public int Height, Width;
	public String FigureType;
	
	public GeometricFigure (int height, int width, String type)
	{
		this.Height=height;
		this.Width=width;
		this.FigureType=type;
	}
	
	public int getHeight()
	{
		return Height;
	}
	
	public int getWidth()
	{
		return Width;
	}
	
	public String getType()
	{
		return FigureType;
	}
	
	public abstract double Area(int figureHeight, int figureWidth);
	
}
