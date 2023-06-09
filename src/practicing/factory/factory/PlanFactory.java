package practicing.factory.factory;

import practicing.factory.plans.CommercialPlan;
import practicing.factory.plans.DomesticPlan;
import practicing.factory.plans.InstitutionalPlan;
import practicing.factory.plans.Plan;

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
