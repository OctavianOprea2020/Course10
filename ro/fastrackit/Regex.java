package ro.fastrackit;

public class Regex {

    public static void main(String[] args) {
        String text = "Mademoiselle Marjorie are mere, merisoare, mure si prune (din care face marmelade),\n" 
        + "dar nu are visine, nuci, portocale, mandarine si minole.\n"
        + "Din mere face si multe poame, pe care mi le ofera mie, pentru ca imi plac.\n"
        + "Madame Manuelle face zacusca folosind mazare, morcovi, marar, indiferent de marime.\n" 
        + "Ea face o munca meritorie, cantitatea de zacusca fiind mare, chiar foarte maaaaaaaaaaaaaaaaaare !!!\n"
        + "Mesterul Manole munceste la manastire, iar in pauze culege fragi, afine si mure.";

        // Inlocuieste cuvintele care incep cu "m" si se termina cu "e" in "*".
        //
        // Rezolvare: "\\bm[a-zA-Z]{0,42}e\\b":
        // - incep cu "m": "\\b(m);"
        // - intre "m" si "e" pot fi 0 sau maximum 42 litere mici sau mari 
        // (cel mai lung cuvant romanesc are 44 de litere): "[a-zA-Z]{0,42}";
        // - se termina cu "e": "e\\b".

        System.out.println("Textul initial este:\n" + "\"" + text + "\"");
        System.out.println();
        System.out.print("Textul final este:\n\"");
        System.out.print(text.replaceAll("\\b(m|M)[a-zA-Z]{0,41}(e|E)\\b", "*"));
        System.out.println("\"");
    }
}
