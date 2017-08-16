package com.endava.calculator.addTest;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
public class Assertions {

  /**
   * Creates a new instance of <code>{@link com.endava.calculator.addTest.AddTestAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static com.endava.calculator.addTest.AddTestAssert assertThat(com.endava.calculator.addTest.AddTest actual) {
    return new com.endava.calculator.addTest.AddTestAssert(actual);
  }

  /**
   * Creates a new <code>{@link Assertions}</code>.
   */
  protected Assertions() {
    // empty
  }
}
