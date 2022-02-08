public class Employee {
    //DATA
    String name;
    int baseSalary=16000;
    int extraHours;
    int hourRate;
    int id;


    //func
    //cons
    Employee() {


    }

    Employee(String name, int baseSalary, int hourRate, int extraHours, int id) {

        this.name = name;
        //this.baseSalary = baseSalary;
        this.extraHours = extraHours;
        this.hourRate = hourRate;
        this.id = id;
    }

    int calcSalary() {
        return baseSalary + (extraHours * hourRate);
    }

    void updateHourRate(int newRate) {
        hourRate = newRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.name + '\'' +
                ", baseSalary=" + this.baseSalary +
                ", extraHours=" + this.extraHours +
                ", hourRate=" + this.hourRate +
                ", id=" + this.id +
                '}';
    }
}
