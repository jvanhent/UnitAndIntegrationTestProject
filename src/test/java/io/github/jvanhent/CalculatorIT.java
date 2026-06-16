package io.github.jvanhent;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorIT {

    @Test
    void testIntegration() {
        // Dummy integration test
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 20);
        assertTrue(result > 0, "Result should be positive");
    }
}
