package java.com.example.springRush.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Purchase {
    private int id;
    private String product;
    private BigDecimal price;
}
