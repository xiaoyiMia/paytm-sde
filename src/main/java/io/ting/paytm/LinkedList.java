package io.ting.paytm;

import java.util.Iterator;

public class LinkedList <T> implements List<T> {

  private java.util.LinkedList<T> list;

  public LinkedList() {
    list = new java.util.LinkedList<>();
  }

  public List<T> add(int index, T element) {
    if(this.list.size() == Integer.MAX_VALUE) {
      throw new IndexOutOfBoundsException("Will have un-accessible index");
    }

    list.add(index, element);
    return this;
  }

  public List<T> add(T element) {
    if(this.list.size() == Integer.MAX_VALUE) {
      throw new IndexOutOfBoundsException("Will have un-accessible index");
    }

    list.add(element);
    return this;
  }

  public T get(int index) {
    return list.get(index);
  }

  public double averageLastMoving(int lastN) {
    if(lastN > this.list.size() || lastN <= 0) {
      throw new IllegalArgumentException("given number must be smaller " +
          "than the size of this list and larger then 0");
    }
    return 1;
  }

  public Iterator<T> iterator() {
    return this.list.iterator();
  }

  public int size() {
    return this.list.size();
  }

}