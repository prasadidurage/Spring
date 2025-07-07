package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CustomerDto {

    private String CustomerId;
    private String CustomerName;
    private String CustomerAddress;
}
