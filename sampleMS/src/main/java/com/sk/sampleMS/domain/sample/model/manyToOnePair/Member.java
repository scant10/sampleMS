package com.sk.sampleMS.domain.sample.model.manyToOnePair;

import javax.persistence.*;

import com.sk.cnaps.domain.model.*;

import lombok.*;

/**
 * <pre>
 * 다대일 양방향[N:1, 1:N] 예제 , 양방향이라 함은 양쪽에서 모두 참조를 호출할 수 있는 비지니스를 의미
 * History
 * - 2018. 9. 20. | P126458 | 최초작성.
 * </pre>
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_MEMBER")
public class Member extends AbstractEntity {

    
    @Column(name = "MEMBER_NAME")
    private String name;
    @Column(name = "AGE")
    private String age;

    @Setter(AccessLevel.NONE)
    @ManyToOne(optional = true,fetch = FetchType.LAZY)// @ManyToOne의 fetch 기본전략은 EAGER이다.
    @JoinColumn(name = "TEAM_ID")  
    private Team teams;
        
    public void setTeam(Team team){
        this.teams = team;
        //팀의 멤버중에 자기 자신이 없으면 추가
        if(!teams.getMember().contains(this)){ //양쪽에 작성되어 있기에 무한루프 방지
            teams.getMember().add(this);
        }
    }
}