package models;

import java.math.BigDecimal;

public abstract class Component {
    String partId;
    String name;
    BigDecimal price;
    Integer sizeCode;

    public Component(String partId, String name, BigDecimal price, Integer sizeCode) {
        this.partId = partId;
        this.name = name;
        this.price = price;
        this.sizeCode = sizeCode;
    }

    public String getPartId() {return partId;}

    public String getName() {return name;}

    public BigDecimal getPrice() {return price;}

    public  Integer getSizeCode(){return sizeCode;}
}


