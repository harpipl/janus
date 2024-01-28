package pl.harpi.janus.identity.domain.model.user;

import lombok.Builder;

@Builder(toBuilder = true)
public record User(String uid, String username, String password, String email, String fullName) {}
