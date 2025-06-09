@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private int publishedYear;
    private int quantity;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    
    // Constructors, getters, and setters
}