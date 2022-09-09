import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Employee[] employee10 = new Employee[10];
        employee10[0] = new Employee("Филиппова Ксения Владиславовна", 2, 39279);
        employee10[1] = new Employee("Абакова Наталья Николаевна", 3, 53678);
        employee10[2] = new Employee("Аксенов Андрей Александрович", 1, 21999);
        employee10[3] = new Employee("Крючков Сергей Сергеевич", 4, 42000);
        employee10[4] = new Employee("Прокофьева Алена Валерьевна", 4, 40230);
        employee10[5] = new Employee("Эрфурт Владимир Федорович", 2, 37898);
        employee10[6] = new Employee("Колесникова Надежда Тимофеевна", 1, 23120);
        employee10[7] = new Employee("Александрина Зоя Николаевна", 5, 95989);
        employee10[8] = new Employee("Ларионова Ольга Сергеевна", 1, 22100);
        employee10[9] = new Employee("Кузив Эльвира Васильевна", 3, 51232);

        EmployeeService.viewEmployees(employee10);
        System.out.println();
        EmployeeService.calculateSalarySum(employee10);
        System.out.println();
        EmployeeService.findPersonWithMaxSalary(employee10);
        System.out.println();
        EmployeeService.findPersonWithMinSalary(employee10);
        System.out.println();
        EmployeeService.calculateSalaryArray(employee10);
        System.out.println();
        EmployeeService.viewFullNameEmployees(employee10);
        System.out.println();
        EmployeeService.indexSalary(employee10);
        System.out.println();
        EmployeeService.findPersonInDeptWithMinSalary(employee10, 3);
        System.out.println();
        EmployeeService.findPersonInDeptWithMaxSalary(employee10, 1);
        System.out.println();
        EmployeeService.calculateSalarySumInDept(employee10, 2);
        System.out.println();
        EmployeeService.calculateSalarySumArrayInDept(employee10, 3);
        System.out.println();
        EmployeeService.indexSalaryInDept(employee10, 3);
        System.out.println();
        EmployeeService.viewEmployeesInDept(employee10, 3);
        System.out.println();
        EmployeeService.compareLessSalary(employee10,100_000);
        System.out.println();
        EmployeeService.compareMoreSalary(employee10,100_000);




    }
}