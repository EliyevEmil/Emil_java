package lesson148;

import java.io.File;

public class Main2 {
    static int fileCount = 0;

    public static void main(String[] args) {
        File folder = new File("myFolder");

        if (folder.exists() && folder.isDirectory()) {
            listFilesInFolder(folder);
            System.out.println("Ümumi fayl sayı: " + fileCount);
        } else {
            System.out.println("Qovluq tapılmadı!");
        }
    }

    public static void listFilesInFolder(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    listFilesInFolder(file);
                } else {
                    fileCount++;
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}