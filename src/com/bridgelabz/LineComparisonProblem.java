// UC-4 Line Comparison Problem equal and Compare

package com.bridgelabz;
public class LineComparisonProblem
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to line Comparison Computation Problem");
        Line line1 = new Line();
        System.out.println("Co-ordinates of length 1");
        line1.setlengthOfLine();
        Line line2 = new Line();
        System.out.println("Co-ordinates of length 2");
        line2.setlengthOfLine();
        System.out.println("Length of line 1 : "+line1.getLengthOfLine());
        System.out.println("Length of line 1 : "+line2.getLengthOfLine());
        Line.equal(line1,line2); //equals
        Line.compareTo(line1,line2);
    }
}
