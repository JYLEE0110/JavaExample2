package com.hi.app.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OrderItem {

    private String itemId;
    private int number;
    private String remark;

}
