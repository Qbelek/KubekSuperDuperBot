package com.kubek.kubeksuperduperbot.ui.misc;

public class Unit {

    public static Unit INSTANCE() {
        return instance;
    }

    private static final Unit instance = new Unit();

    private Unit() { }
}
