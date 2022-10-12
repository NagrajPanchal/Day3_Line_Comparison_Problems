// UC-1 Line Comparison Problem length of line

package com.bridgelabz;

public class LineComparisonProblem
{
    void lengthOfLine()
    {
        System.out.println("Welcome To Line Comparison Computation Program");
        int x1=10,y1=20,x2=30,y2=40;
        double lengthOfLine =Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("Length of Line : " + lengthOfLine);
    }
    public static void main(String[] args)
    {
        LineComparisonProblem line = new LineComparisonProblem();
        line.lengthOfLine();
    }
}
