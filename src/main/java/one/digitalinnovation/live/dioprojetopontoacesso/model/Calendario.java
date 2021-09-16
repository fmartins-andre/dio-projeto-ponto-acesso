package one.digitalinnovation.live.dioprojetopontoacesso.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "tipo_data_id")
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
