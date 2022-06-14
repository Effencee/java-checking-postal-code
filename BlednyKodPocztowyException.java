package z2;

public class BlednyKodPocztowyException extends RuntimeException{
    public BlednyKodPocztowyException() {
        super("Niepoprawny kod pocztowy");
    }

    public BlednyKodPocztowyException(String s) {
        super(s);
    }
}
