/**
 * Class for constructing Birds
 */

public class Bird extends Animal {
    private String color;
    private String flight;

    /**
     * Default Bird Constructor
     */

    public Bird() {
        color = null;
        flight = null;

    }

    /**
     * Bird Constructor
     **/
    public Bird(String name, String sex, String habitat, String colorValue, String flightValue) {
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
    public String flight() {
        return flight;
    }

    /**
     * Setter for Bird Flight
     */
    public void setFlight(String flight) {
        this.flight = flight;
    }
}
