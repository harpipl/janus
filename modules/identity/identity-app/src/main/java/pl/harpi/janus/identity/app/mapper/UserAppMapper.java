package pl.harpi.janus.identity.app.mapper;

import org.mapstruct.Mapper;
import pl.harpi.janus.identity.app.model.user.CreateUserRequest;
import pl.harpi.janus.identity.app.model.user.CreateUserResponse;
import pl.harpi.janus.identity.domain.ports.inbound.user.input.CreateUserInput;
import pl.harpi.janus.identity.domain.ports.inbound.user.output.CreateUserOutput;

@Mapper
public interface UserAppMapper {
    CreateUserInput toDomain(CreateUserRequest request);

    CreateUserResponse fromDomain(CreateUserOutput output);

}
