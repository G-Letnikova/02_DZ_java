import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task2DZ2 {
    public static void main(String[] args) {

        String fileName = "jurnal.txt";
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = br.readLine()) != null) 
                        System.out.println(parserStr(line));
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    public static String parserStr(String str) {
        str = str.replaceAll("\"", "");
        String[] arrayString = str.split(",|:");
        StringBuilder sb = new StringBuilder();
        sb.append("Студент ").
        append(arrayString[1]).
        append(" получил ").
        append(arrayString[3]).
        append(" по предмету ").
        append(arrayString[5]);
        return sb.toString();
    }

}




