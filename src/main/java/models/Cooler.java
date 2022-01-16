package models;

import java.math.BigDecimal;

public class Cooler extends Component{
    Integer fanSpacesTaken;

    public Cooler(String partId, String name, BigDecimal price, Integer sizeCode, Integer fanSpacesTaken) {
        super(partId, name, price, sizeCode);
        this.fanSpacesTaken = fanSpacesTaken;
    }

    public Integer getFanSpacesTaken() {
        return fanSpacesTaken;
    }

    @Override
    public String toString() {
        return "Cooler ID: " + partId +
                ", Name: " + name +
                ", Price: $" + price +
                ", Fans Spaces Used: " + fanSpacesTaken
                ;
    }
}
