package com.additionaltasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    private final String word;

    public Stream(final String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    //1
    public String getReverseWord(String givenWord) {

        String[] tab = new String[givenWord.length()];

        for (int i = 0; i < givenWord.length(); i++) {
            tab[i] = givenWord.substring(i, i + 1);
        }
        String resultWord = "";
        for (int j = givenWord.length() - 1; j >= 0; j--) {
            resultWord = resultWord + tab[j];
        }
        System.out.println("resultWord= " + resultWord);

        return resultWord;
    }

    //2
    public int checkIfGivenTextIsNumber(String givenText) throws MessageNumberException {

            int sum = 0;
        try {
            for (int i = 0; i < givenText.length(); i++) {
                sum += Integer.parseInt(givenText.substring(i, i + 1));
            }
            System.out.println("Sum of digits "+ sum);

        } catch (NumberFormatException e) {
            System.out.println("Issue with NumberFormatException during calculate sum!!!");
        }
        return sum;
    }

    //JAVA8
    private static List<String>  getWords() {
        List<String> words = Arrays.asList("hi", "hello", "bye", "kodilla", "bootcamp", "holiday");
        return words;
    }

        public static void main(String[] args) {

            System.out.println("task1#");

            getWords().stream()
                        .forEach(s -> System.out.println("  " + s));


            System.out.println();
            System.out.println("task2#");

            String alphabet = "ABCDEFGHIJKLMNOPRSTQWUYZ";

            for (int i = 0; i < alphabet.length(); i++) {
                 alphabet.substring(i, i + 1);

                Stream stream = new Stream(alphabet.substring(i, i + 1));

                if (!stream.getWord().equals("Q")) {
                    List<String> theResultList2 = getWords().stream()
                            .map(String::toUpperCase)
                            .filter(s -> s.length() < 4)
                            .filter(s -> s.contains(stream.getWord()))
                            .map(s -> s.substring(0, 1))
                            .collect(Collectors.toList());

                    theResultList2.stream()
                            .forEach(System.out::println);
                } else
                {/// tu chyba nie zrozmialem autora:-) z tym Q....
                }
            }

            System.out.println();
            System.out.println("task3#");

            //tu nie mam pojecia jak zrobic z tablica

            System.out.println();
            System.out.println("task4#");

            String single = getWords().stream()
                    .collect(Collectors.joining());

            System.out.println(single.toUpperCase());

            System.out.println();
            System.out.println("task5#");

            String singleMap = getWords().stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.joining());
            System.out.println(singleMap);

            System.out.println();
            System.out.println("task6#");

            //Znajdź całkowitą liczbę znaków we wszystkich słowach w Liście.
            String theResultList6 = getWords().stream()
                    .collect(Collectors.joining());

            System.out.println("# All elements: " + theResultList6.length());

            System.out.println();
            System.out.println("task7#");

//            Znajdź liczę elementów w liście, które zawierają literkę „e”.
            List<String> theResultList7 =  getWords().stream()
                    .filter(s -> s.contains("e"))
                    .collect(Collectors.toList());

                        System.out.println("# All elements with e: " + theResultList7.size());


        }
}
