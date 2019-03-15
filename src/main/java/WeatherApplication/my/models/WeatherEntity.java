package WeatherApplication.my.models;

import java.time.LocalTime;
import java.util.Objects;

public class WeatherEntity {
    private String town;
    private double temperature;
    private double humidity;
    private LocalTime actualDate;

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public LocalTime getActualDate() {
        return actualDate;
    }

    public void setActualDate(LocalTime actualDate) {
        this.actualDate = actualDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeatherEntity)) return false;
        WeatherEntity that = (WeatherEntity) o;
        return Double.compare(that.getTemperature(), getTemperature()) == 0 &&
                Double.compare(that.getHumidity(), getHumidity()) == 0 &&
                Objects.equals(getTown(), that.getTown()) &&
                Objects.equals(getActualDate(), that.getActualDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTown(), getTemperature(), getHumidity(), getActualDate());
    }
}