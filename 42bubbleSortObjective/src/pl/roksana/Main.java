//Program sorts elements of array using bubble sort algorithm
package pl.roksana;

public class Main {

    public static void main(String[] args) {

        Array array = new Array();
        BubbleSort bSort = new BubbleSort();
        int[] messyNumbers = array.createArray();
        bSort.displaySortedNumbers(bSort.sort(messyNumbers));
    }
}
