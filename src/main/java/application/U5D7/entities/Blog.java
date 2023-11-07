package application.U5D7.entities;

import application.U5D7.enums.BlogCategory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Blog {
    private int id;
    private BlogCategory blogCategory;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

}
