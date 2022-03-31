package com.example.megawarez.service;

import com.example.megawarez.domain.Session;

import java.util.List;
import java.util.Optional;

public interface ISessionService {
    public List<Session> list();

    public Session save(Session session);

    public Session update(Long id, Session session);

    public void delete(Session session);

    public Optional<Session> findContact(Session session);
}
