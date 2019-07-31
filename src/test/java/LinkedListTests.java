import io.ting.paytm.LinkedList;
import io.ting.paytm.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LinkedListTests {

  @Test
  @DisplayName("get average moving by giving an argument exceed list size")
  void averageMovingIllegalArgumentExceptionLargerThanSize() {
    List<Integer> list = new LinkedList<>();
    for(int i=0; i< 5; i++) {
      list.add(i);
    }

    Assertions.assertThrows(IllegalArgumentException.class, () -> list.averageLastMoving(20));
  }

  @Test
  @DisplayName("get average moving by giving an argument less than 0")
  void averageMovingIllegalArgumentExceptionLessThanZero() {
    List<Integer> list = new LinkedList<>();
    for(int i=0; i< 5; i++) {
      list.add(i);
    }

    Assertions.assertThrows(IllegalArgumentException.class, () -> list.averageLastMoving(-5));
  }

  @Test
  @DisplayName("get average moving successfully")
  void averageMovingSucceed() {
    List<Integer> list = new LinkedList<>();
    for(int i=0; i< 5; i++) {
      list.add(i);
    }

    Assertions.assertEquals(1, list.averageLastMoving(3));
  }

}
