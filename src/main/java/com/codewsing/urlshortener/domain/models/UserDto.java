package com.codewsing.urlshortener.domain.models;

import java.io.Serializable;

/**
 * DTO for {@link com.codewsing.urlshortener.domain.entities.User}
 */
public record UserDto(Long id, String name) implements Serializable {
}