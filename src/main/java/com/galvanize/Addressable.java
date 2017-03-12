package com.galvanize;

import java.util.List;

public interface Addressable {
    List<Address> getAddresses();
    void addAddress(Address address);
}
