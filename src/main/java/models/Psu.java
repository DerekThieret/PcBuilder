package models;

import java.math.BigDecimal;

public class Psu extends Component {
    Integer wattage;
    public Psu(String partId, String name, BigDecimal price, Integer sizeCode, Integer wattage) {
        super(partId, name, price, sizeCode);
        this.wattage = wattage;
    }

    public Integer getWattage() {
        return wattage;
    }

    @Override
    public String toString() {
        return "PSU ID: " + partId +
                ", Name: " + name +
                ", Price: " + price +
                ", Power: " + wattage +
                " Watts";
    }
}
