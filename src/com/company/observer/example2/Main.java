package com.company.observer.example2;

public class Main {
    public static void main(String[] args) {


        Salary salary=new Salary(0);
        ManagerBonus managerBonus =new ManagerBonus(salary);
        EmployeeBonus employeeBonus =new EmployeeBonus(salary);

        System.out.println("_______________________________________________________________");

        salary.setVal(3000);

        System.out.println("_______________________________________________________________");

        salary.setVal(10000);



    }




}
