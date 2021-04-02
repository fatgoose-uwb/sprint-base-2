package Task1;

import Task1.Pets.Cat;
import Task1.Pets.Dog;
import Task1.Pets.Rabbit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PetTest {

    // --- Rabbit Tests ---
    @Test
    public void testRabbitConstructorAndGetters() {
        Rabbit rabbit = new Rabbit("Snowball", 2, "White");

        assertEquals("Snowball", rabbit.getName());
        assertEquals(2, rabbit.getAge());
        assertEquals("White", rabbit.getFurColor());
    }

    @Test
    public void testRabbitToString() {
        Rabbit rabbit = new Rabbit("Clover", 3, "Gray");
        String expected = "Name’s Clover. Fear the fluff!";
        assertEquals(expected, rabbit.toString());
    }

    // --- Cat Tests ---
    @Test
    public void testCatConstructorAndGetters() {
        Cat cat = new Cat("Whiskers", 4, "Yarn Ball");

        assertEquals("Whiskers", cat.getName());
        assertEquals(4, cat.getAge());
        assertEquals("Yarn Ball", cat.getFavoriteToy());
    }

    @Test
    public void testCatToString() {
        Cat cat = new Cat("Luna", 5, "Laser Pointer");
        String expected = "Meow! Hello! My name is Luna";
        assertEquals(expected, cat.toString());
    }

    // --- Dog Tests ---
    @Test
    public void testDogConstructorAndGetters() {
        Dog dog = new Dog("Rex", 3, "Alice");

        assertEquals("Rex", dog.getName());
        assertEquals(3, dog.getAge());
        assertEquals("Alice", dog.getOwnerName());
    }

    @Test
    public void testDogToString() {
        Dog dog = new Dog("Buddy", 2, "John");
        String expected = "Woof! Sup! I'm Buddy, and my favorite hooman is John!";
        assertEquals(expected, dog.toString());
    }

    // --- Equals Tests ---
    @Test
    public void testCatEquals() {
        Cat cat1 = new Cat("Luna", 3, "Laser");
        Cat cat2 = new Cat("Luna", 3, "Laser");
        Cat cat3 = new Cat("Luna", 3, "Feather");
        Cat cat4 = new Cat("Whiskers", 3, "Laser");

        assertEquals(cat1, cat2);  // same name, age, toy
        assertNotEquals(cat1, cat3);  // different toy
        assertNotEquals(cat1, cat4);  // different name
    }

    @Test
    public void testDogEquals() {
        Dog dog1 = new Dog("Buddy", 4, "Alice");
        Dog dog2 = new Dog("Buddy", 4, "Alice");
        Dog dog3 = new Dog("Buddy", 4, "John");
        Dog dog4 = new Dog("Max", 4, "Alice");

        assertEquals(dog1, dog2);
        assertNotEquals(dog1, dog3);
        assertNotEquals(dog1, dog4);
    }

    @Test
    public void testRabbitEquals() {
        Rabbit r1 = new Rabbit("Snowball", 2, "White");
        Rabbit r2 = new Rabbit("Snowball", 2, "White");
        Rabbit r3 = new Rabbit("Snowball", 2, "Black");
        Rabbit r4 = new Rabbit("BunBun", 2, "White");

        assertEquals(r1, r2);
        assertNotEquals(r1, r3);
        assertNotEquals(r1, r4);
    }

}
