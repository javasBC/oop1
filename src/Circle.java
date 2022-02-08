import java.awt.*;

public class Circle {
    //DATA
    double radius;
    double area;
    String color;

    //Func
    Circle(double radius, String color) {
        this.radius = radius;
        this.area=Math.PI*Math.pow(radius,2);
        this.color = color;
    }

    String whatsMyColor(){
        return this.color;
    }


    // 0110010 => 0123456789abcdef

    @Override
    public String toString(){
        //94 => a;
        return "Circle [ radius => "+this.radius+" , "
                +"area => "+this.area+" , color =>"+this.color+"]";
    }

}
