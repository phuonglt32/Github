package cassandra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cassandra.entity.chess_clubs;
import cassandra.service.Chess_clubService;

@RestController
public class Chess_clubController {
	@Autowired
    private Chess_clubService chessservice;
	
	@RequestMapping(value="/clubs", method = RequestMethod.GET)
    List<chess_clubs> findAll() {
        return chessservice.getAllchess_clubs();
    }
}
