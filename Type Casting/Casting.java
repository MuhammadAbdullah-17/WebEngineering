public class Casting {
    /**
     * Employee
     */
   static class Employee {

        int salary;

        void SetSalary(int salary) {
            this.salary = salary;
        }

        int getSalary() {
            return salary;
        }
        void showData()
        {
            System.out.println("Hello I am Employee");
        }
    }

    /**
     * Teacher
     */
    static class Teacher extends Employee {
        String rank;
        void showData()
        {
            System.out.println("Hello I am Teacher.");
        }
    }

    public static void main(String[] args) {
        Employee e = new Teacher();
        Teacher t;
        t = (Teacher) e;
        t.showData();
    }
}
