package driver_package;

import java.util.Scanner;

import credential_service_package.CredentialService;
import employee_package.Employee;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String FirstName;
        String LastName;
        int dept;
        String EmailAddress;

        System.out.println("Enter your First Name : ");
        FirstName = sc.nextLine();

        System.out.println("Enter your Last Name : ");
        LastName = sc.nextLine();

        System.out.println("Choose your Department : ");
        System.out.println("1. Technical Department");
        System.out.println("2. Administrator Department");
        System.out.println("3. Human Resource Department");
        System.out.println("4. Legal Department");

        dept = sc.nextInt();

        Employee E = new Employee(FirstName, LastName);
        CredentialService C = new CredentialService();

        EmailAddress = C.generateEmailAddress(E, dept);
        C.showCredentials(E, EmailAddress);

        sc.close();

    }

}
