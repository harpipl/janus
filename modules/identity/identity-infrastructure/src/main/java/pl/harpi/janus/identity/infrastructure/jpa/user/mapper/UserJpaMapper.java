package pl.harpi.janus.identity.infrastructure.jpa.user.mapper;

import org.mapstruct.Mapper;
import pl.harpi.janus.identity.domain.model.user.User;
import pl.harpi.janus.identity.infrastructure.jpa.user.model.UserEntity;

import java.util.List;

@Mapper
public interface UserJpaMapper {
    UserEntity fromDomain(User obj);
    User toDomain(UserEntity entity);
}
