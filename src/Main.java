public class Main {
    public static void main(String[] args) {
        //tablicza
        // tablicza musi miec z gory okreslony rozmiar nie mozna go pusniej znmienic  alementy moga byc cyfty  proszte i złozone
        // tablicza z 6 wartoscami losowymi z zakresu 1 do 100
        int[] tabliczalosowa = new int[6];
        for (int i = 0; i < tabliczalosowa.length; i++) {
            tabliczalosowa[i] = (int) (Math.random()*100 + 1);
        }
        //wipisana tablicza
        for (int element:tabliczalosowa){
            System.out.println(element+",");
        }
    }
    }



