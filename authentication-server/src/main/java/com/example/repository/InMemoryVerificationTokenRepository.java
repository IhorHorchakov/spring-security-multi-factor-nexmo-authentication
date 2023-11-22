package com.example.repository;

import com.example.repository.entity.SmsCodeVerificationToken;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Repository
public class InMemoryVerificationTokenRepository implements VerificationTokenRepository {

    private final Map<String, SmsCodeVerificationToken> storage = new LinkedHashMap<>();


    @Override
    public Optional<SmsCodeVerificationToken> getLatestPendingTokenByUserId(int userId) {
        return Optional.empty();
    }

    @Override
    public void save(SmsCodeVerificationToken token) {
        if (token.getTokenId() == null) {
            throw new IllegalArgumentException("Failed to save token, the tokenId is null");
        }
        this.storage.put(token.getTokenId(), token);
    }
}
