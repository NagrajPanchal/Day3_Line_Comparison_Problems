// Length of the line


package com.bridgelabz;
import java.util.Objects;
public class Line
{
    Point point1 = new Point();
    Point point2 = new Point();
    void setlengthOfLine()
    {
        System.out.println("Enter line 1 of points ");
        point1.inputsPoint();
        System.out.println("Enter line 2 of points ");
        point2.inputsPoint();
    }
    public Double getLengthOfLine()
    {
       Double length = (Double) Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    return length;
    }
public static void equal(Line line1, Line line2)
{
    Double length1= line1.getLengthOfLine();
    Double length2= line2.getLengthOfLine();
    if(Objects.equals(length1, length2))
        System.out.println("Both lines are equals");
    else
        System.out.println("Lines are not equals");
}
   public static void compareTo(Line line1, Line line2)
    {
        Double length1= line1.getLengthOfLine();
        Double length2= line2.getLengthOfLine();
        if(Double.compare(length1,length2)==0) // Compare To function
            System.out.println("equals");
        else if (Double.compare(length1,length2)>0)
            System.out.println("line 1 Greater then line 2");
        else
            System.out.println("line 1 lesser then line 2");
    }
}
