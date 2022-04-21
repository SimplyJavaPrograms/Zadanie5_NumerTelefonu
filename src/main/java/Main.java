import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static void print(TreeMap<NrTelefoniczny, Wpis> treeMap) {
        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        PrintStream out = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            out.print("Key is: " + me.getKey() + " & ");
            out.println("Value is: " + me.getValue());
        }
    }

    public static void main(String[] args) {
        //   1. Utwórz kilka obiektów klasy "Osoba" i kilka obiektów klasy "Firma"
        Osoba osoba1 = new Osoba("Maciej", "Iwan", "Popcornowa 23",
                new NrTelefoniczny("+48", "123456789"));

        Osoba osoba2 = new Osoba("Danuta", "Zabek", "Popcornowa 23",
                new NrTelefoniczny("+48", "450800401"));

        Osoba osoba3 = new Osoba("Weronika", "Kisiel", "Welonina 98",
                new NrTelefoniczny("+48", "987654321"));


        Firma firma1 = new Firma("XYZ", "Zakrecona 1",
                new NrTelefoniczny("+48", "731444555"));

        Firma firma2 = new Firma("XYZ2", "Karasia 3",
                new NrTelefoniczny("+48", "731444550"));

        Firma firma3 = new Firma("XYZA", "Biwaczkowa 43",
                new NrTelefoniczny("+48", "500400200"));

        // 2. następnie umieść je w kontenerze TreeMap. Jako klucz wykorzystaj numer telefonu.
        TreeMap<NrTelefoniczny, Wpis> treeMap = new TreeMap<NrTelefoniczny, Wpis>();
        treeMap.put(osoba1.getNumerTelefonu(), osoba1);
        treeMap.put(osoba2.getNumerTelefonu(), osoba2);
        treeMap.put(osoba3.getNumerTelefonu(), osoba3);

        treeMap.put(firma1.getNumerTelefonu(), firma1);
        treeMap.put(firma2.getNumerTelefonu(), firma2);
        treeMap.put(firma3.getNumerTelefonu(), firma3);

        //  3. Wypisz na konsoli utworzoną w ten sposób książkę telefoniczną za pomocą iteratora.
        print(treeMap);

        //   4. Zaproponuj sposób eliminacji tych wpisów, które mają identyczną nazwę ulicy w adresie.
        TreeMap<NrTelefoniczny, Wpis> treeMapWithoutDuplicates = new TreeMap<NrTelefoniczny, Wpis>();
        Set set = treeMap.entrySet();

        for (Object o : set) {
            Wpis me = (Wpis) ((Map.Entry) o).getValue();
            if (treeMapWithoutDuplicates.containsValue(me) == false)
                treeMapWithoutDuplicates.put(me.numerTelefonu, me);
        }
        
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Wpis me = (Wpis) ((Map.Entry) iterator.next()).getValue();
//            if (treeMapWithoutDuplicates.containsValue(me) == false)
//                treeMapWithoutDuplicates.put(me.numerTelefonu, me);
//        }


        //    5. Wypisz na konsoli poprawioną zawartość mapy.
        System.out.println("Wprowadz dowolny znak oraz {Enter} aby wyswietlic wersje bez duplikatow nazw ulic");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        print(treeMapWithoutDuplicates);
    }
}
