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
			arquivo = "teste/teste.frank";

			Lexer lexer =
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024)); 
			Token token;
			while(!((token = lexer.next()) instanceof EOF)) {
				System.out.print(token.getClass());
				System.out.println(" ( "+token.toString()+")");
			}
			
			Parser parser = new Parser(lexer);
			
			Start str = parser.parse();
			
			PDeclaracao pde = str.getPDeclaracao();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}