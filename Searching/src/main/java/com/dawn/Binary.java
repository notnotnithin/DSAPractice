package com.dawn;

public class Binary {

    static void main() {
        int[] arr = { 10, 20, 30, 30, 30, 30, 40, 50, 60, 70, 70, 80, 90, 100 };
        int target = Integer.parseInt(IO.readln("Enter an integer: "));
        /*int index = search(arr, target);
        if (index == -1) {
            IO.println("Could not find the element!");
        } else {
            IO.println("Element found!");
        }


        int firstOccurrenceIndex = searchFirstOccurrenceWithDuplicates(arr, target);
        if (firstOccurrenceIndex == -1) {
            IO.println("Could not find the element!");
        } else {
            IO.println("Element found at index " + firstOccurrenceIndex);
        }

        int lastOccurrenceIndex = searchLastOccurrenceWithDuplicates(arr, target);
        if (lastOccurrenceIndex == -1) {
            IO.println("Could not find the element!");
        } else {
            IO.println("Element found at index " + lastOccurrenceIndex);
        }*/

        int count = searchTotalOccurrence(arr, target);
        IO.println("Element found " + count + " times!");

    }

    private static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int searchFirstOccurrenceWithDuplicates(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int mid;
        int result = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                result = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return result;
    }

    private static int searchLastOccurrenceWithDuplicates(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int mid;
        int result = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                result = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return result;
    }

    private static int searchTotalOccurrence(int[] arr, int target) {
        int firstOccurrence = searchFirstOccurrenceWithDuplicates(arr, target);
        int lastOccurrence = searchLastOccurrenceWithDuplicates(arr, target);

        return (lastOccurrence == -1 && firstOccurrence == -1) ? 0 : (lastOccurrence - firstOccurrence + 1);
    }
}
