
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

    private final static QName _BuscarAsignatura_QNAME = new QName("http://Servicios/", "buscarAsignatura");
    private final static QName _BuscarAsignaturaResponse_QNAME = new QName("http://Servicios/", "buscarAsignaturaResponse");
    private final static QName _CreateAsignatura_QNAME = new QName("http://Servicios/", "createAsignatura");
    private final static QName _CreateAsignaturaResponse_QNAME = new QName("http://Servicios/", "createAsignaturaResponse");
    private final static QName _DeleteAsignatura_QNAME = new QName("http://Servicios/", "deleteAsignatura");
    private final static QName _DeleteAsignaturaResponse_QNAME = new QName("http://Servicios/", "deleteAsignaturaResponse");
    private final static QName _ListarAsignatura_QNAME = new QName("http://Servicios/", "listarAsignatura");
    private final static QName _ListarAsignaturaResponse_QNAME = new QName("http://Servicios/", "listarAsignaturaResponse");
    private final static QName _ReadAsignatura_QNAME = new QName("http://Servicios/", "readAsignatura");
    private final static QName _ReadAsignaturaResponse_QNAME = new QName("http://Servicios/", "readAsignaturaResponse");
    private final static QName _UpdateAsignatura_QNAME = new QName("http://Servicios/", "updateAsignatura");
    private final static QName _UpdateAsignaturaResponse_QNAME = new QName("http://Servicios/", "updateAsignaturaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarAsignatura }
     * 
     */
    public BuscarAsignatura createBuscarAsignatura() {
        return new BuscarAsignatura();
    }

    /**
     * Create an instance of {@link BuscarAsignaturaResponse }
     * 
     */
    public BuscarAsignaturaResponse createBuscarAsignaturaResponse() {
        return new BuscarAsignaturaResponse();
    }

    /**
     * Create an instance of {@link CreateAsignatura }
     * 
     */
    public CreateAsignatura createCreateAsignatura() {
        return new CreateAsignatura();
    }

    /**
     * Create an instance of {@link CreateAsignaturaResponse }
     * 
     */
    public CreateAsignaturaResponse createCreateAsignaturaResponse() {
        return new CreateAsignaturaResponse();
    }

    /**
     * Create an instance of {@link DeleteAsignatura }
     * 
     */
    public DeleteAsignatura createDeleteAsignatura() {
        return new DeleteAsignatura();
    }

    /**
     * Create an instance of {@link DeleteAsignaturaResponse }
     * 
     */
    public DeleteAsignaturaResponse createDeleteAsignaturaResponse() {
        return new DeleteAsignaturaResponse();
    }

    /**
     * Create an instance of {@link ListarAsignatura }
     * 
     */
    public ListarAsignatura createListarAsignatura() {
        return new ListarAsignatura();
    }

    /**
     * Create an instance of {@link ListarAsignaturaResponse }
     * 
     */
    public ListarAsignaturaResponse createListarAsignaturaResponse() {
        return new ListarAsignaturaResponse();
    }

    /**
     * Create an instance of {@link ReadAsignatura }
     * 
     */
    public ReadAsignatura createReadAsignatura() {
        return new ReadAsignatura();
    }

    /**
     * Create an instance of {@link ReadAsignaturaResponse }
     * 
     */
    public ReadAsignaturaResponse createReadAsignaturaResponse() {
        return new ReadAsignaturaResponse();
    }

    /**
     * Create an instance of {@link UpdateAsignatura }
     * 
     */
    public UpdateAsignatura createUpdateAsignatura() {
        return new UpdateAsignatura();
    }

    /**
     * Create an instance of {@link UpdateAsignaturaResponse }
     * 
     */
    public UpdateAsignaturaResponse createUpdateAsignaturaResponse() {
        return new UpdateAsignaturaResponse();
    }

    /**
     * Create an instance of {@link Asignatura }
     * 
     */
    public Asignatura createAsignatura() {
        return new Asignatura();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAsignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "buscarAsignatura")
    public JAXBElement<BuscarAsignatura> createBuscarAsignatura(BuscarAsignatura value) {
        return new JAXBElement<BuscarAsignatura>(_BuscarAsignatura_QNAME, BuscarAsignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAsignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "buscarAsignaturaResponse")
    public JAXBElement<BuscarAsignaturaResponse> createBuscarAsignaturaResponse(BuscarAsignaturaResponse value) {
        return new JAXBElement<BuscarAsignaturaResponse>(_BuscarAsignaturaResponse_QNAME, BuscarAsignaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAsignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "createAsignatura")
    public JAXBElement<CreateAsignatura> createCreateAsignatura(CreateAsignatura value) {
        return new JAXBElement<CreateAsignatura>(_CreateAsignatura_QNAME, CreateAsignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAsignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "createAsignaturaResponse")
    public JAXBElement<CreateAsignaturaResponse> createCreateAsignaturaResponse(CreateAsignaturaResponse value) {
        return new JAXBElement<CreateAsignaturaResponse>(_CreateAsignaturaResponse_QNAME, CreateAsignaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAsignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "deleteAsignatura")
    public JAXBElement<DeleteAsignatura> createDeleteAsignatura(DeleteAsignatura value) {
        return new JAXBElement<DeleteAsignatura>(_DeleteAsignatura_QNAME, DeleteAsignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAsignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "deleteAsignaturaResponse")
    public JAXBElement<DeleteAsignaturaResponse> createDeleteAsignaturaResponse(DeleteAsignaturaResponse value) {
        return new JAXBElement<DeleteAsignaturaResponse>(_DeleteAsignaturaResponse_QNAME, DeleteAsignaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAsignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "listarAsignatura")
    public JAXBElement<ListarAsignatura> createListarAsignatura(ListarAsignatura value) {
        return new JAXBElement<ListarAsignatura>(_ListarAsignatura_QNAME, ListarAsignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAsignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "listarAsignaturaResponse")
    public JAXBElement<ListarAsignaturaResponse> createListarAsignaturaResponse(ListarAsignaturaResponse value) {
        return new JAXBElement<ListarAsignaturaResponse>(_ListarAsignaturaResponse_QNAME, ListarAsignaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAsignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "readAsignatura")
    public JAXBElement<ReadAsignatura> createReadAsignatura(ReadAsignatura value) {
        return new JAXBElement<ReadAsignatura>(_ReadAsignatura_QNAME, ReadAsignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAsignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "readAsignaturaResponse")
    public JAXBElement<ReadAsignaturaResponse> createReadAsignaturaResponse(ReadAsignaturaResponse value) {
        return new JAXBElement<ReadAsignaturaResponse>(_ReadAsignaturaResponse_QNAME, ReadAsignaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAsignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "updateAsignatura")
    public JAXBElement<UpdateAsignatura> createUpdateAsignatura(UpdateAsignatura value) {
        return new JAXBElement<UpdateAsignatura>(_UpdateAsignatura_QNAME, UpdateAsignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAsignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "updateAsignaturaResponse")
    public JAXBElement<UpdateAsignaturaResponse> createUpdateAsignaturaResponse(UpdateAsignaturaResponse value) {
        return new JAXBElement<UpdateAsignaturaResponse>(_UpdateAsignaturaResponse_QNAME, UpdateAsignaturaResponse.class, null, value);
    }

}
