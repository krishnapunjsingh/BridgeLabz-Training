

public class MealPlanService {
    public static <T extends MealPlan> Meal<T> generateMealPlan(String userName, T mealPlan){
        if(!mealPlan.isValid()){
            throw new IllegalArgumentException("Illegal Meal Plan");
        }
        return new Meal<>(userName, mealPlan);
    }
}
