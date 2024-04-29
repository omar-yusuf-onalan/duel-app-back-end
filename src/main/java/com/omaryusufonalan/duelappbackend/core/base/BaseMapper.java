package com.omaryusufonalan.duelappbackend.core.base;

import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import java.util.List;

public interface BaseMapper<Entity extends BaseEntity, Request, Response> {
    @Named("requestToEntity")
    Entity requestToEntity(Request request);

    @Named("responseToEntity")
    Entity responseToEntity(Response response);

    @Named("entityToRequest")
    Request entityToRequest(Entity entity);

    @Named("entityToResponse")
    Response entityToResponse(Entity entity);

    @Named("entityToListResponse")
    List<Response> entityToListResponse(List<Entity> entity);

    void update(@MappingTarget Entity targetEntity, Request updatingRequest);
}
