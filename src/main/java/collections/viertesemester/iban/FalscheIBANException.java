package collections.viertesemester.iban;

public class FalscheIBANException extends Exception{

    String errorMessage;


    public FalscheIBANException(){
        this.errorMessage = "FEHLER: Datei enthält ungültige IBAN";
    }

    public FalscheIBANException(String errorMessage){
        this.errorMessage = errorMessage;
    }



}
