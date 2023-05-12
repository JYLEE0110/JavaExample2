package com.hi.app.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Address {

    private String zipcode;
    private String address1;
    private String address2;

}
