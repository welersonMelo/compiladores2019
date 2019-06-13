package frank;


import frank.lexer.*;
import frank.node.*;

public abstract class Printer {
	public static void printTokens(Lexer lexer) {
		Lexer lex = lexer;
		Token token;
		try {
			while(!((token = lex.next()) instanceof EOF)) {
				System.out.print(token.getClass());
				System.out.println(" ( "+token.toString()+")");
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
