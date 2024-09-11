import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //tablica
        //musi mieć z góry określony rozmiar
        //nie można go później zmienić
        //elementem tablicy mogą byc typy proste i złożone
        //tablica 6 elementowa z wartościami losowym z zakresu 1,100
        int [] tablicaLosowych = new int[6];
        for (int i = 0; i < tablicaLosowych.length; i++) {
            tablicaLosowych[i] = (int) (Math.random()*100+1);
        }
        //wypisywanie elementów tablicy
        for (int element:tablicaLosowych) {
            System.out.print(element+", ");
        }
        //kolekcje, elemnty typami złożonymi
        //nie muszą mieć zdefiniowanego rozmiaru
        //rozmiar w trakcie może zmieniać
        //listy List, zbiory Set, mapy

        //wstawianie liczb z klawiatury do kolekcji
        ArrayList<Integer> listaLiczbWpisanych = new ArrayList<>();
        System.out.println("podaj 6 liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbWpisanych.add(liczba);
        }
        System.out.println("Wstawiono liczby:");
        for (Integer liczbaWpisana:listaLiczbWpisanych) {
            System.out.println(liczbaWpisana);
        }
        //wypisywanie inaczej
        for (int i = 0; i < listaLiczbWpisanych.size(); i++) {
            System.out.println(listaLiczbWpisanych.get(i));
        }




    }
}
