
public class NrTelefoniczny implements Comparable<NrTelefoniczny> {
    private final String nrkierunkowy;
    private final String nrTelefonu;

    public NrTelefoniczny(String nrkierunkowy, String nrTelefonu) {
        this.nrkierunkowy = nrkierunkowy;
        this.nrTelefonu = nrTelefonu;
    }

    public String parseToFullNumber(){
        return  nrkierunkowy + nrTelefonu;
    }

    @Override
    public int compareTo(NrTelefoniczny numer) {
        return this.parseToFullNumber().compareTo(numer.parseToFullNumber());
    }

    public String toString() {
        return String.format("%s %s", nrkierunkowy, nrTelefonu);
    }
}
