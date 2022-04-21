
public class Osoba extends Wpis {
    private String imie;
    private String nazwisko;

    Osoba (String imie, String nazwisko, String adres, NrTelefoniczny numerTelefonu){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.numerTelefonu = numerTelefonu;
    }
    @Override
    public String opis() {

        return String.format("\n\t%s %s\n\tMieszka przy %s. \n\tJego numer telefonu to: %s\n", this.imie, this.nazwisko, this.adres, this.getNumerTelefonu());
    }

}
