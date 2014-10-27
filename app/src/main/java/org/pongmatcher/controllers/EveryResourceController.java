package org.pongmatcher.controllers;

import org.pongmatcher.repositories.MatchRepository;
import org.pongmatcher.repositories.MatchRequestRepository;
import org.pongmatcher.repositories.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EveryResourceController {

    @Autowired
    private MatchRequestRepository matchRequestRepository;
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private ResultRepository resultRepository;

    @Transactional
    @RequestMapping(value = "/all", method = RequestMethod.DELETE)
    public
    @ResponseBody
    void delete() {
        matchRequestRepository.deleteAll();
        matchRepository.deleteAll();
        resultRepository.deleteAll();
    }
}

