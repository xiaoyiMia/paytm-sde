package io.ting.paytm;

import java.util.Iterator;

public interface List<T> {

  /**
   * Add an element at given position
   * @param index The given position to add the element
   * @param element The element to add into the list
   * @return The list after add the element
   */
  List<T> add(int index, T element);

  /**
   * Add an element at the end of the list
   * @param element The element to add into the list
   * @return The list after add the element
   */
  List<T> add(T element);

  /**
   * Get the element at the given position
   * @param index The index of the position to read
   * @return The element at the given position.
   */
  T get(int index);

  /**
   * <p>Get the average of moving that existing elements need to take in order to add the
   * n elements into the list. Element insertion itself counted as 1 moving.</p>
   * <p>e.g. Add [1, 2, 3, 4, 5] into list at positions [3, 2, 0, 1, 4]. <br>
   * If lastN = 3,  <br>
   * return the average moves other elements need to do for adding elements [3, 4, 5].</p>
   * @param lastN The number of n elements added in this list.
   * @return the average moving
   */
  double averageLastMoving(int lastN);

  /**
   * Return an iterator to support traversal all elements.
   * @return an iterator
   */
  Iterator<T> iterator();

  /**
   * Return size of the list
   * @return size of the list
   */
  int size();
}
