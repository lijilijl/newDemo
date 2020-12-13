package com.lijl.biz.seata.model;

public class Banana {
  private long id;
  private String name;

  public Banana() {
  }

  public Banana(long id, String name) {
    this.id = id;
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Banana{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
