import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class employee {
    String name;
    int age;
    Double salary;

    employee(String val1, int val2, Double val3) {
        this.name = val1;
        this.age = val2;
        this.salary = val3;

    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }

}

public class collec_n_sort {

    private static Scanner scanner = new Scanner(System.in);

    void add_employee() {
        scanner.nextLine();
        System.out.print("Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Employee age: ");
        int age = scanner.nextInt();
        System.out.print("Employee salary: ");
        Double salary = scanner.nextDouble();
        scanner.nextLine();
        // add employee
        employee_list.add(new employee(name, age, salary));

        // for (employee s : employee_list) {
        // System.out.println(s);
        // }

    }

    ArrayList<employee> employee_list = new ArrayList<>();

    public static void main(String[] args) {

        collec_n_sort cns = new collec_n_sort();

        while (true) {
            System.out.println("\n-----choose action-----");
            System.out.println("1. Add Employee");
            System.out.println("2. exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    cns.add_employee();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    return;

            }

            // Step 4: Sort by salary (descending)
            Collections.sort(cns.employee_list, new Comparator<employee>() {
                @Override
                public int compare(employee e1, employee e2) {
                    return Double.compare(e2.salary, e1.salary); // Descending
                }
            });

            System.out.println("\nSorted by Salary (Descending):----------");
            for (employee e : cns.employee_list) {
                System.out.println(e);
            }

            // Step 5: Sort by name (ascending)
            Collections.sort(cns.employee_list, new Comparator<employee>() {
                @Override
                public int compare(employee e1, employee e2) {
                    return e1.name.compareTo(e2.name); // Ascending
                }
            });

            System.out.println("\nSorted by Name (Ascending):-----------");
            for (employee e : cns.employee_list) {
                System.out.println(e);
            }

        }
    }

}