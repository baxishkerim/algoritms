package main.java.org;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class WorkFile {

    public static void main(String[] args) {
        ArrayList<File> files = new ArrayList<>();

        searchFiles(new File("D:\\"), files);

        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

    }


    private static void searchFiles(File rootFile, List<File> workFileList) {


        if (rootFile.isDirectory()) {
            System.out.println("searching at: " + rootFile.getAbsolutePath());

            File[] directoryFiles = rootFile.listFiles();

            if (directoryFiles != null) {

                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFiles(file, workFileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg"))
                            workFileList.add(file);
                    }
                }
            }
        }

    }
}
