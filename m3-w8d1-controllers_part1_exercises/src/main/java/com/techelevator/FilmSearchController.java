package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Film;

/**
 * 
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

	@Autowired
	FilmDao filmDao;

	@RequestMapping(path = "/filmList", method = RequestMethod.GET)
	public String searchFilms() {
		return "filmList";
	}

	@RequestMapping(path = "/filmListResult", method = RequestMethod.GET)
	public String searchFilmResults(@RequestParam(required = false) String genre,
			@RequestParam(required = false) int minLength, @RequestParam(required = false) int maxLength,
			ModelMap modelHolder) {
		modelHolder.put("filmList", filmDao.getFilmsBetween(genre, minLength, maxLength));
		return "filmList";
	}

}