
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deleteAsignatura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deleteAsignatura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_Asignatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteAsignatura", propOrder = {
    "idAsignatura"
})
public class DeleteAsignatura {

    @XmlElement(name = "ID_Asignatura")
    protected String idAsignatura;

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

}
