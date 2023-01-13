package uz.pdp.warehouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Input {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String data;

   @ManyToOne
   private Wherhouse wherhouse;

   @OneToOne
   private Supplier supplier;

   @ManyToOne
   private Currencyy currencyy;

   private String facture_number;

   private String code;

}
