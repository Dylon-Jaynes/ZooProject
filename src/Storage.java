import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Gives methods to read and write data from a file
 */
public class Storage {

    /**
     * Store data in a specific file
     * @param fileName
     * @param data
     * @throws IOException
     */
    public static void storeData(String fileName, ArrayList<Animal> data) throws IOException {
        //File Format:
        //One object per line
        //Class-type, animalName, animalSex, animalHabitat (include color and flight for birds)
        try (PrintWriter out = new PrintWriter(fileName)) {
            for (Animal obj: data) {
                if (obj instanceof Bird) {
                    Bird b1 = (Bird) obj;
                    out.format("%s|%s|%s|%s|%s|%b\n", "Bird", obj.getName(), obj.getSex(), obj.getHabitat(),
                            ((Bird) obj).getColor(), ((Bird) obj).flight());
                }

                else if (obj instanceof Giraffe) {
                    Giraffe g = (Giraffe) obj;
                    out.format("%s|%s|%s|%s\n", "Giraffe", obj.getName(), obj.getSex(), obj.getHabitat());
                }

                else if (obj instanceof Lion) {
                    Lion l = (Lion) obj;
                    out.format("%s|%s|%s|%s\n", "Lion", obj.getName(), obj.getSex(), obj.getHabitat());
                }

                else if (obj instanceof Bear) {
                    Bear b2 = (Bear) obj;
                    out.format("%s|%s|%s|%s\n", "Bear", obj.getName(), obj.getSex(), obj.getHabitat());
                }

                else {
                    out.format("%s|%s|%s|%s\n", "Animal", obj.getName(), obj.getSex(), obj.getHabitat());
                }

            }
        }

        catch(IOException exception) {
            throw new IOException("Couldn't write file", exception);
        }
    }

    /**
     * Loads data from a specific file
     * @param fileName
     * @return
     * @throws IOException
     */
    public static ArrayList<Animal> loadData(String fileName) throws IOException {
        ArrayList<Animal> newData = new ArrayList<>();

        //Check if file exists
        int lineNumber = 0;
        try (Scanner input = new Scanner(new File(fileName))) {
            while(input.hasNextLine()) {
                String line = input.nextLine().trim();
                lineNumber += 1;

                String[] fields = line.split("\\|");
                if (fields[0].equals("Animal")) {
                    Animal a = new Animal();
                    if (fields.length > 1) {
                        a.setName(fields[1]);
                        a.setSex(fields[2]);
                        a.setHabitat(fields[3]);
                    }
                    newData.add(a);
                }

                else if (fields[0].equals("Bird")) {
                    if (fields.length < 6) {
                        throw new IOException("Invalid record format on line " + lineNumber);
                    }
                    Bird b1 = new Bird();
                    b1.setName(fields[1]);
                    b1.setSex(fields[2]);
                    b1.setHabitat(fields[3]);
                    b1.setColor(fields[4]);
                    b1.setFlight(fields[5]);
                    newData.add(b1);
                }

                else if (fields[0].equals("Giraffe")) {
                    if (fields.length < 4) {
                        throw new IOException("Invalid record format on line " + lineNumber);
                    }
                    Giraffe g = new Giraffe();
                    g.setName(fields[1]);
                    g.setSex(fields[2]);
                    g.setHabitat(fields[3]);
                    newData.add(g);
                }

                else if (fields[0].equals("Lion")) {
                    if (fields.length < 4) {
                        throw new IOException("Invalid record format on line " + lineNumber);
                    }
                    Lion l = new Lion();
                    l.setName(fields[1]);
                    l.setSex(fields[2]);
                    l.setHabitat(fields[3]);
                    newData.add(l);
                }

                else if (fields[0].equals("Bear")) {
                    if (fields.length < 4) {
                        throw new IOException("Invalid record format on line " + lineNumber);
                    }
                    Bear b = new Bear();
                    b.setName(fields[1]);
                    b.setSex(fields[2]);
                    b.setHabitat(fields[3]);
                    newData.add(b);
                }

                else {
                    throw new IOException(String.format("Invalid record type '%s' on line %d", fields[0], lineNumber));
                }
            }
        }

        catch (NumberFormatException exception) {
            throw new IOException("Invalid format on line " + lineNumber);
        }
        return newData;
    }
}
