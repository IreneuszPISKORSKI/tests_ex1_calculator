import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTest {
    private Calculator testThis = new Calculator();
    @Test
    void test_addition() {
        float result = testThis.add_things(4, 2);
        Assertions.assertEquals(6,result);
    }
    @Test
    void test_subtraction() {
        float result = testThis.substract_things(6, 4);
        Assertions.assertEquals(2,result);
    }
    @Test
    void test_multiplication() {
        float result = testThis.multiplication_things(2, 4);
        Assertions.assertEquals(8,result);
    }
    @Test
    @DisplayName("Test of division")
    void test_division() {
        String result = testThis.division_things(8,0);
        Assertions.assertEquals("Division by 0 is not allowed!",result);
    }
    @Test
    @DisplayName("2nd test of division")
    void test_division2() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            int result = testThis.division2_things(4, 0);
        });
    }
}
