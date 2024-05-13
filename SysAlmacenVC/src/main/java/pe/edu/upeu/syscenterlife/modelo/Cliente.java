package pe.edu.upeu.syscenterlife.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Cliente {
    
    @Id
    String dniruc;
    String nombrers;
    String documento;
    
}