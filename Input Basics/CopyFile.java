import java.io.*;

public class CopyFile {

    private static void doRead() {

        try {

            String fileName = "abc.txt";
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            BufferedWriter out = new BufferedWriter(new FileWriter("xyz.txt"));
            String s;
            while ((s = in.readLine()) != null) {
                out.write(s);
            }
            in.close();
            out.close();

        } catch (IOException e) {

            System.out.println("IOException:");
            e.printStackTrace();

        }

    }

    public static void main(String[] args) {
        doRead();
    }

}