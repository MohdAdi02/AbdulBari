import static java.lang.reflect.Array.set;

public class Product
{
    public String itemNo;
    public String name;
    public double price;
    public short qty;
    public Product(String itemNo){
        itemNo= itemNo;
    }
    public Product(String name, String  itemNo){
        this.name= name;
        itemNo= itemNo;
    }
    public Product(String name, String itemNo, double price,short qty){
        itemNo=itemNo;
        this.name=name;
        price= price;
        qty= qty;
    }
    public String getItemNo(){return itemNo;}
    public String getName(){return name;}

    public double getPrice() {return price;}

    public short getQty(){return qty;}

    public double setPrice(double price){
        return this.price= price;
    }


    public short setQty(short qty) {
        return this.qty = qty;
    }
}
