package models;

import java.math.BigDecimal;

public class Ryzen extends Cpu {


    public Ryzen(String partId,String name, BigDecimal price, Integer sizeCode, String socket, Integer cores, Integer threads, Integer wattage) {
        super(partId, name, price, sizeCode,socket, cores, threads, wattage);
    }

    @Override
    public String toString() {
        return "CPU Id: " + partId +
                ", Name: " + name +
                ", Price: $" + price +
                ", Cores: " + cores +
                ", Threads: " + threads +
                ", Socket: " + socket +
                ", Power: " + wattage +
                " Watts";
    }
}


