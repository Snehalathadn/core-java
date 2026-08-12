class FancyStore {

    public static void store(String item, double cost, int quantity, String color) {

        if(item != null) {
            System.out.println("Item : " + item);
        }

        if(cost > 0) {
            System.out.println("Cost : " + cost);
        }

        if(quantity > 0) {
            System.out.println("Quantity : " + quantity);
        }

        if(color != null) {
            System.out.println("Color : " + color);
        }
    }
}