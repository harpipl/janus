package pl.harpi.janus.identity.domain.ports.inbound.user.input;

import lombok.Builder;
import pl.harpi.lib.core.domain.Input;

@Builder(toBuilder = true)
public record CreateUserInput(String username, String password, String email) implements Input {}