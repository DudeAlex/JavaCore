package collections.viertesemester.stringformater;

public class StringFormatter {

    String text;


    public StringFormatter(String text){
        this.text = text;
    }

    public StringFormatter toUpper(){
        this.text = text.toUpperCase();
        return this;
    }

    public StringFormatter replace(String alt, String neu){
        this.text = text.replace(alt, neu);
        return this;
    }

    public StringFormatter trim(){
        this.text = text.trim();
        return this;
    }

    public String get(){
        return text;
    }

    public static void main(String[] args) {
        String result = new StringFormatter("    Hello world    ")
                .trim()
                .replace("Hello", "hallo")
                .toUpper()
                .get();

        System.out.println(result);
    }
}
