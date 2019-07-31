import io.ting.paytm.ArrayList;
import io.ting.paytm.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayListTests {

  @Test
  @DisplayName("get average moving by giving an argument exceed list size")
  void averageMovingIllegalArgumentExceptionLargerThanSize() {
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < 5; i++) {
      list.add(0, i);
    }

    Assertions.assertThrows(IllegalArgumentException.class, () -> list.averageLastMoving(20));
  }

  @Test
  @DisplayName("get average moving by giving an argument less than 0")
  void averageMovingIllegalArgumentExceptionLessThanZero() {
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < 5; i++) {
      list.add(0, i);
    }

    Assertions.assertThrows(IllegalArgumentException.class, () -> list.averageLastMoving(-5));
  }

  @Test
  @DisplayName("get average moving successfully")
  void averageMovingSucceed() {
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < 5; i++) {
      list.add(0, i);
    }

    Assertions.assertEquals((3+4+5) * 1.00/3, list.averageLastMoving(3));
  }

}
