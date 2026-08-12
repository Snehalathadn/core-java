class NonStaticToStatic {

    static void displayInfo() {
        System.out.println("This is a static method.");
    }

    void startProcess() {
        System.out.println("Calling a static method from a non-static method.");
        displayInfo();
    }
}