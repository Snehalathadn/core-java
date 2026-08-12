class Gym {

    static void register(String memberName, int age, String plan,
                         double fee, boolean trainerRequired) {

        System.out.println("Running register in Gym");

        if (memberName != null && age >= 18 && age <= 60 &&
            plan != null && fee > 0) {

            System.out.println("Member Name      : " + memberName);
            System.out.println("Age              : " + age);
            System.out.println("Plan             : " + plan);
            System.out.println("Fee              : " + fee);
            System.out.println("Trainer Required : " + trainerRequired);
            System.out.println("Registration Successful");
        } else {
            System.out.println("Invalid Details");
        }
    }
}