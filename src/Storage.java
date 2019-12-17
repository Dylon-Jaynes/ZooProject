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
                            obj.getColor(), obj.flight());
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

        try (Scanner input = new Scanner(fileName)) {
            while(input.hasNextLine()) {
                String line = input.nextLine().trim();
                String[] fields = line.split("|");
                if (fields[0].equals("Animal")) {
                    Animal a = new Animal;
                    if (fields.length > 1) {
                        a.setName(fields[1]);
                        a.setSex(fields[2]);
                        a.setHabitat(fields[3]);
                    }
                }

                else if (fields[0].equals("Bird")) {
                    Bird b1 = new Bird();
                    if (fields.length < 6) {
                        throw new IOException("Invalid record format");
                    }
                    
                }

                else if (fields[0].equals("Giraffe")) {

                }

                else if (fields[0].equals("Lion")) {

                }

                else if (fields[0].equals("Bear")) {

                }

                else {
                    throw new IOException("Invalid record type: " + fields[0]);
                }

            }
        }
        return null;
    }
}
