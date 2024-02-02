package pl.harpi.janus.identity.app.mapper;

import org.mapstruct.Mapper;
import pl.harpi.janus.identity.app.model.user.CreateUserRequest;
import pl.harpi.janus.identity.domain.ports.inbound.user.input.CreateUserInput;

@Mapper
public interface UserAppMapper {
    CreateUserInput toDomain(CreateUserRequest request);
}
