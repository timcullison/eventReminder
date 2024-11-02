package eventReminder.Dao;

import java.util.List;
import java.util.Optional;

import eventReminder.Entities.Task;

public class TaskDao implements Dao<Task> {

	@Override
	public Optional<Task> get(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Task> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Task t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Task t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Task t) {
		// TODO Auto-generated method stub
		
	}

}
