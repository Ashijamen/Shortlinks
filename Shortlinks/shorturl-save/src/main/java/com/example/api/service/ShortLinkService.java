package com.example.api.service;

import com.example.api.entity.ShortLink;
import com.example.api.repository.ShortLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ShortLinkService {

    @Autowired
    private ShortLinkRepository shortLinkRepository;

    public ShortLink shortenLink(String originalLink) {
        // Generowanie unikalnego UUID
        UUID id = UUID.randomUUID();

        // Tworzenie obiektu ShortLink
        ShortLink shortLink = new ShortLink();
        shortLink.setId(id);
        shortLink.setOriginalLink(originalLink);

        // Zapisanie ShortLink do bazy danych
        shortLinkRepository.save(shortLink);

        // Generowanie skróconego URL na podstawie adresu serwera i identyfikatora
        String serverUrl = "http://localhost:8002/link/";
        String shortUrl = serverUrl + id.toString();

        // Ustawienie skróconego URL w obiekcie ShortLink
        shortLink.setShortLink(shortUrl);

        // Zwrócenie obiektu ShortLink z ustawionym skróconym URL
        return shortLink;
    }
}
