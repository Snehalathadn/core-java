class DryFruitStore {

    public static void dryFruit(String name, int quantity, double cost) {

        if(name != null) {
            System.out.println("Dry Fruit Name : " + name);
        }

        if(quantity > 0) {
            System.out.println("Quantity : " + quantity);
        }

        if(cost > 0) {
            System.out.println("Cost : " + cost);
        }
    }
}