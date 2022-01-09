package models;

import java.math.BigDecimal;

public class Ryzen extends Cpu {


    public Ryzen(String partId,String name, BigDecimal price, Integer sizeCode, String socket, Integer cores, Integer threads, Integer wattage) {
        super(partId, name, price, sizeCode,socket, cores, threads, wattage);
    }

    @Override
    public String toString() {
        return "Ryzen{" +
                "partId='" + partId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sizeCode=" + sizeCode +
                ", cores=" + cores +
                ", threads=" + threads +
                ", socket='" + socket + '\'' +
                ", wattage=" + wattage +
                '}';
    }
}


