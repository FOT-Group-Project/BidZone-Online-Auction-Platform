import jakarta.persistence.*;

import java.sql.Blob;

@Entity
@Table(name = "SOLDITEM")
public class SoldItem {
    private int id;
    private String name;
    private String ownerName;
    private int reservePrice;
    private Blob image;
    private int hammerPrice;
    private int consumerId;
    private String consumerName;

    public SoldItem() {
    }

    public SoldItem(int id, String name, String ownerName, int reservePrice, Blob image, int hammerPrice, int consumerId, String consumerName) {
        this.id = id;
        this.name = name;
        this.ownerName = ownerName;
        this.reservePrice = reservePrice;
        this.image = image;
        this.hammerPrice = hammerPrice;
        this.consumerId = consumerId;
        this.consumerName = consumerName;
    }

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(int reservePrice) {
        this.reservePrice = reservePrice;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public int getHammerPrice() {
        return hammerPrice;
    }

    public void setHammerPrice(int hammerPrice) {
        this.hammerPrice = hammerPrice;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }
}
