package com.nhlstenden.JabberPoint.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaVersionTest {
    @Test
    void testJavaVersion_JDK21_ShouldBeTrue() {
        String javaVersion = System.getProperty("java.version");
        assertTrue(javaVersion.startsWith("21"),
                "The Java runtime version should be 21, so it is" + javaVersion);
    }

    @Test
    void testJavaVersion_JDK20_ShouldBeFalse() {
        String javaVersion = System.getProperty("java.version");
        assertFalse(javaVersion.startsWith("20"),
                "The Java runtime version should be 21, but it is " + javaVersion);
    }

    @Test
    void testJavaVersion_MajorVersion_ShouldBeEqual() {
        String javaVersion = System.getProperty("java.version");
        String[] versionParts = javaVersion.split("\\.");
        int majorVersion = Integer.parseInt(versionParts[0]);

        assertEquals(21, majorVersion,
                "The major version number should be 21, so it is: " + majorVersion);
    }
}
