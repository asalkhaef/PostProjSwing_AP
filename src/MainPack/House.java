package MainPack;

public class House extends Data<Integer>{
    private Integer OwnerNC;
    private double price;
    private Integer zipCode;
    private int area;
    private String address;
    //.....Constructor....................
    public House(Integer ownerNC, double price, Integer zipCode, int area, String address) {
        super(zipCode);
        OwnerNC = ownerNC;
        this.price = price;
        this.zipCode = zipCode;
        this.area = area;
        this.address = address;
    }
    //.....Setter&Getter...................
    public Integer getOwnerNC() {
        return OwnerNC;
    }
    public double getPrice() {
        return price;
    }
    public Integer getZipCode() {
        return zipCode;
    }
    public int getArea() {
        return area;
    }
    public String getAddress() {
        return address;
    }
    public void setOwnerNC(Integer ownerNC) {
        OwnerNC = ownerNC;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    //.....toString..........................
    @Override
    public String toString() {
        return "MainPack.House{" +
                "\n  key=" + key +
                "\n  OwnerNC=" + OwnerNC +
                "\n  price=" + price +
                "\n  zipCode=" + zipCode +
                "\n  area=" + area +
                "\n  address='" + address + '\'' +
                '}';
    }
}
