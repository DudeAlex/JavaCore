package collections.viertesemester.iban;

public class FalscheIBANException extends RuntimeException {

    public FalscheIBANException(){
        super("Ungultige IBAn");
    }

    public FalscheIBANException(String message){
        super();
    }

}
