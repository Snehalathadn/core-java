class FoodIn
{
    public static String[] findIngredientsByFood(String foodName)
    {
        System.out.println("running FoodIngredient in findIngredientsByFood");
        System.out.println("foodName=" + foodName);

        if(foodName == "Biryani")
        {
            System.out.println("Biryani is the name");

            String[] foodIngredients = {"rice", "chicken", "oil", "coriander","ginger-garlic paste", "onion","tomato","lemon", "curd", "and other spices" };

            return foodIngredients;
        }

        else if(foodName == "Jamoon")
        {
            System.out.println("Jamoon is the name");

            String[] foodIngredient = {"milk", "gulab jamoon powder", "sugar", "ghee","oil"};

            return foodIngredient;
        }

        else if(foodName == "Gobi")
        {
            System.out.println("Gobi is the name");

            String[] foodIngredient = {"cauliflower", "ginger", "garlic","oil","onion","ketchup", "flour","chilli sauce", "and other spices",};

            return foodIngredient;
        }

        else if(foodName == "FriedRice")
        {
            System.out.println("FriedRice is the name");

            String[] foodIngredient = {"rice", "oil", "carrot", "beans" ,"chilli", "capsicum", "onion", "soy sauce", "and other spices"
            };

            return foodIngredient;
        }

        System.out.println("name is not matched, so return empty");

        String[] empty = {};
        return empty;
    }
}