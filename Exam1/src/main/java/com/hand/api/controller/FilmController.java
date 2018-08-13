package com.hand.api.controller;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import com.hand.domain.entity.Page;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmController {

    private Logger logger = (Logger) LoggerFactory.getLogger(FilmController.class);

    @Autowired
    private FilmService filmService;

    @GetMapping("/film")
    public List<Film> list(@RequestBody Page page){
        page.setSort("ASC");
        List<Film> films = filmService.list(page);
        logger.info("==========> user pagehelper");
        for (int i = 0; i < films.size(); i++) {
            logger.info(films.get(i).toString());
        }
        return films;
    }
}
