// UC-1 Line Comparison Problem length of line

package com.bridgelabz;

import java.util.Objects;

public class LineComparisonProblem
{
    public static double lengthOfLine1;
    public static double lengthOfLine2;
    void lengthOfLine()
    {
        System.out.println("Line Comparison Program two lines are the equal");
        int x1=10,y1=20,x2=30,y2=40; // Local variables
        int x3=10,y3=20,x4=30,y4=40;
        lengthOfLine1 =Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)); // sqrt and Power function
        System.out.println("Length of First Line : " + lengthOfLine1);
        lengthOfLine2 =Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));
        System.out.println("Length of Second Line : "+ lengthOfLine2);
    }
    void equal()
    {
        if(Objects.equals(lengthOfLine1, lengthOfLine2))
        {
            System.out.println("Both lines are equals");
        }
        else
        {
            System.out.println("Lines are not equals");
        }
    }
    public static void main(String[] args)
    {
        LineComparisonProblem line = new LineComparisonProblem(); // Object created
        line.lengthOfLine(); // call method
        line.equal();
    }
}
