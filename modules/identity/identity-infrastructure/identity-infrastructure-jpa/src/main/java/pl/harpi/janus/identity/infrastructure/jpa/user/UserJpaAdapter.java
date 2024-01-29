package pl.harpi.janus.identity.infrastructure.jpa.user;

import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.harpi.janus.identity.domain.model.user.User;
import pl.harpi.janus.identity.domain.ports.outbound.user.UserPort;
import pl.harpi.janus.identity.infrastructure.jpa.user.mapper.UserJpaMapper;
import pl.harpi.janus.identity.infrastructure.jpa.user.model.UserEntity;
import pl.harpi.lib.core.infrastructure.Profiles;
import pl.harpi.lib.core.infrastructure.jpa.JpaAdapter;

@Repository
@Profile(Profiles.JPA)
public class UserJpaAdapter extends JpaAdapter<UserEntity, User, String> implements UserPort {
  private final UserJpaRepository repository;

  public UserJpaAdapter(UserJpaRepository repository, UserJpaMapper mapper) {
    super(mapper::toDomain, mapper::fromDomain);
    this.repository = repository;
  }

  @Override
  protected CrudRepository<UserEntity, Long> getRepository() {
    return repository;
  }

  @Override
  protected UserEntity findByUid(String uid) {
    return repository.findByUid(uid);
  }
}