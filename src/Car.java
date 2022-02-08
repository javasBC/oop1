import java.time.LocalDate;
import java.time.LocalDateTime;

public class Car {
    //DATA
    public String make;
    public String model;
    public int horsePower;
    private int cc;
    private int maxSpeed;
    private int numberOfSeats;

    //Func
    public Car(String make, String model, int horsePower, int cc, int numberOfSeats) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;
        this.cc = cc;
        this.numberOfSeats = numberOfSeats;
        this.maxSpeed=cc/(horsePower-numberOfSeats);
    }

    public int year(){
        return LocalDate.now().getYear() -this.horsePower/100;
    }

    @Override
    public String toString() {
        return "Car {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", cc=" + cc +
                ", maxSpeed=" + maxSpeed +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
