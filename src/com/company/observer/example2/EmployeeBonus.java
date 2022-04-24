package com.company.observer.example2;

public class EmployeeBonus extends Observer{


    public EmployeeBonus(Salary salary) {
        this.salary=salary;
        this.salary.subscribe(this);

    }

    @Override
    public void update() {

        System.out.println("Employee Bonus is : "+ salary.getVal()*2);
    }
}
