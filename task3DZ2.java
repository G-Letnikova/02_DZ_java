//---- калькулятор ----------------------
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class task3DZ2 {
    public static void main(String[] args) {

        String askYN = "y";
        Scanner sc = new Scanner(System.in);

        while (askYN.equals("y")) {
            System.out.printf("int number1: ");
            int num1 = sc.nextInt();
            System.out.printf("int action: ");
            String act = sc.next();
            System.out.printf("int number1: ");
            int num2 = sc.nextInt();
            int result = 0;
            switch (act) {
                case "+":
                    result = num1 + num2;
                    saveLogMessage("Сложение ",num1,num2);
                    break;

                case "-":
                result = num1 - num2;
                saveLogMessage("Вычитание ",num1,num2);

                break;

                case "*":
                result = num1 * num2;
                saveLogMessage("Умножение ",num1,num2);
                break;

                case "/":
                result = num1 / num2;
                saveLogMessage("Деление ",num1,num2);
                break;

                default:
                System.out.println("error");
                saveLogMessage("error ",0,0);
                break;
            }
        System.out.println(result);
        System.out.println("Продолжить? y/n: ");
        askYN = sc.next();

    }
    sc.close();
}


    public static void saveLogMessage(String message, int n1, int n2) {
        File logFile = new File("logFileMassage.txt");
        StringBuilder strb = new StringBuilder();
        try {
            FileWriter writer = new FileWriter(logFile,true);
            strb.append(message).append(n1).append(" на ").append(n2).append("\n");
            writer.write(strb.toString()); 
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }   
    }


}

