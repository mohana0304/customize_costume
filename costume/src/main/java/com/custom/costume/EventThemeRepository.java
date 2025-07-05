package com.custom.costume;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventThemeRepository extends MongoRepository<EventTheme, String> {
}
