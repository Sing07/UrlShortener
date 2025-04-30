package com.codewsing.urlshortener.domain.repositories;

import com.codewsing.urlshortener.domain.entities.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {
}
