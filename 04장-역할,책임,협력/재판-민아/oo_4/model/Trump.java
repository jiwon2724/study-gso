package org.oo_4.model;

abstract class Trump {
   protected boolean isLookingUp;

    public Trump() {
        this.isLookingUp = true;
    }

    public void lieProne() {
        this.isLookingUp = false;
    }

    public void flipBack() {
        this.isLookingUp = !isLookingUp;
    }
}
