package com.jwt.model.User;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private  String userId;
    private  String name;
    private String email;
}
