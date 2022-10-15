// Points

package com.bridgelabz;
import java.util.Scanner;
public class Point {
    private int x,y;
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
    public void inputsPoint() {
        Scanner inputPointsObject = new Scanner(System.in);
        System.out.println("Enter Point 1 : ");
        x=inputPointsObject.nextInt();
        setX(inputPointsObject.nextInt());
        System.out.println("Enter Point 2 : ");
        y=inputPointsObject.nextInt();
    }
}
