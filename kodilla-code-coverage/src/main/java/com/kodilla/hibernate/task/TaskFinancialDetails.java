package com.kodilla.hibernate.task;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "TASKSFINANCIALDETAILS")
public class TaskFinancialDetails  {
    private int id;
    private double price;
    private boolean paid;

    public TaskFinancialDetails(){}

    public TaskFinancialDetails(int id, double price, boolean paid) {
        this.id = id;
        this.price = price;
        this.paid = paid;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "PRICE")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column(name = "ISPAID")
    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
