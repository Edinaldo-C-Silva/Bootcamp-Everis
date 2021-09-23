package com.dio.Beerstock.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.dio.Beerstock.dto.BeerDTO;
import com.dio.Beerstock.entity.Beer;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
