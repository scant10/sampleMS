package com.sk.sampleMS.domain.sample.model;

import com.sk.cnaps.domain.model.*;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class Address implements JsonValue {
        private String city;
        private String gu;
        private String dong;
        private String detial;
}
