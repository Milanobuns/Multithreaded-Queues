import java.time.LocalDateTime;

public class Item 
{
	int id;
	long enqTime, deqTime;
	
	public Item next;
	
	Item( int _id )
	{
		id = _id;
		next = null;
	}

	public int getId() 
	{
		return id;
	}

	public long getEnqTime() 
	{
		return enqTime;
	}

	public void setEnqTime( long enqTime )  
	{
		this.enqTime = enqTime;
	}

	public long getDeqTime() 
	{
		return deqTime;
	}

	public void setDeqTime( long deqTime )
{
		this.deqTime = deqTime;
	}
}
