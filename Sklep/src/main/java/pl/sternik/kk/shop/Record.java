package main.java.pl.sternik.kk.shop;

public class Record extends Article implements Streamable {
	
	private final String format;
	private final int size;
	
	public Record(String format, int size){
		this.format = format;
		this.size = size;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] nextPacket() {
		// TODO Auto-generated method stub
		byte[] tab = new byte[0];
		return tab;
	}



}
