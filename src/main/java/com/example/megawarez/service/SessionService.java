package com.example.megawarez.service;

import com.example.megawarez.dao.SessionDao;
import com.example.megawarez.domain.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService implements ISessionService{

    @Autowired
    private SessionDao sessionDao;

    @Override
    public List<Session> list() {
        return (List<Session>) sessionDao.findAll();
    }

    @Override
    public Session save(Session session) {
        return sessionDao.save(session);
    }

    @Override
    public Session update(Long id, Session session) {
        session.setId(id);
        return sessionDao.save(session);
    }

    @Override
    public void delete(Session session) {
        sessionDao.delete(session);
    }

    @Override
    public Optional<Session> findContact(Session session) {
        return sessionDao.findById(session.getId());
    }
}