class ProvisionStore {

    public static void provision(String item, int quantity, double cost, boolean available) {

        if(item != null) {
            System.out.println("Item : " + item);
        }

        if(quantity > 0) {
            System.out.println("Quantity : " + quantity);
        }

        if(cost > 0) {
            System.out.println("Cost : " + cost);
        }

        if(available) {
            System.out.println("Item is Available");
        }
    }
}