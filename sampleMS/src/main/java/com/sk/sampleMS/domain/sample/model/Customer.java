package com.sk.sampleMS.domain.sample.model;

import javax.persistence.*;

import com.sk.cnaps.domain.model.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_CUSTOMER")
public class Customer extends AbstractEntity implements AggregateRoot{


private String firstName;

private String LastName;

private String email;

private RoleType roleType;

@Convert(converter=Address.class)
@Column(length=1000)
private Address address;

}
