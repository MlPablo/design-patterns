package task_3_3;

public class RemoteController {
    private Command onCommand;
    private Command offCommand;
    private Command volumeUpCommand;
    private Command volumeDownCommand;
    private Command nextChanelCommand;
    private Command prevChanelCommand;

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    public void setVolumeUpCommand(Command volumeUpCommand) {
        this.volumeUpCommand = volumeUpCommand;
    }

    public void setVolumeDownCommand(Command volumeDownCommand) {
        this.volumeDownCommand = volumeDownCommand;
    }

    public void setNextChanelCommand(Command nextChanelCommand) {
        this.nextChanelCommand = nextChanelCommand;
    }

    public void setPrevChanelCommand(Command prevChanelCommand) {
        this.prevChanelCommand = prevChanelCommand;
    }

    void deviceOn(){
        onCommand.execute();
    }
    void deviceOff(){
        offCommand.execute();
    }
    void deviceVolumeUp(){
        volumeUpCommand.execute();
    }
    void deviceVolumeDown(){
        volumeDownCommand.execute();
    }
    void deviceNextChanel(){
        nextChanelCommand.execute();
    }
    void devicePrevChanel(){
        prevChanelCommand.execute();
    }
}
