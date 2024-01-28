package pl.harpi.janus.identity.domain.ports.inbound.user.output;

import lombok.Builder;
import pl.harpi.lib.core.domain.Output;

@Builder(toBuilder = true)
public record CreateUserOutput(String uid) implements Output {}
