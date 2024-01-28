package pl.harpi.janus.identity.infrastructure.jpa.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.harpi.lib.core.infrastructure.Identifiable;
import pl.harpi.lib.core.infrastructure.jpa.BaseEntity;

@Getter
@Entity
@Table(name = "USERS", schema = "IDENTITY")
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BaseEntity implements Identifiable<String> {
  @Column(name = "UID")
  private String uid;
}
