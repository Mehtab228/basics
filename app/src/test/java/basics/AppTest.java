/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basics;

import javaFundamentals.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.pluralize("cat", 4), "app should return cats");
    }
}
