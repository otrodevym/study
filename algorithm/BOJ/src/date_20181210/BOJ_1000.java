package date_20181210;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1000 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            // Test case1
            int num1 = br.read() - 48;
            br.read();
            int num2 = br.read() - 48;
            System.out.println(num1 + num2);
            
            // Test case2
            /*
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            System.out.println(num1);
            int num2 = Integer.parseInt(st.nextToken());
            System.out.println(num2);
            */

            // Test case3
            /*
            String[] str = br.readLine().split(" ");
            System.out.println(str[0]);
            System.out.println(str[1]);
            */

            // Test case4
            /*
            bw.write("asd");
            bw.newLine();
            bw.write(String.valueOf(123 + 456));
            bw.flush();
            bw.close();
            */
        } catch (Exception e) {
        }

    }
}