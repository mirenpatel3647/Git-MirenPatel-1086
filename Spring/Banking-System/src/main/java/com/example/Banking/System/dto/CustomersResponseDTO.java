package com.example.Banking.System.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomersResponseDTO {
    private long id;
    private long accNumber;
    private String accName;
    private String accBranch;
}
