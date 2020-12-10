import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Item9 {
    // try-finally인 경우
    // static String firstLineOfFile(String path) throws Exception {
    // BufferedReader br = new BufferedReader(new FileReader(path));
    // try {
    // return br.readLine();
    // } finally {
    // br.close();
    // }
    // }
    // static void copy(String src, String dst) throws IOException {
    // InputStream in = new FileInputStream(src);
    // try {
    // OuputStream out = new FileOutputStream(dst);
    // try {
    // byte[] buf = new byte[BUFFER_SIZE];
    // int n;
    // while ((n = in.read(buf)) >= 0) {
    // out.write(buf, 0, n);
    // }
    // } finally {
    // out.close();
    // }
    // } finally {
    // in.close();
    // }
    // }

    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }

    static String firstLineOfFile2(String path, String defaultVal) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

    public static void main(String[] args) {
        System.out.println("hi");
    }
}
