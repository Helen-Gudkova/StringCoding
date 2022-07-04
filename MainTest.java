import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MainTest {
    StringCoding sub = new StringCoding();

    @BeforeAll
    public void init() {
        sub.setSourceString("AAAA");
    }

    @Test
    public void testString() {
        sub.setSourceString("AAAA");
        Assertions.assertEquals("4A", sub.getDestinationString());
    }

}