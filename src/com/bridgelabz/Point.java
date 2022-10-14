// Points
package com.bridgelabz;

import java.util.Scanner;

public class Point
{
    Scanner inputPointsObject = new Scanner(System.in);
    private int x;
    private int y;
       public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void inputsPoint()
    {
        System.out.println("Enter Point 1 : ");
        setX(inputPointsObject.nextInt());
        System.out.println("Enter Point 2 : ");
        setY(inputPointsObject.nextInt());
    }
}
