package lesson148;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File folder = new File("myFolder");

        if (!folder.exists()) {
            folder.mkdir();
        }

        File file = new File(folder, "qeyd.txt");

        if (file.exists()) {
            System.out.println("Fayl artıq var");
        } else {
            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write("Java-da fayllarla işləmək maraqlıdır!");
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}