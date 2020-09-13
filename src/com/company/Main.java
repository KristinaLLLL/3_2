package com.company;

public class Main {

    public static void main(String[] args) {
	MovablePoint p=new MovablePoint(2, 4, 1, 2);
	System.out.println(p);
	MovableCircle c=new MovableCircle(2,2,2,2, 2);
	System.out.println(c);
	MovableRectangle r=new MovableRectangle(5, 6, 1, 2, 4, 5);
	System.out.println(r);
    }
}
