public class AgeDetails {
    public static void main(String[] args) {
        // Implement Conditional Statements:
        int age = 25;
        String message = (age >= 18) ? "You are an adult." : "You are a minor.";
        System.out.println(message);

        // Implement a Switch Statement:
        switch (age) {
            case 12:
                System.out.println("You are a child.");
                break;
            case 19:
                System.out.println("You are a teenager.");
                break;
            case 59:
                System.out.println("You are an adult.");
                break;
            default:
                if (age >= 60) {
                    System.out.println("You are a senior citizen.");
                } else {
                    System.out.println("Invalid age.");
                }
        }

        // Use a Looping Structure:
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Use Nested Loop:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Implement Loop Control Statements:
        int countdown = 10;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
    }
}
