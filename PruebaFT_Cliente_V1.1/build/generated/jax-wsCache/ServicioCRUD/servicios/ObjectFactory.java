
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

    private final static QName _Buscar_QNAME = new QName("http://Servicios/", "buscar");
    private final static QName _BuscarResponse_QNAME = new QName("http://Servicios/", "buscarResponse");
    private final static QName _Create_QNAME = new QName("http://Servicios/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://Servicios/", "createResponse");
    private final static QName _DeleteEstudiante_QNAME = new QName("http://Servicios/", "deleteEstudiante");
    private final static QName _DeleteEstudianteResponse_QNAME = new QName("http://Servicios/", "deleteEstudianteResponse");
    private final static QName _ListarID_QNAME = new QName("http://Servicios/", "listarID");
    private final static QName _ListarIDResponse_QNAME = new QName("http://Servicios/", "listarIDResponse");
    private final static QName _ListarPaises_QNAME = new QName("http://Servicios/", "listarPaises");
    private final static QName _ListarPaisesResponse_QNAME = new QName("http://Servicios/", "listarPaisesResponse");
    private final static QName _Read_QNAME = new QName("http://Servicios/", "read");
    private final static QName _ReadResponse_QNAME = new QName("http://Servicios/", "readResponse");
    private final static QName _UpdateEstudiante_QNAME = new QName("http://Servicios/", "updateEstudiante");
    private final static QName _UpdateEstudianteResponse_QNAME = new QName("http://Servicios/", "updateEstudianteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Buscar }
     * 
     */
    public Buscar createBuscar() {
        return new Buscar();
    }

    /**
     * Create an instance of {@link BuscarResponse }
     * 
     */
    public BuscarResponse createBuscarResponse() {
        return new BuscarResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link DeleteEstudiante }
     * 
     */
    public DeleteEstudiante createDeleteEstudiante() {
        return new DeleteEstudiante();
    }

    /**
     * Create an instance of {@link DeleteEstudianteResponse }
     * 
     */
    public DeleteEstudianteResponse createDeleteEstudianteResponse() {
        return new DeleteEstudianteResponse();
    }

    /**
     * Create an instance of {@link ListarID }
     * 
     */
    public ListarID createListarID() {
        return new ListarID();
    }

    /**
     * Create an instance of {@link ListarIDResponse }
     * 
     */
    public ListarIDResponse createListarIDResponse() {
        return new ListarIDResponse();
    }

    /**
     * Create an instance of {@link ListarPaises }
     * 
     */
    public ListarPaises createListarPaises() {
        return new ListarPaises();
    }

    /**
     * Create an instance of {@link ListarPaisesResponse }
     * 
     */
    public ListarPaisesResponse createListarPaisesResponse() {
        return new ListarPaisesResponse();
    }

    /**
     * Create an instance of {@link Read }
     * 
     */
    public Read createRead() {
        return new Read();
    }

    /**
     * Create an instance of {@link ReadResponse }
     * 
     */
    public ReadResponse createReadResponse() {
        return new ReadResponse();
    }

    /**
     * Create an instance of {@link UpdateEstudiante }
     * 
     */
    public UpdateEstudiante createUpdateEstudiante() {
        return new UpdateEstudiante();
    }

    /**
     * Create an instance of {@link UpdateEstudianteResponse }
     * 
     */
    public UpdateEstudianteResponse createUpdateEstudianteResponse() {
        return new UpdateEstudianteResponse();
    }

    /**
     * Create an instance of {@link Estudiante }
     * 
     */
    public Estudiante createEstudiante() {
        return new Estudiante();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "buscar")
    public JAXBElement<Buscar> createBuscar(Buscar value) {
        return new JAXBElement<Buscar>(_Buscar_QNAME, Buscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "buscarResponse")
    public JAXBElement<BuscarResponse> createBuscarResponse(BuscarResponse value) {
        return new JAXBElement<BuscarResponse>(_BuscarResponse_QNAME, BuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "deleteEstudiante")
    public JAXBElement<DeleteEstudiante> createDeleteEstudiante(DeleteEstudiante value) {
        return new JAXBElement<DeleteEstudiante>(_DeleteEstudiante_QNAME, DeleteEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "deleteEstudianteResponse")
    public JAXBElement<DeleteEstudianteResponse> createDeleteEstudianteResponse(DeleteEstudianteResponse value) {
        return new JAXBElement<DeleteEstudianteResponse>(_DeleteEstudianteResponse_QNAME, DeleteEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "listarID")
    public JAXBElement<ListarID> createListarID(ListarID value) {
        return new JAXBElement<ListarID>(_ListarID_QNAME, ListarID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "listarIDResponse")
    public JAXBElement<ListarIDResponse> createListarIDResponse(ListarIDResponse value) {
        return new JAXBElement<ListarIDResponse>(_ListarIDResponse_QNAME, ListarIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPaises }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "listarPaises")
    public JAXBElement<ListarPaises> createListarPaises(ListarPaises value) {
        return new JAXBElement<ListarPaises>(_ListarPaises_QNAME, ListarPaises.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPaisesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "listarPaisesResponse")
    public JAXBElement<ListarPaisesResponse> createListarPaisesResponse(ListarPaisesResponse value) {
        return new JAXBElement<ListarPaisesResponse>(_ListarPaisesResponse_QNAME, ListarPaisesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Read }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "read")
    public JAXBElement<Read> createRead(Read value) {
        return new JAXBElement<Read>(_Read_QNAME, Read.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "readResponse")
    public JAXBElement<ReadResponse> createReadResponse(ReadResponse value) {
        return new JAXBElement<ReadResponse>(_ReadResponse_QNAME, ReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "updateEstudiante")
    public JAXBElement<UpdateEstudiante> createUpdateEstudiante(UpdateEstudiante value) {
        return new JAXBElement<UpdateEstudiante>(_UpdateEstudiante_QNAME, UpdateEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "updateEstudianteResponse")
    public JAXBElement<UpdateEstudianteResponse> createUpdateEstudianteResponse(UpdateEstudianteResponse value) {
        return new JAXBElement<UpdateEstudianteResponse>(_UpdateEstudianteResponse_QNAME, UpdateEstudianteResponse.class, null, value);
    }

}
