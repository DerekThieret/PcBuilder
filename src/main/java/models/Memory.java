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
        return "Memory{" +
                "partId='" + partId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sizeCode=" + sizeCode +
                ", sizeGB=" + sizeGB +
                ", speed='" + speed + '\'' +
                '}';
    }
}
