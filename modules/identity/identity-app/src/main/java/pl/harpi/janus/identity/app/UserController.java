package pl.harpi.janus.identity.app;

import com.google.common.base.Preconditions;
import java.security.Principal;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.harpi.janus.identity.app.mapper.UserAppMapper;
import pl.harpi.janus.identity.app.model.user.CreateUserRequest;
import pl.harpi.janus.identity.domain.ports.inbound.user.CreateUserUseCase;
import pl.harpi.lib.core.domain.ServiceTask;

@RestController
@RequestMapping("/api/identity")
@RequiredArgsConstructor
public class UserController {
  private final UserAppMapper userAppMapper;
  private final CreateUserUseCase createUserUseCase;

  @PostMapping("/v1/users")
  public ResponseEntity<String> createUser(@RequestBody CreateUserRequest request, Principal principal) {
    Preconditions.checkNotNull(principal, "Required principal name");

    val input = userAppMapper.toDomain(request);
    val result = createUserUseCase.process(ServiceTask.of(input, principal.getName()));

    return ResponseEntity.ok("ok");
  }
}
