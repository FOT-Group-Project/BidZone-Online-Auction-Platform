import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
    private int id;
    private String name;
    private String nickName;
    private String address;
    private Date dob;
    private Date mob;
    private String password;

    public Customer() {
    }

    public Customer(int id, String name, String nickName, String address, Date dob, Date mob, String password) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.address = address;
        this.dob = dob;
        this.mob = mob;
        this.password = password;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getMob() {
        return mob;
    }

    public void setMob(Date mob) {
        this.mob = mob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
