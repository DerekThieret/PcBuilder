package models;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Component> componentList = new ArrayList<>();
    private BigDecimal buildFee = new BigDecimal("49.99");
    private  BigDecimal totalPrice = new BigDecimal("49.99");

    public void addComponent(Component component) {
        this.componentList.add(component);
        this.totalPrice = this.totalPrice.add(component.getPrice());
    }

    public BigDecimal getTotalPrice(){
        return totalPrice;
    }

    @Override
    public String toString() {
        String str = "---------------------\n";
        str += "Your Order:\n";
        str += "Build Fee: $" + this.buildFee.setScale(2, RoundingMode.HALF_UP) + "\n";
        str += "Components:\n";


        for (Component component : componentList) {

            str += component.getName() + "\t$" + component.getPrice().setScale(2, RoundingMode.HALF_UP) + "\n";
        }
        str += "Your Total:\n";
        str += "$" + this.totalPrice.setScale(2, RoundingMode.HALF_UP);

        return str;
    }

}
