package com.sk.sampleMS.domain.sample.model.manyToOnePair;

import java.util.*;

import javax.persistence.*;

import com.sk.cnaps.domain.model.*;

import lombok.*;

/**
 * <pre>
 *다대일 양방향[N:1, 1:N] 예제 , 양방향이라 함은 양쪽에서 모두 참조를 호출할 수 있는 비지니스를 의미
 * History
 * - 2018. 9. 19. | P126458 | 최초작성.
 * </pre>
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_TEAM")
@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "TEAM_ID"))
})
public class Team extends AbstractEntity implements AggregateRoot {


    @Column(name = "TEAM_NAME")
    private String teamName;
    @Column(name = "TEAM_DESC")
    private String teamDesc;
    

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "teams") // @OneToMany의 fetch 기본전략은 LAZY이다.
   private List<Member> member = new ArrayList<>();
   
      
   public void addMember(Member m){
       this.member.add(m);
       //멤버의 팀이 자기자신이 아니면 멤버에 팀 추가
       if(m.getTeams() != this){//양쪽에 작성되어 있기에  무한루프 방지
         m.setTeam(this);
       }
     }
}
