package com.demo.contacts.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;
@Data
@Builder
public class Contact {
    private UUID id;
    private String name;
    private String email;

    // + всё необходимое
}