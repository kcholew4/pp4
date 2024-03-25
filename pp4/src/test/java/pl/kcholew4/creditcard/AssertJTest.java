package pl.kcholew4.creditcard;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
public class AssertJTest {
    @Test
    void helloAssertJ() {
        var hello = "Hello world!";
        assertThat(hello).containsOnlyDigits();
    }

    @Test
    void testSomeListExpression() {
        var names = Collections.singleton("jakub");
        assertThat(names).isUnmodifiable().hasSize(3).containsAll(Arrays.asList("Jakub", "Michal"));
    }
}
