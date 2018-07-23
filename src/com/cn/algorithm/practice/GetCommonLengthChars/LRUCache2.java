package com.cn.algorithm.practice.GetCommonLengthChars;

import java.util.HashMap;

public class LRUCache2<K, V> {

  private int length = 0;
  private final int capacity;

  private HashMap<K, Entry<K, V>> map = new HashMap<>();

  private Entry<K, V> head = null;
  private Entry<K, V> tail = null;

  LRUCache2(int capacity) {
    this.capacity = capacity;
    this.head = new Entry<>();
    this.tail = new Entry<>();

    this.head.next = this.tail;
    this.tail.prev = this.head;

  }

  public V get(K k) {
    Entry<K, V> entry = this.map.get(k);

    if (entry == null)
      return null;

    moveToHead(entry);

    return entry.v;

  }

  public void set(K k, V v) {

    Entry<K, V> newEntry;

    if (this.map.get(k) == null) {
      newEntry = new Entry<>(k, v, null, null);
      if (this.length >= this.capacity)
        removeLast();
      this.length++;
    } else {
      newEntry = this.map.get(k);
      newEntry.v = v;
    }

    newEntry = moveToHead(newEntry);

    this.map.put(k, newEntry);

  }


  private Entry<K,V> moveToHead(Entry<K, V> entry) {

    if (entry.prev != null || entry.next != null) {
      entry.prev.next = entry.next;
      entry.next.prev = entry.prev;
    }

    entry.next = head.next;
    entry.prev = head;

    head.next.prev = entry;
    head.next = entry;

    return entry;
  }


  private void removeLast() {
    Entry<K, V> last = this.map.get(this.tail.prev.k);

    last.prev.next = this.tail;
    last.next.prev = last.prev;

    this.map.remove(last.k);
    this.length--;
  }

  public String toString(){
    StringBuffer sb = new StringBuffer();
    Entry<K,V> node = this.tail.prev;
    while (node!=this.head){
      sb.append(node.k).append(":").append(node.v).append("-->");
      node = node.prev;
    }
    sb.append("length:"+this.length);
    sb.append("capacity:"+this.capacity);
    return sb.toString();
  }


  private class Entry<K, V> {
    K k;
    V v;
    Entry<K, V> prev;
    Entry<K, V> next;

    Entry() {
    }

    Entry(K k, V v, Entry<K, V> prev, Entry<K, V> next) {
      this.k = k;
      this.v = v;
      this.prev = prev;
      this.next = next;
    }
  }
}
