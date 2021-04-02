package Task1.Pets;

import lombok.Getter;

import java.util.Objects;

public class Rabbit extends Pet {
    @Getter
    private String furColor;

    public Rabbit(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    /*
        TODO: fix the bug in this function.
          Use the unit tests to understand how this function is supposed to work.
     */
    @Override
    public String toString() {
        return "Yooo! Name’s " + name + ". Fear the fluff!";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Rabbit rabbit = (Rabbit) object;
        return super.equals(object) && Objects.equals(furColor, rabbit.furColor);
    }
}