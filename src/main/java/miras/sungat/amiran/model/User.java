package miras.sungat.amiran.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "UserEntity")
@Table(name = "users")
public class User implements Serializable
{
    private long id;
    private String username;
    private String password;
    private Role role;
    //TODO how PERSISTENSE WORK? private List<Book> books;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId()
    {
        return this.id;
    }
    public void setId(long user_id)
    {
        this.id = user_id;
    }

    @Column(name = "username")
    public String getUsername()
    {
        return this.username;
    }
    public void setUsername(String email)
    {this.username = email;}

    @Column(name = "password")
    public String getPassword()
    {
        return this.password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id")
    public Role getRole()
    {
        return role;
    }
    public void setRole(Role role)
    {
        this.role = role;
    }
}