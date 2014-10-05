package ru.ifmo.md.lesson4.CalculationEngine;

public class CalculationEngineFactory {

    private CalculationEngineFactory() {

    }

    public static CalculationEngine defaultEngine() {
        return new DummyCalculateEngine();
    }
}