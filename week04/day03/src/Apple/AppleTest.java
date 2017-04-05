package Apple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Gabor on 05/04/2017.
 */
public class AppleTest {

  @Test
  void testApple(){
  assertEquals("Granny Smith", Apple.getApple());
  }
}
