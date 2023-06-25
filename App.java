package PDF.com.java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	File oldFile =new File("C:\\Users\\saksh\\eclipse-workspace\\PDF\\QB.pdf");
    	PDDocument document = PDDocument.load(oldFile);
    	
    	Splitter splitter = new Splitter();
    	
    	List<PDDocument> splitPages = splitter.split(document);
    	
    	
    	int i=1;
        for(PDDocument doc : splitPages)
        {
        	doc.save("C:\\Users\\saksh\\eclipse-workspace\\PDF\\Splitpdf\\split0"+i+".pdf");
        	i++;
        	doc.close();
        }
        System.out.println("Split Done Successfully....!!");
        
    }
}
