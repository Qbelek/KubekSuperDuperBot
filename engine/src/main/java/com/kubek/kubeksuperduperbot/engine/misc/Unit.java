package com.kubek.kubeksuperduperbot.engine.misc;

public class Unit {

    public static Unit INSTANCE() {
        return instance;
    }

    private static final Unit instance = new Unit();

    private Unit() { }
}
