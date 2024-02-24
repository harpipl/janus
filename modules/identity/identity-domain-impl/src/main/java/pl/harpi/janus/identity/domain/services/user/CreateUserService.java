package pl.harpi.janus.identity.domain.services.user;

import lombok.RequiredArgsConstructor;
import lombok.val;
import pl.harpi.janus.identity.domain.model.user.User;
import pl.harpi.janus.identity.domain.ports.inbound.user.CreateUserUseCase;
import pl.harpi.janus.identity.domain.ports.inbound.user.input.CreateUserInput;
import pl.harpi.janus.identity.domain.ports.inbound.user.output.CreateUserOutput;
import pl.harpi.janus.identity.domain.ports.outbound.user.UserPort;
import pl.harpi.lib.core.domain.ServiceResult;
import pl.harpi.lib.core.domain.ServiceTask;
import pl.harpi.lib.core.domain.UseCase;

@UseCase
@RequiredArgsConstructor
public class CreateUserService extends AbstractUserService implements CreateUserUseCase {
  private final UserPort port;

  protected UserPort getPort() {
    return port;
  }

  @Override
  public ServiceResult<CreateUserOutput> process(ServiceTask<CreateUserInput> serviceTask) {
    val input = serviceTask.getInput();

    val existingUser = findByUsername(input.username()).orElse(null);

    if(existingUser != null) {
      throw new IllegalArgumentException("User with the username '" + input.username() + "' already exists.");
    }

    val newUser = User.builder().username(input.username())
            .password(input.password())
            .email(input.email())
            .fullName(input.fullName())
            .build();

    val savedUser = port.save(newUser);

    return createServiceResult(CreateUserOutput.builder().uid(savedUser.uid()).build());
  }
}
