public class Firma extends Wpis{
    private String nazwa;

    Firma (String nazwa, String adres, NrTelefoniczny numerTelefonu){
        this.nazwa = nazwa;
        this.adres = adres;
        this.numerTelefonu = numerTelefonu;
    }
    @Override
    public String opis() {
        return String.format("\n\tFirma %s\n\tz siedzibą przy ulicy %s\n\tAby się skontaktować zadzwoń pod numer %s\n", this.nazwa, this.adres, this.numerTelefonu);
    }
}
