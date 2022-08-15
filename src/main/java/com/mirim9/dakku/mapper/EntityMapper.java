package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.BaseEntityDto;
import org.mapstruct.IterableMapping;
import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@MapperConfig(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EntityMapper <D, E> {

    E toEntity(D dto);

    @IterableMapping(elementTargetType = BaseEntityDto.class)
    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    @IterableMapping(elementTargetType = BaseEntityDto.class)
    List<D> toDto(List<E> entityList);
}