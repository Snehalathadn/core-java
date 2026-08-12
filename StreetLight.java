class StreetLight {

    public static void displayStreetLight(String color, boolean isOn) {

        System.out.println("Light Color : " + color);
        System.out.println("Light ON    : " + isOn);
    }

    public static void main(String[] args) {

        displayStreetLight("Red", true);

        String color = "Green";
        boolean isOn = false;

        displayStreetLight(color, isOn);
    }
}