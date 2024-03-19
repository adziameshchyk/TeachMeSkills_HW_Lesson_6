package com.tms.interfaces_and_abstract_classes.mandatory_tasks.task_0.runner;

import com.tms.interfaces_and_abstract_classes.mandatory_tasks.task_0.models.Circle;
import com.tms.interfaces_and_abstract_classes.mandatory_tasks.task_0.models.Rectangle;
import com.tms.interfaces_and_abstract_classes.mandatory_tasks.task_0.models.Shape;
import com.tms.interfaces_and_abstract_classes.mandatory_tasks.task_0.models.Triangle;

/**
 * Task:
 * <p>
 * Write the “Shapes” class hierarchy.
 * Shape -> Triangle -> Rectangle -> Circle.
 * Implement the function for calculating the area for each type of figure and calculating the perimeter.
 * Create an array of 5 shapes.
 * Display the sum of the perimeter of all the shapes in the array.
 */
public class Runner {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(3.2, 7.9);
        shapes[1] = new Triangle(4.12, 6.23, 9.12);
        shapes[2] = new Circle(4.3);
        shapes[3] = new Triangle(7.1, 3.3, 9.1);
        shapes[4] = new Circle(7.2);

        double perimeter = 0;
        for(Shape shape : shapes) {
            perimeter += shape.calculatePerimeter();
        }

        System.out.printf("The sum of the perimeters of all figures in the array: %.2f", perimeter);
    }

}
