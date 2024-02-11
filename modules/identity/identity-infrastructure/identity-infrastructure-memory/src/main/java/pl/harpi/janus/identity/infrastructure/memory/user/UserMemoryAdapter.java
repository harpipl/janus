package pl.harpi.janus.identity.infrastructure.memory.user;

import org.springframework.stereotype.Repository;
import pl.harpi.janus.identity.domain.model.user.User;
import pl.harpi.janus.identity.domain.ports.outbound.user.UserPort;
import pl.harpi.lib.core.infrastructure.memory.MemoryAdapter;

@Repository
public class UserMemoryAdapter extends MemoryAdapter<User, String> implements UserPort {}
