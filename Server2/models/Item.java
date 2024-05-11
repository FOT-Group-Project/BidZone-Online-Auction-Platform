import jakarta.persistence.*;

import java.sql.Blob;

@Entity
@Table(name = "ITEM")
public class Item {
    private int id;
    private String name;
    private String ownerName;
    private int reservePrice;
    private Blob image;

    public Item() {
    }

    public Item(int id, String name, String ownerName, int reservePrice, Blob image) {
        this.id = id;
        this.name = name;
        this.ownerName = ownerName;
        this.reservePrice = reservePrice;
        this.image = image;
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
}
