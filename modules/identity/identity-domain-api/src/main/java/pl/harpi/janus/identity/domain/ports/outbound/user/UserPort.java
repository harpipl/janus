package pl.harpi.janus.identity.domain.ports.outbound.user;

import pl.harpi.janus.identity.domain.model.user.User;
import pl.harpi.lib.core.domain.ports.outbound.Port;

public interface UserPort extends Port<User, String> {}
