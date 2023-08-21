package modi.modi.dto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name="MEMBER")
public class Member {

    @Id
    @Column(name="ID")
    private Long id;

    @NotNull
    @Column(name="NAME")
    private String name;

}
