package models;

import java.math.BigDecimal;

public class Intel extends Cpu {
    Integer pCores;
    Integer eCores;

    public Intel(String partId, String name, BigDecimal price, Integer sizeCode, String socket,
                 Integer cores, Integer threads, Integer pCores, Integer eCores, Integer wattage) {
        super(partId, name, price, sizeCode, socket, cores, threads, wattage);
        this.pCores = pCores;
        this.eCores = eCores;
    }

    @Override
    public String toString() {
        return "CPU Id: " + partId +
                ", Name: " + name +
                ", Price: $" + price +
                ", Cores: " + cores +
                " (" + pCores + " Performance and " +
                eCores + " Efficiency Cores)" +
                ", Threads: " + threads +
                ", Socket: " + socket +
                ", Power: " + wattage +
                " Watts";
    }
}