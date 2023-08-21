package modi.modi.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "tb_user")
@DynamicUpdate
public class User {

    @Id
    @Column(name="id")
    private String id;

    @Setter
    @Column(name = "password")
    private String password;

    @Setter
    @Column(name ="name")
    private String name;



}
