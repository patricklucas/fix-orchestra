module orchestra.interfaces {
  requires transitive java.xml.bind;
  requires transitive jaxb2.basics.runtime;
  
  exports io.fixprotocol._2022.orchestra.interfaces;
  opens io.fixprotocol._2022.orchestra.interfaces;
  exports org.purl.dc.elements._1;
  opens org.purl.dc.elements._1;
  exports org.purl.dc.terms;
  opens org.purl.dc.terms;
}