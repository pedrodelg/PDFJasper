package com.pedroDelg.reporte;

import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class GenerarPdf {

	public static void createPDF(String file) {
		
        try
	        {
        	
       	 		
	            JasperReport jasperReport = null;
	            JasperPrint jasperPrint = null;
	            JasperDesign jasperDesign = null;
	            Map parameters = new HashMap();
	            jasperDesign = JRXmlLoader.load("/WebContent/CartaEvaluacion.jrxml"); //direccion del archivo jrxml
	            jasperReport = JasperCompileManager.compileReport(jasperDesign);  //complia el archivo
	            jasperPrint  = JasperFillManager.fillReport(jasperReport, parameters, new JRBeanCollectionDataSource(com.pedroDelg.reporte.Datos.getDatosList()));
	            JasperExportManager.exportReportToPdfFile(jasperPrint,file); //crea el pdf y lo manda a la carpeta temporal  (el parametro file es el q contiene esa ruta)
//	            JasperViewer.viewReport(jasperPrint); esto no se usa, solo para hacer pruebas de visualizacion de reporte con el jasperviewer 
	            
	    

	        }
	        catch(Exception ex)
	        {
	            System.out.println("EXCEPTION: "+ex);
	        }
		
		
	}
}
