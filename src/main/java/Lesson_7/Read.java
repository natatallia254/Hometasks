package Lesson_7;

import java.io.*;

public class Read {
    public void ReadFile() throws Exception{
        File file = new File("c:\\Бруковская\\Курс Java\\dz7.csv");
        BufferedReader reader = null;
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String string = reader.readLine();
        while (string != null) {
            System.out.println(string);
            string = reader.readLine();
        }
        reader.close();
    }
}

