package pl.harpi.janus.identity.domain.services.user;

import com.google.common.base.Preconditions;
import pl.harpi.janus.identity.domain.model.user.User;
import pl.harpi.janus.identity.domain.ports.outbound.user.UserPort;
import pl.harpi.lib.core.domain.AbstractService;

import java.util.Optional;

public abstract class AbstractUserService extends AbstractService<User, String, UserPort> {
    protected Optional<User> findByUsername(String username) {
        Preconditions.checkNotNull(username, "Username cannot be null");
        Preconditions.checkArgument(!username.isEmpty(), "Username cannot be empty");

        return Optional.empty();
    }
}
