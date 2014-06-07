import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class DeckOfCards {
	public static void main(String[] args) {
		try {
			Document doc = new Document();
			PdfWriter.getInstance(doc, new FileOutputStream("Cards.pdf"));
			doc.open();
			
			PdfPTable borders = new PdfPTable(4);
			borders.setWidthPercentage(60);
			borders.getDefaultCell().setFixedHeight(60);;
			
			BaseFont cardsFont = BaseFont.createFont("times.ttf", BaseFont.IDENTITY_H, true);
			Font black = new Font(cardsFont, 45f, 0, BaseColor.BLACK);
			Font red = new Font(cardsFont, 45f, 0, BaseColor.RED);
			
			String card = "";
            char color = ' ';
           
            for (int i = 2; i <= 14; i++) {
                    switch (i) {
                    case 10: card = "10"; break;
                    case 11: card = " J"; break;
                    case 12: card = " Q"; break;
                    case 13: card = " K"; break;
                    case 14: card = " A"; break;
                    default: card = " " + i; break;
                    }
                    for (int j = 1; j <= 4; j++) {
                            switch (j) {
                            case 1: color = '♣'; borders.addCell(new Paragraph(card + color, black)); break;
                            case 2: color = '♦'; borders.addCell(new Paragraph(card + color, red)); break;
                            case 3: color = '♥'; borders.addCell(new Paragraph(card + color, black)); break;
                            case 4: color = '♠'; borders.addCell(new Paragraph(card + color, red)); break;
                            }
                    }
            }
			doc.add(borders);
			doc.close();
		} 
		catch (Exception e) {
			 e.printStackTrace();
		}
	}
}
