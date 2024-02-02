package pl.harpi.janus.identity.app.model.user;

public record CreateUserRequest(String username, String password, String email, String fullName) {}
