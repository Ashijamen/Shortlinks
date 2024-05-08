package com.example.api.service;

import com.example.api.entity.ShortLink;
import com.example.api.repository.ShortLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ShortLinkService {

    private final ShortLinkRepository shortLinkRepository;

    @Autowired
    public ShortLinkService(ShortLinkRepository shortLinkRepository) {
        this.shortLinkRepository = shortLinkRepository;
    }

    public ShortLink saveLink(ShortLink shortLink) {
        return shortLinkRepository.save(shortLink);
    }

    public Optional<ShortLink> getLinkById(UUID linkId) {
        return shortLinkRepository.findById(linkId);
    }

    public List<ShortLink> getAllLinks() {
        return shortLinkRepository.findAll();
    }
}
