package com.sk.sampleMS.domain.sample.model.manyToOne;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;

import com.sk.cnaps.domain.model.*;

import lombok.*;

/**
 * <pre>
 * 다대일 단방향[N:1] 샘플 객체 양방향 관계에서 연관관계의 주인은 항상 다쪽이다.
 * History
 * - 2018. 9. 20. | P126458 | 최초작성.
 * </pre>
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_GUEST")
@NamedQuery(name = "findByAge", query = "from Guest where age > :min and age < :max")
@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "GUEST_ID"))
})
public class Guest extends AbstractEntity{

    
    @Column(length = 50, nullable = false)
    @NotEmpty 
    private String name;

    @Column(length = 200, nullable = true)
    @Email 
    private String mail;

    @Column(nullable = true)
    @Min(value = 0)
    @Max(value = 200) 
    private Integer age;
      
}
