package com.example.project;

class Point
{
   private final int x;
   private final int y;


   public Point(int x, int y)
   {
       this.x = x;
       this.y = y;
   }


   public int getX()
   {
       return x;
   }


   public int getY()
   {
       return y;
   }


   // Returns distance between this Point object and another Point object
   public double distanceTo(Point other)
   {
       double distance = Math.pow(other.getX() - this.getX(), 2) + Math.pow(other.getY() - this.getY(), 2);
       return Math.sqrt(distance);
   }


   // Returns a string in the format: (x, y)
   public String pointInfo()
   {
       return "(" + x + ", " + y + ")";
   }
}
