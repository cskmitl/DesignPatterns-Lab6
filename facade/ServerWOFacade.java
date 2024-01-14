public class ServerWOFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
        ServerFacade serverFacade = new ServerFacade(scheduleServer);

        // Start the server
        serverFacade.startServer();

        System.out.println("Server is working...");

        // Stop the server
        serverFacade.stopServer();
    }
}
