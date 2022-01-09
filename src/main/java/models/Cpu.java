package models;

import java.math.BigDecimal;

public abstract class Cpu extends Component{

    Integer cores;
    Integer threads;
    String socket;
    Integer wattage;

    public Cpu(String partId, String name, BigDecimal price, Integer sizeCode, String socket, Integer cores, Integer threads, Integer wattage) {
        super(partId, name, price, sizeCode);
        this.socket = socket;
        this.cores = cores;
        this.threads = threads;
        this.wattage = wattage;
    }

    public Integer getWattage() {return wattage;}

    public Integer getCores() {
        return cores;
    }

    public Integer getThreads() {
        return threads;
    }

    public String getSocket() {
        return socket;
    }
}
