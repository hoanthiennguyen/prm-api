package app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String productName;
    protected int quantity;
    protected int inventory;
    protected Date updateDate;
    protected boolean isDelete;
    protected String status;
    protected String description;
    protected String author;
    protected String publishedBy;
    protected String providedBy;
    protected int rating;
    protected int price;


    @Column(nullable = true)
    double discount = 0;


    @Column(nullable = true)
    protected String category;

}
