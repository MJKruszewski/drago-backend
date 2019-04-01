package pl.sunflux.drago.domain.familiar.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
public final class Dragon {

    @Id
    private UUID uuid;

    private String name;

    private Integer age;
}
