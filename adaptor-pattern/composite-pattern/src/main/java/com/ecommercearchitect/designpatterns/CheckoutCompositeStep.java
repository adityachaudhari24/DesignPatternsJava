package com.ecommercearchitect.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class CheckoutCompositeStep implements CheckoutStep {
    private List<CheckoutStep> steps = new ArrayList<>();

    public void addStep(CheckoutStep step) {
        steps.add(step);
    }

    public void removeStep(CheckoutStep step) {
        steps.remove(step);
    }

    @Override
    public void perform() {
        for (CheckoutStep step : steps) {
            step.perform();
        }
    }
}
