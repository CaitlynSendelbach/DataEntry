package com.example.dataentrydemo.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EntryTests {

    @Test
    void testEntryGettersAndSetters() {
        Entry entry = new Entry();

        entry.setName("John Doe");
        entry.setAge(30);
        entry.setTitle("Developer");
        entry.setHometown("Springfield");

        assertEquals("John Doe", entry.getName());
        assertEquals(30, entry.getAge());
        assertEquals("Developer", entry.getTitle());
        assertEquals("Springfield", entry.getHometown());

    }

    @Test
    void testEntryGettersAndSettersFailure() {
        Entry entry = new Entry();

        entry.setName("John");
        entry.setAge(25);
        entry.setTitle("Test");
        entry.setHometown("Toledo");

        assertNotEquals("John Doe", entry.getName());
        assertNotEquals(30, entry.getAge());
        assertNotEquals("Developer", entry.getTitle());
        assertNotEquals("Springfield", entry.getHometown());

    }
}
