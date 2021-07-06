import java.io.CharArrayWriter;
import java.util.Arrays;

public class Encryption {

    public static String encryption(String s) {


        String output = s.replaceAll("\\s+","");
        int length = output.length();
        int rows = (int) Math.floor(Math.sqrt(output.length()));
        int columns = (int) Math.ceil(Math.sqrt(output.length()));

        char[] chars = output.toCharArray();
        StringBuilder encrypted = new StringBuilder();

        System.out.println("length: "+length);
        System.out.println("rows: "+ rows);
        System.out.println("column: "+ columns);
        System.out.println(Arrays.toString(chars));

        if (rows * columns < length) {
            rows = columns;
        }

        int count = 0;

            for (int i = 0; i < chars.length; i+=rows) {

                for (int j = count; j < chars.length; j+=columns) {
                    encrypted.append(chars[j]);
                }
                encrypted.append(" ");
                count++;
            }

        return encrypted.toString();
    }


}
