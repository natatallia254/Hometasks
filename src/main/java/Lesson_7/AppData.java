package Lesson_7;

import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;

    public void WriteFile() throws Exception{
        String[] header = new String[3];
        header[0] = "Value 1";
        header[1] = "Value 2";
        header[2] = "Value 3";

        for (int i = 0; i < header.length; i++) {
            if (i != header.length-1) {
                System.out.print(header[i] + "; ");
            } else {
                System.out.println(header[i]);
            }
        }

        int[][] data = new int[3][3];
        data[0][0] = 100;
        data[0][1] = 200;
        data[0][2] = 123;
        data[1][0] = 300;
        data[1][1] = 400;
        data[1][2] = 500;
        data[2][0] = 650;
        data[2][1] = 750;
        data[2][2] = 800;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (j != data.length-1) {
                    System.out.print(data[i][j] + "; ");
                } else {
                    System.out.print(data[i][j] + " ");
                }
            }
            System.out.println();
        }

        File file = new File("c:\\Бруковская\\Курс Java\\dz7.csv");
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(file));

        for (int i = 0; i < header.length; i++) {
            if (i != header.length-1) {
                writer.write(header[i] + "; ");
            } else {
                writer.write(header[i] + "");
            }
        }
        writer.newLine();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (j != data.length-1) {
                    writer.write(data[i][j] + "; ");
                } else {
                    writer.write(data[i][j] + " ");
                }
            }
            writer.newLine();
        }

        writer.flush();
        writer.close();
    }
}

