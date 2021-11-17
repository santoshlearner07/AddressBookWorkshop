package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Contacts<info> {

    @Before
    public void createAddressBook() {

    }

    @Test
    public void addingContactToAddressBook() {
        List<info> list = new ArrayList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void addDetailsToAddressBook() {

    }

    private void assertTrue(boolean empty) {
    }
}
