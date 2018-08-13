package com.hand.api.service;

import com.hand.domain.entity.Film;
import com.hand.domain.entity.Page;

import java.util.List;

public interface FilmService {
    Film findById(Short filmId);

    List<Film> list(Page page);


}
