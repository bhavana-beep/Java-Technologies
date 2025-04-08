class Metro 
{
    int id;
    String line;
    String route;
    double distance;
    int stations;
    boolean isUnderground;
    String city;

    Metro() 
	{
        this("Blue Line", "Downtown to Uptown");
    }

    Metro(String line, String route) 
	{
        this(131);
        this.line = line;
        this.route = route;
    }

    Metro(int id)
	{
        this(13.5, 10);
        this.id = id;
    }

    Metro(double distance, int stations)
	{
        this(true);
        this.distance = distance;
        this.stations = stations;
    }

    Metro(boolean isUnderground) 
	{
        this("Namma Bengalulu metro");
        this.isUnderground = isUnderground;
    }

    Metro(String city)
	{
        this("Metro City", true);
        this.city = city;
    }

    Metro(String line, boolean isUnderground) 
	{
        
        this.line = line;
        this.isUnderground=isUnderground;
    }

    void displayDetails() 
	{
        System.out.println("Metro ID: " + id);
        System.out.println("Line: " + line);
        System.out.println("Route: " + route);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Stations: " + stations);
        System.out.println("Is Underground: " + isUnderground);
        System.out.println("City: " + city);
    }
}