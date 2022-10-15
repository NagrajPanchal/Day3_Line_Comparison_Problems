// UC-4 Line Comparison Problem equal and Compare

package com.bridgelabz;
public class LineComparisonProblem
{
    public static void main(String[] args)
    {
        System.out.println("WelCome to Line Comparison Problem");
        Line line1 = new Line();
        System.out.println("Length of the line 1 : ");
        line1.setlengthOfLine();
        Line line2 = new Line();
        System.out.println("Length of the line 2 : ");
        line2.setlengthOfLine();
        System.out.println("Length of the line 1 : " +line1.getLengthOfLine());
        System.out.println("Length of the line 2 : " +line2.getLengthOfLine());
        Line.compareByEquals(line1,line2); //equals
        Line.compareByCompareTo(line1,line2); //CompareTo
    }
}
