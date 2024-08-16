package lk.ijse.se102.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Blog {
   @Id
    private int Id;
    private String Title;
    private String text;
    private String Category;


}
