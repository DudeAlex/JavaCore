package collections.viertesemester.aufgabefahrzeuge.iban;

import collections.viertesemester.aufgabefahrzeuge.Fahrrad;

public class FalscheIBANException extends Exception{

    String errorMessage;


    public FalscheIBANException(){
        this.errorMessage = "FEHLER: Datei enthält ungültige IBAN";
    }

    public FalscheIBANException(String errorMessage){
        this.errorMessage = errorMessage;
    }



}
