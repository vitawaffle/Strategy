package by.vitalilabatsevich.strategy.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends Entity {

    private String username;

    private String password;

    @Builder
    public User(String username, String password, ObjectId id) {
        super(id);
        this.username = username;
        this.password = password;
    }

}
