package com.techelevator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	@RequestMapping(path = "/actorListResult", method = RequestMethod.GET)
	public String showActorSearchResults(@RequestParam(defaultValue = "") String lastName, ModelMap modelHolder) {
		lastName = lastName.toUpperCase();
		if (!lastName.equals("")) {
			modelHolder.put("actors", actorDao.getMatchingActors(lastName));
		}
		return "actorList";
	}

	@RequestMapping(path = "/actorList", method = RequestMethod.GET)
	public String searchActors() {
		return "actorList";
	}
}