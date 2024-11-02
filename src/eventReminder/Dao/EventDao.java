package eventReminder.Dao;

import java.util.List;
import java.util.Optional;

import eventReminder.Entities.Event;

public class EventDao implements Dao<Event> {

	@Override
	public Optional<Event> get(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Event> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Event t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Event t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Event t) {
		// TODO Auto-generated method stub
		
	}

}
