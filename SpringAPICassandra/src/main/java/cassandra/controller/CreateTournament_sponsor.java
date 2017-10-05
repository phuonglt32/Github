package cassandra.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datastax.driver.core.LocalDate;

import cassandra.entity.Actual_tournament_sponsor;
import cassandra.entity.List_of_sponsor;
import cassandra.entity.Tournament;
import cassandra.service.ActualtournamentsponsorService;
import cassandra.service.ListofsponsorService;
import cassandra.service.TournamentServicce;

@RestController
public class CreateTournament_sponsor {
	
	@Autowired
	private TournamentServicce tourservice;
	
	@Autowired
	private ListofsponsorService sponsorservice;
	
	@Autowired
	private ActualtournamentsponsorService actual;
	
	@RequestMapping(value = "/tour", method = RequestMethod.POST)    
	Actual_tournament_sponsor create(@RequestBody Tournament tour,@RequestBody List_of_sponsor sponsor) {       
		tour.setTournamentStartDate(LocalDate.fromYearMonthDay(Calendar.YEAR, Calendar.MONTH,Calendar.DATE));
		tourservice.createtournament(tour);
		
        sponsorservice.createsponsor(sponsor);
        
        Actual_tournament_sponsor actualentities = new Actual_tournament_sponsor(tour.getTournamentId(), sponsor.getSponsorId(), sponsor.getSponsorName(), sponsor.getSponsorPhone(), tour.getTournamentDetails(), tour.getTournamtentEndDate(), tour.getTournamentName(), tour.getTournamentStartDate());
        return actual.createactual(actualentities);
    }
	
	@RequestMapping(value="/tour", method = RequestMethod.GET)
    List<Tournament> findAll() {
        return tourservice.getAllTournament();
        
    }
	
	
	
}
