
import com.ecommerce.model.Product;
import com.ecommerce.service.CartService;
import com.ecommerce.util.DiscountUtil;
public class MainApp{
    public static void main(String[] args){
        CartService cart=new CartService();
        Product p1=new Product(1, "iPhone 16", DiscountUtil.applyDiscount(20000));
        Product p2=new Product(2, "iQOO z9", DiscountUtil.applyDiscount(5000));
        cart.addProduct(p1);
        cart.showCart();
        cart.addProduct(p2);
        cart.showCart();
        int totalAmt=cart.calculateTotal();
        System.out.println("Total Amount: "+totalAmt);
    }
}