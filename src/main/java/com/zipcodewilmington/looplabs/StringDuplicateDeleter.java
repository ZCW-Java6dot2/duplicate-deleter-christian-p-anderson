package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    private ArrayUtilities<String> arrayUtilities;

    public StringDuplicateDeleter (String[] strArray) {
        super(strArray);
        this.arrayUtilities = new ArrayUtilities<>(strArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return arrayUtilities.removeDuplicates(super.array, maxNumberOfDuplications);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return arrayUtilities.removeDuplicatesExactly(super.array, exactNumberOfDuplications);
    }
}
