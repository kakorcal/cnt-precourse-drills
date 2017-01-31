package com.galvanize;

import java.util.List;
import java.util.ArrayList;

public class Business implements Addressable {
  private String name;
  private ArrayList<Address> addresses;

  public Business(String name) {
    this.name = name;
    this.addresses = new ArrayList<Address>();
  }

  public String getName() {
    return name;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void addAddress(Address address) {
    addresses.add(address);
  }
}