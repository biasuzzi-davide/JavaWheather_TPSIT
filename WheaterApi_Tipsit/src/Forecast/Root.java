//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.1 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.16 alle 11:47:03 AM CET 
//


package Forecast;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="tz_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="localtime_epoch" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                   &lt;element name="localtime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="current"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="last_updated_epoch" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                   &lt;element name="last_updated" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="temp_c" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="temp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="is_day" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="condition"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="wind_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="wind_kph" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="wind_degree" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="wind_dir" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="pressure_mb" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *                   &lt;element name="pressure_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="precip_mm" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="precip_in" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="cloud" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="feelslike_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="feelslike_f" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="vis_km" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="vis_miles" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="uv" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="gust_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="gust_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="air_quality"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="forecast"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="forecastday" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="date_epoch" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                             &lt;element name="day"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="maxtemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="maxtemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="mintemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="mintemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="avgtemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="avgtemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="maxwind_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="maxwind_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="totalprecip_mm" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="totalprecip_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="totalsnow_cm" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="avgvis_km" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="avgvis_miles" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="avghumidity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="daily_will_it_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="daily_chance_of_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="daily_will_it_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="daily_chance_of_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="condition"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="uv" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="air_quality"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence minOccurs="0"&gt;
 *                                                 &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                                 &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="astro"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="sunrise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="sunset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="moonrise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="moonset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="moon_phase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="moon_illumination" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="is_moon_up" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="is_sun_up" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="hour" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="time_epoch" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                                       &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="temp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="temp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="is_day" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="condition"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="wind_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="wind_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="wind_degree" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *                                       &lt;element name="wind_dir" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="pressure_mb" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *                                       &lt;element name="pressure_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="precip_mm" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="precip_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="cloud" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="feelslike_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="feelslike_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="windchill_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="windchill_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="heatindex_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="heatindex_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="dewpoint_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="dewpoint_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="will_it_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="chance_of_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="will_it_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="chance_of_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="vis_km" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="vis_miles" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="gust_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="gust_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="uv" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                       &lt;element name="air_quality"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence minOccurs="0"&gt;
 *                                                 &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                                 &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="alerts" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "location",
    "current",
    "forecast",
    "alerts"
})
@XmlRootElement(name = "root")
public class Root {

    @XmlElement(required = true)
    protected Root.Location location;
    @XmlElement(required = true)
    protected Root.Current current;
    @XmlElement(required = true)
    protected Root.Forecast forecast;
    @XmlElement(required = true)
    protected Object alerts;

    private static Root istance = null;
    public static Root getIstance() throws JAXBException
    {
    	System.out.println("\n\n\nGET ISTANCE\n\n\n");
    	if(istance==null)
    		istance=Root.refresh();
    	return istance;
    }
    
    public static Root refresh(String city) throws JAXBException
    {
    	JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RequestToServer Server=new RequestToServer();
		Server.Request(Server.UrlForecast(city));
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
		return forecast;
    }
    
    public static Root refresh() throws JAXBException
    {
    	JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
		return forecast;
    }
    
    
    /**
     * Recupera il valore della proprietà location.
     * 
     * @return
     *     possible object is
     *     {@link Root.Location }
     *     
     */
    public Root.Location getLocation() {
        return location;
    }

    /**
     * Imposta il valore della proprietà location.
     * 
     * @param value
     *     allowed object is
     *     {@link Root.Location }
     *     
     */
    public void setLocation(Root.Location value) {
        this.location = value;
    }

    /**
     * Recupera il valore della proprietà current.
     * 
     * @return
     *     possible object is
     *     {@link Root.Current }
     *     
     */
    public Root.Current getCurrent() {
        return current;
    }

    /**
     * Imposta il valore della proprietà current.
     * 
     * @param value
     *     allowed object is
     *     {@link Root.Current }
     *     
     */
    public void setCurrent(Root.Current value) {
        this.current = value;
    }

    /**
     * Recupera il valore della proprietà forecast.
     * 
     * @return
     *     possible object is
     *     {@link Root.Forecast }
     *     
     */
    public Root.Forecast getForecast() {
        return forecast;
    }

    /**
     * Imposta il valore della proprietà forecast.
     * 
     * @param value
     *     allowed object is
     *     {@link Root.Forecast }
     *     
     */
    public void setForecast(Root.Forecast value) {
        this.forecast = value;
    }

    /**
     * Recupera il valore della proprietà alerts.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAlerts() {
        return alerts;
    }

    /**
     * Imposta il valore della proprietà alerts.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAlerts(Object value) {
        this.alerts = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="last_updated_epoch" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *         &lt;element name="last_updated" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="temp_c" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="temp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="is_day" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="condition"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="wind_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="wind_kph" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="wind_degree" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="wind_dir" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="pressure_mb" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
     *         &lt;element name="pressure_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="precip_mm" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="precip_in" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="cloud" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="feelslike_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="feelslike_f" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="vis_km" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="vis_miles" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="uv" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="gust_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="gust_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="air_quality"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lastUpdatedEpoch",
        "lastUpdated",
        "tempC",
        "tempF",
        "isDay",
        "condition",
        "windMph",
        "windKph",
        "windDegree",
        "windDir",
        "pressureMb",
        "pressureIn",
        "precipMm",
        "precipIn",
        "humidity",
        "cloud",
        "feelslikeC",
        "feelslikeF",
        "visKm",
        "visMiles",
        "uv",
        "gustMph",
        "gustKph",
        "airQuality"
    })
    public static class Current {

        @XmlElement(name = "last_updated_epoch")
        @XmlSchemaType(name = "unsignedInt")
        protected long lastUpdatedEpoch;
        @XmlElement(name = "last_updated", required = true)
        protected String lastUpdated;
        @XmlElement(name = "temp_c")
        @XmlSchemaType(name = "unsignedByte")
        protected short tempC;
        @XmlElement(name = "temp_f", required = true)
        protected BigDecimal tempF;
        @XmlElement(name = "is_day")
        @XmlSchemaType(name = "unsignedByte")
        protected short isDay;
        @XmlElement(required = true)
        protected Root.Current.Condition condition;
        @XmlElement(name = "wind_mph", required = true)
        protected BigDecimal windMph;
        @XmlElement(name = "wind_kph")
        @XmlSchemaType(name = "unsignedByte")
        protected short windKph;
        @XmlElement(name = "wind_degree")
        @XmlSchemaType(name = "unsignedByte")
        protected short windDegree;
        @XmlElement(name = "wind_dir", required = true)
        protected String windDir;
        @XmlElement(name = "pressure_mb")
        @XmlSchemaType(name = "unsignedShort")
        protected int pressureMb;
        @XmlElement(name = "pressure_in", required = true)
        protected BigDecimal pressureIn;
        @XmlElement(name = "precip_mm")
        @XmlSchemaType(name = "unsignedByte")
        protected short precipMm;
        @XmlElement(name = "precip_in")
        @XmlSchemaType(name = "unsignedByte")
        protected short precipIn;
        @XmlSchemaType(name = "unsignedByte")
        protected short humidity;
        @XmlSchemaType(name = "unsignedByte")
        protected short cloud;
        @XmlElement(name = "feelslike_c", required = true)
        protected BigDecimal feelslikeC;
        @XmlElement(name = "feelslike_f")
        @XmlSchemaType(name = "unsignedByte")
        protected short feelslikeF;
        @XmlElement(name = "vis_km")
        @XmlSchemaType(name = "unsignedByte")
        protected short visKm;
        @XmlElement(name = "vis_miles")
        @XmlSchemaType(name = "unsignedByte")
        protected short visMiles;
        @XmlSchemaType(name = "unsignedByte")
        protected short uv;
        @XmlElement(name = "gust_mph", required = true)
        protected BigDecimal gustMph;
        @XmlElement(name = "gust_kph", required = true)
        protected BigDecimal gustKph;
        @XmlElement(name = "air_quality", required = true)
        protected Root.Current.AirQuality airQuality;

        /**
         * Recupera il valore della proprietà lastUpdatedEpoch.
         * 
         */
        public long getLastUpdatedEpoch() {
            return lastUpdatedEpoch;
        }

        /**
         * Imposta il valore della proprietà lastUpdatedEpoch.
         * 
         */
        public void setLastUpdatedEpoch(long value) {
            this.lastUpdatedEpoch = value;
        }

        /**
         * Recupera il valore della proprietà lastUpdated.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastUpdated() {
            return lastUpdated;
        }

        /**
         * Imposta il valore della proprietà lastUpdated.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastUpdated(String value) {
            this.lastUpdated = value;
        }

        /**
         * Recupera il valore della proprietà tempC.
         * 
         */
        public short getTempC() {
            return tempC;
        }

        /**
         * Imposta il valore della proprietà tempC.
         * 
         */
        public void setTempC(short value) {
            this.tempC = value;
        }

        /**
         * Recupera il valore della proprietà tempF.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTempF() {
            return tempF;
        }

        /**
         * Imposta il valore della proprietà tempF.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTempF(BigDecimal value) {
            this.tempF = value;
        }

        /**
         * Recupera il valore della proprietà isDay.
         * 
         */
        public short getIsDay() {
            return isDay;
        }

        /**
         * Imposta il valore della proprietà isDay.
         * 
         */
        public void setIsDay(short value) {
            this.isDay = value;
        }

        /**
         * Recupera il valore della proprietà condition.
         * 
         * @return
         *     possible object is
         *     {@link Root.Current.Condition }
         *     
         */
        public Root.Current.Condition getCondition() {
            return condition;
        }

        /**
         * Imposta il valore della proprietà condition.
         * 
         * @param value
         *     allowed object is
         *     {@link Root.Current.Condition }
         *     
         */
        public void setCondition(Root.Current.Condition value) {
            this.condition = value;
        }

        /**
         * Recupera il valore della proprietà windMph.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWindMph() {
            return windMph;
        }

        /**
         * Imposta il valore della proprietà windMph.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWindMph(BigDecimal value) {
            this.windMph = value;
        }

        /**
         * Recupera il valore della proprietà windKph.
         * 
         */
        public short getWindKph() {
            return windKph;
        }

        /**
         * Imposta il valore della proprietà windKph.
         * 
         */
        public void setWindKph(short value) {
            this.windKph = value;
        }

        /**
         * Recupera il valore della proprietà windDegree.
         * 
         */
        public short getWindDegree() {
            return windDegree;
        }

        /**
         * Imposta il valore della proprietà windDegree.
         * 
         */
        public void setWindDegree(short value) {
            this.windDegree = value;
        }

        /**
         * Recupera il valore della proprietà windDir.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWindDir() {
            return windDir;
        }

        /**
         * Imposta il valore della proprietà windDir.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWindDir(String value) {
            this.windDir = value;
        }

        /**
         * Recupera il valore della proprietà pressureMb.
         * 
         */
        public int getPressureMb() {
            return pressureMb;
        }

        /**
         * Imposta il valore della proprietà pressureMb.
         * 
         */
        public void setPressureMb(int value) {
            this.pressureMb = value;
        }

        /**
         * Recupera il valore della proprietà pressureIn.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPressureIn() {
            return pressureIn;
        }

        /**
         * Imposta il valore della proprietà pressureIn.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPressureIn(BigDecimal value) {
            this.pressureIn = value;
        }

        /**
         * Recupera il valore della proprietà precipMm.
         * 
         */
        public short getPrecipMm() {
            return precipMm;
        }

        /**
         * Imposta il valore della proprietà precipMm.
         * 
         */
        public void setPrecipMm(short value) {
            this.precipMm = value;
        }

        /**
         * Recupera il valore della proprietà precipIn.
         * 
         */
        public short getPrecipIn() {
            return precipIn;
        }

        /**
         * Imposta il valore della proprietà precipIn.
         * 
         */
        public void setPrecipIn(short value) {
            this.precipIn = value;
        }

        /**
         * Recupera il valore della proprietà humidity.
         * 
         */
        public short getHumidity() {
            return humidity;
        }

        /**
         * Imposta il valore della proprietà humidity.
         * 
         */
        public void setHumidity(short value) {
            this.humidity = value;
        }

        /**
         * Recupera il valore della proprietà cloud.
         * 
         */
        public short getCloud() {
            return cloud;
        }

        /**
         * Imposta il valore della proprietà cloud.
         * 
         */
        public void setCloud(short value) {
            this.cloud = value;
        }

        /**
         * Recupera il valore della proprietà feelslikeC.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFeelslikeC() {
            return feelslikeC;
        }

        /**
         * Imposta il valore della proprietà feelslikeC.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFeelslikeC(BigDecimal value) {
            this.feelslikeC = value;
        }

        /**
         * Recupera il valore della proprietà feelslikeF.
         * 
         */
        public short getFeelslikeF() {
            return feelslikeF;
        }

        /**
         * Imposta il valore della proprietà feelslikeF.
         * 
         */
        public void setFeelslikeF(short value) {
            this.feelslikeF = value;
        }

        /**
         * Recupera il valore della proprietà visKm.
         * 
         */
        public short getVisKm() {
            return visKm;
        }

        /**
         * Imposta il valore della proprietà visKm.
         * 
         */
        public void setVisKm(short value) {
            this.visKm = value;
        }

        /**
         * Recupera il valore della proprietà visMiles.
         * 
         */
        public short getVisMiles() {
            return visMiles;
        }

        /**
         * Imposta il valore della proprietà visMiles.
         * 
         */
        public void setVisMiles(short value) {
            this.visMiles = value;
        }

        /**
         * Recupera il valore della proprietà uv.
         * 
         */
        public short getUv() {
            return uv;
        }

        /**
         * Imposta il valore della proprietà uv.
         * 
         */
        public void setUv(short value) {
            this.uv = value;
        }

        /**
         * Recupera il valore della proprietà gustMph.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGustMph() {
            return gustMph;
        }

        /**
         * Imposta il valore della proprietà gustMph.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGustMph(BigDecimal value) {
            this.gustMph = value;
        }

        /**
         * Recupera il valore della proprietà gustKph.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGustKph() {
            return gustKph;
        }

        /**
         * Imposta il valore della proprietà gustKph.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGustKph(BigDecimal value) {
            this.gustKph = value;
        }

        /**
         * Recupera il valore della proprietà airQuality.
         * 
         * @return
         *     possible object is
         *     {@link Root.Current.AirQuality }
         *     
         */
        public Root.Current.AirQuality getAirQuality() {
            return airQuality;
        }

        /**
         * Imposta il valore della proprietà airQuality.
         * 
         * @param value
         *     allowed object is
         *     {@link Root.Current.AirQuality }
         *     
         */
        public void setAirQuality(Root.Current.AirQuality value) {
            this.airQuality = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "co",
            "no2",
            "o3",
            "so2",
            "pm25",
            "pm10",
            "usEpaIndex",
            "gbDefraIndex"
        })
        public static class AirQuality {

            @XmlElement(required = true)
            protected BigDecimal co;
            @XmlElement(required = true)
            protected BigDecimal no2;
            @XmlElement(required = true)
            protected BigDecimal o3;
            @XmlElement(required = true)
            protected BigDecimal so2;
            @XmlElement(name = "pm2_5", required = true)
            protected BigDecimal pm25;
            @XmlElement(required = true)
            protected BigDecimal pm10;
            @XmlElement(name = "us-epa-index")
            @XmlSchemaType(name = "unsignedByte")
            protected short usEpaIndex;
            @XmlElement(name = "gb-defra-index")
            @XmlSchemaType(name = "unsignedByte")
            protected short gbDefraIndex;

            /**
             * Recupera il valore della proprietà co.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCo() {
                return co;
            }

            /**
             * Imposta il valore della proprietà co.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCo(BigDecimal value) {
                this.co = value;
            }

            /**
             * Recupera il valore della proprietà no2.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNo2() {
                return no2;
            }

            /**
             * Imposta il valore della proprietà no2.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNo2(BigDecimal value) {
                this.no2 = value;
            }

            /**
             * Recupera il valore della proprietà o3.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getO3() {
                return o3;
            }

            /**
             * Imposta il valore della proprietà o3.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setO3(BigDecimal value) {
                this.o3 = value;
            }

            /**
             * Recupera il valore della proprietà so2.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSo2() {
                return so2;
            }

            /**
             * Imposta il valore della proprietà so2.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSo2(BigDecimal value) {
                this.so2 = value;
            }

            /**
             * Recupera il valore della proprietà pm25.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPm25() {
                return pm25;
            }

            /**
             * Imposta il valore della proprietà pm25.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPm25(BigDecimal value) {
                this.pm25 = value;
            }

            /**
             * Recupera il valore della proprietà pm10.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPm10() {
                return pm10;
            }

            /**
             * Imposta il valore della proprietà pm10.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPm10(BigDecimal value) {
                this.pm10 = value;
            }

            /**
             * Recupera il valore della proprietà usEpaIndex.
             * 
             */
            public short getUsEpaIndex() {
                return usEpaIndex;
            }

            /**
             * Imposta il valore della proprietà usEpaIndex.
             * 
             */
            public void setUsEpaIndex(short value) {
                this.usEpaIndex = value;
            }

            /**
             * Recupera il valore della proprietà gbDefraIndex.
             * 
             */
            public short getGbDefraIndex() {
                return gbDefraIndex;
            }

            /**
             * Imposta il valore della proprietà gbDefraIndex.
             * 
             */
            public void setGbDefraIndex(short value) {
                this.gbDefraIndex = value;
            }

        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "text",
            "icon",
            "code"
        })
        public static class Condition {

            @XmlElement(required = true)
            protected String text;
            @XmlElement(required = true)
            protected String icon;
            @XmlSchemaType(name = "unsignedShort")
            protected int code;

            /**
             * Recupera il valore della proprietà text.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Imposta il valore della proprietà text.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

            /**
             * Recupera il valore della proprietà icon.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIcon() {
                return icon;
            }

            /**
             * Imposta il valore della proprietà icon.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIcon(String value) {
                this.icon = value;
            }

            /**
             * Recupera il valore della proprietà code.
             * 
             */
            public int getCode() {
                return code;
            }

            /**
             * Imposta il valore della proprietà code.
             * 
             */
            public void setCode(int value) {
                this.code = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="forecastday" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="date_epoch" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *                   &lt;element name="day"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="maxtemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="maxtemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="mintemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="mintemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="avgtemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="avgtemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="maxwind_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="maxwind_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="totalprecip_mm" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="totalprecip_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="totalsnow_cm" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="avgvis_km" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="avgvis_miles" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="avghumidity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="daily_will_it_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="daily_chance_of_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="daily_will_it_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="daily_chance_of_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="condition"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="uv" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="air_quality"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence minOccurs="0"&gt;
     *                                       &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                                       &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="astro"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="sunrise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="sunset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="moonrise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="moonset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="moon_phase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="moon_illumination" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="is_moon_up" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="is_sun_up" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="hour" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="time_epoch" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *                             &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="temp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="temp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="is_day" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="condition"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="wind_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="wind_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="wind_degree" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
     *                             &lt;element name="wind_dir" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="pressure_mb" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
     *                             &lt;element name="pressure_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="precip_mm" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="precip_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="cloud" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="feelslike_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="feelslike_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="windchill_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="windchill_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="heatindex_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="heatindex_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="dewpoint_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="dewpoint_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="will_it_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="chance_of_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="will_it_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="chance_of_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="vis_km" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="vis_miles" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="gust_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="gust_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="uv" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                             &lt;element name="air_quality"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence minOccurs="0"&gt;
     *                                       &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                                       &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "forecastday"
    })
    public static class Forecast {

        @XmlElement(required = true)
        protected List<Root.Forecast.Forecastday> forecastday;

        /**
         * Gets the value of the forecastday property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the forecastday property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getForecastday().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Root.Forecast.Forecastday }
         * 
         * 
         */
        public List<Root.Forecast.Forecastday> getForecastday() {
            if (forecastday == null) {
                forecastday = new ArrayList<Root.Forecast.Forecastday>();
            }
            return this.forecastday;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="date_epoch" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
         *         &lt;element name="day"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="maxtemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="maxtemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="mintemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="mintemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="avgtemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="avgtemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="maxwind_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="maxwind_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="totalprecip_mm" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="totalprecip_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="totalsnow_cm" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="avgvis_km" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="avgvis_miles" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="avghumidity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="daily_will_it_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="daily_chance_of_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="daily_will_it_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="daily_chance_of_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="condition"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="uv" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="air_quality"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence minOccurs="0"&gt;
         *                             &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                             &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="astro"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="sunrise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="sunset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="moonrise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="moonset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="moon_phase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="moon_illumination" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="is_moon_up" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="is_sun_up" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="hour" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="time_epoch" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
         *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="temp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="temp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="is_day" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="condition"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="wind_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="wind_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="wind_degree" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
         *                   &lt;element name="wind_dir" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="pressure_mb" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
         *                   &lt;element name="pressure_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="precip_mm" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="precip_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="cloud" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="feelslike_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="feelslike_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="windchill_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="windchill_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="heatindex_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="heatindex_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="dewpoint_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="dewpoint_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="will_it_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="chance_of_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="will_it_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="chance_of_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="vis_km" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="vis_miles" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="gust_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="gust_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="uv" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                   &lt;element name="air_quality"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence minOccurs="0"&gt;
         *                             &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                             &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "date",
            "dateEpoch",
            "day",
            "astro",
            "hour"
        })
        public static class Forecastday {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlElement(name = "date_epoch")
            @XmlSchemaType(name = "unsignedInt")
            protected long dateEpoch;
            @XmlElement(required = true)
            protected Root.Forecast.Forecastday.Day day;
            @XmlElement(required = true)
            protected Root.Forecast.Forecastday.Astro astro;
            @XmlElement(required = true)
            protected List<Root.Forecast.Forecastday.Hour> hour;

            /**
             * Recupera il valore della proprietà date.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Imposta il valore della proprietà date.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * Recupera il valore della proprietà dateEpoch.
             * 
             */
            public long getDateEpoch() {
                return dateEpoch;
            }

            /**
             * Imposta il valore della proprietà dateEpoch.
             * 
             */
            public void setDateEpoch(long value) {
                this.dateEpoch = value;
            }

            /**
             * Recupera il valore della proprietà day.
             * 
             * @return
             *     possible object is
             *     {@link Root.Forecast.Forecastday.Day }
             *     
             */
            public Root.Forecast.Forecastday.Day getDay() {
                return day;
            }

            /**
             * Imposta il valore della proprietà day.
             * 
             * @param value
             *     allowed object is
             *     {@link Root.Forecast.Forecastday.Day }
             *     
             */
            public void setDay(Root.Forecast.Forecastday.Day value) {
                this.day = value;
            }

            /**
             * Recupera il valore della proprietà astro.
             * 
             * @return
             *     possible object is
             *     {@link Root.Forecast.Forecastday.Astro }
             *     
             */
            public Root.Forecast.Forecastday.Astro getAstro() {
                return astro;
            }

            /**
             * Imposta il valore della proprietà astro.
             * 
             * @param value
             *     allowed object is
             *     {@link Root.Forecast.Forecastday.Astro }
             *     
             */
            public void setAstro(Root.Forecast.Forecastday.Astro value) {
                this.astro = value;
            }

            /**
             * Gets the value of the hour property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hour property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHour().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Root.Forecast.Forecastday.Hour }
             * 
             * 
             */
            public List<Root.Forecast.Forecastday.Hour> getHour() {
                if (hour == null) {
                    hour = new ArrayList<Root.Forecast.Forecastday.Hour>();
                }
                return this.hour;
            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="sunrise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="sunset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="moonrise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="moonset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="moon_phase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="moon_illumination" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="is_moon_up" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="is_sun_up" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "sunrise",
                "sunset",
                "moonrise",
                "moonset",
                "moonPhase",
                "moonIllumination",
                "isMoonUp",
                "isSunUp"
            })
            public static class Astro {

                @XmlElement(required = true)
                protected String sunrise;
                @XmlElement(required = true)
                protected String sunset;
                @XmlElement(required = true)
                protected String moonrise;
                @XmlElement(required = true)
                protected String moonset;
                @XmlElement(name = "moon_phase", required = true)
                protected String moonPhase;
                @XmlElement(name = "moon_illumination")
                @XmlSchemaType(name = "unsignedByte")
                protected short moonIllumination;
                @XmlElement(name = "is_moon_up")
                @XmlSchemaType(name = "unsignedByte")
                protected short isMoonUp;
                @XmlElement(name = "is_sun_up")
                @XmlSchemaType(name = "unsignedByte")
                protected short isSunUp;

                /**
                 * Recupera il valore della proprietà sunrise.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSunrise() {
                    return sunrise;
                }

                /**
                 * Imposta il valore della proprietà sunrise.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSunrise(String value) {
                    this.sunrise = value;
                }

                /**
                 * Recupera il valore della proprietà sunset.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSunset() {
                    return sunset;
                }

                /**
                 * Imposta il valore della proprietà sunset.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSunset(String value) {
                    this.sunset = value;
                }

                /**
                 * Recupera il valore della proprietà moonrise.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMoonrise() {
                    return moonrise;
                }

                /**
                 * Imposta il valore della proprietà moonrise.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMoonrise(String value) {
                    this.moonrise = value;
                }

                /**
                 * Recupera il valore della proprietà moonset.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMoonset() {
                    return moonset;
                }

                /**
                 * Imposta il valore della proprietà moonset.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMoonset(String value) {
                    this.moonset = value;
                }

                /**
                 * Recupera il valore della proprietà moonPhase.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMoonPhase() {
                    return moonPhase;
                }

                /**
                 * Imposta il valore della proprietà moonPhase.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMoonPhase(String value) {
                    this.moonPhase = value;
                }

                /**
                 * Recupera il valore della proprietà moonIllumination.
                 * 
                 */
                public short getMoonIllumination() {
                    return moonIllumination;
                }

                /**
                 * Imposta il valore della proprietà moonIllumination.
                 * 
                 */
                public void setMoonIllumination(short value) {
                    this.moonIllumination = value;
                }

                /**
                 * Recupera il valore della proprietà isMoonUp.
                 * 
                 */
                public short getIsMoonUp() {
                    return isMoonUp;
                }

                /**
                 * Imposta il valore della proprietà isMoonUp.
                 * 
                 */
                public void setIsMoonUp(short value) {
                    this.isMoonUp = value;
                }

                /**
                 * Recupera il valore della proprietà isSunUp.
                 * 
                 */
                public short getIsSunUp() {
                    return isSunUp;
                }

                /**
                 * Imposta il valore della proprietà isSunUp.
                 * 
                 */
                public void setIsSunUp(short value) {
                    this.isSunUp = value;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="maxtemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="maxtemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="mintemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="mintemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="avgtemp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="avgtemp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="maxwind_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="maxwind_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="totalprecip_mm" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="totalprecip_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="totalsnow_cm" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="avgvis_km" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="avgvis_miles" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="avghumidity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="daily_will_it_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="daily_chance_of_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="daily_will_it_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="daily_chance_of_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="condition"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="uv" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="air_quality"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence minOccurs="0"&gt;
             *                   &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *                   &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "maxtempC",
                "maxtempF",
                "mintempC",
                "mintempF",
                "avgtempC",
                "avgtempF",
                "maxwindMph",
                "maxwindKph",
                "totalprecipMm",
                "totalprecipIn",
                "totalsnowCm",
                "avgvisKm",
                "avgvisMiles",
                "avghumidity",
                "dailyWillItRain",
                "dailyChanceOfRain",
                "dailyWillItSnow",
                "dailyChanceOfSnow",
                "condition",
                "uv",
                "airQuality"
            })
            public static class Day {

                @XmlElement(name = "maxtemp_c", required = true)
                protected BigDecimal maxtempC;
                @XmlElement(name = "maxtemp_f", required = true)
                protected BigDecimal maxtempF;
                @XmlElement(name = "mintemp_c", required = true)
                protected BigDecimal mintempC;
                @XmlElement(name = "mintemp_f", required = true)
                protected BigDecimal mintempF;
                @XmlElement(name = "avgtemp_c", required = true)
                protected BigDecimal avgtempC;
                @XmlElement(name = "avgtemp_f", required = true)
                protected BigDecimal avgtempF;
                @XmlElement(name = "maxwind_mph", required = true)
                protected BigDecimal maxwindMph;
                @XmlElement(name = "maxwind_kph", required = true)
                protected BigDecimal maxwindKph;
                @XmlElement(name = "totalprecip_mm", required = true)
                protected BigDecimal totalprecipMm;
                @XmlElement(name = "totalprecip_in", required = true)
                protected BigDecimal totalprecipIn;
                @XmlElement(name = "totalsnow_cm")
                @XmlSchemaType(name = "unsignedByte")
                protected short totalsnowCm;
                @XmlElement(name = "avgvis_km", required = true)
                protected BigDecimal avgvisKm;
                @XmlElement(name = "avgvis_miles")
                @XmlSchemaType(name = "unsignedByte")
                protected short avgvisMiles;
                @XmlSchemaType(name = "unsignedByte")
                protected short avghumidity;
                @XmlElement(name = "daily_will_it_rain")
                @XmlSchemaType(name = "unsignedByte")
                protected short dailyWillItRain;
                @XmlElement(name = "daily_chance_of_rain")
                @XmlSchemaType(name = "unsignedByte")
                protected short dailyChanceOfRain;
                @XmlElement(name = "daily_will_it_snow")
                @XmlSchemaType(name = "unsignedByte")
                protected short dailyWillItSnow;
                @XmlElement(name = "daily_chance_of_snow")
                @XmlSchemaType(name = "unsignedByte")
                protected short dailyChanceOfSnow;
                @XmlElement(required = true)
                protected Root.Forecast.Forecastday.Day.Condition condition;
                @XmlSchemaType(name = "unsignedByte")
                protected short uv;
                @XmlElement(name = "air_quality", required = true)
                protected Root.Forecast.Forecastday.Day.AirQuality airQuality;

                /**
                 * Recupera il valore della proprietà maxtempC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMaxtempC() {
                    return maxtempC;
                }

                /**
                 * Imposta il valore della proprietà maxtempC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMaxtempC(BigDecimal value) {
                    this.maxtempC = value;
                }

                /**
                 * Recupera il valore della proprietà maxtempF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMaxtempF() {
                    return maxtempF;
                }

                /**
                 * Imposta il valore della proprietà maxtempF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMaxtempF(BigDecimal value) {
                    this.maxtempF = value;
                }

                /**
                 * Recupera il valore della proprietà mintempC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMintempC() {
                    return mintempC;
                }

                /**
                 * Imposta il valore della proprietà mintempC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMintempC(BigDecimal value) {
                    this.mintempC = value;
                }

                /**
                 * Recupera il valore della proprietà mintempF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMintempF() {
                    return mintempF;
                }

                /**
                 * Imposta il valore della proprietà mintempF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMintempF(BigDecimal value) {
                    this.mintempF = value;
                }

                /**
                 * Recupera il valore della proprietà avgtempC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAvgtempC() {
                    return avgtempC;
                }

                /**
                 * Imposta il valore della proprietà avgtempC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAvgtempC(BigDecimal value) {
                    this.avgtempC = value;
                }

                /**
                 * Recupera il valore della proprietà avgtempF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAvgtempF() {
                    return avgtempF;
                }

                /**
                 * Imposta il valore della proprietà avgtempF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAvgtempF(BigDecimal value) {
                    this.avgtempF = value;
                }

                /**
                 * Recupera il valore della proprietà maxwindMph.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMaxwindMph() {
                    return maxwindMph;
                }

                /**
                 * Imposta il valore della proprietà maxwindMph.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMaxwindMph(BigDecimal value) {
                    this.maxwindMph = value;
                }

                /**
                 * Recupera il valore della proprietà maxwindKph.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMaxwindKph() {
                    return maxwindKph;
                }

                /**
                 * Imposta il valore della proprietà maxwindKph.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMaxwindKph(BigDecimal value) {
                    this.maxwindKph = value;
                }

                /**
                 * Recupera il valore della proprietà totalprecipMm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalprecipMm() {
                    return totalprecipMm;
                }

                /**
                 * Imposta il valore della proprietà totalprecipMm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalprecipMm(BigDecimal value) {
                    this.totalprecipMm = value;
                }

                /**
                 * Recupera il valore della proprietà totalprecipIn.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalprecipIn() {
                    return totalprecipIn;
                }

                /**
                 * Imposta il valore della proprietà totalprecipIn.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalprecipIn(BigDecimal value) {
                    this.totalprecipIn = value;
                }

                /**
                 * Recupera il valore della proprietà totalsnowCm.
                 * 
                 */
                public short getTotalsnowCm() {
                    return totalsnowCm;
                }

                /**
                 * Imposta il valore della proprietà totalsnowCm.
                 * 
                 */
                public void setTotalsnowCm(short value) {
                    this.totalsnowCm = value;
                }

                /**
                 * Recupera il valore della proprietà avgvisKm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAvgvisKm() {
                    return avgvisKm;
                }

                /**
                 * Imposta il valore della proprietà avgvisKm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAvgvisKm(BigDecimal value) {
                    this.avgvisKm = value;
                }

                /**
                 * Recupera il valore della proprietà avgvisMiles.
                 * 
                 */
                public short getAvgvisMiles() {
                    return avgvisMiles;
                }

                /**
                 * Imposta il valore della proprietà avgvisMiles.
                 * 
                 */
                public void setAvgvisMiles(short value) {
                    this.avgvisMiles = value;
                }

                /**
                 * Recupera il valore della proprietà avghumidity.
                 * 
                 */
                public short getAvghumidity() {
                    return avghumidity;
                }

                /**
                 * Imposta il valore della proprietà avghumidity.
                 * 
                 */
                public void setAvghumidity(short value) {
                    this.avghumidity = value;
                }

                /**
                 * Recupera il valore della proprietà dailyWillItRain.
                 * 
                 */
                public short getDailyWillItRain() {
                    return dailyWillItRain;
                }

                /**
                 * Imposta il valore della proprietà dailyWillItRain.
                 * 
                 */
                public void setDailyWillItRain(short value) {
                    this.dailyWillItRain = value;
                }

                /**
                 * Recupera il valore della proprietà dailyChanceOfRain.
                 * 
                 */
                public short getDailyChanceOfRain() {
                    return dailyChanceOfRain;
                }

                /**
                 * Imposta il valore della proprietà dailyChanceOfRain.
                 * 
                 */
                public void setDailyChanceOfRain(short value) {
                    this.dailyChanceOfRain = value;
                }

                /**
                 * Recupera il valore della proprietà dailyWillItSnow.
                 * 
                 */
                public short getDailyWillItSnow() {
                    return dailyWillItSnow;
                }

                /**
                 * Imposta il valore della proprietà dailyWillItSnow.
                 * 
                 */
                public void setDailyWillItSnow(short value) {
                    this.dailyWillItSnow = value;
                }

                /**
                 * Recupera il valore della proprietà dailyChanceOfSnow.
                 * 
                 */
                public short getDailyChanceOfSnow() {
                    return dailyChanceOfSnow;
                }

                /**
                 * Imposta il valore della proprietà dailyChanceOfSnow.
                 * 
                 */
                public void setDailyChanceOfSnow(short value) {
                    this.dailyChanceOfSnow = value;
                }

                /**
                 * Recupera il valore della proprietà condition.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.Forecast.Forecastday.Day.Condition }
                 *     
                 */
                public Root.Forecast.Forecastday.Day.Condition getCondition() {
                    return condition;
                }

                /**
                 * Imposta il valore della proprietà condition.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.Forecast.Forecastday.Day.Condition }
                 *     
                 */
                public void setCondition(Root.Forecast.Forecastday.Day.Condition value) {
                    this.condition = value;
                }

                /**
                 * Recupera il valore della proprietà uv.
                 * 
                 */
                public short getUv() {
                    return uv;
                }

                /**
                 * Imposta il valore della proprietà uv.
                 * 
                 */
                public void setUv(short value) {
                    this.uv = value;
                }

                /**
                 * Recupera il valore della proprietà airQuality.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.Forecast.Forecastday.Day.AirQuality }
                 *     
                 */
                public Root.Forecast.Forecastday.Day.AirQuality getAirQuality() {
                    return airQuality;
                }

                /**
                 * Imposta il valore della proprietà airQuality.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.Forecast.Forecastday.Day.AirQuality }
                 *     
                 */
                public void setAirQuality(Root.Forecast.Forecastday.Day.AirQuality value) {
                    this.airQuality = value;
                }


                /**
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence minOccurs="0"&gt;
                 *         &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
                 *         &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "co",
                    "no2",
                    "o3",
                    "so2",
                    "pm25",
                    "pm10",
                    "usEpaIndex",
                    "gbDefraIndex"
                })
                public static class AirQuality {

                    protected BigDecimal co;
                    protected BigDecimal no2;
                    protected BigDecimal o3;
                    protected BigDecimal so2;
                    @XmlElement(name = "pm2_5")
                    protected BigDecimal pm25;
                    protected BigDecimal pm10;
                    @XmlElement(name = "us-epa-index")
                    @XmlSchemaType(name = "unsignedByte")
                    protected Short usEpaIndex;
                    @XmlElement(name = "gb-defra-index")
                    @XmlSchemaType(name = "unsignedByte")
                    protected Short gbDefraIndex;

                    /**
                     * Recupera il valore della proprietà co.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getCo() {
                        return co;
                    }

                    /**
                     * Imposta il valore della proprietà co.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setCo(BigDecimal value) {
                        this.co = value;
                    }

                    /**
                     * Recupera il valore della proprietà no2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getNo2() {
                        return no2;
                    }

                    /**
                     * Imposta il valore della proprietà no2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setNo2(BigDecimal value) {
                        this.no2 = value;
                    }

                    /**
                     * Recupera il valore della proprietà o3.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getO3() {
                        return o3;
                    }

                    /**
                     * Imposta il valore della proprietà o3.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setO3(BigDecimal value) {
                        this.o3 = value;
                    }

                    /**
                     * Recupera il valore della proprietà so2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSo2() {
                        return so2;
                    }

                    /**
                     * Imposta il valore della proprietà so2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSo2(BigDecimal value) {
                        this.so2 = value;
                    }

                    /**
                     * Recupera il valore della proprietà pm25.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPm25() {
                        return pm25;
                    }

                    /**
                     * Imposta il valore della proprietà pm25.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPm25(BigDecimal value) {
                        this.pm25 = value;
                    }

                    /**
                     * Recupera il valore della proprietà pm10.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPm10() {
                        return pm10;
                    }

                    /**
                     * Imposta il valore della proprietà pm10.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPm10(BigDecimal value) {
                        this.pm10 = value;
                    }

                    /**
                     * Recupera il valore della proprietà usEpaIndex.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getUsEpaIndex() {
                        return usEpaIndex;
                    }

                    /**
                     * Imposta il valore della proprietà usEpaIndex.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setUsEpaIndex(Short value) {
                        this.usEpaIndex = value;
                    }

                    /**
                     * Recupera il valore della proprietà gbDefraIndex.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getGbDefraIndex() {
                        return gbDefraIndex;
                    }

                    /**
                     * Imposta il valore della proprietà gbDefraIndex.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setGbDefraIndex(Short value) {
                        this.gbDefraIndex = value;
                    }

                }


                /**
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "text",
                    "icon",
                    "code"
                })
                public static class Condition {

                    @XmlElement(required = true)
                    protected String text;
                    @XmlElement(required = true)
                    protected String icon;
                    @XmlSchemaType(name = "unsignedShort")
                    protected int code;

                    /**
                     * Recupera il valore della proprietà text.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Imposta il valore della proprietà text.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                    /**
                     * Recupera il valore della proprietà icon.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIcon() {
                        return icon;
                    }

                    /**
                     * Imposta il valore della proprietà icon.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIcon(String value) {
                        this.icon = value;
                    }

                    /**
                     * Recupera il valore della proprietà code.
                     * 
                     */
                    public int getCode() {
                        return code;
                    }

                    /**
                     * Imposta il valore della proprietà code.
                     * 
                     */
                    public void setCode(int value) {
                        this.code = value;
                    }

                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="time_epoch" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
             *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="temp_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="temp_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="is_day" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="condition"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="wind_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="wind_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="wind_degree" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
             *         &lt;element name="wind_dir" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="pressure_mb" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
             *         &lt;element name="pressure_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="precip_mm" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="precip_in" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="cloud" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="feelslike_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="feelslike_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="windchill_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="windchill_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="heatindex_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="heatindex_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="dewpoint_c" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="dewpoint_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="will_it_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="chance_of_rain" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="will_it_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="chance_of_snow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="vis_km" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="vis_miles" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="gust_mph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="gust_kph" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="uv" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *         &lt;element name="air_quality"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence minOccurs="0"&gt;
             *                   &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *                   &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "timeEpoch",
                "time",
                "tempC",
                "tempF",
                "isDay",
                "condition",
                "windMph",
                "windKph",
                "windDegree",
                "windDir",
                "pressureMb",
                "pressureIn",
                "precipMm",
                "precipIn",
                "humidity",
                "cloud",
                "feelslikeC",
                "feelslikeF",
                "windchillC",
                "windchillF",
                "heatindexC",
                "heatindexF",
                "dewpointC",
                "dewpointF",
                "willItRain",
                "chanceOfRain",
                "willItSnow",
                "chanceOfSnow",
                "visKm",
                "visMiles",
                "gustMph",
                "gustKph",
                "uv",
                "airQuality"
            })
            public static class Hour {

                @XmlElement(name = "time_epoch")
                @XmlSchemaType(name = "unsignedInt")
                protected long timeEpoch;
                @XmlElement(required = true)
                protected String time;
                @XmlElement(name = "temp_c", required = true)
                protected BigDecimal tempC;
                @XmlElement(name = "temp_f", required = true)
                protected BigDecimal tempF;
                @XmlElement(name = "is_day")
                @XmlSchemaType(name = "unsignedByte")
                protected short isDay;
                @XmlElement(required = true)
                protected Root.Forecast.Forecastday.Hour.Condition condition;
                @XmlElement(name = "wind_mph", required = true)
                protected BigDecimal windMph;
                @XmlElement(name = "wind_kph", required = true)
                protected BigDecimal windKph;
                @XmlElement(name = "wind_degree")
                @XmlSchemaType(name = "unsignedShort")
                protected int windDegree;
                @XmlElement(name = "wind_dir", required = true)
                protected String windDir;
                @XmlElement(name = "pressure_mb")
                @XmlSchemaType(name = "unsignedShort")
                protected int pressureMb;
                @XmlElement(name = "pressure_in", required = true)
                protected BigDecimal pressureIn;
                @XmlElement(name = "precip_mm", required = true)
                protected BigDecimal precipMm;
                @XmlElement(name = "precip_in", required = true)
                protected BigDecimal precipIn;
                @XmlSchemaType(name = "unsignedByte")
                protected short humidity;
                @XmlSchemaType(name = "unsignedByte")
                protected short cloud;
                @XmlElement(name = "feelslike_c", required = true)
                protected BigDecimal feelslikeC;
                @XmlElement(name = "feelslike_f", required = true)
                protected BigDecimal feelslikeF;
                @XmlElement(name = "windchill_c", required = true)
                protected BigDecimal windchillC;
                @XmlElement(name = "windchill_f", required = true)
                protected BigDecimal windchillF;
                @XmlElement(name = "heatindex_c", required = true)
                protected BigDecimal heatindexC;
                @XmlElement(name = "heatindex_f", required = true)
                protected BigDecimal heatindexF;
                @XmlElement(name = "dewpoint_c", required = true)
                protected BigDecimal dewpointC;
                @XmlElement(name = "dewpoint_f", required = true)
                protected BigDecimal dewpointF;
                @XmlElement(name = "will_it_rain")
                @XmlSchemaType(name = "unsignedByte")
                protected short willItRain;
                @XmlElement(name = "chance_of_rain")
                @XmlSchemaType(name = "unsignedByte")
                protected short chanceOfRain;
                @XmlElement(name = "will_it_snow")
                @XmlSchemaType(name = "unsignedByte")
                protected short willItSnow;
                @XmlElement(name = "chance_of_snow")
                @XmlSchemaType(name = "unsignedByte")
                protected short chanceOfSnow;
                @XmlElement(name = "vis_km")
                @XmlSchemaType(name = "unsignedByte")
                protected short visKm;
                @XmlElement(name = "vis_miles")
                @XmlSchemaType(name = "unsignedByte")
                protected short visMiles;
                @XmlElement(name = "gust_mph", required = true)
                protected BigDecimal gustMph;
                @XmlElement(name = "gust_kph", required = true)
                protected BigDecimal gustKph;
                @XmlSchemaType(name = "unsignedByte")
                protected short uv;
                @XmlElement(name = "air_quality", required = true)
                protected Root.Forecast.Forecastday.Hour.AirQuality airQuality;

                /**
                 * Recupera il valore della proprietà timeEpoch.
                 * 
                 */
                public long getTimeEpoch() {
                    return timeEpoch;
                }

                /**
                 * Imposta il valore della proprietà timeEpoch.
                 * 
                 */
                public void setTimeEpoch(long value) {
                    this.timeEpoch = value;
                }

                /**
                 * Recupera il valore della proprietà time.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTime() {
                    return time;
                }

                /**
                 * Imposta il valore della proprietà time.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTime(String value) {
                    this.time = value;
                }

                /**
                 * Recupera il valore della proprietà tempC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTempC() {
                    return tempC;
                }

                /**
                 * Imposta il valore della proprietà tempC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTempC(BigDecimal value) {
                    this.tempC = value;
                }

                /**
                 * Recupera il valore della proprietà tempF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTempF() {
                    return tempF;
                }

                /**
                 * Imposta il valore della proprietà tempF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTempF(BigDecimal value) {
                    this.tempF = value;
                }

                /**
                 * Recupera il valore della proprietà isDay.
                 * 
                 */
                public short getIsDay() {
                    return isDay;
                }

                /**
                 * Imposta il valore della proprietà isDay.
                 * 
                 */
                public void setIsDay(short value) {
                    this.isDay = value;
                }

                /**
                 * Recupera il valore della proprietà condition.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.Forecast.Forecastday.Hour.Condition }
                 *     
                 */
                public Root.Forecast.Forecastday.Hour.Condition getCondition() {
                    return condition;
                }

                /**
                 * Imposta il valore della proprietà condition.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.Forecast.Forecastday.Hour.Condition }
                 *     
                 */
                public void setCondition(Root.Forecast.Forecastday.Hour.Condition value) {
                    this.condition = value;
                }

                /**
                 * Recupera il valore della proprietà windMph.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getWindMph() {
                    return windMph;
                }

                /**
                 * Imposta il valore della proprietà windMph.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setWindMph(BigDecimal value) {
                    this.windMph = value;
                }

                /**
                 * Recupera il valore della proprietà windKph.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getWindKph() {
                    return windKph;
                }

                /**
                 * Imposta il valore della proprietà windKph.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setWindKph(BigDecimal value) {
                    this.windKph = value;
                }

                /**
                 * Recupera il valore della proprietà windDegree.
                 * 
                 */
                public int getWindDegree() {
                    return windDegree;
                }

                /**
                 * Imposta il valore della proprietà windDegree.
                 * 
                 */
                public void setWindDegree(int value) {
                    this.windDegree = value;
                }

                /**
                 * Recupera il valore della proprietà windDir.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWindDir() {
                    return windDir;
                }

                /**
                 * Imposta il valore della proprietà windDir.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWindDir(String value) {
                    this.windDir = value;
                }

                /**
                 * Recupera il valore della proprietà pressureMb.
                 * 
                 */
                public int getPressureMb() {
                    return pressureMb;
                }

                /**
                 * Imposta il valore della proprietà pressureMb.
                 * 
                 */
                public void setPressureMb(int value) {
                    this.pressureMb = value;
                }

                /**
                 * Recupera il valore della proprietà pressureIn.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPressureIn() {
                    return pressureIn;
                }

                /**
                 * Imposta il valore della proprietà pressureIn.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPressureIn(BigDecimal value) {
                    this.pressureIn = value;
                }

                /**
                 * Recupera il valore della proprietà precipMm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPrecipMm() {
                    return precipMm;
                }

                /**
                 * Imposta il valore della proprietà precipMm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPrecipMm(BigDecimal value) {
                    this.precipMm = value;
                }

                /**
                 * Recupera il valore della proprietà precipIn.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPrecipIn() {
                    return precipIn;
                }

                /**
                 * Imposta il valore della proprietà precipIn.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPrecipIn(BigDecimal value) {
                    this.precipIn = value;
                }

                /**
                 * Recupera il valore della proprietà humidity.
                 * 
                 */
                public short getHumidity() {
                    return humidity;
                }

                /**
                 * Imposta il valore della proprietà humidity.
                 * 
                 */
                public void setHumidity(short value) {
                    this.humidity = value;
                }

                /**
                 * Recupera il valore della proprietà cloud.
                 * 
                 */
                public short getCloud() {
                    return cloud;
                }

                /**
                 * Imposta il valore della proprietà cloud.
                 * 
                 */
                public void setCloud(short value) {
                    this.cloud = value;
                }

                /**
                 * Recupera il valore della proprietà feelslikeC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getFeelslikeC() {
                    return feelslikeC;
                }

                /**
                 * Imposta il valore della proprietà feelslikeC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setFeelslikeC(BigDecimal value) {
                    this.feelslikeC = value;
                }

                /**
                 * Recupera il valore della proprietà feelslikeF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getFeelslikeF() {
                    return feelslikeF;
                }

                /**
                 * Imposta il valore della proprietà feelslikeF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setFeelslikeF(BigDecimal value) {
                    this.feelslikeF = value;
                }

                /**
                 * Recupera il valore della proprietà windchillC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getWindchillC() {
                    return windchillC;
                }

                /**
                 * Imposta il valore della proprietà windchillC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setWindchillC(BigDecimal value) {
                    this.windchillC = value;
                }

                /**
                 * Recupera il valore della proprietà windchillF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getWindchillF() {
                    return windchillF;
                }

                /**
                 * Imposta il valore della proprietà windchillF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setWindchillF(BigDecimal value) {
                    this.windchillF = value;
                }

                /**
                 * Recupera il valore della proprietà heatindexC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHeatindexC() {
                    return heatindexC;
                }

                /**
                 * Imposta il valore della proprietà heatindexC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHeatindexC(BigDecimal value) {
                    this.heatindexC = value;
                }

                /**
                 * Recupera il valore della proprietà heatindexF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHeatindexF() {
                    return heatindexF;
                }

                /**
                 * Imposta il valore della proprietà heatindexF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHeatindexF(BigDecimal value) {
                    this.heatindexF = value;
                }

                /**
                 * Recupera il valore della proprietà dewpointC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getDewpointC() {
                    return dewpointC;
                }

                /**
                 * Imposta il valore della proprietà dewpointC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setDewpointC(BigDecimal value) {
                    this.dewpointC = value;
                }

                /**
                 * Recupera il valore della proprietà dewpointF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getDewpointF() {
                    return dewpointF;
                }

                /**
                 * Imposta il valore della proprietà dewpointF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setDewpointF(BigDecimal value) {
                    this.dewpointF = value;
                }

                /**
                 * Recupera il valore della proprietà willItRain.
                 * 
                 */
                public short getWillItRain() {
                    return willItRain;
                }

                /**
                 * Imposta il valore della proprietà willItRain.
                 * 
                 */
                public void setWillItRain(short value) {
                    this.willItRain = value;
                }

                /**
                 * Recupera il valore della proprietà chanceOfRain.
                 * 
                 */
                public short getChanceOfRain() {
                    return chanceOfRain;
                }

                /**
                 * Imposta il valore della proprietà chanceOfRain.
                 * 
                 */
                public void setChanceOfRain(short value) {
                    this.chanceOfRain = value;
                }

                /**
                 * Recupera il valore della proprietà willItSnow.
                 * 
                 */
                public short getWillItSnow() {
                    return willItSnow;
                }

                /**
                 * Imposta il valore della proprietà willItSnow.
                 * 
                 */
                public void setWillItSnow(short value) {
                    this.willItSnow = value;
                }

                /**
                 * Recupera il valore della proprietà chanceOfSnow.
                 * 
                 */
                public short getChanceOfSnow() {
                    return chanceOfSnow;
                }

                /**
                 * Imposta il valore della proprietà chanceOfSnow.
                 * 
                 */
                public void setChanceOfSnow(short value) {
                    this.chanceOfSnow = value;
                }

                /**
                 * Recupera il valore della proprietà visKm.
                 * 
                 */
                public short getVisKm() {
                    return visKm;
                }

                /**
                 * Imposta il valore della proprietà visKm.
                 * 
                 */
                public void setVisKm(short value) {
                    this.visKm = value;
                }

                /**
                 * Recupera il valore della proprietà visMiles.
                 * 
                 */
                public short getVisMiles() {
                    return visMiles;
                }

                /**
                 * Imposta il valore della proprietà visMiles.
                 * 
                 */
                public void setVisMiles(short value) {
                    this.visMiles = value;
                }

                /**
                 * Recupera il valore della proprietà gustMph.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getGustMph() {
                    return gustMph;
                }

                /**
                 * Imposta il valore della proprietà gustMph.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setGustMph(BigDecimal value) {
                    this.gustMph = value;
                }

                /**
                 * Recupera il valore della proprietà gustKph.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getGustKph() {
                    return gustKph;
                }

                /**
                 * Imposta il valore della proprietà gustKph.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setGustKph(BigDecimal value) {
                    this.gustKph = value;
                }

                /**
                 * Recupera il valore della proprietà uv.
                 * 
                 */
                public short getUv() {
                    return uv;
                }

                /**
                 * Imposta il valore della proprietà uv.
                 * 
                 */
                public void setUv(short value) {
                    this.uv = value;
                }

                /**
                 * Recupera il valore della proprietà airQuality.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.Forecast.Forecastday.Hour.AirQuality }
                 *     
                 */
                public Root.Forecast.Forecastday.Hour.AirQuality getAirQuality() {
                    return airQuality;
                }

                /**
                 * Imposta il valore della proprietà airQuality.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.Forecast.Forecastday.Hour.AirQuality }
                 *     
                 */
                public void setAirQuality(Root.Forecast.Forecastday.Hour.AirQuality value) {
                    this.airQuality = value;
                }


                /**
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence minOccurs="0"&gt;
                 *         &lt;element name="co" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="o3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="so2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="pm2_5" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="pm10" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="us-epa-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
                 *         &lt;element name="gb-defra-index" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "co",
                    "no2",
                    "o3",
                    "so2",
                    "pm25",
                    "pm10",
                    "usEpaIndex",
                    "gbDefraIndex"
                })
                public static class AirQuality {

                    protected BigDecimal co;
                    protected BigDecimal no2;
                    protected BigDecimal o3;
                    protected BigDecimal so2;
                    @XmlElement(name = "pm2_5")
                    protected BigDecimal pm25;
                    protected BigDecimal pm10;
                    @XmlElement(name = "us-epa-index")
                    @XmlSchemaType(name = "unsignedByte")
                    protected Short usEpaIndex;
                    @XmlElement(name = "gb-defra-index")
                    @XmlSchemaType(name = "unsignedByte")
                    protected Short gbDefraIndex;

                    /**
                     * Recupera il valore della proprietà co.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getCo() {
                        return co;
                    }

                    /**
                     * Imposta il valore della proprietà co.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setCo(BigDecimal value) {
                        this.co = value;
                    }

                    /**
                     * Recupera il valore della proprietà no2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getNo2() {
                        return no2;
                    }

                    /**
                     * Imposta il valore della proprietà no2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setNo2(BigDecimal value) {
                        this.no2 = value;
                    }

                    /**
                     * Recupera il valore della proprietà o3.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getO3() {
                        return o3;
                    }

                    /**
                     * Imposta il valore della proprietà o3.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setO3(BigDecimal value) {
                        this.o3 = value;
                    }

                    /**
                     * Recupera il valore della proprietà so2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSo2() {
                        return so2;
                    }

                    /**
                     * Imposta il valore della proprietà so2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSo2(BigDecimal value) {
                        this.so2 = value;
                    }

                    /**
                     * Recupera il valore della proprietà pm25.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPm25() {
                        return pm25;
                    }

                    /**
                     * Imposta il valore della proprietà pm25.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPm25(BigDecimal value) {
                        this.pm25 = value;
                    }

                    /**
                     * Recupera il valore della proprietà pm10.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPm10() {
                        return pm10;
                    }

                    /**
                     * Imposta il valore della proprietà pm10.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPm10(BigDecimal value) {
                        this.pm10 = value;
                    }

                    /**
                     * Recupera il valore della proprietà usEpaIndex.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getUsEpaIndex() {
                        return usEpaIndex;
                    }

                    /**
                     * Imposta il valore della proprietà usEpaIndex.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setUsEpaIndex(Short value) {
                        this.usEpaIndex = value;
                    }

                    /**
                     * Recupera il valore della proprietà gbDefraIndex.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getGbDefraIndex() {
                        return gbDefraIndex;
                    }

                    /**
                     * Imposta il valore della proprietà gbDefraIndex.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setGbDefraIndex(Short value) {
                        this.gbDefraIndex = value;
                    }

                }


                /**
                 * <p>Classe Java per anonymous complex type.
                 * 
                 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "text",
                    "icon",
                    "code"
                })
                public static class Condition {

                    @XmlElement(required = true)
                    protected String text;
                    @XmlElement(required = true)
                    protected String icon;
                    @XmlSchemaType(name = "unsignedShort")
                    protected int code;

                    /**
                     * Recupera il valore della proprietà text.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Imposta il valore della proprietà text.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                    /**
                     * Recupera il valore della proprietà icon.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIcon() {
                        return icon;
                    }

                    /**
                     * Imposta il valore della proprietà icon.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIcon(String value) {
                        this.icon = value;
                    }

                    /**
                     * Recupera il valore della proprietà code.
                     * 
                     */
                    public int getCode() {
                        return code;
                    }

                    /**
                     * Imposta il valore della proprietà code.
                     * 
                     */
                    public void setCode(int value) {
                        this.code = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="tz_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="localtime_epoch" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *         &lt;element name="localtime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "region",
        "country",
        "lat",
        "lon",
        "tzId",
        "localtimeEpoch",
        "localtime"
    })
    public static class Location {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String region;
        @XmlElement(required = true)
        protected String country;
        @XmlElement(required = true)
        protected BigDecimal lat;
        @XmlElement(required = true)
        protected BigDecimal lon;
        @XmlElement(name = "tz_id", required = true)
        protected String tzId;
        @XmlElement(name = "localtime_epoch")
        @XmlSchemaType(name = "unsignedInt")
        protected long localtimeEpoch;
        @XmlElement(required = true)
        protected String localtime;

        /**
         * Recupera il valore della proprietà name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Imposta il valore della proprietà name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Recupera il valore della proprietà region.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegion() {
            return region;
        }

        /**
         * Imposta il valore della proprietà region.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegion(String value) {
            this.region = value;
        }

        /**
         * Recupera il valore della proprietà country.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Imposta il valore della proprietà country.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

        /**
         * Recupera il valore della proprietà lat.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLat() {
            return lat;
        }

        /**
         * Imposta il valore della proprietà lat.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLat(BigDecimal value) {
            this.lat = value;
        }

        /**
         * Recupera il valore della proprietà lon.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLon() {
            return lon;
        }

        /**
         * Imposta il valore della proprietà lon.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLon(BigDecimal value) {
            this.lon = value;
        }

        /**
         * Recupera il valore della proprietà tzId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTzId() {
            return tzId;
        }

        /**
         * Imposta il valore della proprietà tzId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTzId(String value) {
            this.tzId = value;
        }

        /**
         * Recupera il valore della proprietà localtimeEpoch.
         * 
         */
        public long getLocaltimeEpoch() {
            return localtimeEpoch;
        }

        /**
         * Imposta il valore della proprietà localtimeEpoch.
         * 
         */
        public void setLocaltimeEpoch(long value) {
            this.localtimeEpoch = value;
        }

        /**
         * Recupera il valore della proprietà localtime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocaltime() {
            return localtime;
        }

        /**
         * Imposta il valore della proprietà localtime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocaltime(String value) {
            this.localtime = value;
        }

    }

}
