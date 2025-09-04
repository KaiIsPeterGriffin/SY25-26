public class Rectangle
{
    int length;
    int width;
    
    public Rectangle(int _length, int _width)
    {
        this.length = _length;
        this.width = _width;
    }
    
    public int Area()
    {
        return length * width;
    }
    
    public int Perimeter()
    {
        return 2 * (length + width);
    }
    
    public String toString()
    {
        String retVal = "Reactangle\n\t" + "Length: " + length + "\n\tWidth: " + width + 
                        "\n\tArea: " + Area() + "\n\tPerimeter" + Perimeter();
        return retVal;
    }
}
