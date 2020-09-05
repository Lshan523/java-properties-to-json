package pl.jalokim.propertiestojson.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Insurance {

    private String type;
    private Double cost;
    private Boolean valid;
}