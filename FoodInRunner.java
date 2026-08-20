class FoodInRunner
{
    public static void main(String[] values)
    {
        String foodName = "Gobi";

        String[] totalIngredient =
            FoodIn.findIngredientsByFood(foodName);

        int ingredients = totalIngredient.length;

        System.out.println("ingredients=" + ingredients);
    }
}