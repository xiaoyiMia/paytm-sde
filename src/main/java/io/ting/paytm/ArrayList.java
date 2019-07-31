package io.ting.paytm;

import java.util.Iterator;

public class ArrayList <T> implements List<T> {

  private java.util.ArrayList<T> list;
  private java.util.ArrayList<Integer> lastElementsMoving;

  public ArrayList() {
    this.list = new java.util.ArrayList<>();
    this.lastElementsMoving = new java.util.ArrayList<>();
  }

  public List<T> add(int index, T element) {
    if(this.list.size() == Integer.MAX_VALUE) {
      throw new IndexOutOfBoundsException("Will have un-accessible index");
    }

    list.add(index, element);
    lastElementsMoving.add(list.size() - index);
    return this;
  }

  public List<T> add(T element) {
    return this.add(0, element);
  }

  public T get(int index) {
    return this.list.get(index);
  }

  public double averageLastMoving(int lastN) {
    if(lastN > this.list.size() || lastN <= 0) {
      throw new IllegalArgumentException("given number must be smaller " +
          "than the size of this list and larger then 0");
    }

    int movingSum = 0;
    for(int i = this.lastElementsMoving.size() - lastN; i < this.lastElementsMoving.size(); i++) {
      movingSum += this.lastElementsMoving.get(i);
    }
    return movingSum * 1.00 / lastN;
  }

  public Iterator<T> iterator() {
    return this.list.iterator();
  }

  public int size() {
    return this.list.size();
  }
}
