package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
public class CustomerDTO {
    @JsonProperty("cID")
    private String cID;

    @JsonProperty("cName")
    private String cName;

    @JsonProperty("cAddress")
    private String cAddress;
}
