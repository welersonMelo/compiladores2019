package frank;
import frank.lexer.*;
import frank.node.*;
import java.io.*;
import frank.parser.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo;
//			if(args[0] != null) {
//				arquivo = args[0];
//			}
			arquivo = "teste.frank";

			Lexer lexer =
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024)); 
			
			//Printer.printTokens(lexer);
			
			Parser parser = new Parser(lexer);
			
			Start start = parser.parse();
			
			System.out.println(start.toString());
			
			
			//PDeclaracao pde = start.getPDeclaracao();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}