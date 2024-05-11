import jakarta.persistence.*;

@Entity
@Table(name = "ADMIN")
public class Admin {
    private String name;
    private String nickName;
    private String password;

    public Admin(String name, String nickName, String password) {
        this.name = name;
        this.nickName = nickName;
        this.password = password;
    }

    public Admin() {
    }

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
