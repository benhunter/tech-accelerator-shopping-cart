package com.galvanize.cart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    @Test
    void testShouldGetInitializedWithNameAndPrice() {
        Item item = new Item("name", 1.34);
        assertNotNull(item);
    }

    @Test
    void testGetPrice() {
        double price = 1.34;
        Item item = new Item("name", price);
        assertEquals(price, item.getPrice());
    }

}
