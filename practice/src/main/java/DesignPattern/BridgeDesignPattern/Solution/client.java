package DesignPattern.BridgeDesignPattern.Solution;


public class client {
    public static void main(String[] args) {
        LivingThings tree = new Tree(new LandBreatheImplementor());
        tree.breatheProcess();
    }
}
