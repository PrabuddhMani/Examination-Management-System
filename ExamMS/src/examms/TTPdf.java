
package examms;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;



public class TTPdf {
    public static void main(String[] args) {
        try {
            // Step 1: Create a Document object
            Document document = new Document();
            
            // Step 2: Create a PdfWriter object
            PdfWriter.getInstance(document, new FileOutputStream("output.pdf"));
            
            // Step 3: Open the Document
            document.open();
            
            // Step 4: Add content to the Document
            String text = "This is a sample text that will be converted to PDF.";
            Paragraph paragraph = new Paragraph(text);
            document.add(paragraph);
            
            // Step 5: Close the Document
            document.close();
            
            System.out.println("PDF file generated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 

