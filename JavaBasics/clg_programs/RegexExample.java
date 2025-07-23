
public class RegexExample {

    public static void main(String[] args) {
        // Example of using regex to validate an email address
        String email = "disumakadiya@gmail.com";
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (email.matches(emailRegex)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
        // Example of using regex to validate a phone number
        String phoneNumber = "123-456-7890";
        String phoneRegex = "^\\d{3}-\\d{3}-\\d{4}$";
        if (phoneNumber.matches(phoneRegex)) {
            System.out.println("Valid phone number.");
        } else {
            System.out.println("Invalid phone number.");
        }
        // Example of using regex to validate a date in the format dd/mm/yyyy
        String date = "25/12/2023";
        String dateRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if (date.matches(dateRegex)) {
            System.out.println("Valid date.");
        } else {
            System.out.println("Invalid date.");
        }

        // Example of using regex to validate a name
        String name = "John Doe";
        String pincode = "123456";
        String regex = "^[A-Za-z ]+$";      // Regex for name (only letters and spaces)
        String pincodeRegex = "^[0-9]{6}+$";

        if (name.matches(regex)) {
            System.out.println("Valid name.");
        } else {
            System.out.println("Invalid name.");
        }

        if (pincode.matches(pincodeRegex)) {
            System.out.println("Valid pincode.");
        } else {
            System.out.println("Invalid pincode.");
        }
        // Replacing inappropriate words with ***
        String text = "Java is a programming language. Java is also a platform.";
        String wordRegex = "\\bJava\\b";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(wordRegex);
        java.util.regex.Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("***");
        System.out.println(result);

    }
}
