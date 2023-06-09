package practicing.factory;

public class Main {
    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();
        Plan plan = planFactory.createPlan("domestic");
        plan.getRate();
        plan.calculateBill(10);
    }
}
