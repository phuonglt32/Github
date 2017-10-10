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
	private ActualtournamentsponsorService actualService;
	
	@RequestMapping(value = "/tour", method = RequestMethod.POST)    
	Actual_tournament_sponsor create(Actual_tournament_sponsor actual) {      
		actual.setTournament_start_date(LocalDate.fromYearMonthDay(Calendar.YEAR, Calendar.MONTH,Calendar.DATE));
		actual.setTournament_end_date(LocalDate.fromYearMonthDay(Calendar.YEAR, Calendar.MONTH,Calendar.DATE));
		List_of_sponsor sponsor = new List_of_sponsor(actual.getPk().getSponsorid(),actual.getSponsor_name(),actual.getSponsor_phone());
		sponsorservice.createsponsor(sponsor);
		
		Tournament tour = new Tournament(actual.getPk().getTournamentid(),actual.getOrganizerid(),actual.getTournament_start_date(), actual.getTournament_end_date(), actual.getTournament_name(), actual.getTournament_details());
        tourservice.createtournament(tour);
        
        return actualService.createactual(actual);
        
        //Actual_tournament_sponsor actualentities = new Actual_tournament_sponsor(tour.getTournamentId(), sponsor.getSponsorId(), sponsor.getSponsorName(), sponsor.getSponsorPhone(), tour.getTournamentDetails(), tour.getTournamtentEndDate(), tour.getTournamentName(), tour.getTournamentStartDate());
        //return actual.createactual(actualentities);
    }
	
	@RequestMapping(value="/tour", method = RequestMethod.GET)
    List<Tournament> findAll() {
        return tourservice.getAllTournament();
        
    }
	
	@RequestMapping(value="/sponsor", method = RequestMethod.GET)
    List<List_of_sponsor> findAllSponsor() {
        return sponsorservice.getAllList_of_sponsors();
        
    }
    
    @RequestMapping(value="/actualtoursponsor", method = RequestMethod.GET)
    List<Actual_tournament_sponsor> findAllactualtoursponsor() {
        return actualService.getAllActual_tournament_sponsors();
        
    }
	
	
	
}
