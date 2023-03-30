import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.io.IOException;


public class task1DZ2 {
    public static void main(String[] args) {
        int[] myArray = {5,6,8,2,1,5,7,3,3};
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(SortBubleArray(myArray)));
    }
    
    public static void save_log(int num1, int num2) {
        File logFile = new File("logFile.txt");
        StringBuilder strb = new StringBuilder();
        try {
            FileWriter writer = new FileWriter(logFile,true);
            strb.append("поменяли ").append(num1).append(" с ").append(num2).append("\n");
            writer.write(strb.toString()); 
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }   
    }

    public static int[] SortBubleArray(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                save_log(array[j],array[j+1]);   
            } 
        }
        return array;
    }

}
