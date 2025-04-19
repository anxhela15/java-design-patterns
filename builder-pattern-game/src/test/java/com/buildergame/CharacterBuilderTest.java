package com.buildergame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterBuilderTest {

    @Test
    void testBuilderSetsAllFields() {
        Character c = new Character.Builder()
                .name("Luna")
                .health(120)
                .strength(15)
                .agility(18)
                .build();

        assertEquals("Luna", c.getName());
        assertEquals(120, c.getHealth());
        assertEquals(15, c.getStrength());
        assertEquals(18, c.getAgility());
    }

    @Test
    void testBuilderDefaults() {
        Character c = new Character.Builder()
                .name("Nova")
                .build();

        assertEquals("Nova", c.getName());
        assertEquals(100, c.getHealth());    // default health
        assertEquals(10, c.getStrength());   // default strength
        assertEquals(10, c.getAgility());    // default agility
    }

    @Test
    void testBuilderMissingNameThrows() {
        Exception exception = assertThrows(IllegalStateException.class, () ->
            new Character.Builder().build()
        );
        assertTrue(exception.getMessage().contains("Name cannot be null"));
    }
}
