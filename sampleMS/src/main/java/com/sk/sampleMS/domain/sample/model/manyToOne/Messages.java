package com.sk.sampleMS.domain.sample.model.manyToOne;

import javax.persistence.*;

import org.hibernate.validator.constraints.*;

import com.sk.cnaps.domain.model.*;

import lombok.*;

/**
 * <pre>
 * 다대일 단방향[N:1] 샘플 객체 양방향 관계에서 연관관계의 주인은 항상 다쪽이다.
 * History
 * - 2018. 9. 5. | P126458 | 최초작성.
 * </pre>
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_MSG")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Messages extends AbstractEntity implements AggregateRoot{

   
    @Column
    private String title;

    @Column(nullable = false)
    @NotEmpty
    private String message;
   
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "GUEST_ID")  
    private Guest guest;
    

}
