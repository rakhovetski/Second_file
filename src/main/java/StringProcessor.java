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

    public int stringCountIn(String a, String b){
        int count = 0;
        if (!b.equals("") && b != null) {
            for(int i = 0; i <= a.length() - b.length(); i++){
                String c = a.substring(i, i+b.length());
                if(c.equals(b)){
                    count ++;
                }
            }
        }
        else{
            throw new IllegalArgumentException("Empty line entered");
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
