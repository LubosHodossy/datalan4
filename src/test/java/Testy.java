import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class Testy {

    @Test
    void shouldShowSimpleAssertion() {
        Assertions.assertEquals(1, 1);
    }
}
