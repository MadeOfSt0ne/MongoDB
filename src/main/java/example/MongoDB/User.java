package example.MongoDB;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class User {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favoriteBeer;
    private BigDecimal totalSpentInBeer;
    private LocalDateTime created;

    public User(String firstname,
                String lastname,
                String email,
                Gender gender,
                Address address,
                List<String> favoriteBeer,
                BigDecimal totalSpentInBeer,
                LocalDateTime created) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favoriteBeer = favoriteBeer;
        this.totalSpentInBeer = totalSpentInBeer;
        this.created = created;
    }
}
