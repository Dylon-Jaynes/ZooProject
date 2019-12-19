import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;

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
    public static void storeData(File fileName, ArrayList<Animal> data) throws IOException {
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
    public static void loadData(File fileName) throws IOException {


        try {
            FileReader fileReader = new FileReader(fileName);
            StringBuffer stringBuffer = new StringBuffer();
            int numCharsRead;
            char[] charArray = new char[1024];
            while ((numCharsRead = fileReader.read(charArray)) > 0) {
                stringBuffer.append(charArray, 0, numCharsRead);
            }
            fileReader.close();
            System.out.println("Contents of file:");
            System.out.println(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
