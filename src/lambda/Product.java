package lambda;

public class Product {
    private String pid;
    private String name;
    private int price;
    private String company;

    public Product(String pid, String name, int price, String company) {
        super();
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.company = company;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
