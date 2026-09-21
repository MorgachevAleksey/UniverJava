package com.fintech.practice4.task1;

//У Throwable (класс ошибок Java) и его наследников есть конструктор с сообщением которое будет в тексте ошибки
public class IllegalTriangleException extends Exception{
     public IllegalTriangleException(String message){
        super(message);
    }
}
