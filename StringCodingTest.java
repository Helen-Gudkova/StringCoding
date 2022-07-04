import org.junit.Assert;

public class StringCodingTest {
    StringCoding sub = new StringCoding();

    @org.junit.Test
    public void testString() {
        sub.setSourceString("AAAA");
        Assert.assertEquals("4A", sub.getDestinationString());
    }

    @org.junit.Test
    public void testString1() {
        sub.setSourceString("BBBB");
        Assert.assertEquals("5B", sub.getDestinationString());
    }

    @org.junit.Test
    public void testString2() {
        sub.setSourceString("ППППоооЛЛЛ");
        Assert.assertEquals("4П3о3Л", sub.getDestinationString());
    }

}