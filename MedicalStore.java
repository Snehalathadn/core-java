class MedicalStore {

    public static void medicine(String name, int price) {

        if(name != null) {
            System.out.println("Medicine Name : " + name);
        }

        if(price > 0) {
            System.out.println("Price : " + price);
        }
    }
}