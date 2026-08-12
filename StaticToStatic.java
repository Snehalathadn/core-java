class StaticToStatic {

    static void showDetails() {
        System.out.println("Successfully entered the first static method.");
    }

    static void executeTask() {
        System.out.println("Invoking one static method from another static method.");
        showDetails();
    }

    public static void main(String[] args) {
        System.out.println(" Static to Static Method Invocation ");
        executeTask();
    }
}