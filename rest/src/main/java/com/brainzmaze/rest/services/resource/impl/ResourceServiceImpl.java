package com.brainzmaze.rest.services.resource.impl;

import com.brainzmaze.rest.dtos.ResourceDto;
import com.brainzmaze.rest.mappers.ResourceMapper;
import com.brainzmaze.rest.models.Resource;
import com.brainzmaze.rest.repositories.ResourceRepository;
import com.brainzmaze.rest.services.resource.ResourceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ResourceServiceImpl implements ResourceService {
    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public ResourceDto createResource(ResourceDto resourceDto) {
        Resource resource = resourceMapper.toModel(resourceDto);
        Resource savedResource = resourceRepository.save(resource);
        return resourceMapper.toDto(savedResource);
    }

    @Override
    public Resource getResourceById(Long id) {
        return resourceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resource not found with id: " + id));
    }

    @Override
    public ResourceDto getResourceDto(Long id) {
        Resource resource = getResourceById(id);
        return resourceMapper.toDto(resource);
    }

}
