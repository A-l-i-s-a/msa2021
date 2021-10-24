package msa.materials;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "material_table")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private int count;
}
