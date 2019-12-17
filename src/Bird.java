/**
 * Class for constructing Birds
 */

public class Bird extends Animal {
    private String color;
    private boolean flight;

    /**
     * Default Bird Constructor
     */

    public Bird() {
        color = null;
        flight = false;

    }

    /**
     * Bird Constructor
     **/
    public Bird(String name, String sex, String habitat, String colorValue, boolean flightValue) {
        super(name, sex, habitat);
        color = colorValue;
        flight = flightValue;
        birdCount++;
        totalAnimals++;
    }

    /**
     * Getter for Bird Color
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter for Bird Color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for Bird Flight
     */
    public boolean flight() {
        return flight;
    }

    /**
     * Setter for Bird Flight
     */
    public void setFlight(boolean flight) {
        this.flight = flight;
    }
}
