import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RegExID identity1 = new RegExID();

        identity1.setFirstName("");
        identity1.setLastName("");
        identity1.setIdNumber("");
        identity1.setPassword("");

        System.out.println(identity1);

    }
}