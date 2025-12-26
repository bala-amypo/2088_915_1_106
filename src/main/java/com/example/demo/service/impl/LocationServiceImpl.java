public Location createLocation(Location l) {
    if (l.getRegion() == null)
        throw new IllegalArgumentException("region required");
    return repo.save(l);
}
