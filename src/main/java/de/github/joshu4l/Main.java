package de.github.joshu4l;

/*
    Schritt 1: Filtert eine Liste von Zahlen und gebt nur die geraden Zahlen aus.

    Schritt 2: Verwendet 'map' und verdoppelt jede Zahl in der Liste.

    Schritt 3: Sortiert die Liste in aufsteigender Reihenfolge.

    Schritt 4: Führt eine 'reduce'-Operation durch, um die Summe aller Zahlen in der Liste zu berechnen.

    Schritt 5: Nutzt 'forEach' und gebt jede verarbeitete Zahl aus.

    Schritt 6: Sammelt die verarbeiteten Zahlen in einer neuen Liste mit 'collect'.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        // Create an ArrayList of Integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(17);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(4);
        numbers.add(11);
        numbers.add(15);
        numbers.add(14);
        numbers.add(12);


        // Example usage of: .filter
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println(evenNumbers);

        // Example usage of: .map
        List<Blabla> listOfBlaObjects = numbers.stream()
                .map(Blabla::new)
                .toList();
        System.out.println(listOfBlaObjects);

        // Example usage of: .sorted
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        System.out.println(sortedNumbers);

        // Example usage of: .reduce
        int sumOfNumbersList = numbers.stream()
                .reduce(0, (element, anotherElement) -> element + anotherElement);
        System.out.println(sumOfNumbersList);

        // Example usage of: .distinct and .forEach
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // Example usage of: .collect
        List<Integer> newList = numbers.stream().collect(Collectors.toList());
        System.out.println(newList);


    }

}