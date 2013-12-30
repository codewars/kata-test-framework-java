import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.rules.TestRule;
import org.junit.runner.Description;

/**
     * Created with IntelliJ IDEA.
     * User: michael
     * Date: 27/10/2013
     * Time: 19:33
     * To change this template use File | Settings | File Templates.
     */
    public class CodewarsJavaTest {

    int correctAnswers;
    int incorrectAnswers;

        CodewarsJava codewarsJava = new CodewarsJava();

        @Before
        public void setUp() throws Exception {

        }

        @Rule
        public TestWatcher testWatcher = new TestWatcher() {
            @Override
            protected final void succeeded(Description description) {
        System.out.println("" + description.getDisplayName() + " succeeded.");
                super.succeeded(description);    //To change body of overridden methods use File | Settings | File Templates.
            correctAnswers++;
            }

            @Override
            protected final void failed(Throwable e, Description description) {
                System.out.println("" + description.getDisplayName() + " failed " +
                e.getMessage());
                super.failed(e, description);
                incorrectAnswers++;
            }

        };

        @Test
        public final void testMultiply() { // Final in Java stops a method being overridden.

            Assert.assertEquals("The two values should multiply together", 50, codewarsJava.multiply(10, 5));

        }

        @Test
        public final void testGreet() {
            Assert.assertEquals("Hello Bob", codewarsJava.greet("Bob"));
        }

        @After
        public void tearDown() throws Exception {

        }

}


