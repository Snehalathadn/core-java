class ChocolateStore {

    public static void chocolate(String name, int price) {

        if(name != null) {
            System.out.println("Chocolate Name : " + name);
        }

        if(price > 0) {
            System.out.println("Price : " + price);
        }
    }
}