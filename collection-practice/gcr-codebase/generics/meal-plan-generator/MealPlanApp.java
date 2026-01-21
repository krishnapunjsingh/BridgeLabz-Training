public class MealPlanApp {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = MealPlanService.generateMealPlan("Krishna", new VegetarianMeal());
        Meal<VeganMeal> veganMeal = MealPlanService.generateMealPlan("Yash", new VeganMeal());
        Meal<HighProteinMeal> proteinMeal = MealPlanService.generateMealPlan("Siddharth", new HighProteinMeal());


        vegMeal.displayMeal();
        veganMeal.displayMeal();
        proteinMeal.displayMeal();
    }
}
