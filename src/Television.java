public class Television
{
// constants
public final int MAX_CHANNEL = 100;
public final int MIN_CHANNEL = 1;
public final int MAX_VOLUME = 10;
public final int MIN_VOLUME = 1;
public final int DEFAULT_CHANNEL = 3;
public final int DEFAULT_VOLUME = 5;
// instance variables

private int channel;
private int volume;
// constructors
public Television()
{
	channel = DEFAULT_CHANNEL;
	volume = DEFAULT_VOLUME;
}
public Television(int c, int v)
{
	channel = c;
	volume = v;
}
// accessor methods
public int getChannel()
{
	return channel;
}
public int getVolume()
{
	return volume;
}
// mutator methods
/* This method increases the channel by one.
* If the channel increase exceeds the value of MAX_CHANNEL
* then the channel should be set to MIN_CHANNEL.
*/
public void increaseChannel()
{
if(MAX_CHANNEL == channel) {
		
	}
	else {
		channel = channel + 1;
	}
	
}
/* This method decreases the channel by one.
* If the channel decrease exceeds the value of MIN_CHANNEL
* then the channel should be set to MAX_CHANNEL.
*/
public void decreaseChannel()
{
	{
		if(MIN_CHANNEL == channel) {
				
			}
			else {
				channel = channel - 1;
			}
			
		}

}
/* This method changes the channel to the value specified
* in the parameter list. If the value of the parameter is
* not a valid channel number then the channel should
* remain unchanged.
* @param c the channel to be changed to
*/
public void selectChannel(int c)
{
	channel = c;
}
/* This method increases the volume by one.
* If MAX_VOLUME is reached a call to increaseVolume
* should have no effect.
*/
public void increaseVolume()
{
	if(MAX_VOLUME == channel) {
		
	}
	else {
		volume = volume + 1;
	}
}
/* This method decreases the volume by one.
* If MIN_VOLUME is reached a call to decreaseVolume
* should have no effect.
*/
public void decreaseVolume()
{
	if(MIN_VOLUME == volume) {
		
	}
	else {
		volume = volume - 1;
	}
}

}
