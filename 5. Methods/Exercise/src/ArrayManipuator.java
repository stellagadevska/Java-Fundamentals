import java.util.*;

public class ArrayManipuator {
    //•	min even/odd – returns the INDEX of the min even/odd element -> [1, 4, 8, 2, 3] -> min even > print 3

    //o	If there are two or more equal min/max elements, return the index of the rightmost one.
    //o	If a min/max even/odd element cannot be found, print "No matches".
    //•	first {count} even/odd– returns the first {count} elements -> [1, 8, 2, 3] -> first 2 even -> print [8, 2]
    //•	last {count} even/odd – returns the last {count} elements -> [1, 8, 2, 3] -> last 2 odd -> print [1, 3]
    //o	If the count is greater than the array length, print "Invalid count".
    //o	If there are not enough elements to satisfy the count, print as many as you can. If there are zero even/odd elements, print an empty array "[]".
    //•	end – stop taking input and print the final state of the array.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(tokens[1]);
                    if (index < 0 || index > numbers.length) {
                        System.out.println("Invalid index");
                    } else {
                        exchange(numbers, index);
                    }
                    break;
                case "max": {
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        findMaxEven(numbers);
                    } else {
                        findMaxOdd(numbers);
                    }
                    break;
                }
                case "min": {
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        findMinEven(numbers);
                    } else {
                        findMinOdd(numbers);
                    }
                    break;
                }
                case "first": {
                    int count = Integer.parseInt(tokens[1]);
                    String evenOrOdd = tokens[2];
                    if (count > numbers.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (evenOrOdd.equals("even")) {
                            if (countEven(numbers) == 0) {
                                System.out.println("[]");
                            } else {
                                findFirstCountEven(numbers, count);
                            }
                        } else {
                            if (countOdd(numbers) == 0) {
                                System.out.println("[]");
                            } else {
                                findFirstCountOdd(numbers, count);
                            }
                        }
                    }
                    break;
                }
                case "last": {
                    int count = Integer.parseInt(tokens[1]);
                    String evenOrOdd = tokens[2];

                    if (count > numbers.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (evenOrOdd.equals("even")) {
                            if (countEven(numbers) == 0) {
                                System.out.println("[]");
                            } else {
                                findLastCountEven(numbers, count);
                            }
                        } else {
                            if (countOdd(numbers) == 0) {
                                System.out.println("[]");
                            } else {
                                findLastCountOdd(numbers, count);
                            }
                        }
                    }
                    break;
                }
            }
            input = scanner.nextLine();
        }

        printArray(numbers);
    }

    // ------------------ EXCHANGE ------------------------

    public static void exchange(int[] array, int index) {
        if (index != array.length - 1) {

            int[] temp = copyArray(array);
            int count = 0;

            for (int i = index + 1; i < temp.length; i++) {
                array[count] = temp[i];
                count++;
            }

            for (int i = 0; i <= index; i++) {
                array[count] = temp[i];
                count++;
            }
        }
    }

    public static int[] copyArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        return newArray;
    }

    // ------------------ MAX ------------------------

    private static void findMaxEven(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && max <= array[i]) {
                max = array[i];
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findMaxOdd(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && max <= array[i]) {
                max = array[i];
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    // ------------------ MIN ------------------------

    private static void findMinEven(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && min >= array[i]) {
                min = array[i];
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findMinOdd(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && min >= array[i]) {
                min = array[i];
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    // ------------------ FIRST -----------------------

    private static void findFirstCountEven(int[] array, int count) {
        List<Integer> evenElements = new ArrayList<>();

        for (int value : array) {
            if (value % 2 == 0) {
                evenElements.add(value);
            }
        }

        int[] evenCount = new int[count];
        if (evenElements.size() < count) {
            evenCount = new int[evenElements.size()];
        }
        for (int i = 0; i < evenCount.length; i++) {
            evenCount[i] = evenElements.get(i);
        }

        printArray(evenCount);
    }

    private static void findFirstCountOdd(int[] array, int count) {
        List<Integer> oddElements = new ArrayList<>();

        for (int value : array) {
            if (value % 2 != 0) {
                oddElements.add(value);
            }
        }

        int[] oddCount = new int[count];
        if (oddElements.size() < count) {
            oddCount = new int[oddElements.size()];
        }
        for (int i = 0; i < oddCount.length; i++) {
            oddCount[i] = oddElements.get(i);
        }

        printArray(oddCount);
    }

    // ------------------ LAST -----------------------

    private static void findLastCountEven(int[] array, int count) {
        List<Integer> evenElements = new ArrayList<>();

        for (int value : array) {
            if (value % 2 == 0) {
                evenElements.add(value);
            }
        }

        Collections.reverse(evenElements);

        int[] evenCount = new int[count];
        if (evenElements.size() < count) {
            evenCount = new int[evenElements.size()];
        }

        for (int i = 0; i < evenCount.length; i++) {
            evenCount[i] = evenElements.get(i);
        }

        printArray(evenCount);
    }

    private static void findLastCountOdd(int[] array, int count) {
        List<Integer> oddElements = new ArrayList<>();

        for (int value : array) {
            if (value % 2 != 0) {
                oddElements.add(value);
            }
        }

        Collections.reverse(oddElements);

        int[] oddCount = new int[oddElements.size()];
        for (int i = 0; i < oddCount.length; i++) {
            oddCount[i] = oddElements.get(i);
        }

        printArray(oddCount);
    }

    // PRINT ARRAY
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    // COUNT EVEN
    private static int countEven(int[] numbers) {
        int countEven = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    // COUNT EVEN
    private static int countOdd(int[] numbers) {
        int countOdd = 0;
        for (int i : numbers) {
            if (i % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }
}
