package routing;

import core.Connection;
import core.Settings;

public class MazurRouter extends ActiveRouter {

	protected MazurRouter(ActiveRouter r) {
		super(r);
	}

	public MazurRouter(Settings s) {
		super(s);
	}

	@Override
	public MessageRouter replicate() {
		return null;
	}

	@Override
	public void changedConnection(Connection con) {
		super.changedConnection(con);
		
	}
}
