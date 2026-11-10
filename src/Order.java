import java.util.Arrays;
import java.util.Objects;

class Order {
    String customer;
    Product[] basket;

    Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }


    @Override
    public String toString() {
        return "Заказ{" +
                "клиент='" + customer + '\'' +
                ", корзина=" + Arrays.toString(basket) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order other = (Order) o;
        if (!Objects.equals(customer, other.customer))return false;
        if (basket.length != other.basket.length) return false;
        for (int i=0; i< basket.length;i++){
            if (basket[i]==null && other.basket[i] != null) return false;
            if (basket[i]!=null && !basket[i].equals(other.basket[i]))return false;
        }
        return true;
    }
}
