/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.ji.injector.exercise.classes.easy.monster.Monster;
import com.ji.injector.exercise.string.easy.password.PasswordManager;
import com.ji.injector.headquarter.ConditionToExecute;
import java.math.BigDecimal;
import java.math.RoundingMode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Disabled;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@ConditionToExecute(classToCheck = PasswordManager.class)
public class Lesson1AUnitTest {

    private String message;
    private String result;
    private static float vote = 0;
    private static PasswordManager pm = null;
    private static final String BREAKLINE = "\n---------------------------------------------------------------------------------------------------";

    public Lesson1AUnitTest() {
    }

    public static float round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, RoundingMode.CEILING);
        return bd.floatValue();
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
        pm = new PasswordManager();
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
        System.out.println("\n\n===========================================================");
        if (vote > 30) {
            System.out.println("\t\t\tYOUR VOTE: 30 e Lode ! ");
        } else {
            System.out.println("\t\t\tYOUR VOTE: " + round(vote, 1) + "/30");
        }

        System.out.println("===========================================================\n\n");
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
         pm = new PasswordManager();
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
        System.out.println("[Test Module][Lesson1]" + message + ": " + result);

    }

    @Test
    @DisplayName("[1.A.1](1/1) Easy: getMaxAttempts [getter]")
    public void test1a1(TestInfo info) {

        message = info.getDisplayName();
        result = "\t\t[FAIL]"+BREAKLINE;

        int maxa = pm.getMaxAttempts();
        assertEquals(3, maxa,"Mi aspettavo che il numero massimo di tentativi fosse 3, invece mi hai restituito "+maxa);

        result = "\t\t[SUCCESS][+5.0]"+BREAKLINE;
        vote += 5.0f;
    }
    
    @Test
    @DisplayName("[1.A.2](1/1) Easy: getWrongAttempts [getter at init]")
    public void test1a2(TestInfo info) {

        message = info.getDisplayName();
        result = "\t[FAIL]"+BREAKLINE;

        int wa = pm.getWrongAttempts();
        assertEquals(0, wa,"All'inizio il numero di errori deve essere zero, invece mi dai come valore: "+wa);

        result = "\t[SUCCESS][+2.0]"+BREAKLINE;
        vote += 2.0f;
    }
    
    @Test
    @DisplayName("[1.A.2](1/6) Easy: checkPassword [progression]")
    public void test1a3(TestInfo info) {

        message = info.getDisplayName();
        result = "\t\t[SKIPPED] (fix 1.A.2, 1)";

        int wa = pm.getWrongAttempts();
        
        Assumptions.assumeTrue(wa==0);
        result = "\t\t[FAIL]";
        pm.checkPassword("erro1");
        pm.checkPassword("erro1");
        wa = pm.getWrongAttempts();
        assertEquals(2, wa,"Ho eseguito due tentativi errati ma il conteggio è errato");

        result = "\t\t[SUCCESS][+3.0]";
        vote += 3.0f;
    }
    
    @Test
    @DisplayName("[1.A.2](2/6) Easy: checkPassword [progression 2]")
    public void test1a4(TestInfo info) {

        message = info.getDisplayName();
        result = "\t[SKIPPED] (fix 1.A.2, 1)";

        int wa = pm.getWrongAttempts();
        
        Assumptions.assumeTrue(wa==0);
        result = "\t[FAIL]";
        pm.checkPassword("erro1");
        pm.checkPassword("erro1");
        pm.checkPassword("erro12");
        pm.checkPassword("erro13");
        pm.checkPassword("erro14333");
        wa = pm.getWrongAttempts();
        assertEquals(3, wa,"Ho eseguito 6 tentativi errati ma il conteggio è errato, non dovrebbe superare le 3 prove invece.. : "+wa);

        result = "\t[SUCCESS][+5.0]";
        vote += 5.0f;
    }
    
    @Test
    @DisplayName("[1.A.2](3/6) Easy: checkPassword [correct value]")
    public void test1a5(TestInfo info) {

        message = info.getDisplayName();
        result = "\t[SKIPPED] (fix 1.A.2, 1)";

        int wa = pm.getWrongAttempts();
        
        Assumptions.assumeTrue(wa==0);
        result = "\t[FAIL]";
        String value = pm.checkPassword("antisgamo");
        wa = pm.getWrongAttempts();
        assertEquals(0, wa,"Ho subito inserito la password corretta e mi aspettavo "+wa);
        assertEquals("CORRECT", value,"Ho subito inserito la password corretta ma non mi ha ritornato il giusto valore");

        result = "\t[SUCCESS][+3.0]";
        vote += 3.0f;
    }
    
    @Test
    @DisplayName("[1.A.2](4/6) Easy: checkPassword [correct value]")
    public void test1a6(TestInfo info) {

        message = info.getDisplayName();
        result = "\t[SKIPPED] (fix 1.A.2, 1)";

        int wa = pm.getWrongAttempts();
        
        Assumptions.assumeTrue(wa==0);
        result = "\t[FAIL]";
        pm.checkPassword("alfonso");
        pm.checkPassword("minki");
        String value = pm.checkPassword("antisgamo");
        wa = pm.getWrongAttempts();
        assertEquals(0, wa,"Ho inserito la password corretta dopo due errori ma il contatore di passwrod segna ancora: "+wa+".  Mi hai molto deluso.");
        assertEquals("CORRECT", value,"Ho inserito la password corretta ma non mi ha ritornato il giusto valore");
        result = "\t[SUCCESS][+4.0]";
        vote += 4.0f;
    }
    
    @Test
    @DisplayName("[1.A.2](5/6) Easy: checkPassword [check labels]")
    public void test1a7(TestInfo info) {

        message = info.getDisplayName();
        result = "\t\t[SKIPPED] (fix 1.A.2, 1)";

        int wa = pm.getWrongAttempts();
        
        Assumptions.assumeTrue(wa==0);
        result = "\t\t[FAIL]";
        String checkValue1 = pm.checkPassword("alfonso");
        String checkValue2 = pm.checkPassword("minki");
        String checkValue3 = pm.checkPassword("antisgamo");
        
        assertEquals("ERROR", checkValue1,"ho inserito una password errata ma non hai restituito il giusto valore di ritorno");
        assertEquals("ERROR", checkValue2,"ho inserito una password errata ma non hai restituito il giusto valore di ritorno");
        assertEquals("CORRECT", checkValue3,"ho inserito una password giusta ma non hai restituito il giusto valore di ritorno");

        result = "\t\t[SUCCESS][+5.0]";
        vote += 5.0f;
    }
    
    
    @Test
    @DisplayName("[1.A.2](6/6) Easy: checkPassword [blocked]")
    public void test1a8(TestInfo info) {

        message = info.getDisplayName();
        result = "\t\t[SKIPPED] (fix 1.A.2, 1)";

        int wa = pm.getWrongAttempts();
        
        Assumptions.assumeTrue(wa==0);
        result = "\t\t[FAIL]";
        pm.checkPassword("alfonso");
        pm.checkPassword("minki");
        pm.checkPassword("minki2");
        pm.checkPassword("minki3");
        String checkValue = pm.checkPassword("antisgamo");
        
        assertEquals("BLOCKED", checkValue,"ho superato il numero massimo di errori e mi aspettavo il valore di ritorno BLOCKED.. e invece..:"+checkValue);

        result = "\t\t[SUCCESS][+4.0]";
        vote += 4.0f;
    }
    

   

}
