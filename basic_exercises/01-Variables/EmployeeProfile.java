public class EmployeeProfile {
    public static void main(String[] args){
        String name = "Alfredo Adan Sofio Toledo";
        int age = 36;
        double salary = 9500.99;
        boolean  working = false;
        System.out.println("**** Employee Information ****");
        System.out.println("Employee Name: " + name);
        System.out.println("Age : " + age + " years old");
        System.out.println("Salary : $" + String.format("%.2f", salary));
        System.out.println("Active? : " + working);
    }
}
