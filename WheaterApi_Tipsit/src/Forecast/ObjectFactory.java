//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.1 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.16 alle 11:47:03 AM CET 
//


package Forecast;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Root }
     * 
     */
    public Root createRoot() {
        return new Root();
    }

    /**
     * Create an instance of {@link Root.Forecast }
     * 
     */
    public Root.Forecast createRootForecast() {
        return new Root.Forecast();
    }

    /**
     * Create an instance of {@link Root.Forecast.Forecastday }
     * 
     */
    public Root.Forecast.Forecastday createRootForecastForecastday() {
        return new Root.Forecast.Forecastday();
    }

    /**
     * Create an instance of {@link Root.Forecast.Forecastday.Hour }
     * 
     */
    public Root.Forecast.Forecastday.Hour createRootForecastForecastdayHour() {
        return new Root.Forecast.Forecastday.Hour();
    }

    /**
     * Create an instance of {@link Root.Forecast.Forecastday.Day }
     * 
     */
    public Root.Forecast.Forecastday.Day createRootForecastForecastdayDay() {
        return new Root.Forecast.Forecastday.Day();
    }

    /**
     * Create an instance of {@link Root.Current }
     * 
     */
    public Root.Current createRootCurrent() {
        return new Root.Current();
    }

    /**
     * Create an instance of {@link Root.Location }
     * 
     */
    public Root.Location createRootLocation() {
        return new Root.Location();
    }

    /**
     * Create an instance of {@link Root.Forecast.Forecastday.Astro }
     * 
     */
    public Root.Forecast.Forecastday.Astro createRootForecastForecastdayAstro() {
        return new Root.Forecast.Forecastday.Astro();
    }

    /**
     * Create an instance of {@link Root.Forecast.Forecastday.Hour.Condition }
     * 
     */
    public Root.Forecast.Forecastday.Hour.Condition createRootForecastForecastdayHourCondition() {
        return new Root.Forecast.Forecastday.Hour.Condition();
    }

    /**
     * Create an instance of {@link Root.Forecast.Forecastday.Hour.AirQuality }
     * 
     */
    public Root.Forecast.Forecastday.Hour.AirQuality createRootForecastForecastdayHourAirQuality() {
        return new Root.Forecast.Forecastday.Hour.AirQuality();
    }

    /**
     * Create an instance of {@link Root.Forecast.Forecastday.Day.Condition }
     * 
     */
    public Root.Forecast.Forecastday.Day.Condition createRootForecastForecastdayDayCondition() {
        return new Root.Forecast.Forecastday.Day.Condition();
    }

    /**
     * Create an instance of {@link Root.Forecast.Forecastday.Day.AirQuality }
     * 
     */
    public Root.Forecast.Forecastday.Day.AirQuality createRootForecastForecastdayDayAirQuality() {
        return new Root.Forecast.Forecastday.Day.AirQuality();
    }

    /**
     * Create an instance of {@link Root.Current.Condition }
     * 
     */
    public Root.Current.Condition createRootCurrentCondition() {
        return new Root.Current.Condition();
    }

    /**
     * Create an instance of {@link Root.Current.AirQuality }
     * 
     */
    public Root.Current.AirQuality createRootCurrentAirQuality() {
        return new Root.Current.AirQuality();
    }

}
