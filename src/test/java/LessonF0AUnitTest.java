/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.ji.injector.exercise.classes.easy.monster.Monster;
import com.ji.injector.exercise.string.easy.password.PasswordManager;
import com.ji.injector.headquarter.Exercise;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Disabled;

//@Disabled
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class LessonF0AUnitTest {

    private String message;
    private String result;
    private static float vote = 0;
    private static final String title;
    public static final String UNKNOWN_EXERCIZE = "<UNKNOWN EXERCIZE>";
    private static boolean brutalityExisting = false;
    private Field fieldBrutality = null;
    
    static{
        Exercise annotation = Monster.class.getAnnotation(Exercise.class);
        title = annotation == null ? UNKNOWN_EXERCIZE : annotation.name();
    }

    public LessonF0AUnitTest() {
    }

    public static float round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, RoundingMode.CEILING);
        return bd.floatValue();
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
        
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
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
        System.out.println("[Test Module][Classi e Oggetti]" + message + ": " + result);

    }

    @Test
    @DisplayName("(1/1) Easy: attributo brutality [existence]")
    public void test1a1(TestInfo info) {

        message = "["+title+"]"+info.getDisplayName();
        result = "\t[FAIL]";
        try {
            fieldBrutality= Monster.class.getDeclaredField("brutality");
            Assertions.assertNotNull(fieldBrutality);
            brutalityExisting = true;
        } catch (NoSuchFieldException ex) {
           return;
        } catch (SecurityException ex) {
           return;
        }

        result = "\t[SUCCESS][+5.0]";
        vote += 5.0f;
    }
    
    
    @Test
    @DisplayName("(1/1) Easy: attributo brutality [private]")
    public void test1a2(TestInfo info) {
        message = "["+title+"]"+info.getDisplayName();
        result = "\t\t[SKIPPED]";
        Assumptions.assumeTrue(brutalityExisting);
        result = "\t\t[FAIL]";
        try {
            fieldBrutality= Monster.class.getDeclaredField("brutality");
            int modifiers = fieldBrutality.getModifiers();
            Assertions.assertTrue(Modifier.isPrivate(modifiers), "la variabile brutality non ha accesso privato.");
            brutalityExisting = true;
        } catch (SecurityException ex) {
           return;
        } catch (NoSuchFieldException ex) {
            return;
        }
        

        result = "\t\t[SUCCESS][+5.0]";
        vote += 5.0f;
    }
    

   

}
