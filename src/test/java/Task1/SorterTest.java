package Task1;

import Task1.Pets.Cat;
import Task1.Pets.Dog;
import Task1.Pets.Pet;
import Task1.Pets.Rabbit;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SorterTest {

    @Test
    public void testAllNulls() {
        ElasticArray<Pet> pets = new ElasticArray<>();

        pets.write(0, null);
        pets.write(1, null);
        pets.write(2, null);

        Sorter.SortByAge(pets);

        assertNull(pets.read(0));
        assertNull(pets.read(1));
        assertNull(pets.read(2));
    }

    @Test
    public void testSortByAgeWithNullGaps() {
        Pet p1 = new Cat("Whiskers", 4, "Yarn Ball");
        Pet p2 = new Dog("Buddy", 2, "Alice");
        Pet p4 = new Rabbit("Thumper", 3, "Brown");
        Pet p6 = new Cat("Milo", 1, "Laser");

        ElasticArray<Pet> pets = new ElasticArray<>();
        pets.write(0, p1);
        pets.write(1, p2);
        pets.write(2, null);
        pets.write(3, p4);
        pets.write(4, null);
        pets.write(5, p6);

        Sorter.SortByAge(pets);

        assertEquals(p6, pets.read(0));  // Milo, age 1
        assertEquals(p2, pets.read(1));  // Buddy, age 2
        assertNull(pets.read(2));
        assertEquals(p4, pets.read(3));  // Thumper, age 3
        assertNull(pets.read(4));
        assertEquals(p1, pets.read(5));  // Whiskers, age 4
    }

    @Test
    public void testNullsAtBeginning() {
        Pet p2 = new Dog("Max", 3, "Owner1");
        Pet p3 = new Rabbit("Bun", 1, "White");
        Pet p4 = new Cat("Kit", 2, "String");

        ElasticArray<Pet> pets = new ElasticArray<>();
        pets.write(0, null);
        pets.write(1, null);
        pets.write(2, p2);
        pets.write(3, p3);
        pets.write(4, p4);

        Sorter.SortByAge(pets);

        assertNull(pets.read(0));
        assertNull(pets.read(1));
        assertEquals(p3, pets.read(2));  // Bun, age 1
        assertEquals(p4, pets.read(3));  // Kit, age 2
        assertEquals(p2, pets.read(4));  // Max, age 3
    }

    @Test
    public void testNullsAtEnd() {
        Pet p0 = new Cat("Luna", 5, "Laser");
        Pet p1 = new Dog("Rocky", 1, "Bob");
        Pet p2 = new Rabbit("Snow", 3, "Gray");

        ElasticArray<Pet> pets = new ElasticArray<>();
        pets.write(0, p0);
        pets.write(1, p1);
        pets.write(2, p2);
        pets.write(3, null);
        pets.write(4, null);

        Sorter.SortByAge(pets);

        assertEquals(p1, pets.read(0));  // Rocky, age 1
        assertEquals(p2, pets.read(1));  // Snow, age 3
        assertEquals(p0, pets.read(2));  // Luna, age 5
        assertNull(pets.read(3));
        assertNull(pets.read(4));
    }

    @Test
    public void testNoNulls() {
        Pet p0 = new Dog("Chase", 4, "OwnerA");
        Pet p1 = new Rabbit("Coco", 2, "Brown");
        Pet p2 = new Cat("Zoe", 1, "Feather");
        Pet p3 = new Dog("Bolt", 3, "Tom");

        ElasticArray<Pet> pets = new ElasticArray<>();
        pets.write(0, p0);
        pets.write(1, p1);
        pets.write(2, p2);
        pets.write(3, p3);

        Sorter.SortByAge(pets);

        assertEquals(p2, pets.read(0));  // Zoe, age 1
        assertEquals(p1, pets.read(1));  // Coco, age 2
        assertEquals(p3, pets.read(2));  // Bolt, age 3
        assertEquals(p0, pets.read(3));  // Chase, age 4
    }

    @Test
    public void testDuplicateAges() {
        Pet p0 = new Cat("Alpha", 2, "Bell");
        Pet p1 = new Dog("Bravo", 1, "Alex");
        Pet p2 = new Rabbit("Charlie", 2, "White");
        Pet p3 = new Cat("Delta", 1, "Toy");

        ElasticArray<Pet> pets = new ElasticArray<>();
        pets.write(0, p0);
        pets.write(1, p1);
        pets.write(2, p2);
        pets.write(3, p3);

        Sorter.SortByAge(pets);

        assertEquals(p1, pets.read(0));  // Bravo, age 1
        assertEquals(p3, pets.read(1));  // Delta, age 1
        assertEquals(p0, pets.read(2));  // Alpha, age 2
        assertEquals(p2, pets.read(3));  // Charlie, age 2
    }

    @Test
    public void testAllSameAges() {
        Pet p0 = new Cat("Echo", 3, "String");
        Pet p1 = new Dog("Foxtrot", 3, "Amy");
        Pet p2 = new Rabbit("Golf", 3, "Black");

        ElasticArray<Pet> pets = new ElasticArray<>();
        pets.write(0, p0);
        pets.write(1, p1);
        pets.write(2, p2);

        Sorter.SortByAge(pets);

        assertEquals(p0, pets.read(0));
        assertEquals(p1, pets.read(1));
        assertEquals(p2, pets.read(2));
    }

    @Test
    public void testSortByPetTypeWithShuffledOrderAndMoreNulls() {
        Cat cat1 = new Cat("C1", 2, "Toy1");
        Cat cat2 = new Cat("C2", 3, "Toy2");
        Cat cat3 = new Cat("C3", 3, "Toy3");
        Dog dog1 = new Dog("D1", 4, "OwnerA");
        Dog dog2 = new Dog("D2", 5, "OwnerB");
        Rabbit rabbit1 = new Rabbit("R1", 6, "White");
        Rabbit rabbit2 = new Rabbit("R2", 7, "Gray");

        ElasticArray<Pet> pets = new ElasticArray<>();
        pets.write(0, null);
        pets.write(1, dog1);
        pets.write(2, cat3);
        pets.write(3, null);      // newly added null
        pets.write(4, null);
        pets.write(5, cat1);
        pets.write(6, dog2);
        pets.write(7, rabbit1);
        pets.write(8, cat2);
        pets.write(9, null);

        Sorter.sortByPetTypeAsCatDogRabbit(pets);

        // Prepare expected groups
        List<Cat> cats = Arrays.asList(cat1, cat2, cat3);
        List<Dog> dogs = Arrays.asList(dog1, dog2);
        List<Rabbit> rabbits = Arrays.asList(rabbit1, rabbit2);

        // Validate nulls are preserved at indices 0, 3, 4, and 9
        assertNull(pets.read(0));
        assertNull(pets.read(3));
        assertNull(pets.read(4));
        assertNull(pets.read(9));

        // Validate cat group (should be in indexes 1, 2, 5)
        assertTrue(pets.read(1) instanceof Cat && listContains(cats, pets.read(1)));
        assertTrue(pets.read(2) instanceof Cat && listContains(cats, pets.read(2)));
        assertTrue(pets.read(5) instanceof Cat && listContains(cats, pets.read(5)));

        // Validate dog group (should be in indexes 6, 7)
        assertTrue(pets.read(6) instanceof Dog && listContains(dogs, pets.read(6)));
        assertTrue(pets.read(7) instanceof Dog && listContains(dogs, (Dog) pets.read(7)));

        // Validate rabbit group (should be in index 8)
        assertTrue(pets.read(8) instanceof Rabbit && listContains(rabbits, pets.read(8)));
    }

    @Test
    public void testSortByPetTypeAlreadySortedWithNulls() {
        Cat cat1 = new Cat("C1", 2, "Toy1");
        Cat cat2 = new Cat("C2", 3, "Toy2");
        Cat cat3 = new Cat("C3", 3, "Toy3");
        Dog dog1 = new Dog("D1", 4, "OwnerA");
        Dog dog2 = new Dog("D2", 5, "OwnerB");
        Rabbit rabbit1 = new Rabbit("R1", 6, "White");
        Rabbit rabbit2 = new Rabbit("R2", 7, "Gray");

        ElasticArray<Pet> pets = new ElasticArray<>();
        pets.write(0, null);
        pets.write(1, cat1);
        pets.write(2, cat2);
        pets.write(3, null);
        pets.write(4, cat3);
        pets.write(5, dog1);
        pets.write(6, dog2);
        pets.write(7, rabbit1);
        pets.write(8, rabbit2);
        pets.write(9, null);

        Sorter.sortByPetTypeAsCatDogRabbit(pets);

        // Prepare expected groups
        List<Cat> cats = Arrays.asList(cat1, cat2, cat3);
        List<Dog> dogs = Arrays.asList(dog1, dog2);
        List<Rabbit> rabbits = Arrays.asList(rabbit1, rabbit2);

        // Validate nulls at fixed positions
        assertNull(pets.read(0));
        assertNull(pets.read(3));
        assertNull(pets.read(9));

        // Validate cats at 1, 2, 4
        assertTrue(pets.read(1) instanceof Cat && listContains(cats, pets.read(1)));
        assertTrue(pets.read(2) instanceof Cat && listContains(cats, pets.read(2)));
        assertTrue(pets.read(4) instanceof Cat && listContains(cats, pets.read(4)));

        // Validate dogs at 5, 6
        assertTrue(pets.read(5) instanceof Dog && listContains(dogs, pets.read(5)));
        assertTrue(pets.read(6) instanceof Dog && listContains(dogs, pets.read(6)));

        // Validate rabbits at 7, 8
        assertTrue(pets.read(7) instanceof Rabbit && listContains(rabbits, pets.read(7)));
        assertTrue(pets.read(8) instanceof Rabbit && listContains(rabbits, pets.read(8)));
    }

    private static boolean listContains(List<? extends Pet> list, Pet pet) {
        for (Pet p : list) {
            if (p == null || pet == null) continue;

            if (p.getClass() != pet.getClass()) continue;

            if (p instanceof Cat) {
                Cat c1 = (Cat) p;
                Cat c2 = (Cat) pet;
                if (c1.equals(c2)) return true;
            } else if (p instanceof Dog) {
                Dog d1 = (Dog) p;
                Dog d2 = (Dog) pet;
                if (d1.equals(d2)) return true;
            } else if (p instanceof Rabbit) {
                Rabbit r1 = (Rabbit) p;
                Rabbit r2 = (Rabbit) pet;
                if (r1.equals(r2)) return true;
            }
        }
        return false;
    }

    /*
        TODO: This test has a bug. Yes test can have bug too. Make a fix by making changes in the last line.
     */
    @Test
    public void testListContainsExactMatch() {
        Cat c1 = new Cat("Whiskers", 3, "Laser");
        Cat c2 = new Cat("Mittens", 4, "String");
        List<Cat> cats = Arrays.asList(c1, c2);

        assertTrue(listContains(cats, new Cat("Whiskers", 3, "Laser")));
        assertTrue(listContains(cats, new Cat("Whiskers", 3, "Feather"))); // different toy
    }

    @Test
    public void testListContainsDifferentTypes() {
        Dog d1 = new Dog("Buddy", 5, "Alice");
        Rabbit r1 = new Rabbit("Thumper", 2, "White");

        List<Pet> mixed = Arrays.asList(d1, r1);

        assertTrue(listContains(mixed, new Dog("Buddy", 5, "Alice")));
        assertTrue(listContains(mixed, new Rabbit("Thumper", 2, "White")));
        assertFalse(listContains(mixed, new Cat("Buddy", 5, "Alice"))); // wrong type
    }

    @Test
    public void testListContainsNull() {
        Dog d1 = new Dog("Max", 6, "OwnerA");
        List<Dog> dogs = Arrays.asList(d1);

        assertFalse(listContains(dogs, null));
        assertFalse(listContains(Arrays.asList((Dog) null), new Dog("Max", 6, "OwnerA")));
    }

    @Test
    public void testListContainsEmptyList() {
        List<Cat> empty = Arrays.asList();
        assertFalse(listContains(empty, new Cat("Cleo", 2, "Yarn")));
    }
}
