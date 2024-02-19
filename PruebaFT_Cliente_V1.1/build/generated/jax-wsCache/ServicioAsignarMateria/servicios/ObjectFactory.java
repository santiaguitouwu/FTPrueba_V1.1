
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicios package. 
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

    private final static QName _CreateAsignarMateria_QNAME = new QName("http://Servicios/", "CreateAsignarMateria");
    private final static QName _CreateAsignarMateriaResponse_QNAME = new QName("http://Servicios/", "CreateAsignarMateriaResponse");
    private final static QName _DeleteAsignarMateria_QNAME = new QName("http://Servicios/", "deleteAsignarMateria");
    private final static QName _DeleteAsignarMateriaResponse_QNAME = new QName("http://Servicios/", "deleteAsignarMateriaResponse");
    private final static QName _ReadXasignatura_QNAME = new QName("http://Servicios/", "readXasignatura");
    private final static QName _ReadXasignaturaResponse_QNAME = new QName("http://Servicios/", "readXasignaturaResponse");
    private final static QName _ReadXestudiante_QNAME = new QName("http://Servicios/", "readXestudiante");
    private final static QName _ReadXestudianteResponse_QNAME = new QName("http://Servicios/", "readXestudianteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateAsignarMateria }
     * 
     */
    public CreateAsignarMateria createCreateAsignarMateria() {
        return new CreateAsignarMateria();
    }

    /**
     * Create an instance of {@link CreateAsignarMateriaResponse }
     * 
     */
    public CreateAsignarMateriaResponse createCreateAsignarMateriaResponse() {
        return new CreateAsignarMateriaResponse();
    }

    /**
     * Create an instance of {@link DeleteAsignarMateria }
     * 
     */
    public DeleteAsignarMateria createDeleteAsignarMateria() {
        return new DeleteAsignarMateria();
    }

    /**
     * Create an instance of {@link DeleteAsignarMateriaResponse }
     * 
     */
    public DeleteAsignarMateriaResponse createDeleteAsignarMateriaResponse() {
        return new DeleteAsignarMateriaResponse();
    }

    /**
     * Create an instance of {@link ReadXasignatura }
     * 
     */
    public ReadXasignatura createReadXasignatura() {
        return new ReadXasignatura();
    }

    /**
     * Create an instance of {@link ReadXasignaturaResponse }
     * 
     */
    public ReadXasignaturaResponse createReadXasignaturaResponse() {
        return new ReadXasignaturaResponse();
    }

    /**
     * Create an instance of {@link ReadXestudiante }
     * 
     */
    public ReadXestudiante createReadXestudiante() {
        return new ReadXestudiante();
    }

    /**
     * Create an instance of {@link ReadXestudianteResponse }
     * 
     */
    public ReadXestudianteResponse createReadXestudianteResponse() {
        return new ReadXestudianteResponse();
    }

    /**
     * Create an instance of {@link AsignarMateria }
     * 
     */
    public AsignarMateria createAsignarMateria() {
        return new AsignarMateria();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAsignarMateria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "CreateAsignarMateria")
    public JAXBElement<CreateAsignarMateria> createCreateAsignarMateria(CreateAsignarMateria value) {
        return new JAXBElement<CreateAsignarMateria>(_CreateAsignarMateria_QNAME, CreateAsignarMateria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAsignarMateriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "CreateAsignarMateriaResponse")
    public JAXBElement<CreateAsignarMateriaResponse> createCreateAsignarMateriaResponse(CreateAsignarMateriaResponse value) {
        return new JAXBElement<CreateAsignarMateriaResponse>(_CreateAsignarMateriaResponse_QNAME, CreateAsignarMateriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAsignarMateria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "deleteAsignarMateria")
    public JAXBElement<DeleteAsignarMateria> createDeleteAsignarMateria(DeleteAsignarMateria value) {
        return new JAXBElement<DeleteAsignarMateria>(_DeleteAsignarMateria_QNAME, DeleteAsignarMateria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAsignarMateriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "deleteAsignarMateriaResponse")
    public JAXBElement<DeleteAsignarMateriaResponse> createDeleteAsignarMateriaResponse(DeleteAsignarMateriaResponse value) {
        return new JAXBElement<DeleteAsignarMateriaResponse>(_DeleteAsignarMateriaResponse_QNAME, DeleteAsignarMateriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadXasignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "readXasignatura")
    public JAXBElement<ReadXasignatura> createReadXasignatura(ReadXasignatura value) {
        return new JAXBElement<ReadXasignatura>(_ReadXasignatura_QNAME, ReadXasignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadXasignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "readXasignaturaResponse")
    public JAXBElement<ReadXasignaturaResponse> createReadXasignaturaResponse(ReadXasignaturaResponse value) {
        return new JAXBElement<ReadXasignaturaResponse>(_ReadXasignaturaResponse_QNAME, ReadXasignaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadXestudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "readXestudiante")
    public JAXBElement<ReadXestudiante> createReadXestudiante(ReadXestudiante value) {
        return new JAXBElement<ReadXestudiante>(_ReadXestudiante_QNAME, ReadXestudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadXestudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "readXestudianteResponse")
    public JAXBElement<ReadXestudianteResponse> createReadXestudianteResponse(ReadXestudianteResponse value) {
        return new JAXBElement<ReadXestudianteResponse>(_ReadXestudianteResponse_QNAME, ReadXestudianteResponse.class, null, value);
    }

}
