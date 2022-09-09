public class EmployeeService {
    public static void viewEmployees (Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void viewFullNameEmployees (Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
    public static void calculateSalarySum (Employee[] employees) {
        double sum = 0.0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + sum + " рублей.");
    }
    public static void findPersonWithMaxSalary (Employee[] employees) {
        double max = Double.MIN_VALUE;
        String name = null;
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getFullName();
            }
        }
        System.out.println(name + " имеет самую высокую зарплату в размере " + max + " рублей.");
    }
    public static void findPersonWithMinSalary (Employee[] employees) {
        double min = Double.MAX_VALUE;
        String name = null;
        for (Employee employee : employees) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getFullName();
            }
        }
        System.out.println(name + " имеет самую низкую зарплату в размере " + min + " рублей.");
    }
    public static void calculateSalaryArray (Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        sum = sum / employees.length;
        System.out.println("Среднее значение зарплат за месяц " + sum + " рублей.");
    }

    public static void indexSalary (Employee[] employees) {
        System.out.println("Теперь, после индексации зарплат:");
        double salary;
        for (Employee employee : employees) {
            salary = employee.getSalary();
            salary = salary * 1.5;
            employee.setSalary(salary);
            System.out.println(employee.getFullName() + " имеет зарплату в размере "
            + employee.getSalary() + " рублей");
        }
    }
    public static void findPersonInDeptWithMinSalary (Employee[] employees, int dept) {
        double min = Double.MAX_VALUE;
        String name = null;
        for (Employee employee : employees) {
            if (employee.getDept() == 1 && dept == 1 && employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getFullName();
            } else if (employee.getDept() == 2 && dept == 2 && employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getFullName();
            } else if (employee.getDept() == 3 && dept == 3 && employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getFullName();
            } else if (employee.getDept() == 4 && dept == 4 && employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getFullName();
            } else if (employee.getDept() == 5 && dept == 5 && employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getFullName();
            }
        }
        System.out.println(name + " получает зарплату меньше всех в выбраном вами отделе, в размере " + min + " рублей.");
    }

    public static void findPersonInDeptWithMaxSalary (Employee[] employees, int dept) {
        double max = Double.MIN_VALUE;
        String name = null;
        for (Employee employee : employees) {
            if (employee.getDept() == 1 && dept == 1 && employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getFullName();
            } else if (employee.getDept() == 2 && dept == 2 && employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getFullName();
            } else if (employee.getDept() == 3 && dept == 3 && employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getFullName();
            } else if (employee.getDept() == 4 && dept == 4 && employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getFullName();
            } else if (employee.getDept() == 5 && dept == 5 && employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getFullName();
            }
        }
        System.out.println(name + " получает зарплату больше всех в выбраном вами отделе, в размере " + max + " рублей.");
    }
    public static void calculateSalarySumInDept (Employee[] employees, int dept) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee.getDept() == 1 && dept == 1) {
                sum = sum + employee.getSalary();
            } else if (employee.getDept() == 2 && dept == 2) {
                sum = sum + employee.getSalary();
            } else if (employee.getDept() == 3 && dept == 3) {
                sum = sum + employee.getSalary();
            } else if (employee.getDept() == 4 && dept == 4) {
                sum = sum + employee.getSalary();
            } else if (employee.getDept() == 5 && dept == 5) {
                sum = sum + employee.getSalary();
            }
        }
        System.out.println("Сумма зарплат по отделу: " + sum + " рублей.");
    }
    public static void calculateSalarySumArrayInDept (Employee[] employees, int dept) {
        double sum = 0;
        int countDept = 0;
        for (Employee employee : employees) {
            if (employee.getDept() == 1 && dept == 1) {
                countDept++;
                sum = sum + employee.getSalary();
            } else if (employee.getDept() == 2 && dept == 2) {
                countDept++;
                sum = sum + employee.getSalary();
            } else if (employee.getDept() == 3 && dept == 3) {
                countDept++;
                sum = sum + employee.getSalary();
            } else if (employee.getDept() == 4 && dept == 4) {
                countDept++;
                sum = sum + employee.getSalary();
            } else if (employee.getDept() == 5 && dept == 5) {
                countDept++;
                sum = sum + employee.getSalary();
            }
        }
        sum = sum / countDept;
        System.out.println("Средняя зарплата по выбранному отделу: " + sum + " рублей.");
    }
    public static void indexSalaryInDept (Employee[] employees, int dept) {
        System.out.println("Теперь, после индексации зарплат " + dept + " отдела");
        double salary = 0;
        for (Employee employee : employees) {
            if (employee.getDept() == 1 && dept == 1) {
                salary = employee.getSalary();
                salary = salary * 2;
                employee.setSalary(salary);
                System.out.println(employee.getFullName() + " имеет зарплату в размере "
                        + employee.getSalary() + " рублей");
            } else if (employee.getDept() == 2 && dept == 2) {
                salary = employee.getSalary();
                salary = salary * 2;
                employee.setSalary(salary);
                System.out.println(employee.getFullName() + " имеет зарплату в размере "
                        + employee.getSalary() + " рублей");
            } else if (employee.getDept() == 3 && dept == 3) {
                salary = employee.getSalary();
                salary = salary * 2;
                employee.setSalary(salary);
                System.out.println(employee.getFullName() + " имеет зарплату в размере "
                        + employee.getSalary() + " рублей");
            } else if (employee.getDept() == 4 && dept == 4) {
                salary = employee.getSalary();
                salary = salary * 2;
                employee.setSalary(salary);
                System.out.println(employee.getFullName() + " имеет зарплату в размере "
                        + employee.getSalary() + " рублей");
            } else if (employee.getDept() == 5 && dept == 5) {
                salary = employee.getSalary();
                salary = salary * 2;
                employee.setSalary(salary);
                System.out.println(employee.getFullName() + " имеет зарплату в размере "
                        + employee.getSalary() + " рублей");
            }
        }
    }
    public static void viewEmployeesInDept (Employee[] employees, int dept) {
        System.out.println("В " + dept + " отделе работают:");
        for (Employee employee : employees) {
            if (employee.getDept() == 1 && dept == 1) {
                System.out.println(employee.getFullName() + "(id:" + employee.getId() + ") и имеет зарплату "
                        + employee.getSalary() + " рублей");
            } else if (employee.getDept() == 2 && dept == 2) {
                System.out.println(employee.getFullName() + "(id:" + employee.getId() + ") и имеет зарплату "
                        + employee.getSalary() + " рублей");
            } else if (employee.getDept() == 3 && dept == 3) {
                System.out.println(employee.getFullName() + "(id:" + employee.getId() + ") и имеет зарплату "
                        + employee.getSalary() + " рублей");
            } else if (employee.getDept() == 4 && dept == 4) {
                System.out.println(employee.getFullName() + "(id:" + employee.getId() + ") и имеет зарплату "
                        + employee.getSalary() + " рублей");
            } else if (employee.getDept() == 5 && dept == 5) {
                System.out.println(employee.getFullName() + "(id:" + employee.getId() + ") и имеет зарплату "
                        + employee.getSalary() + " рублей");
            }
        }
    }
    public static void compareLessSalary (Employee[] employees, int salary2) {
        System.out.println("Следующие работники получают зарплату меньше " + salary2 + " рублей: ");
        for (Employee employee : employees) {
            if (employee.getSalary() < salary2) {
                System.out.println(employee.getFullName() + "(id:" + employee.getId() + ") с зарплатой "
                        + employee.getSalary() + " рублей.");
            }
        }
    }
    public static void compareMoreSalary (Employee[] employees, int salary2) {
        System.out.println("Следующие работники получают зарплату больше " + salary2 + " рублей: ");
        for (Employee employee : employees) {
            if (employee.getSalary() > salary2) {
                System.out.println(employee.getFullName() + "(id:" + employee.getId() + ") с зарплатой "
                        + employee.getSalary() + " рублей.");
            }
        }
    }

}
