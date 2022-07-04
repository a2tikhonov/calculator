package ru.atikhonov.course2.calculator.exceptions;

public class DivideByNullExcepction extends IllegalArgumentException{
    public DivideByNullExcepction() {
        super();
    }

    public DivideByNullExcepction(String s) {
        super(s);
    }

    public DivideByNullExcepction(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideByNullExcepction(Throwable cause) {
        super(cause);
    }
}
