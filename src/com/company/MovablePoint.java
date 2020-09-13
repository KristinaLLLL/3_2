package com.company;

public class MovablePoint implements Movable{
    int x=0;
    int y=0;
    int xSpeed=0;
    int ySpeed=0;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
       this.x=x;
       this.y=y;
       this.xSpeed=xSpeed;
       this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        this.y+=y;
    }

    @Override
    public void moveDown() {
        this.y-=y;
    }

    @Override
    public void moveLeft() {
        this.x-=x;
    }

    @Override
    public void moveRight() {
        this.x+=x;
    }
}
