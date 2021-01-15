
//import java.util.HashMap;
import java.io.*;

public class Testing {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String curdir = System.getProperty("user.dir");
        File cd = new File(curdir);
        File[] files = cd.listFiles();
        for (File f : files) {
            if (f.getName().endsWith(".java")) {
                try (FileInputStream is = new FileInputStream(f)) {
                    InputStreamReader ir = new InputStreamReader(is);
                    BufferedReader rdr = new BufferedReader(ir);
                    String line = rdr.readLine();
                    while (line != null) {
                        if (line.contains("\""))
                            // while (!line.contains("class "))
                            System.out.printf("%s: %s\n", f.getName(), line);
                        line = rdr.readLine();
                    }
                } catch (Exception ex) {
                    System.out.printf("Failed for %s\n", f.getName());
                }
            }
        }
    }
}