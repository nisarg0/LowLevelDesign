package DesignPatterns.singleton;


// We need this class to be instantiated only once
public class DatabaseConnection {
    private static DatabaseConnection databaseConnection;

    // Making constructor private ensures no one outside the class can initialize the class
    private DatabaseConnection() {
    }

    // Making this method static ensures that it can be accessed globally even when there is no object for
    // DatabaseConnection class
    public static DatabaseConnection getInstance() {
        // Synchronized only the creation of the instance part and nothing else
        synchronized (DatabaseConnection.class) {
            // Use lazy initialization - only create the instance if needed
            // If no object exists then create one and return else simply return
            if (databaseConnection == null) {
                databaseConnection = new DatabaseConnection();
            }
        }
        return databaseConnection;
    }
}


// Gives same instance of DatabaseConnection each time.
// DatabaseConnection databaseConnection = DatabaseConnection.getInstance();


