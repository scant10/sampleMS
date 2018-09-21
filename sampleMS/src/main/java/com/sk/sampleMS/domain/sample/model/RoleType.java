package com.sk.sampleMS.domain.sample.model;

import com.fasterxml.jackson.databind.annotation.*;
import com.sk.cnaps.domain.util.*;


@JsonSerialize(using=EnumWithTextSerializer.class) 
public enum RoleType implements EnumWithText {
        GENERAL("일반사용자"),
        MANGER("관리자");
        
        private String text;
        
        RoleType(String text) {
                this.text = text;
        }
        
        public String text() {
                return text;
        }
}
