//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.2-147
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.12 at 07:43:10 PM CET
//


package de.uni_tuebingen.qbic.guseWorkflowBeans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}graf"/>
 *           &lt;element ref="{}real"/>
 *         &lt;/choice>
 *         &lt;element ref="{}abst" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="download" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="export" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="mainabst" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="maingraf" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="mainreal" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"grafOrReal", "abst"})
@XmlRootElement(name = "workflow")
public class Workflow {

  @XmlElements({@XmlElement(name = "graf", type = Graf.class),
      @XmlElement(name = "real", type = Real.class)})
  protected List<Object> grafOrReal;
  protected Abst abst;
  @XmlAttribute(name = "download", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NCName")
  protected String download;
  @XmlAttribute(name = "export", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NCName")
  protected String export;
  @XmlAttribute(name = "mainabst", required = true)
  @XmlSchemaType(name = "anySimpleType")
  protected String mainabst;
  @XmlAttribute(name = "maingraf", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NCName")
  protected String maingraf;
  @XmlAttribute(name = "mainreal", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NCName")
  protected String mainreal;
  @XmlAttribute(name = "name", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NCName")
  protected String name;

  /**
   * Gets the value of the grafOrReal property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the grafOrReal property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getGrafOrReal().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Graf } {@link Real }
   * 
   * 
   */
  public List<Object> getGrafOrReal() {
    if (grafOrReal == null) {
      grafOrReal = new ArrayList<Object>();
    }
    return this.grafOrReal;
  }

  /**
   * Gets the value of the abst property.
   * 
   * @return possible object is {@link Abst }
   * 
   */
  public Abst getAbst() {
    return abst;
  }

  /**
   * Sets the value of the abst property.
   * 
   * @param value allowed object is {@link Abst }
   * 
   */
  public void setAbst(Abst value) {
    this.abst = value;
  }

  /**
   * Gets the value of the download property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDownload() {
    return download;
  }

  /**
   * Sets the value of the download property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDownload(String value) {
    this.download = value;
  }

  /**
   * Gets the value of the export property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getExport() {
    return export;
  }

  /**
   * Sets the value of the export property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setExport(String value) {
    this.export = value;
  }

  /**
   * Gets the value of the mainabst property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMainabst() {
    return mainabst;
  }

  /**
   * Sets the value of the mainabst property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMainabst(String value) {
    this.mainabst = value;
  }

  /**
   * Gets the value of the maingraf property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMaingraf() {
    return maingraf;
  }

  /**
   * Sets the value of the maingraf property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMaingraf(String value) {
    this.maingraf = value;
  }

  /**
   * Gets the value of the mainreal property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMainreal() {
    return mainreal;
  }

  /**
   * Sets the value of the mainreal property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMainreal(String value) {
    this.mainreal = value;
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

}
