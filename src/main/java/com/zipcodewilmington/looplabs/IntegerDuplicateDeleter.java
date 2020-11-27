package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    private ArrayUtilities<Integer> arrayUtilities;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.arrayUtilities = new ArrayUtilities<>(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return arrayUtilities.removeDuplicates(super.array, maxNumberOfDuplications);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return arrayUtilities.removeDuplicatesExactly(super.array, exactNumberOfDuplications);
    }
}
