package credential_service_package;

import java.util.Random;

import employee_package.Employee;

public class CredentialService {

    Random rn = new Random();

    public String generateEmailAddress(Employee E, int dept) {

        String Email = null;

        switch (dept) {
            case 1: {
                Email = (E.getFirstName() + E.getLastName() + "@" + "tech" + ".abc.com");
                break;
            }
            case 2: {
                Email = (E.getFirstName() + E.getLastName() + "@" + "admin" + ".abc.com");
                break;
            }
            case 3: {
                Email = (E.getFirstName() + E.getLastName() + "@" + "hr" + ".abc.com");
                break;
            }
            case 4: {
                Email = (E.getFirstName() + E.getLastName() + "@" + "legal" + ".abc.com");
                break;
            }
        }
        return Email;

    }

    public String getPassword() {

        String Password;

        String Alphabets_small = "abcdefghijklmnopqrstuvwxyz";
        String Alphabets_capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String SpecialCharacters = "~`@#$!%^&*()_+-=";

        Integer randomPin0 = rn.nextInt(999);
        Integer randomPin1 = rn.nextInt(26);
        Integer randomPin2 = rn.nextInt(26);
        Integer randomPin3 = rn.nextInt(16);

        Password = randomPin0.toString() + Alphabets_small.charAt(randomPin1) + Alphabets_capital.charAt(randomPin2)
                + SpecialCharacters.charAt(randomPin3);

        return Password;

    }

    public void showCredentials(Employee E, String EmailAddress) {

        String Password = getPassword();

        System.out.println("Dear " + E.getFirstName() + ", Please find your generated credentials below");
        System.out.println("Email Address : " + EmailAddress);
        System.out.println("Password : " + Password);

    }

}
