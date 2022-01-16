package models;

import java.math.BigDecimal;

public class Memory extends Component{
    Integer sizeGB;
    String speed;

    public Memory(String partId, String name, BigDecimal price, Integer sizeCode, Integer sizeGB, String speed) {
        super(partId, name, price, sizeCode);
        this.sizeGB = sizeGB;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Memory Kit ID: " + partId +
                ", Name: " + name +
                ", Price: $" + price +
                ", Size: " + sizeGB + "GB" +
                ", Speed: " + speed;
    }
}
