import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\IDE projects\\Algosi\\_0_0\\input.txt");
        Scanner input = new Scanner(file);
        HashSet<Integer> set = new HashSet<>();
        long sum = 0;
        while (input.hasNext()) {
            int m = input.nextInt();
            if (set.add(m)) {
                sum += m;
            }
        }
        input.close();

        FileWriter writer = new FileWriter("E:\\IDE projects\\Algosi\\_0_0\\output.txt");
        writer.write(Long.toString(sum));
        writer.close();
    }
}