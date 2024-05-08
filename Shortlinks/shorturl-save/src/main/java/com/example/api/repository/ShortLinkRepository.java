package com.example.api.repository;

import com.example.api.entity.ShortLink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShortLinkRepository extends CrudRepository<ShortLink, UUID> {
}
