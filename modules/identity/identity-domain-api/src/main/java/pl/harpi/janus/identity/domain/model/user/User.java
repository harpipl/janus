package pl.harpi.janus.identity.domain.model.user;

import lombok.Builder;
import pl.harpi.lib.core.domain.ports.outbound.Identifiable;

@Builder(toBuilder = true)
public record User(String uid, String username, String password, String email, String fullName) implements Identifiable<String> {
    @Override
    public String getUid() {
        return this.uid();
    }
}
