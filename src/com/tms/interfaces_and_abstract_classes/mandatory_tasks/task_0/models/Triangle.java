package com.tms.interfaces_and_abstract_classes.mandatory_tasks.task_0.models;

public class Triangle extends Shape {

    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("The sides of the triangle are incorrectly specified. " +
                    "In a triangle, the sum of any two sides must be greater than the third.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double perimeter = calculatePerimeter();
        return Math.sqrt(perimeter) * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC);
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
