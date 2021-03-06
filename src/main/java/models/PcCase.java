
package models;

import java.math.BigDecimal;

public class PcCase extends models.Component {
    Integer fansSupported;
    Integer ssdsSupported;
    Integer hddsSupported;
    Integer fansIncluded;

    public PcCase(String partId, String name, BigDecimal price, Integer sizeCode, Integer fansSupported,
                  Integer ssdSupported, Integer hddsSupported, Integer fansIncluded) {
        super(partId, name, price, sizeCode);
        this.fansSupported = fansSupported;
        this.ssdsSupported = ssdSupported;
        this.hddsSupported = hddsSupported;
        this.fansIncluded = fansIncluded;
    }
    public Integer getFansSupported() {return fansSupported;}

    public Integer getSsdsSupported() {
        return ssdsSupported;
    }

    public Integer getHddsSupported() {return hddsSupported;}

    public Integer getFansIncluded() {return fansIncluded;}

    @Override
    public String toString() {
        return "Pc Case ID: " + partId +
                ", Name: " + name +
                ", Price: $" + price +
                ", SSDs Supported: " + ssdsSupported +
                ", HDDs Supported: " + hddsSupported +
                ", Fans Supported: " + fansSupported +
                ", Fans Included: " + fansIncluded ;
    }
}

