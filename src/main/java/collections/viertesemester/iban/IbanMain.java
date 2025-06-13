package collections.viertesemester.iban;

public class IbanMain {
    public static void main(String[] args) throws FalscheIBANException {


        Iban iban = new Iban();

        //iban.ibanAusDateiLesen("src/main/resources/IbanFalsch");

        iban.dateienTest(new String[]{"src/main/resources/IbanNummer"});
    }
}
