package pl.harpi.janus.identity.app.model.user;

public record CreateUserResponse(String username, String password, String email, String fullName) {}
