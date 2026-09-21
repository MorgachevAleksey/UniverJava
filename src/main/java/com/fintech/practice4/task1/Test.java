package com.fintech.practice4.task1;

public class Test {
    public static void main(String[] args) {
        Triangle triangle1 = createTriangle(3, 4, 55);

        System.out.println(triangle1);
    }

    public static Triangle createTriangle(double side1, double side2, double side3){
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Треугольник создан");
            return triangle;
        }
        catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Создан треугольник по умолчанию");
        return new Triangle();
    }
}
