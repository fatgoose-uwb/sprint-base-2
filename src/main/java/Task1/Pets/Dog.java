package Task1.Pets;

import lombok.Getter;

import java.util.Objects;

public class Dog extends Pet {
    @Getter
    private String ownerName;

    /*
        TODO: fix the bug in this function. Use the unit tests to understand how this function is supposed to work.
     */
    public Dog(String name, int age, String ownerName) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Woof! Sup! I'm " + name + ", and my favorite hooman is " + ownerName + "!";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) return false;
        Dog dog = (Dog) object;
        return super.equals(object) && Objects.equals(ownerName, dog.ownerName);
    }
}
