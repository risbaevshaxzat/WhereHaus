package uz.pdp.warehouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String date;

    @ManyToOne
    private Wherhouse wherhouse;

    @ManyToOne
    private Currencyy currencyy;

    private String facture_number;

    private String code;

    @ManyToOne
    private Client client;
}
