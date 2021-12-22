package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arrayOne = new int[30];
        Array array = new Array(arrayOne);
        array.evenNumbers(); // Заповнення масиву парними числами
        array.randomNumbers(); // Заповнення масиву рандомними числами
        array.avarageNumber(); // Середнє значення рандомного масив
        array.sumOfThree(); // Сума чисел кратна трьом  масив чиел рандомного масиву
        array.evenIndex(); // Вивід тільки парних індексів
        array.sortArray(); // сортування масиву
        array.minNumberOfArray(); // найменше значення масиву
        array.maxNumberOfArray(); // найбільше значення масиву
        array.sumEvenOfArray(); // сума значень парних індексів
        array.asciiTable(); // таблиця ASCII
    }
}
