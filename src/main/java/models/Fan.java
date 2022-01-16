package models;

import java.math.BigDecimal;

public class Fan extends Component {
    BigDecimal airflow;
    Integer rpm;
    BigDecimal noise;

    public Fan(String partId, String name, BigDecimal price, Integer sizeCode, BigDecimal airflow, Integer rpm, BigDecimal noise) {
        super(partId, name, price, sizeCode);
        this.airflow = airflow;
        this.rpm = rpm;
        this.noise = noise;
    }

    @Override
    public String toString() {
        return "Fan Id: " + partId +
                ", Name: " + name +
                ", Price: $" + price +
                ", CFM: " + airflow +
                ", RPM: " + rpm +
                ", Noise at Max RPM: " + noise +
                "db";
    }
}
