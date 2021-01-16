import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//reference: https://www.candidjava.com/tutorial/program-to-search-word-in-a-file/

import javax.swing.DefaultListModel;

public class Shapeinfo implements interfaceShape {

    /**
     * @return DefaultListModel<String>
     */
    // {"type":"circle","id":0,"radius":6,"color":"yellow"},

    /**
     * This is where my calculations for my code are set up each method uses a
     * DefaultListModel<String> as its return types because i could not figure out
     * how to display it to a screen otherwise
     * 
     * I was rushed for time so many variables go unused in the final product
     * 
     * I use the split method to get the string and break it down to where i can
     * grab the individual strings that i get and put into my return functions
     * 
     * I re-used some of my testing code to get my program to read my files
     * correctly and to mkae sure it is eading from the right one
     */
    @Override
    public DefaultListModel<String> tooString() {

        String info = new String();
        String input1 = "circle:";
        String input2 = "square:";
        String input3 = "rectangle:";
        String input4 = "triangle:";
        String lineRD = new String();

        String[] words = null;
        String part1 = new String();
        String part2 = new String();

        DefaultListModel<String> content = new DefaultListModel<String>();
        String curdir = System.getProperty("user.dir");
        File shapes = new File(curdir);
        File[] shapesArray = shapes.listFiles();

        for (File f : shapesArray) {
            if (f.getName().endsWith(".txt")) {
                try (FileInputStream is = new FileInputStream(f)) {
                    InputStreamReader ir = new InputStreamReader(is);
                    BufferedReader rdr = new BufferedReader(ir);
                    lineRD = rdr.readLine();
                    words = lineRD.split(" ", 4);
                    while ((lineRD = rdr.readLine()) != null) {
                        if (lineRD.startsWith("c")) {
                            part1 = input1;
                            part2 = words[1];
                            content.addElement(part1 + "" + part2);
                            lineRD = rdr.readLine();
                            System.out.println(part1 + " " + part2);
                        } else if (lineRD.startsWith("s")) {
                            part1 = input2;
                            part2 = words[1];
                            content.addElement(part1 + "" + part2);
                            lineRD = rdr.readLine();
                            System.out.println(part1 + " " + part2);

                        } else if (lineRD.startsWith("r")) {
                            part1 = input3;
                            part2 = words[1];
                            content.addElement(part1 + "" + part2);
                            lineRD = rdr.readLine();
                            System.out.println(part1 + " " + part2);
                        } else if (lineRD.startsWith("t")) {
                            part1 = input4;
                            part2 = words[1];
                            content.addElement(part1 + "" + part2);
                            lineRD = rdr.readLine();
                            System.out.println(part1 + " " + part2);
                        }
                        info = part1 + " " + part2;
                    }
                } catch (Exception ex) {
                    System.out.printf("Failed for %s\n", f.getName());
                }
            }
        }
        return content;
    }

    /**
     * @return DefaultListModel<String>
     */
    @Override
    public DefaultListModel<String> getDetailString() {
        DefaultListModel<String> content = new DefaultListModel<String>();
        String help = new String();
        String curdir = System.getProperty("user.dir");
        File shapes = new File(curdir);
        File[] shapesArray = shapes.listFiles();

        for (File f : shapesArray) {

            if (f.getName().endsWith(".txt")) {
                System.out.println(f.getName());
                try (FileInputStream is = new FileInputStream(f)) {
                    InputStreamReader ir = new InputStreamReader(is);
                    BufferedReader rdr = new BufferedReader(ir);
                    help = rdr.readLine();
                    while (help != null) {
                        content.addElement(help);
                        help = rdr.readLine();
                    }
                } catch (Exception ex) {
                    System.out.printf("Failed for %s\n", f.getName());
                }
            }
        }
        return content;
    }

    /**
     * @return int
     */
    @Override
    public DefaultListModel<String> getID() {
        String stop_gap = new String();
        String input1 = "circle:";
        String input2 = "square:";
        String input3 = "rectangle:";
        String input4 = "triangle:";
        String lineRD = new String();

        String[] words = null;
        String part2 = new String();

        DefaultListModel<String> content = new DefaultListModel<String>();
        String curdir = System.getProperty("user.dir");
        File shapes = new File(curdir);
        File[] shapesArray = shapes.listFiles();

        for (File f : shapesArray) {

            if (f.getName().endsWith(".txt")) {
                try (FileInputStream is = new FileInputStream(f)) {
                    InputStreamReader ir = new InputStreamReader(is);
                    BufferedReader rdr = new BufferedReader(ir);
                    lineRD = rdr.readLine();
                    while ((stop_gap = rdr.readLine()) != null) {
                        words = stop_gap.split(" ", 4);
                        if (lineRD.startsWith("c")) {
                            part2 = words[1];
                            content.addElement(part2);
                            lineRD = rdr.readLine();
                        } else if (lineRD.startsWith("s")) {
                            part2 = words[1];
                            content.addElement(part2);
                            lineRD = rdr.readLine();
                        } else if (lineRD.startsWith("r")) {
                            part2 = words[1];
                            content.addElement(part2);
                            lineRD = rdr.readLine();
                        } else if (lineRD.startsWith("t")) {
                            part2 = words[1];
                            content.addElement(part2);
                            lineRD = rdr.readLine();
                        }
                    }
                } catch (Exception ex) {
                    System.out.printf("Failed for %s\n", f.getName());
                }
            }
        }
        return content;
    }

    /**
     * @return DefaultListModel<String>
     */
    @Override
    public DefaultListModel<String> getKind() {
        String info = new String();
        String input1 = "circle:";
        String input2 = "square:";
        String input3 = "rectangle:";
        String input4 = "triangle:";
        String lineRD = new String();

        String[] words = null;
        String part1 = new String();

        DefaultListModel<String> content = new DefaultListModel<String>();
        String curdir = System.getProperty("user.dir");
        File shapes = new File(curdir);
        File[] shapesArray = shapes.listFiles();

        for (File f : shapesArray) {
            if (f.getName().endsWith(".txt")) {
                try (FileInputStream is = new FileInputStream(f)) {
                    InputStreamReader ir = new InputStreamReader(is);
                    BufferedReader rdr = new BufferedReader(ir);
                    lineRD = rdr.readLine();
                    words = lineRD.split(" ", 4);
                    while ((lineRD = rdr.readLine()) != null) {
                        if (lineRD.startsWith("c")) {
                            part1 = words[0];
                            content.addElement(part1);
                            lineRD = rdr.readLine();
                        } else if (lineRD.startsWith("s")) {
                            part1 = words[0];
                            content.addElement(part1);
                            lineRD = rdr.readLine();
                        } else if (lineRD.startsWith("r")) {
                            part1 = words[0];
                            content.addElement(part1);
                            lineRD = rdr.readLine();
                        } else if (lineRD.startsWith("t")) {
                            part1 = words[0];
                            content.addElement(part1);
                            lineRD = rdr.readLine();
                        }
                        info = part1;
                    }
                } catch (Exception ex) {
                    System.out.printf("Failed for %s\n", f.getName());
                }
            }
        }

        return content;
    }
}
