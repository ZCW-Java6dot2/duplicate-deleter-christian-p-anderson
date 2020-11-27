package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilities<T> {

    private T[] content;

    public ArrayUtilities(T[] content) {
        this.content = content;
    }

    /**
     * helper method
     * @param arr is the array being evaluated
     * @param value is the value that needs to be removed
     * @return arr2 which doesn't contain the value
     */
    public T[] removeDuplicatesHelper(T[] arr, T value) {
        int countOfValue = countValues(arr, value);

        int index = 0;

        // create a new array based on the specified component type and length
        T[] arr2 = (T[]) Array.newInstance(content.getClass().getComponentType(), arr.length - countOfValue);

        for (T element : arr) {
            if(!element.equals(value)) {
                arr2[index++] = element;
            }
        }

        return arr2;
    }

    /**
     * this is a helper method that helps determine the length of arr2 in the removeDuplicates() method above and also used in the methods below
     * @param arr is the array to be evaluated
     * @param value is the value needs to be counted
     * @return how many times the value of type T occurs in the array
     */
    public int countValues(T[] arr, T value) {
        int countOfValue = 0;

        for (T element : arr) {
            if (element.equals(value)) {
                countOfValue++;
            }
        }
        return countOfValue;
    }

    /**
     * remove all values in arr which occur exactly the specified number of times
     * @param arr
     * @param exactNumOfDuplicationsToRemove
     * @return arr2
     */
    public T[] removeDuplicatesExactly(T[] arr, int exactNumOfDuplicationsToRemove) {
        T[] arr2 = Arrays.copyOf(arr, arr.length);
        for (T element : arr2) {
            if((countValues(arr2, element) == exactNumOfDuplicationsToRemove)) {
                arr2 = removeDuplicatesHelper(arr2, element);
            }
        }
        return arr2;
    }

    /**
     * remove all values in arr which occur at a very minimum number of times
     * @param arr
     * @param maxNumOfDuplications
     * @return
     */
    public T[] removeDuplicates(T[] arr, int maxNumOfDuplications) {
        T[] arr2 = Arrays.copyOf(arr, arr.length);
        for (T element : arr2) {
            if ((countValues(arr2, element) >= maxNumOfDuplications)) {
                arr2 = removeDuplicatesHelper(arr2, element);
            }
        }
        return arr2;
    }

}
