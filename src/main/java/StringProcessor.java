import java.util.Objects;

public class StringProcessor {
    public String stringCopy(String s, int N){
        String copyString = "";
        if(N == 0){
            return copyString;
        }
        if(N < 0){
            throw new IllegalArgumentException("Целое число меньше 0!");
        }
        for(int i = 0; i < N; i++){
            copyString += s;
        }
        return copyString;
    }

    /* Филиппов А.В. 04.12.2021 Комментарий не удалять.
     Не работает! См. задание. Не выполнено вот это
     Если вторая строка пустая или null, выбросить исключение.
    */
    public int stringCountIn(String a, String b){
        int count = 0;
        /* Филиппов А.В. 04.12.2021 Комментарий не удалять.
         Строки обычно через equals сравниваются
        */
        if (b != "") {
            for(int i = 0; i <= a.length() - b.length(); i++){
                String c = a.substring(i, i+b.length());
                if(c.equals(b)){
                    count ++;
                }
            }
        }
        else{
            return 0;
        }
        return count;
    }

    public String replaceString(String s){

        String s2 = s;
        s2 = s2.replace("1", "один");
        s2 = s2.replace("2", "два");
        s2 = s2.replace("3", "три");
        return s2;
    }

    public static String deleteSymbol(StringBuilder s) {
        StringBuilder strBuf = new StringBuilder(s);
        for (int i = 1; i < s.length() ; i += 1) {
            s.deleteCharAt(i);
        }
        return s.toString();
    }
}
