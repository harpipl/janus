package pl.harpi.janus.identity.infrastructure.jpa.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.harpi.janus.identity.infrastructure.jpa.user.model.UserEntity;

@Repository
public interface UserJpaRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByUid(String uid);
}
