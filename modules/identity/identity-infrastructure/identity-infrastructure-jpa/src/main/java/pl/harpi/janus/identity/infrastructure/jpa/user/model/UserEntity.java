package pl.harpi.janus.identity.infrastructure.jpa.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import pl.harpi.lib.core.domain.ports.outbound.Identifiable;
import pl.harpi.lib.core.infrastructure.jpa.BaseAggregateRoot;

@Getter
@Entity
@Table(name = "USERS", schema = "IDENTITY")
@Builder(toBuilder = true)
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BaseAggregateRoot<Long, String> implements Identifiable<String> {
}
