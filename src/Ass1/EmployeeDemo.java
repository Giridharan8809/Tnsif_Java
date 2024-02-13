package Ass1;

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public double calculateBonus() {
    	return 0.05 * salary;
    }
 
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
      
        return 0.1 * getSalary() * teamSize;
    }

    public void reporting() {
        System.out.println("Manager " + getName() + " is reporting with a team size of " + teamSize + ".");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

  
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

   
    @Override
    public double calculateBonus() {
        return 0.08 * getSalary();
    }

   
    public void code() {
        System.out.println("Developer " + getName() + " is coding in " + programmingLanguage + ".");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
       
        Manager manager = new Manager("John Manager", 101, 60000, 8);
        Developer developer = new Developer("Alice Developer", 201, 50000, "Java");

        System.out.println("Manager Bonus: $" + manager.calculateBonus());
        manager.reporting();

        System.out.println("\nDeveloper Bonus: $" + developer.calculateBonus());
        developer.code();
    }
}
