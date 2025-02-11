package com.example.project;

class Triangle
{
   // array of Point objects
   private final Point[] vertices = new Point[3];


   // Constructor: initializes the vertices array
   // to contain the three Point objects
   public Triangle(Point p1, Point p2, Point p3)
   {
       vertices[0] = p1;
       vertices[1] = p2;
       vertices[2] = p3;
   }


   public Point[] getVertices()
   {
       return vertices;
   }


   // Returns the perimeter of the Triangle
   // HINT: use the distanceTo method that you wrote in the Point class
   public double perimeter()
   {
       double sideOne = vertices[1].distanceTo(vertices[0]);
       double sideTwo = vertices[1].distanceTo(vertices[2]);
       double sideThree = vertices[2].distanceTo(vertices[0]);


       return sideOne + sideTwo + sideThree;
   }


   // Returns a String with the three vertices that make up the Triangle;
   // if the vertices are the points (6, 10), (11, 15), and (18, 7),
   // this method should return: "[(6, 10), (11, 15), (18, 7)]"
   public String triangleInfo()
   {
       String pointOne = vertices[0].pointInfo();
       String pointTwo = vertices[1].pointInfo();
       String pointThree = vertices[2].pointInfo();


       return "[" + pointOne + ", " + pointTwo + ", " + pointThree + "]";
   }
}
