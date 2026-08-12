class WineStore {

    public static void wine(String brand, int quantity, double price) {

        if(brand != null) {
            System.out.println("Brand : " + brand);
        }

        if(quantity > 0) {
            System.out.println("Quantity : " + quantity);
        }

        if(price > 0) {
            System.out.println("Price : " + price);
        }
    }
}