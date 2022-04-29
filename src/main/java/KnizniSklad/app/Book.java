package KnizniSklad.app;

/**
 *
 * @author IakTim
 */
public class Book implements Product{
    
    private String name;
    private double price;
    private double weight;
    private double[] size;
    
    private Book(){
        
    }
    
    public static Book getInstance(String name, double price, double weight, double[] size){
        return new Book();
    }
    
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
