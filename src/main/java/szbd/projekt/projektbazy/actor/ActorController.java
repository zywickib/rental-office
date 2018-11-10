package szbd.projekt.projektbazy.actor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ActorController {
	
	@Autowired
	private ActorService actorService;

	@RequestMapping(method=RequestMethod.GET,value="/actor/all")
	public List<Actor> getAllActors() {	
		return actorService.getAllActors();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/actor/{idActor}")
	public Optional<Actor> getActor(@PathVariable Integer idActor)
	{
		return actorService.getActor(idActor);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/actor")
	public void addActor(@RequestBody Actor actor)
	{
		actorService.addActor(actor);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/actor/{idActor}")
	public void deleteActor(@PathVariable Integer idActor)
	{
		
		actorService.deleteActor(idActor);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/actor/{idActor}")
	public void updateActor(@RequestBody Actor actor,@PathVariable Integer idActor)
	{
		 actorService.updateActor(idActor, actor);
	}
}
