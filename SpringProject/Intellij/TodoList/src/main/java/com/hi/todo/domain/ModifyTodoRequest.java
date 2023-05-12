package com.hi.todo.domain;

import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ModifyTodoRequest {
    private int tno;
    private String todo;
    private String duedate;
    private String fhinised;
}
