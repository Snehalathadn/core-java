class FlowerStore {

    public static void flower(String name, String color, int quantity, double price, boolean fresh) {

        if(name != null) {
            System.out.println("Flower Name : " + name);
        }

        if(color != null) {
            System.out.println("Flower Color : " + color);
        }

        if(quantity > 0) {
            System.out.println("Quantity : " + quantity);
        }

        if(price > 0) {
            System.out.println("Price : " + price);
        }

        if(fresh) {
            System.out.println("Fresh Flower Available");
        }
    }
}