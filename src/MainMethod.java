import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {
        RegExID identity1 = new RegExID();
        RegExID identity2 = new RegExID();

        identity1.setFirstName("");
        identity1.setLastName("");
        identity1.setIdNumber("");
        identity1.setPassword("");



        System.out.println(identity1);
        System.out.println(identity2);

    }
}