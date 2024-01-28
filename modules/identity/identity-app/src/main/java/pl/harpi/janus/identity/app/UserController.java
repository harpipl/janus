package pl.harpi.janus.identity.app;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.harpi.janus.identity.domain.ports.inbound.user.CreateUserUseCase;
import pl.harpi.janus.identity.domain.ports.inbound.user.input.CreateUserInput;
import pl.harpi.lib.core.domain.ServiceTask;

@RestController
@RequestMapping("/identity/users")
@RequiredArgsConstructor
public class UserController {
  private final CreateUserUseCase createUserUseCase;

  @GetMapping
  public void getPerson() {
    val input = CreateUserInput.builder().username("user").build();
    createUserUseCase.process(ServiceTask.of(input, "user"));
  }
}
