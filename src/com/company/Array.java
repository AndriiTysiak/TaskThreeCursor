package com.company;

import java.util.Arrays;
import java.util.Random;

public class Array {
    private int array[];

    public Array(int[] array) {
        this.array = array;
    }

    public void evenNumbers() {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        System.out.println("Масив з парних чисел:\n" + Arrays.toString(array) + "\n");
    }

    public void randomNumbers() {
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            count = random.nextInt(100);
            array[i] = count;
        }
        System.out.println("Масив з рандомних чисел чисел:\n" + Arrays.toString(array));
    }

    public void avarageNumber() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Середнє значення масиву arrayOne:\n" + sum / array.length + "\n");
    }

    public void sumOfThree() {
        int sumMultipleOfThree = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                sumMultipleOfThree += i;
            }
        }
        System.out.println("Сума числел кратна трьом:\n" + sumMultipleOfThree + "\n");
    }

    public void evenIndex() {
        for (int i = 0; i < array.length; i += 2) {
            System.out.println("Порядковий номер:  " + i + "\nЗначеняня:  " + array[i]);
        }
    }

    public void sortArray() {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        System.out.println("\nПосортований масив: " + Arrays.toString(array));
    }

    public void minNumberOfArray() {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("\nНайменше значення маcиву :" + min);
    }

    public void maxNumberOfArray() {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("\nНайменше значення маcиву :" + max);
    }

    public void sumEvenOfArray() {
        int sumOfArray = 0;
        for (int i = 0; i < array.length; i += 2) {
            sumOfArray += array[i];
        }
        System.out.println("\nСума значень парних індексів:" + sumOfArray);

    }

    public void asciiTable() {
        char[] arrayAscii = new char[20];
        for (int i = 0; i < arrayAscii.length; i++) {
            arrayAscii[i] = (char) (i + 97);
        }
        System.out.println("\nCимволи ASCII(97-116): " + Arrays.toString(arrayAscii));
    }
}
