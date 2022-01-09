package models;

import java.math.BigDecimal;

public class GraphicsCard extends Component {
    Integer memoryGB;
    Integer wattage;

    public GraphicsCard(String partId, String name, BigDecimal price, Integer sizeCode, Integer memoryGB, Integer wattage) {
        super(partId, name, price, sizeCode);
        this.memoryGB = memoryGB;
        this.wattage = wattage;
    }

    public Integer getWattage() {
        return wattage;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "partId='" + partId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sizeCode=" + sizeCode +
                ", memoryGB=" + memoryGB +
                ", wattage=" + wattage +
                '}';
    }
}
