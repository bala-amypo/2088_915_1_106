public User register(User u) {
    if (repo.findByEmail(u.getEmail()).isPresent())
        throw new IllegalArgumentException("email exists");
    if (u.getRole() == null) u.setRole("USER");
    return repo.save(u);
}
