package com.brainzmaze.rest.services.resource;

import com.brainzmaze.rest.dtos.ResourceDto;
import com.brainzmaze.rest.models.Resource;

public interface ResourceService {
    public ResourceDto createResource(ResourceDto resourceDto);
    public Resource getResourceById(Long id);
    public ResourceDto getResourceDto(Long id);
}
