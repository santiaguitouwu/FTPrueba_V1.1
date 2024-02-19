
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreateAsignarMateria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateAsignarMateria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idEstudiante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAsignarMateria", propOrder = {
    "idEstudiante",
    "idMateria"
})
public class CreateAsignarMateria {

    protected String idEstudiante;
    protected String idMateria;

    /**
     * Obtiene el valor de la propiedad idEstudiante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEstudiante() {
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
    public void setIdEstudiante(String value) {
        this.idEstudiante = value;
    }

    /**
     * Obtiene el valor de la propiedad idMateria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMateria() {
        return idMateria;
    }

    /**
     * Define el valor de la propiedad idMateria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMateria(String value) {
        this.idMateria = value;
    }

}
