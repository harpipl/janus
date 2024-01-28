package pl.harpi.janus.identity.domain.ports.inbound.user;

import pl.harpi.janus.identity.domain.ports.inbound.user.input.CreateUserInput;
import pl.harpi.janus.identity.domain.ports.inbound.user.output.CreateUserOutput;
import pl.harpi.lib.core.domain.Service;

public interface CreateUserUseCase extends Service<CreateUserInput, CreateUserOutput> {}
