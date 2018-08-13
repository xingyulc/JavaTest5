package com.hand.infra.mapper;

import com.hand.domain.entity.Film;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;
import tk.mybatis.mapper.common.Mapper;

import static tk.mybatis.mapper.code.Style.camelhump;


public interface FilmMapper extends Mapper<Film> {
//    int deleteByPrimaryKey(Short filmId);
//
//    int insert(Film record);
//
//    int insertSelective(Film record);
//
//    Film findById(Short filmId);
//
//    int updateByPrimaryKeySelective(Film record);
//
//    int updateByPrimaryKeyWithBLOBs(Film record);
//
//    int updateByPrimaryKey(Film record);
}