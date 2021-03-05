public class TestSimpleCircle {
       public static void main(String[] args) {
           SimpleCircle circle1 = new SimpleCircle();
           System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());

           SimpleCircle circle2 = new SimpleCircle(25);
           System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());

           SimpleCircle circle3 = new SimpleCircle(120);
           System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
           circle3.setRadius(300); //set radius
           System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
       }
    
}

class SimpleCircle{
    double radius = 1;
    SimpleCircle(){}

    SimpleCircle(double newRadius){
        radius = newRadius;
    }
    
    double getArea(){
        return radius*radius*Math.PI;
    }

    double getPerimeter(){
        return 2*radius*Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}

