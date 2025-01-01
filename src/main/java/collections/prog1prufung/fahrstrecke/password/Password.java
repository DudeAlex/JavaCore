package collections.prog1prufung.fahrstrecke.password;


/*
Перед вами стоит задача запрограммировать класс Password, который должен управлять паролем.
a) Напишите метод для класса asPWsuitable, который проверяет переданную символьную строку на пригодность в качестве пароля.
Строка символов подходит для использования в качестве пароля, если она удовлетворяет следующим критериям:
 Строка символов должна состоять не менее чем из восьми символов.
 Строка символов должна содержать заглавные буквы.
 Строка символов должна содержать строчные буквы.
 Строка символов должна содержать цифры.
 В строке должно быть не менее двух символов каждого из трех вышеупомянутых типов. Другими словами, две заглавные буквы, две строчные буквы и т. д.
Если символьная строка удовлетворяет требованиям, метод возвращает булево значение true, в противном случае - false.
б) Добавьте в класс конструктор, которому передается символьная строка. Строка символов проверяется с помощью метода asPWsuitable из a).
Если это подходящая символьная строка, она сохраняется в подходящем атрибуте экземпляра. Если символьная строка не подходит для
использования в качестве пароля, атрибуту присваивается нулевой литерал.
в) Класс также перезаписывает метод toString, который возвращает сохраненный пароль в виде строки.
 Однако не в виде обычного текста, а с соответствующим числом '*'.
Если сохраненный пароль является нулевым литералом, то возвращается строка «No valid password!

 */
public class Password {

    private String password;

    public Password(String password){
        if(alsPWgeeignet(password)) this.password = password;
    }



    private boolean alsPWgeeignet(String password){
        return password.length() > 8 && check(password);
    }

    private boolean check(String password){
        int gross = 0;
        int klein = 0;
        int ziffer = 0;

        char[] arr = password.toCharArray();
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            if(temp >= 'A' && temp <= 'Z') gross ++;
            if(temp >= 'a' && temp <= 'z') klein ++;
            if(temp >= '0' && temp <= '9') ziffer ++;
        }

        return gross > 1 && klein > 1 && ziffer > 1;
    }

    public String toString(){
        String str = "";
        if(password == null) return "No valid password!";
        else{
            for(int i = 0; i < password.length(); i++){
                str += "*";
            }
        }
        return str;
    }

    public String change(){
        char c = '*';
        char[] arr = password.toCharArray();
        for(int i = 0; i < arr.length; i += 2){
            arr[i] = c;
        }
        String newString = "";
        for(int i = 0; i < arr.length; i++){
            newString += Character.toString(arr[i]);
        }
        return newString;
    }


    public boolean pwAendern(String newPassword){
        if(newPassword.equals(password)) return false;

        if(!alsPWgeeignet(newPassword)) return false;


        if(password.substring(1, password.length() -1).equals(newPassword.substring(1, newPassword.length() -1))){
            if (password.substring(0,1).equals(newPassword.substring(0,1)) || (password.substring(password.length()).equals(newPassword.substring(newPassword.length())))) return false;
        }
        this.password = newPassword;


        return true;

    }
}
