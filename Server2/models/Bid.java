import jakarta.persistence.*;

@Entity
@Table(name = "BID")
public class Bid {
    private int id;
    private String consumerName;
    private int bidPrice;
    private int consumerId;

    public Bid() {
    }

    public Bid(int id, String consumerName, int bidPrice, int consumerId) {
        this.id = id;
        this.consumerName = consumerName;
        this.bidPrice = bidPrice;
        this.consumerId = consumerId;
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

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public int getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(int bidPrice) {
        this.bidPrice = bidPrice;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }
}
