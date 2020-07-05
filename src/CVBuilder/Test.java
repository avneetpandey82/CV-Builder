package CVBuilder;


import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.IBlockElement;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;


public class Test {    
	
public static String name;
public static String dob;
public static String mail;
public static String contact;
public static String address;
public static String gender;
public static String image;
public static String grade12,school12,year12,grade10,school10,year10;
public static String collegeName;
public static String degreeName;
public static String clgpercent;
public static String yearGraduation;
public static String title1=null,title2=null,title3=null,title4=null,title5=null,title6=null,title7=null,title8=null,title9=null,title10=null;
public static String platform1,platform2=null,platform3=null,platform4=null,platform5=null,platform6=null,platform7=null,platform8=null,platform9=null,platform10=null;
public static String date1,date2=null,date3=null,date4=null,date5=null,date6=null,date7=null,date8=null,date9=null,date10=null;
public static String pTitle1,pTitle2,pTitle3;
public static String technology1,technology2,technology3;
public static String pEndDate1,pEndDate2,pEndDate3;
public static String skill1,skill2,skill3,skill4,skill5,skill6,skill7,skill8,skill9;

private int n=1;
private float f = 540f;


		public Test(String image) 
		{
			try {
			   // Creating a PdfWriter       
		      String dest = "C:\\Users\\hp pc\\eclipse-workspace\\Java CVBuilder\\Your Resume.pdf";       
		      PdfWriter writer = new PdfWriter(dest); 
		   
		      // Creating a PdfDocument       
		      PdfDocument pdfDoc = new PdfDocument(writer);              
		   
		      // Adding a new page 
		      pdfDoc.addNewPage();               
		   
		      // Creating a Document        
		      Document doc = new Document(pdfDoc,PageSize.A4);
		      
		      ImageData imd = ImageDataFactory.create(image);
		      Image img = new Image(imd);
		      img.setFixedPosition(440f, 710f);
		      img.scaleAbsolute(80, 85);
		   
		      new PdfFontFactory();
		      PdfFont pf1 = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
		      PdfFont pf2 = PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
		      
		      
		      Paragraph p1 = new Paragraph("Avneet Pandey").setFont(pf1).setFontSize(25f);
		   
		      
		      Paragraph p2 = new Paragraph().setFont(pf2).setFontSize(12f);
		      p2.add(mail+"/").add("+91-"+contact+"/");
		      if(gender.equals("Male"))
				{
					p2.add("M\n");
				}
		      else if(gender.equalsIgnoreCase("Female"))
				{
					p2.add("F\n");
				}
				else
				{
					p2.add("O\n");
				}
		     System.out.println(address.length());
				if(address.length()>60)
				{
					int half = address.length()/2;
					for(int i=0;i<half;i++)
					{
						p2.add(String.valueOf(address.charAt(i)));
					}
					p2.add("\n");
					for (int i = half; i < address.length(); i++) 
					{
						p2.add(String.valueOf(address.charAt(i)));
					}
				}
				else
				{
					p2.add(address+"\n\n");
				}
				
				//Draw a line in pdf
				PdfCanvas pdc = new PdfCanvas(pdfDoc,1);
				pdc.moveTo(10, 700);
				pdc.lineTo(570,700);
				pdc.closePathStroke();
				
				Paragraph p3 = new Paragraph("Career Objective").setFont(pf1).setFontSize(15f);
//				p3.setTextAlignment(TextAlignment.CENTER);
				p3.setFixedPosition(230, 670, 200);
				
				Paragraph p4 = new Paragraph().setFont(pf2).setFontSize(10f);
				p4.add("To be a part of an organization where I can put my "
					+ "theoretical learnings in to best practical use and thereby "
					+ "assist the organization work more effectively.");
				
				p4.setFixedPosition(35, 640, 500);
				
				Paragraph p5 = new Paragraph("\n\n\nEducation Qualifications").setFont(pf1).setFontSize(15f);
				p5.setTextAlignment(TextAlignment.CENTER);
				
				
		    
				Paragraph p6 = new Paragraph().setFont(pf2).setFontSize(10);
				  float[] width= {100f,500f,600f,300f};
			      Table table = new Table(width);
			      table.addCell(new Cell().add(new Paragraph("S.No")).setHeight(20f));
			      table.addCell(new Cell().add(new Paragraph("Qualification")).setHeight(20f));
			      table.addCell(new Cell().add(new Paragraph("Year of Passing")).setHeight(20f));
			      table.addCell(new Cell().add(new Paragraph("Grades")).setHeight(20f));
			      
			      if(degreeName!=null && clgpercent!=null && yearGraduation!=null)
			      {
			    	  table.addCell(new Cell().add(new Paragraph(String.valueOf(n++))));
			    	  table.addCell(new Cell().add(new Paragraph(collegeName)));
			    	  table.addCell(new Cell().add(new Paragraph(yearGraduation)));
			    	  table.addCell(new Cell().add(new Paragraph(clgpercent)));
			    	  f-=25f;
			    	  p6.add("\n");
			}
			      table.addCell(new Cell().add(new Paragraph(String.valueOf(n++))));
			      table.addCell(new Cell().add(new Paragraph(school12)).setHeight(40f));
			      table.addCell(new Cell().add(new Paragraph(year12)).setHeight(40f));
			      table.addCell(new Cell().add(new Paragraph(grade12)).setHeight(40f));
			      
			      table.addCell(new Cell().add(new Paragraph(String.valueOf(n++))));
			      table.addCell(new Cell().add(new Paragraph(school10)).setHeight(40f));
			      table.addCell(new Cell().add(new Paragraph(year10)));
			      table.addCell(new Cell().add(new Paragraph(grade10)));
			      table.setFixedPosition(40f, 450f, 500f);
			      doc.add(table);
			      
			      
//				if(degreeName!=null && clgpercent!=null && yearGraduation!=null)
//				{
//					p6.add("•	"+degreeName+" from "+collegeName+" with an aggregate of "+clgpercent+"\n");
//				}
//				p6.add("•	HSC from "+school12+", "+year12+" with an aggregate of "+grade12+"\n");
//				p6.add("•	SSC from "+school10+", "+year10+" with an aggreagate of "+grade10+"\n");
//				
//				
				Paragraph p7 = new Paragraph().setFont(pf1).setFontSize(15f);
				p7.add("\n\n\n\n\n\nPersonal Competencies");
				p7.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph p8 = new Paragraph().setFont(pf2).setFontSize(10f);
				p8.add("•	Ability to face challenges and provide goal-oriented performance.\n").
					add("•	Equally effective in working independently and within a team.\n").
					add("•	A reliable, responsible and a motivated individual with interpersonal skills.\n").
					add("•	Punctuality in job completion.");
				
				Paragraph p9 = new Paragraph().setFont(pf1).setFontSize(15f);
				p9.add("Certifications");
				p9.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph p10 = new Paragraph().setFont(pf2).setFontSize(10f);
				p10.add("•	"+title1+" certified from "+platform1+" on "+date1+"\n");
				if(title2!=null && platform2!=null && date2!=null) 
				{
					p10.add("•	"+title2+" certified from "+platform2+" on "+date2+"\n");
				}
				if(title3!=null && platform3!=null && date3!=null) 
				{
					p10.add("•	"+title3+" certified from "+platform3+" on "+date3+"\n");
				}
				if(title4!=null && platform4!=null && date4!=null) 
				{
					p10.add("•	"+title4+" certified from "+platform4+" on "+date4+"\n");
				}
				if(title5!=null && platform5!=null && date5!=null) 
				{
					p10.add("•	"+title6+" certified from "+platform5+" on "+date5+"\n");					
				}
				if(title7!=null && platform7!=null && date7!=null) 
				{
					p10.add("•	"+title7+" certified from "+platform7+" on "+date7+"\n");					
				}
				if(title8!=null && platform8!=null && date8!=null) 
				{
					p10.add("•	"+title8+" certified from "+platform8+" on "+date8+"\n");					
				}
				if(title9!=null && platform9!=null && date9!=null) 
				{
					p10.add("•	"+title9+" certified from "+platform9+" on "+date9+"\n");					
				}
				if(title10!=null && platform10!=null && date10!=null) 
				{
					p10.add("•	"+title10+" certified from "+platform10+" on "+date10+"\n");					
				}
				if(title6!=null && platform6!=null && date6!=null) 
				{
					p10.add("•	"+title6+" certified from "+platform6+" on "+date6+"\n");					
				}
				
				
				Paragraph p11 = new Paragraph().setFont(pf1).setFontSize(15f);
				p11.add("Projects");
				p11.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph p12 = new Paragraph().setFont(pf2).setFontSize(10f);
				p12.add("•	"+pTitle1+" based on "+technology1+" completed on "+pEndDate1+"\n");
				p12.add("•	"+pTitle2+" based on "+technology2+" completed on "+pEndDate2+"\n");
				p12.add("•	"+pTitle3+" based on "+technology3+" completed on "+pEndDate3+"\n");
				
				Paragraph p13 = new Paragraph().setFont(pf1).setFontSize(15f);
				p13.add("Skills");
				p13.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph p14 = new Paragraph().setFont(pf2).setFontSize(10f);
				p14.add(skill1+","+skill2+","+skill3);
				if(skill4.isEmpty()) {}
				else
				p14.add(","+skill4);
				if(skill5.isEmpty()) {}
				else
				p14.add(","+skill5);
				if(skill6.isEmpty()) {}
				else
				p14.add(","+skill6);
				if(skill7.isEmpty()) {}
				else
				p14.add(","+skill7);
				if(skill8.isEmpty()) {}
				else
				p14.add(","+skill8);
				if(skill9.isEmpty()) {}
				else
				p14.add(","+skill9);
//				
				doc.add(p1);
				doc.add(img);
				doc.add(p2);
				doc.add(p3);
				doc.add(p4);
				doc.add(p5);
				doc.add(p6);
				doc.add(p7);
				doc.add(p8);
				doc.add(p9);
				doc.add(p10);
				doc.add(p11);
				doc.add(p12);
				doc.add(p13);
				doc.add(p14);
		      // Closing the document    
				doc.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		      System.out.println("PDF Created");  
		}
public static void main(String args[]) {              
     		try {
				new	Test("C:\\Users\\hp pc\\eclipse-workspace\\Java CVBuilder\\pics\\1.jpg");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
   } 
} 