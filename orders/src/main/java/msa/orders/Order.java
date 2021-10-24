package msa.orders;

import msa.clients.Client;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Order() {
    }

    public Order(UUID id, String name, Client client) {
        this.id = id;
        this.name = name;
        this.client = client;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
