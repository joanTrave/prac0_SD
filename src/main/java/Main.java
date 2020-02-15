import utils.ComUtilsService;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            file.createNewFile();
            ComUtilsService comUtilsService = new ComUtilsService(new FileInputStream(file), new FileOutputStream(file));
            comUtilsService.writeTest();
            System.out.println(comUtilsService.readTest());
        } catch (IOException e) {
            System.out.println("Error Found during Operation:" + e.getMessage());
            e.printStackTrace();
        }
    }

}