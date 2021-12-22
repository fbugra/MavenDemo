import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MavenJunitTest {

    @Test
    public void testApp()
    {
        assertEquals(10,new MavenJunit().calculateSomething());
    }
}
