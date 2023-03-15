//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.1 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.15 alle 03:41:53 PM CET 
//




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
