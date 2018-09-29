package homework.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTask {

    public static void main(String[] args) {

//  a) Stwórz listę obiektów typu Person.
        List<Person> personList = new ArrayList<>();

//  b) Dodaj do listy następujące obiekty typu Person: "Jan", 20 lat; "Adam", 35 lat; "Zofia", 41 lat; "Jan", 24 lata.
        Person person1 = new Person("Jan", 20);
        Person person2 = new Person("Adam", 35);
        Person person3 = new Person("Zofia", 41);
        Person person4 = new Person("Jan", 24);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

//  c) Wypisz rozmiar listy.
        System.out.println("Wielkość listy : " + personList.size());

//  d) Wypisz kolejne elementy listy. (przypominam o implementacji toString w klasie Person)
//        System.out.println(arrayList.toString());
            for(Person person: personList){
                System.out.println(person);
            }

//  e) Sprawdź czy lista zawiera osobę o imieniu "Jan" i wieku 20 lat. (przypominam o implementacji equals i hashCode w klasie Person)
        System.out.println("Czy w liście znajduje się osoba o imieniu Jan i ma 20 lat : " + personList.contains(new Person("Jan", 20)));

//  f) Wypisz indeks, pod którym znajduje się osoba o imieniu "Zofia" i wieku 41 lat.
        System.out.println("Index w liście osoby Zofia, 41 lat to : " + personList.indexOf(new Person("Zofia", 41)));

//  g) Posortuj listę. Obiekty powinny być sortowane wg imienia. Jeśli imię jest takie samo, to o pozycji na liście powinien decydować wiek. (przypominam o interfejsie Comparable. I nie wystarczy "class Person implements Comparable". Do Comparable trzeba dodać typ generyczny - "class Person impements Comparable<Person>")
        Collections.sort(personList);
        for(Person person: personList){
            System.out.println(person);
        }

//  h) Usuń z listy osobęo imieniu "Adam" i wieku 35 lat.
        System.out.println("Usuń osobę o imieniu Adam i wieku 35 lat : " + personList.remove(new Person("Adam", 35)));

//  i) Wydrukuj informację czy lista jest pusta, wypisz rozmiar listy i jej kolejne elementy.
        System.out.println("Czy lista jest pust : " + personList.isEmpty());
        System.out.println("Lista ma długość : " + personList.size());
        for(Person person: personList){
            System.out.println(person);
        }

//  Zadanie dodatkowe: czy potrafisz utworzyć listę obiektów typu Person bezpośrednio z tablicy obiektów typu Person?
//  Nie wiedziałem jak to zrobić

        personList = Arrays.asList(new Person("Jan", 20), new Person("Adam", 35));

    }
}
