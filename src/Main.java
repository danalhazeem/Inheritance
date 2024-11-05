
import company.*;


public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);

        SalesPerson lisa = new SalesPerson("Lisa", "Sales", 60000, 120);
        System.out.println(lisa);

        Engineer danah = new Engineer("danah", "Engineering", 80000);
        danah.addSkill("Java");
        danah.addSkill("Python");
        System.out.println(danah);


        Director DaveA = new Director("dave a","dirc",40000,300);
        System.out.println(DaveA);
        DaveA.allocateBudget(100);
    }
}