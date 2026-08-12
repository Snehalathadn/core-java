class StackOverflowDemo {

    static void repeatTask() {
        System.out.println("Executing recursive method...");
        repeatTask();
    }

    public static void main(String[] args) {
        System.out.println("=== StackOverflowError Demonstration ===");
        System.out.println("The method keeps calling itself without a stopping condition.");
        repeatTask();
    }
}