package shop;

public interface Streamable extends Downloadable{
	byte[] nextPacket();
}
