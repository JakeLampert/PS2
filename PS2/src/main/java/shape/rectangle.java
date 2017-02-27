package shape;

public class rectangle {

	
	
	private int Width;
	private int Length;
	public rectangle(int width, int length) {
		super();
		Width = width;
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	
	public double area()
	{
		return getWidth() * getLength();
		
	}
	public double perimeter()
	{
		return(2* getWidth()) + (2 * getLength());
	}
}
