//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.1 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.15 alle 03:41:53 PM CET 
//




import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *                   &lt;element name="temp_f" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
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
 *                   &lt;element name="feelslike_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    "current"
})
@XmlRootElement(name = "root")
public class Root {

    @XmlElement(required = true)
    protected Root.Location location;
    @XmlElement(required = true)
    protected Root.Current current;

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
     *         &lt;element name="temp_f" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
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
     *         &lt;element name="feelslike_f" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
        @XmlElement(name = "temp_f")
        @XmlSchemaType(name = "unsignedByte")
        protected short tempF;
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
        @XmlElement(name = "feelslike_f", required = true)
        protected BigDecimal feelslikeF;
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
         */
        public short getTempF() {
            return tempF;
        }

        /**
         * Imposta il valore della proprietà tempF.
         * 
         */
        public void setTempF(short value) {
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
