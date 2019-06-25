package routing;

import core.Connection;
import core.Settings;

public class MazurRouter extends ActiveRouter {

	private class RREQ {
		public String sourceAddress;
		public int sourceSequence; //timestamp wysłania RREQ
		public int broadcastId;
		public String destinationAddress;
		public int destinationSequence; //0?
		public int hopCount;  
	}

	private class RREP {
		public String sourceAddress;
		public String destinationAddress;
		public int sourceSequence;
		public int hopCount;
		public int lifeTime;
	}

	List<RREQ> RREQPackets;
	List<RREP> RREPPackets;

	protected MazurRouter(ActiveRouter r) {
		super(r);
		RREPPackets = new ArrayList();
		RREQPackets = new ArrayList();
	}

	public MazurRouter(Settings s) {
		super(s);
		RREPPackets = new ArrayList();
		RREQPackets = new ArrayList();
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
