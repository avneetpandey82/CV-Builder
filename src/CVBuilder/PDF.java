package CVBuilder;

import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
public class PDF {
	
	public static String name,dob,gender="fed",mail,contact,address="qwqr",image;
		public PDF()
		{
			Document doc = new Document();
			try {
			PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("Resume.pdf"));
			doc.open();
			//doc.addTitle(name);
			Font n1 = new Font(FontFamily.HELVETICA,25.0f,Font.BOLD,BaseColor.BLACK);
			Paragraph p1 = new Paragraph(name+"\n",n1);
			Font n2 = new Font(FontFamily.HELVETICA, 12.0f,Font.NORMAL,BaseColor.BLACK);
			Paragraph p2 = new Paragraph("",n2);
			p2.add(mail+"/");
			p2.add("+91-"+contact+"/");
			if(gender.equals("Male"))
			{
				p2.add("M\n");
			}else if(gender.equalsIgnoreCase("Female"))
			{
				p2.add("F\n");
			}
			else
			{
				p2.add("O\n");
			}
			if(address.length()>40)
			{
				for(int i=0;i<address.length()/2;i++)
				{
					p2.add(String.valueOf(address.charAt(i)));
				}
				p2.add("\n");
				for (int i = address.length()/2; i < address.length(); i++) 
				{
					p2.add(String.valueOf(address.charAt(i)));
				}
			}
			else
			{
				p2.add(address);
			}
			
			Image img = Image.getInstance(image);
			img.setAbsolutePosition(410f, 730f);
			img.scaleAbsolute(80f,80f);
			
			
			
			Paragraph p3 = new Paragraph("---------------------------------------------------------------------------------------------------------------------");
			doc.add(img);
			doc.add(p1);
			doc.add(p2);
			doc.add(p3);
			doc.close();
			pdf.close();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		new PDF();
	}
}
