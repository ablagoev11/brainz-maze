package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.ResourceDto;
import com.brainzmaze.rest.models.Resource;

public class ResourceMapper {
    public static ResourceDto toDto(Resource resource) {
        ResourceDto dto = new ResourceDto();
        dto.setId(resource.getId());
        dto.setName(resource.getName());
        dto.setType(resource.getType());
        dto.setUrl(resource.getUrl());
        return dto;
    }
    public static Resource toResource(ResourceDto dto) {
        Resource resource = new Resource();
        resource.setId(dto.getId());
        resource.setName(dto.getName());
        resource.setType(dto.getType());
        resource.setUrl(dto.getUrl());
        return resource;
    }
}
