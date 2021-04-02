package Task1.Pets;

import lombok.Getter;

import java.util.Objects;

public class Cat extends Pet {
    @Getter
    private String favoriteToy; // TODO: write in a comment explaining where the getter function of this variable is

    public Cat(String name, int age, String favoriteToy) {
        super(name, age); // TODO: write in a comment explaining what super(...) does
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String toString() {
        return "Meow! Hello! My name is " + name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) return false;
        Cat cat = (Cat) object;
        return super.equals(object) && Objects.equals(favoriteToy, cat.favoriteToy);
    }
}
