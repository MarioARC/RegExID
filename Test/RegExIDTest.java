import org.junit.Test;

import static org.junit.Assert.*;

public class RegExIDTest {

    @Test
    public void FirstNameTrue() {
        RegExID test1 = new RegExID();
        test1.setFirstName("Among");
        assertTrue(test1.getFirstName().matches("[A-Z][A-Za-z]*"));
    }

//    @Test
//    public void FirstNameFalse() {
//        RegExID test1 = new RegExID();
//        test1.setFirstName("among");
//        assertFalse(test1.getFirstName().matches("[A-Z][A-Za-z]*"));
//    }

    @Test
    public void LastNameTrue() {
        RegExID test1 = new RegExID();
        test1.setLastName("UsImposter");
        assertTrue(test1.getLastName().matches("[A-Z][A-Za-z]*"));
    }

//    @Test
//    public void IDNum6DigTrue() {
//        RegExID test1 = new RegExID();
//        test1.setIdNumber("385627");
//        assertTrue(test1.getIdNumber().matches("[0-9]{6}"));
//    }

    @Test
    public void IDNum6DigFirst3DigSameTrue() {
        RegExID test1 = new RegExID();
        test1.setIdNumber("789271");
        assertTrue(test1.getIdNumber().matches("(987|789)[0-9]{3}"));
    }

//    @Test
//    public void PasswordTrue() {
//        RegExID test1 = new RegExID();
//        test1.setPassword("P4$$w0rd:)");
//        assertTrue(test1.getPassword().matches("[\\p{Alnum}\\p{Punct}]+"));
//    }

    @Test
    public void LongPasswordTrue() {
        RegExID test1 = new RegExID();
        test1.setPassword("P4$$w0rdIsCool!");
        assertTrue(test1.getPassword().matches("[\\p{Alnum}\\p{Punct}]{4,16}"));
    }
}