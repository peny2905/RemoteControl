
package ask5p;


public class tv {
    
    private boolean open;
    private int volume;
    private int channel;

    public tv(boolean open, int volume, int channel){
        
    }
    
  public boolean isOn(){
      return open;
  }
   public int getvolume(){
       if(open){
       return volume;
   }
       return -1;
       
}
   public int getchannel(){
       if(open){
           return channel;
       }
       return -1;
   }
   public void setOpen(boolean x){
       if (x==true) {
           channel=1;
           volume=10;
       }
       open=x;
   }
   public void onOff(){
      if(open==true){
          open=false;
      } else{
          open=true;
          channel=1;
          volume=10;
      }
       
   }
   public void setChannel(int x){
       if(x>0 && x<101){
           x=channel;
       }else{
       channel=1;
        }
    }
   public void setVolume(int x){
       if(x>0 && x <51){
           x=volume;
       }else{
           volume=0;
       }
   }
 
    public void volumeUp() {
        if (open) {
            setVolume(volume + 1);
        }
    }

    public void volumeDown() {
        if (open) {
            setVolume(volume - 1);
        }
    }

    public void channelUp() {
        if (open) {
            setChannel(channel + 1);
        }
    }

    public void channelDown() {
        if (open) {
            if (channel == 1) {
                channel = 100;
            } else {
                channel--;
            }
        }
    }
}