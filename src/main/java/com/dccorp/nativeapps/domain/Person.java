package com.dccorp.nativeapps.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Person {
    String firstName;
    String lastName;
    String emailAddress;
    String password;
}
