package com.gitchat.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.gitchat.entity.ChatSession;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChatSessionRepository extends JpaRepository<ChatSession, UUID> {
    List<ChatSession> findByUserIdAndRepositoryIdOrderByCreatedAtDesc(UUID userId, UUID repositoryId);

    Optional<ChatSession> findByIdAndUserId(UUID id, UUID userId);
}
