//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.1 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.31 alle 09:21:33 AM CEST 
//


package Historical;

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
public class HObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public HObjectFactory() {
    }

    /**
     * Create an instance of {@link HRoot }
     * 
     */
    public HRoot createRoot() {
        return new HRoot();
    }

    /**
     * Create an instance of {@link HRoot.Forecast }
     * 
     */
    public HRoot.Forecast createRootForecast() {
        return new HRoot.Forecast();
    }

    /**
     * Create an instance of {@link HRoot.Forecast.Forecastday }
     * 
     */
    public HRoot.Forecast.Forecastday createRootForecastForecastday() {
        return new HRoot.Forecast.Forecastday();
    }

    /**
     * Create an instance of {@link HRoot.Forecast.Forecastday.Hour }
     * 
     */
    public HRoot.Forecast.Forecastday.Hour createRootForecastForecastdayHour() {
        return new HRoot.Forecast.Forecastday.Hour();
    }

    /**
     * Create an instance of {@link HRoot.Forecast.Forecastday.Day }
     * 
     */
    public HRoot.Forecast.Forecastday.Day createRootForecastForecastdayDay() {
        return new HRoot.Forecast.Forecastday.Day();
    }

    /**
     * Create an instance of {@link HRoot.Location }
     * 
     */
    public HRoot.Location createRootLocation() {
        return new HRoot.Location();
    }

    /**
     * Create an instance of {@link HRoot.Forecast.Forecastday.Astro }
     * 
     */
    public HRoot.Forecast.Forecastday.Astro createRootForecastForecastdayAstro() {
        return new HRoot.Forecast.Forecastday.Astro();
    }

    /**
     * Create an instance of {@link HRoot.Forecast.Forecastday.Hour.Condition }
     * 
     */
    public HRoot.Forecast.Forecastday.Hour.Condition createRootForecastForecastdayHourCondition() {
        return new HRoot.Forecast.Forecastday.Hour.Condition();
    }

    /**
     * Create an instance of {@link HRoot.Forecast.Forecastday.Day.Condition }
     * 
     */
    public HRoot.Forecast.Forecastday.Day.Condition createRootForecastForecastdayDayCondition() {
        return new HRoot.Forecast.Forecastday.Day.Condition();
    }

}
