import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    private static ArrayList<Integer> wylosowane = new ArrayList<>();
    private ArrayList<Integer> wpisana;
    private LinkedList<Integer>trafiona ;

    private void wylosujLiczby(int ile){
        while (wylosowane.size()<ile){
            int liczba = (int)(Math.random()*100+1);
            while(wylosowane.contains(liczba)){
                liczba= (int)(Math.random()*100+1);
            }
            wylosowane.add(liczba);
        }

    }
    private void wpiszLiczbyZKlawiatury(int ile){
        wpisana = new ArrayList<>();
        System.out.println("podaj "+ile+" liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < ile; i++) {
            int liczba = klawiatura.nextInt();
            wpisana.add(liczba);
        }
    }
    private void wypiszKolekcję(List<Integer> listaDoWypisania){
        for (Integer element:listaDoWypisania) {
            System.out.println("Element:"+element);
        }
    }
    private void zwrocTrafione(){
        trafiona =new LinkedList<>();
        //trafiione to elementy które występują w wylosowanych i wpisanych
        for (Integer wpisana: trafiona) {
            if(wylosowane.contains(wpisana)){
                trafiona.add(wpisana);
            }
        }
    }
    public void  zagraj(){
        wylosujLiczby(6);
        wpiszLiczbyZKlawiatury(6);
        zwrocTrafione();
        wypiszKolekcję(wpisana);
        System.out.println("wpisana");
        wypiszKolekcję(wylosowane);
        System.out.println("wylosowane");
        wypiszKolekcję(trafiona);
        System.out.println("trafiona");
    }



}

