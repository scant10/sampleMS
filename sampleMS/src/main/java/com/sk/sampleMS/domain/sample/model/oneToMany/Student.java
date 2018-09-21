package com.sk.sampleMS.domain.sample.model.oneToMany;

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
@Table(name = "T_STUDENT")
public class Student extends AbstractEntity{
    
    @Column(name = "STUDENT_NAME")
    private String username;
}
