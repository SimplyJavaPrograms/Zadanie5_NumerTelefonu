public abstract class Wpis {
    protected String adres;
    protected NrTelefoniczny numerTelefonu;

    abstract public String opis();

    public NrTelefoniczny getNumerTelefonu() {
        return this.numerTelefonu;
    }
    public String getAdress() {
        return this.adres;
    }

    @Override
    public String toString() {
        return opis();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wpis wpis = (Wpis) o;
        return this.getAdress() == wpis.getAdress();
    }
}
