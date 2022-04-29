package KnizniSklad.app;

/**
 *
 * @author IakTim
 */
public class Toy implements Product{
    
    private String name;
    private double price;
    private double weight;
    private double[] size;
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double[] getSize() {
        return size;
    }
    
}
