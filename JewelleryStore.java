class JewelleryStore {

    public static void jewellery(String item, String metal, double weight, double price, String color, int pieces, boolean hallmark) {

        if(item != null) {
            System.out.println("Item : " + item);
        }

        if(metal != null) {
            System.out.println("Metal : " + metal);
        }

        if(weight > 0) {
            System.out.println("Weight : " + weight);
        }

        if(price > 0) {
            System.out.println("Price : " + price);
        }

        if(color != null) {
            System.out.println("Color : " + color);
        }

        if(pieces > 0) {
            System.out.println("Pieces : " + pieces);
        }

        if(hallmark) {
            System.out.println("Hallmark Jewellery");
        }
    }
}