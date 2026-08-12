class StaticToNonStatic {

    void printResult() {
        System.out.println("Non-static method executed successfully.");
    }

    static void beginExecution() {
        printResult();   // Error
    }

    public static void main(String[] args) {
        beginExecution();
    }
}