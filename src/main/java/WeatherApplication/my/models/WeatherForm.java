package WeatherApplication.my.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Objects;

public class WeatherForm {

    @Max(45)
    @Min(-45)
    private int temp;

    @Max(100)
    @Min(0)
    private int humidity;

    @Pattern(regexp="(?ix)^[A-Z.-]+(?:\\s+[A-Z.-]+)*$")
    private String name;


    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeatherForm)) return false;
        WeatherForm that = (WeatherForm) o;
        return getTemp() == that.getTemp() &&
                getHumidity() == that.getHumidity() &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTemp(), getHumidity(), getName());
    }
}
