public interface Shape {
   void draw();
   double area();
}

public class Rectangle implements Shape {

   private double width;
   private double height;
     
   public Rectangle(double w, double h){
       this.width=w;
       this.height=h;
   }
   @Override
   public void draw() {
      System.out.println("Rectangle is Drawn");
   }
   @Override
   public double area() {
       return this.height*this.width;
   }
}

public class Square implements Shape {
   private double lenght;
   public Square(double l){
      this.lenght=l
   }	
   @Override
   public void draw() {
      System.out.println("Square is Drawn");
   }
   @Override
   public double area(){
      return this.lenght*this.lenght;
   }
}

public class Circle implements Shape {
   private double radius;
   public Circle(double r){
      this.radius=r;
   }

   @Override
   public void draw() {
      System.out.println("Circle is Drawn");
   }

   @Override
   public double area(){
   return Math.PI*this.radius*this.radius;
   }
   public double Radius(){
   return this.radius;
}
}


public class ShapeAndArea{
	public static void main(String[] args) {
	Shape s1=new Rectangle(5,6);
	s1.draw();
	System.out.println("Area="+s1.area());        }
	Shape s2=new Square(7);
	s2.draw();
	System.out.println("Area="+s2.area());
	Shape s3=new Circle(8);
	s3.draw();
	System.out.println("Area="+s3.area());
   }
}
