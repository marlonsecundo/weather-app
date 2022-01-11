import java.util.Date;

public enum MoonPhase {
    NEW_MOON,
    WAXING_CRESCENT,
    FIRST_QUARTER,
    WAXING_GIBBOUS,
    FULL_MOON,
    WANING_GIBBOUS,
    LAST_QUARTER,
    WANING_CRESCENT,
}

public enum Climate {
    RAINY,
    SUNNY,
    CLOUDY,
}

public class DayWeather {

    double temperature;
    String city;
    String country;
    Date date;
    double windVelocity;
    double humidityPercent;
    MoonPhase moonPhase;
    Cliamte climate;

    public DayWeather(double temperature,
            String city,
            String country,
            Date date,
            double windVelocity,
            double humidityPercent,
            MoonPhase moonPhase,
            Climate climate) {

        super();

        this.temperature = temperature;
        this.city = city;
        this.country = country;
        this.date = date;
        this.windVelocity = windVelocity;
        this.humidityPercent = humidityPercent;
        this.moonPhase = moonPhase;
        this.climate = climate;
    }

}
