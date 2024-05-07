public class NameDetails {
    public static void main(String[] args) {
        printNameDetails("John", "Doe");
    }

    public static void printNameDetails(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, my name is " + fullName + ". There are " + firstName.length() +
                " letters in my first name and " + lastName.length() + " letters in my last name.");
    }
}
