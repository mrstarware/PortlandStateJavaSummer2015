package edu.pdx.cs410J.minesweeper;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests the functionality in the {@link Minesweeper} main class.
 */
public class Project1Test extends InvokeMainTestCase {

    /**
     * Invokes the main method of {@link Minesweeper} with the given arguments.
     */
    private MainMethodResult invokeMain(String... args) {
        return invokeMain( Minesweeper.class, args );
    }

  /**
   * Tests that invoking the main method with no arguments issues an error
   */
  @Test
  public void testNoCommandLineArguments() {
    MainMethodResult result = invokeMain();
    assertEquals(new Integer(1), result.getExitCode());
    assertTrue(result.getErr().contains( "Missing command line arguments" ));
  }

}