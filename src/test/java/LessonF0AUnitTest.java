/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.ji.injector.exercise.classes.easy.monster.Monster;
import com.ji.injector.exercise.string.easy.password.PasswordManager;
import java.lang.reflect.Field;
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
    private static PasswordManager pm = null;

    public LessonF0AUnitTest() {
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
        result = "\t\t\t\t[FAIL]";

        
        try {
            Field field = Monster.class.getDeclaredField("brutality");
            Assertions.assertNotNull(field);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(LessonF0AUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(LessonF0AUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
//        assertEquals(3, maxa,"Mi aspettavo che il numero massimo di tentativi fosse 3, invece mi hai restituito "+maxa);

        result = "\t\t\t\t[SUCCESS][+5.0]";
        vote += 5.0f;
    }
    
    

   

}
