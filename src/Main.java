import java.util.*;

public class Main {
    public static void main(String[] args) {

        //tablica
        //musi mieć z góry określony rozmiar
        //nie można go później zmienić
        //elementem tablicy mogą byc typy proste i złożone
        //tablica 6 elementowa z wartościami losowym z zakresu 1,100
        int[] tablicaLosowych = new int[6];
        for (int i = 0; i < tablicaLosowych.length; i++) {
            tablicaLosowych[i] = (int) (Math.random() * 100 + 1);
        }
        //wypisywanie elementów tablicy
        for (int element : tablicaLosowych) {
            System.out.print(element + ", ");
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
        for (Integer liczbaWpisana : listaLiczbWpisanych) {
            System.out.println(liczbaWpisana);
        }
        //wypisywanie inaczej
        for (Integer liczbWpisanych : listaLiczbWpisanych) {
            System.out.println(liczbWpisanych);
        }

        //losowanie liczb bez powtórzeń
        ArrayList<Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int) (Math.random() * 100 + 1);
            while (listaLosowychBezPowtorzen.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }
        //wypisywanie
        System.out.println("wylosowane bez powtorzeń");
        System.out.println(listaLosowychBezPowtorzen);
//losowanie bez powtorzen do zbioru
        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();
        while (zbiorLiczbLosowych.size() < 6) {
            int liczba = (int) (Math.random() * 100 + 1);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println(zbiorLiczbLosowych);
        //lista
        /*
        elementy mogą sie powtarzać
        elementy są indeksowane
         */

        //zbior zazwyczaj
        /*
        elementy unikatowe
        elementy nie są indeksowane
         */

        LinkedList<Integer> trafione = new LinkedList<>();
        //trafiione to elementy które występują w wylosowanych i wpisanych
        for (Integer wpisana : listaLiczbWpisanych) {
            if (zbiorLiczbLosowych.contains(wpisana)) {
                trafione.add(wpisana);
            }
        }
        System.out.println("Trafione:" + trafione);
    }

    //metody

    /**
     * Metoda wylosujLiczby losuje liczby calkowite z zakresu 1 do 100
     * @param ile - liczba całkowita przechowująca ile liczb wylosujemy
     * @return lista z wylosowanymi liczbami
     */
    private static ArrayList<Integer> wylosujLiczby(int ile){
        ArrayList<Integer>listaLosowychBezPowtorzen =new ArrayList<>();
        for (int i = 0; i < ile; i++) {
            int liczba = (int)(Math.random()*100+1);
            while(listaLosowychBezPowtorzen.contains(liczba)){
                liczba= (int)(Math.random()*100+1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }
        return listaLosowychBezPowtorzen;
    }

    private static ArrayList<Integer> wpiszLiczbyZKlawiatury(int ile){
        ArrayList<Integer> listaLiczbWpisanych = new ArrayList<>();
        System.out.println("podaj "+ile+" liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < ile; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbWpisanych.add(liczba);
        }
        return listaLiczbWpisanych;
    }
    private static void wypiszKolekcję(List<Integer> listaDoWypisania){
        for (Integer element:listaDoWypisania) {
            System.out.println("Element:"+element);
        }
    }
    private static LinkedList<Integer> zwrocTrafione(ArrayList<Integer> listaLiczbWpisanych,
                                                     ArrayList<Integer>listaLiczbLosowych){
        LinkedList<Integer> trafione =new LinkedList<>();
        //trafiione to elementy które występują w wylosowanych i wpisanych
        for (Integer wpisana: listaLiczbWpisanych) {
            if(listaLiczbLosowych.contains(wpisana)){
                trafione.add(wpisana);
            }
        }
        return trafione;
    }

    public static void main(String[] args) {
        //losowanie liczby
        ArrayList<Integer> losowe = wylosujLiczby(6);
        System.out.println("wylosowana lista");
        wypiszKolekcję(losowe);
        ArrayList<Integer> wpisane = wpiszLiczbyZKlawiatury(6);
        wypiszKolekcję(wpisane);
        LinkedList<Integer> trafione = zwrocTrafione(losowe,wpisane);
        wypiszKolekcję(trafione);
    }
}
}//jebaqc fałdka

