package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        try {
            File file = new File("input.txt");
            Scanner in = new Scanner(file);

            while (in.hasNext()) {
                String name = in.next();
                String titel = in.next();
                int age = in.nextInt();

                String str = name + " " + titel + " " + age + " ";                
                if (age > 50) {

                    try {
                        FileWriter f2 = new FileWriter("output.txt", true);
                        f2.write(str);
                        System.out.println("Save");
                        f2.close();
                    } catch (IOException ex) {
                        System.out.println("Not save");
                    }

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
