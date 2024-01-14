// Facade class
public class ServerFacade {
    private ScheduleServer scheduleServer;

    public ServerFacade(ScheduleServer scheduleServer) {
        this.scheduleServer = scheduleServer;
    }

    public void startServer() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Server is ready to work...");
    }

    public void stopServer() {
        System.out.println("Server is stopping...");
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
        System.out.println("Server has stopped.");
    }
}
