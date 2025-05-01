package com.codewsing.urlshortener.domain.repositories;

import com.codewsing.urlshortener.domain.entities.ShortUrl;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {
//    @Query("select su from ShortUrl su left join fetch su.createdBy where su.isPrivate = false order by su.createdAt desc ")
//    or
    @Query("select su from ShortUrl su where su.isPrivate = false order by su.createdAt desc ")
    @EntityGraph(attributePaths = {"createdBy"})
    List<ShortUrl> findPublicShortUrls();

    boolean existsByShortKey(String shortKey);
}
