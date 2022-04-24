package com.company.observer.example2;

public class ManagerBonus extends Observer{

    public ManagerBonus(Salary salary) {
        this.salary=salary;
        this.salary.subscribe(this);

    }

    @Override
    public void update() {
        System.out.println("Manager Bonus is :"+salary.getVal()*3);
    }
}
