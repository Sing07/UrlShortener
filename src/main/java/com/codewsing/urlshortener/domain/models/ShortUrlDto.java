package com.codewsing.urlshortener.domain.models;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.codewsing.urlshortener.domain.entities.ShortUrl}
 */
public record ShortUrlDto(Long id, String shortKey, String originalUrl, Boolean isPrivate, Instant expiresAt,
                          UserDto createdBy, Long clickCount, Instant createdAt) implements Serializable {
}