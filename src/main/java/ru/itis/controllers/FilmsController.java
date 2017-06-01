package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.dao.FilmDao;
import ru.itis.models.Film;

import java.util.List;

@Controller
public class FilmsController {

    @Autowired
    private FilmDao filmDao;

    @GetMapping("films/{film-id}")
    public String getFilm(@ModelAttribute("model") ModelMap model, @PathVariable("film-id") int filmId) {
        List<Film> films = filmDao.findAll();
        Film film = films.get(filmId);
        model.addAttribute("film", film);
        return "film";
    }
}
