public class Employee {
    private String id;
    private String name;
    private int salary;


    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary() {
        return salary*12;
    }

    public  int raisedSalary(int percent){
int salaryAfterCalc =+ this.salary*percent/100;
int newSalary = this.salary+salaryAfterCalc;
return this.salary=newSalary;
    }


    public String toSting(){
        return "the id :"+this.id+" the name :"+this.name+" the salary : "+this.salary;
    }

}
