package msa.containers;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "container_table")
public class Container {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private int size;
}
