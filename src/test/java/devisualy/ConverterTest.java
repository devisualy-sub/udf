package devisualy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import devisualy.Converter;

public class ConverterTest extends TestCase {
  public void testChanged() {
    Converter converter = new Converter();
    assertEquals(
      converter.evaluate("GET"),
      "ゲット"
    );
  }
  public void testNotChanged() {
    Converter converter = new Converter();
    assertEquals(
      converter.evaluate("POST"),
      "POST"
    );
  }
}
