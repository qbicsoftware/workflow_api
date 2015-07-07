//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.2-147
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.12 at 07:43:10 PM CET
//


package de.uni_tuebingen.qbic.guseWorkflowBeans;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}port_prop" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="prejob" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="preoutput" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="seq" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"portProp"})
@XmlRootElement(name = "input")
public class Input {

  @XmlElement(name = "port_prop")
  protected List<PortProp> portProp;
  @XmlAttribute(name = "name", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NCName")
  protected String name;
  @XmlAttribute(name = "prejob", required = true)
  @XmlSchemaType(name = "anySimpleType")
  protected String prejob;
  @XmlAttribute(name = "preoutput", required = true)
  @XmlSchemaType(name = "anySimpleType")
  protected String preoutput;
  @XmlAttribute(name = "seq", required = true)
  protected BigInteger seq;
  @XmlAttribute(name = "text", required = true)
  @XmlSchemaType(name = "anySimpleType")
  protected String text;
  @XmlAttribute(name = "x", required = true)
  protected BigInteger x;
  @XmlAttribute(name = "y", required = true)
  protected BigInteger y;

  /**
   * Gets the value of the portProp property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the portProp property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getPortProp().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link PortProp }
   * 
   * 
   */
  public List<PortProp> getPortProp() {
    if (portProp == null) {
      portProp = new ArrayList<PortProp>();
    }
    return this.portProp;
  }

  /**
   * Gets the value of the name property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setName(String value) {
    this.name = value;
  }

  /**
   * Gets the value of the prejob property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPrejob() {
    return prejob;
  }

  /**
   * Sets the value of the prejob property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setPrejob(String value) {
    this.prejob = value;
  }

  /**
   * Gets the value of the preoutput property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPreoutput() {
    return preoutput;
  }

  /**
   * Sets the value of the preoutput property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setPreoutput(String value) {
    this.preoutput = value;
  }

  /**
   * Gets the value of the seq property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getSeq() {
    return seq;
  }

  /**
   * Sets the value of the seq property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setSeq(BigInteger value) {
    this.seq = value;
  }

  /**
   * Gets the value of the text property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getText() {
    return text;
  }

  /**
   * Sets the value of the text property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setText(String value) {
    this.text = value;
  }

  /**
   * Gets the value of the x property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getX() {
    return x;
  }

  /**
   * Sets the value of the x property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setX(BigInteger value) {
    this.x = value;
  }

  /**
   * Gets the value of the y property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getY() {
    return y;
  }

  /**
   * Sets the value of the y property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setY(BigInteger value) {
    this.y = value;
  }

}
