package models;

import java.math.BigDecimal;

public class Motherboard extends Component{
    String socket;
    Integer nvmeSupported;

    public Motherboard(String partId, String name, BigDecimal price, Integer sizeCode, String socket, Integer nvmeSupported) {
        super(partId, name, price, sizeCode);
        this.socket = socket;
        this.nvmeSupported = nvmeSupported;
    }

    public String getSocket() {
        return socket;
    }

    public Integer getNvmeSupported() {
        return nvmeSupported;
    }

    @Override
    public String toString() {
        return "Motherboard Id: " + partId +
                ", Name: " + name +
                ", Price: $" + price +
                ", Socket: " + socket +
                ", NVME Drive Slots: " + nvmeSupported;
    }
}
