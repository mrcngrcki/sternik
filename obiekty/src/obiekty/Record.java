package obiekty;

public class Record extends Article implements Streamable {
	
	String format;
	String size;
	
	public Record(String format, String size){
		this.format = format;
		this.size = size;
	}

	@Override
	public void checkSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkFormat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public byte[] nextPacket() {
		// TODO Auto-generated method stub
		return null;
	}

}
