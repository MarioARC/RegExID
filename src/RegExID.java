import java.util.Scanner;

public class RegExID
{
    Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String idNumber;
    private String password;

    public RegExID()
    {
        firstName = "";
        lastName = "";
        idNumber = "000000";
        password = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = validateFirstName(firstName);
    }

    private String validateFirstName(String firstName)
    {
        while (!firstName.matches("[A-Z][A-Za-z]*"))
        {
            System.out.println("First Name Invalid (Valid Name Ex: John)");
            firstName = input.nextLine();
        }
//        if(firstName.equals("AmongUs"))
//        {
//            System.out.println("Sus");
//        }
        System.out.println("First Name Valid");
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = validateLastName(lastName);
    }

    private String validateLastName(String lastName)
    {
        while(!lastName.matches("[A-Z][A-Za-z]*"))
        {
            System.out.println("Last Name Invalid (Valid Name Ex: Doe)");
            lastName = input.nextLine();
        }
        System.out.println("Last Name Valid");
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = validateIdNumber(idNumber);
    }

    private String validateIdNumber(String idNumber)
    {
        while(!idNumber.matches("(987|789)[0-9]{3}"))
        {
            System.out.println("ID Number Invalid (6 digits long and start with 987 or 789)");
            idNumber = input.nextLine();
        }
        System.out.println("ID Number Valid");
        return idNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = validatePassword(password);
    }

    private String validatePassword(String password)
    {
        while(!password.matches("[\\p{Alnum}\\p{Punct}]{4,16}"))
        {
            System.out.println("Password Invalid (4-16 Characters) (Don't use your actual password)");
            password = input.nextLine();
        }
        System.out.println("Password Valid");
        return password;
    }

    @Override
    public String toString() {
        return "RegExID{" +
                "\nfirstName='" + firstName + '\'' +
                "\n, lastName='" + lastName + '\'' +
                "\n, idNumber='" + idNumber + '\'' +
                "\n, password='" + password + '\'' +
                '}';
    }
}
