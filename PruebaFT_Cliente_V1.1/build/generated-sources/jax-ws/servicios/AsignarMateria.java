
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asignarMateria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asignarMateria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellidoEstudiante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_Asignatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_Estudiante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreAsignatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreEstudiante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asignarMateria", propOrder = {
    "apellidoEstudiante",
    "idAsignatura",
    "idEstudiante",
    "nombreAsignatura",
    "nombreDepartamento",
    "nombreEstudiante"
})
public class AsignarMateria {

    protected String apellidoEstudiante;
    @XmlElement(name = "ID_Asignatura")
    protected String idAsignatura;
    @XmlElement(name = "ID_Estudiante")
    protected String idEstudiante;
    protected String nombreAsignatura;
    protected String nombreDepartamento;
    protected String nombreEstudiante;

    /**
     * Obtiene el valor de la propiedad apellidoEstudiante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    /**
     * Define el valor de la propiedad apellidoEstudiante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoEstudiante(String value) {
        this.apellidoEstudiante = value;
    }

    /**
     * Obtiene el valor de la propiedad idAsignatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDAsignatura() {
        return idAsignatura;
    }

    /**
     * Define el valor de la propiedad idAsignatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDAsignatura(String value) {
        this.idAsignatura = value;
    }

    /**
     * Obtiene el valor de la propiedad idEstudiante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDEstudiante() {
        return idEstudiante;
    }

    /**
     * Define el valor de la propiedad idEstudiante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDEstudiante(String value) {
        this.idEstudiante = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAsignatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    /**
     * Define el valor de la propiedad nombreAsignatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAsignatura(String value) {
        this.nombreAsignatura = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    /**
     * Define el valor de la propiedad nombreDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDepartamento(String value) {
        this.nombreDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEstudiante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    /**
     * Define el valor de la propiedad nombreEstudiante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEstudiante(String value) {
        this.nombreEstudiante = value;
    }

}
