public class Animal {
    //This data is for keeping track of the number of animals in the database.
    public int animalCount = 0;
    public int birdCount = 0;
    public int mammalCount = 0;
    public int giraffeCount = 0;
    public int lionCount = 0;
    public int bearCount = 0;
    public int totalAnimals = 0;

    /**
     * Animal constructor
     */
    public Animal(String name, String sex, String habitat) {
        animalCount++;
        totalAnimals++;
    }

    public String getName() {
        return null;
    }

    public String getSex() {
        return null;
    }

    public String getHabitat() {
        return null;
    }
}
