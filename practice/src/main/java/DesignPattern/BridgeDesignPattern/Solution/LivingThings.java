package DesignPattern.BridgeDesignPattern.Solution;

public abstract class LivingThings {
    BreatheImplementor obj;

    public LivingThings(BreatheImplementor obj) {
        this.obj = obj;
    }

    public void breatheProcess() {
        obj.breathe();
    }
}
