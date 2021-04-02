package Task1.Pets;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@AllArgsConstructor
public class Pet {
    @Getter
    protected String name;  // TODO: Why protected instead of public or private? Write your answer in a comment.

    @Getter
    protected int age;

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Pet pet = (Pet) object;
        return age == pet.age && Objects.equals(name, pet.name);
    }

    // TODO: Does this class have a constructor taking name and age? write in a comment with your answer
}
