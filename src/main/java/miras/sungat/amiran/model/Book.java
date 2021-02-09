package miras.sungat.amiran.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "BookEntity")
@Table(name = "books")
public class Book implements Serializable
{
    private long id;
    private String isbn;
    private String name;
    private String author;
    private int count;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId()
    {
        return this.id;
    }
    public void setId(long id)
    {
        this.id = id;
    }

    @Column(name = "name")
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    @Column(name = "isbn")
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    @Column(name = "author")
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    @Column(name = "count")
    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
}
