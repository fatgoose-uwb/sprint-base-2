package Task1;

import Task1.Pets.Cat;
import Task1.Pets.Dog;
import Task1.Pets.Pet;
import Task1.Pets.Rabbit;

public class Sorter {

    /**
     * Important Requirement:
     *   DO NOT USE any primitive array [] or List such as ArrayList.
     *   This sort is to be done in O(n) complexity.
     *   Our code can only make up to 2 passes through the given ElasticArray.
     *   Do not use any existing sort functions anywhere because they make more than 2 passes.
     *   Check with the teacher if not sure. 0 point for violation.
     * <p>
     * Sorts the ElasticArray of Pet objects so that all Cats appear first,
     * followed by Dogs, then Rabbits. Do not move or overwrite null entries.
     * <p>
     * The sort must be done by rearranging existing elements inside the array
     * using only read() and write(). Do not copy pets into a new array or use lists.
     * You may use another ElasticArray to help keep track of indices, but all pet movement
     * must happen within the original ElasticArray.
     * <p>
     * Example:
     * Input (by type):   [Cat, null, Dog, Rabbit, Cat, null, Dog]
     * Output (by type):  [Cat, null, Cat, Dog, Dog, null, Rabbit]
     * <p>
     * Only the order of non-null elements is changed; nulls remain in place.
     */
    public static void sortByPetTypeAsCatDogRabbit(ElasticArray<Pet> pets) {
        // TODO: implement this function
        //  Hint: This is a disguised Dutch Flag problem.
    }

    /**
     * Important Requirement:
     *   DO NOT USE any primitive array [] or List such as ArrayList.
     *   Check with the teacher if not sure. 0 point for violation.
     * <p>
     * Sorts the ElasticArray of Pet objects in increasing order of their age based on how bubble sort works.
     * Do not move or overwrite null entries.
     * <p>
     * The sort must be done by rearranging existing elements inside the array
     * using only read() and write(). Do not copy pets into a new array or use lists.
     * You may use another ElasticArray to help keep track of indices, but all pet movement
     * must happen within the original ElasticArray.
     * <p>
     * Example:
     * Input (by age):   [Cat(3), null, Dog(1), Rabbit(2), Cat(5), null]
     * Output (by age):  [Dog(1), null, Rabbit(2), Cat(3), Cat(5), null]
     * <p>
     * Only the order of non-null elements is changed; nulls remain in place.
     */
    public static void SortByAge(ElasticArray<Pet> pets) {
        // TODO: implement this function
        //  Hint: To make it easy to track nulls, use another ElasticArray<Integer> to
        //  store the indices of non-null values
    }

    // TODO: OK to add helper function in this class such as swap.
    //  Important Requirement:
    //   DO NOT USE any primitive array [] or List such as ArrayList anywhere in this file.
    //   Check with the teacher if not sure. 0 point for violation.
}
