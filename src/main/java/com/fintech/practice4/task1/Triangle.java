package com.fintech.practice4.task1;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 >= (side2 + side3) || side2 >= (side1 + side3) || side3 >= (side2 + side1)) {
            throw new IllegalTriangleException("Нарушено условие: сумма двух любых сторон треугольника больше третьей стороны");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Можно без переменных - сразу в return все запихнуть
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
    public double getPerimeter(){
        double s = (side1 + side2 + side3);
        return s;
    }
    @Override
    public String toString(){
        return "Треугольник: " + "\n" +
                "сторона1 = " + side1 + "\n" +
                "сторона2 = " + side2 + "\n" +
                "сторона3 = " + side3;
    }
}
