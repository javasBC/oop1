import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int x = 4;
        //Scanner scanner = new Scanner(System.in);
        //Cup hodiCup,samicup;
        //hodiCup=new Cup();
        //samicup=new Cup();
        //Cup yoavCup= new Cup();
//
//
        //yoavCup.color="blue";
        //System.out.println(hodiCup.color);
        //System.out.println(hodiCup.is_Empty);
        //System.out.println();
        //System.out.println(yoavCup.color);
        //System.out.println(yoavCup.is_Empty);
//
        //hodiCup.spell();
        //System.out.println("after the obj method");
        //System.out.println(yoavCup.is_Empty);
        //yoavCup.drink();
        //System.out.println("is Empty? "+yoavCup.is_Empty);
        //System.out.println("Hot? "+hodiCup.isCupHot((byte)80));
//
        //System.out.println(hodiCup.temp);
        ////System.out.println(yoavCup.temp);
        //System.out.println(yoavCup.temp);
//
        //hodiCup.color=yoavCup.color;
        ////hodiCup.color==yoavCup.color;//TRUE
        //hodiCup.temp=yoavCup.temp;
//
        ////yoavCup==hodiCup; /// FAlSE
        //yoavCup=hodiCup;
        ////yoavCup==hodiCup; /// TRUE
//
        //System.out.println();
        //System.out.println();
        //System.out.println(yoavCup.temp);
//
        //Employee emp1=new Employee();
        //emp1.id=222;
        //emp1.extraHours=45;
        //emp1.hourRate=90;
        //emp1.name="naama";
        //emp1.baseSalary=9_000;
//
        //String x;
        //System.out.println("5"+x);
        //int[] arr = {55,44,10,9};
        //Employees
        //Employee emp2=new Employee("yones",7500,130,49,214);
        //System.out.println(emp2);
        //Employee emp3=new Employee("alexsey",32450,44,1,9197);
        //Employee emp4=new Employee("hadar",3200,1050,3,9187);
        //Employee emp5=new Employee();
        ////System.out.println("emp1 =>"+emp1.calcSalary());
        //System.out.println("emp2 =>"+emp2.calcSalary());
        //System.out.println("emp3 =>"+emp3.calcSalary());
        //System.out.println("emp4 =>"+emp4.calcSalary());
        //System.out.println("emp5 =>"+emp5.calcSalary());

        //Circles
        //Circle c1= new Circle(7.8,"grey");
        //Circle c2= new Circle(15.8,"white");
//
        //System.out.println(c1.toString()); //TOString()
        //System.out.println("hi "+c2);
//
        //System.out.println(c1.whatsMyColor());
        //System.out.println(c2.whatsMyColor());
        //Angle a1=new Angle(144.2);
        //System.out.println(a1.degree=19);
       //a1.sin();
       //System.out.println(a1);
       //Employee dima = new Employee("dima",8000,199,160,921148);
        //final int PI=13;
        //PI =13;
        //double phi=0.1614;
        ////PI=55;
        //System.out.println(PI);
        ///////////////////////////////////////////////////////////////////////////////
        // formated string
        //int x=13;
        //double y =4.0123456789;
        //boolean b1=true;
        //String name = "dor";
//
        //String line="hi my name is : "+name+" iam "+x+" years old "+y+" just a number";
        //String formatedString=String.format(
        //        "hi my name is  %s iam  %d years old %.2f  just a number ",name,x,7.0);
//
        //System.out.println(line);
        //System.out.println(formatedString);
////////////////////////////////////////////////formatting datetime
        //yyyy-MM-dd	"1988-09-29"
        //MM/dd/yyyy	"29/09/1988"
        //dd-MMM-yyyy	"29-Sep-1988"
        //E, MMM dd yyyy	"Thu, Sep 29 1988"
        //LocalDateTime now= LocalDateTime.now();
        //System.out.println(LocalDateTime.now());
//
        //DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM  HH:mm");
        //System.out.println(now.format(formatter));
//

        Car dimaCar=new Car("bmw","z4",
                111,2500,3);

        System.out.println(dimaCar);
        System.out.println(dimaCar.year());
    }
}
