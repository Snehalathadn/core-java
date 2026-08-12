class IcecreamStore {

    public static void save(String name, String flavour, int cost, char size, boolean cone, boolean cup) {

        if(name != null) {
            System.out.println("Name : " + name);
        }

        if(flavour != null) {
            System.out.println("Flavour : " + flavour);
        }

        if(cost > 0) {
            System.out.println("Cost : " + cost);
        }

        if(size != ' ') {
            System.out.println("Size : " + size);
        }

        if(cone) {
            System.out.println("Cone Available");
        }

        if(cup) {
            System.out.println("Cup Available");
        }
    }

    public static void order(String name, String flavour, int quantity) {

        if(name != null) {
            System.out.println("Order Name : " + name);
        }

        if(flavour != null) {
            System.out.println("Flavour : " + flavour);
        }

        if(quantity > 0) {
            System.out.println("Quantity : " + quantity);
        }
    }
}