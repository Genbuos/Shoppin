package people;

public class Clothing {
    private String descripton;
    private double price;
    private Size size;

    public Clothing(String descripton, double price, Size size) {
        this.descripton = descripton;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "descripton='" + descripton + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
