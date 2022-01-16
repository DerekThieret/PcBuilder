package models;

import java.math.BigDecimal;

public class Storage extends Component{
    BigDecimal sizeTB;
    Boolean nvme;
    Boolean ssd;

    public Storage(String partId, String name, BigDecimal price, Integer sizeCode, BigDecimal sizeTB, Boolean nvme, Boolean ssd) {
        super(partId, name, price, sizeCode);
        this.sizeTB = sizeTB;
        this.nvme = nvme;
        this.ssd = ssd;
    }


    public Boolean getNvme() {
        return nvme;
    }

    public Boolean getSsd() {
        return ssd;
    }

    @Override
    public String toString() {
        return "Storage ID: " + partId +
                ", Name: " + name +
                ", Price: $" + price +
                ", Size: " + sizeTB + "TB";
    }
}