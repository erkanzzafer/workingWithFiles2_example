/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package g.workingwithfiles2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author zafer
 */
public class WorkingWithFiles2 {

    public static void main(String[] args) {
        readFile();
        writeFile();
    }

    public static void readFile() {

        File file = new File("C:\\javademos\\files\\students.txt");

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\javademos\\files\\students.txt", true));
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
