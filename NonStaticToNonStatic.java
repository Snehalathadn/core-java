class NonStaticToNonStatic {

    static void displayMessage() {
        System.out.println("Second method executed.");
    }

    static void performOperation() {
        System.out.println("Calling one method from another method.");
        displayMessage();
    }

    public static void main(String[] args) {
        System.out.println(" Method Invocation ");
        performOperation();
    }
}