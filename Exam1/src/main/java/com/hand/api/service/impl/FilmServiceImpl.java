package com.hand.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import com.hand.domain.entity.Page;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmMapper filmMapper;

    @Override
    public Film findById(Short filmId) {
        Film film = new Film();
        film.setFilmId(filmId);
        return filmMapper.selectByPrimaryKey(film);
    }

    @Override
    public List<Film> list(Page page) {
        PageHelper.startPage(page.getPage(),page.getPageSize(),page.getSort());
        PageHelper.orderBy("film_id");
        return filmMapper.selectAll();
    }
}
