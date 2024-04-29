package com.omaryusufonalan.duelappbackend.core.base;

public interface BaseService<Entity extends BaseEntity, Request, Response> {
    Entity getById(Long id);
    Response getResponseById(Long id);
    Response create(Request request);
    Response update(Long id, Request request);
    void delete(Long id);
}
