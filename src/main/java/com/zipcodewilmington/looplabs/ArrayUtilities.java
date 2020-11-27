package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;

public class ArrayUtilities<T> {

    private T[] content;

    public ArrayUtilities(T[] content) {
        this.content = content;
    }


    /**
     * @param arr is the array being evaluated
     * @param value is the value that needs to be removed
     * @return arr2 which doesn't contain the value
     */
    public T[] removeDuplicates(T[] arr, T value) {
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
     * this is a helper method that helps determine the length of arr2 in the removeDuplicates() method above
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

}
