import jakarta.persistence.*;

@Entity
@Table(name = "STATUS")
public class Status {
    private String auction;
    private int id;
    private String time;

    public Status() {
    }

    public Status(String auction, int id, String time) {
        this.auction = auction;
        this.id = id;
        this.time = time;
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
    public String getAuction() {
        return auction;
    }

    public void setAuction(String auction) {
        this.auction = auction;
    }



    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
