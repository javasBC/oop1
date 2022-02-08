import java.time.LocalTime;

public class Angle {
    //DATA
     private double degree;

    //Func

    Angle(double degree){
        this.degree=degree;
    }

    private double cos(){
        return Math.cos(this.degree);
    }
    public double sin(){
        return Math.sin(this.degree);
    }

    @Override
    public String toString(){
        return "Angle is : "+degree+"the cos and sin of" +
                " this degree is : "+cos()+"    "+sin() +"tan is :"+
                Math.tan(this.degree)+"\n"+"" +
                "the current time is : "+ LocalTime.now();
    }

}
