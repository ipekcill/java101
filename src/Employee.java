public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int tax;
    int bonus ;
    int raise;
    int netSalary;


    Employee(String name, int salary, int workH, int hireY) {
        this.name = name;
        this.salary = salary;
        this.workHours = workH;
        this.hireYear = hireY;
        int tax=0;
        int bonus=0;
        int raise=0;
        int netSalary=0;
    }

    void tax() {
        if (isTax()) {
            tax = salary * 3 / 1000;
        }
        System.out.println(this.tax);
    }

    boolean isTax() {
        return  (salary >=1000);

    }

    void bonus() {
        if (workHours > 40) {
            for (int i = 1; i <= (workHours - 40); i++) {
                bonus += 30;
            }

        } else {
            bonus = 0;

        }
        System.out.println(this.bonus);
    }

    void raiseSalary() {
        if (2021 - hireYear < 10) {
            raise = salary * 5 / 100;
        } else if (9 < 2021 - hireYear && 2021 - hireYear < 20) {
            raise = salary * 10 / 100;
        } else if (2021 - hireYear > 19) {
            raise = salary * 15 / 100;
        }
        System.out.println(this.raise);
    }

    void netSalary() {
        netSalary=salary+bonus+raise-tax;
        System.out.println(this.netSalary);
    }
    void employeeInfo(){
        System.out.println("Employee name:" + this.name);
        System.out.println("Employee hire year:" + this.hireYear);
        System.out.println("Employee salary:" + this.salary);
        System.out.println("Employee net salary:" + this.netSalary);
    }
}
