package practicing.factory;

public class PlanFactory {
    public Plan createPlan(String planType) {
        switch (planType) {
            case "domestic":
                return new DomesticPlan();
            case "commercial":
                return new CommercialPlan();
            case "institutional":
                return new InstitutionalPlan();
            default:
                return null;
        }
    }
}
