package java_professional_3.task_2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        file.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
        bw.write("Hello Java!!!");
        bw.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("file.txt")));
        System.out.println(br.readLine());
    }
}
