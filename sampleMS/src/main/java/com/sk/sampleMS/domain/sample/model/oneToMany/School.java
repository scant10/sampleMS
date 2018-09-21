package com.sk.sampleMS.domain.sample.model.oneToMany;

import java.util.*;

import javax.persistence.*;

import com.sk.cnaps.domain.model.*;

import lombok.*;

/**
 * <pre>
 * 일대다 단방향[1:N] 샘플
 * History
 * - 2018. 9. 20. | P126458 | 최초작성.
 * </pre>
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_SCHOOL")
@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "SCHOOL_ID"))
})
public class School extends AbstractEntity implements AggregateRoot {

    @Column(name = "SCHOOL_NAME")
    private String name;

    //Student 마다 각각의 외래키를 가지고 있다. 본인이 아닌 다른테이블에 관리
    @OneToMany
    @JoinColumn(name = "SCHOOL_ID")
    private List<Student> student = new ArrayList<>();
}
