package com.example.demo;

public class PatternFactory {
    public A getPlace(Place type) throws IllegalArgumentException {
        A toReturn = null;
        switch (type) {
            case R:
                toReturn = new Navat();
            case T:
                toReturn = new Ticketon();
            case C:
                toReturn = new Broadvey();
            default:
                throw new IllegalArgumentException("Wrong place type:" + type);
        }
    }
}
