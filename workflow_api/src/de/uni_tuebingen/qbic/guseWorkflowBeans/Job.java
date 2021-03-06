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
 *         &lt;element ref="{}input" maxOccurs="unbounded"/>
 *         &lt;element ref="{}output" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}execute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}history" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
@XmlType(name = "", propOrder = {"input", "output", "execute", "description", "history"})
@XmlRootElement(name = "job")
public class Job {

  @XmlElement(required = true)
  protected List<Input> input;
  protected List<Output> output;
  protected List<Execute> execute;
  protected List<Description> description;
  protected List<History> history;
  @XmlAttribute(name = "name", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NCName")
  protected String name;
  @XmlAttribute(name = "text", required = true)
  @XmlSchemaType(name = "anySimpleType")
  protected String text;
  @XmlAttribute(name = "x", required = true)
  protected BigInteger x;
  @XmlAttribute(name = "y", required = true)
  protected BigInteger y;

  /**
   * Gets the value of the input property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the input property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getInput().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Input }
   * 
   * 
   */
  public List<Input> getInput() {
    if (input == null) {
      input = new ArrayList<Input>();
    }
    return this.input;
  }

  /**
   * Gets the value of the output property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the output property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getOutput().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Output }
   * 
   * 
   */
  public List<Output> getOutput() {
    if (output == null) {
      output = new ArrayList<Output>();
    }
    return this.output;
  }

  /**
   * Gets the value of the execute property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the execute property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getExecute().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Execute }
   * 
   * 
   */
  public List<Execute> getExecute() {
    if (execute == null) {
      execute = new ArrayList<Execute>();
    }
    return this.execute;
  }

  /**
   * Gets the value of the description property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the description property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getDescription().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Description }
   * 
   * 
   */
  public List<Description> getDescription() {
    if (description == null) {
      description = new ArrayList<Description>();
    }
    return this.description;
  }

  /**
   * Gets the value of the history property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the history property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getHistory().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link History }
   * 
   * 
   */
  public List<History> getHistory() {
    if (history == null) {
      history = new ArrayList<History>();
    }
    return this.history;
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
