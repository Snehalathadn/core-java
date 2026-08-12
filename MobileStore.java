class MobileStore {

    public static void mobile(String brand, String model, int price, int ram) {

        if(brand != null) {
            System.out.println("Brand : " + brand);
        }

        if(model != null) {
            System.out.println("Model : " + model);
        }

        if(price > 0) {
            System.out.println("Price : " + price);
        }

        if(ram > 0) {
            System.out.println("RAM : " + ram + " GB");
        }
    }
}