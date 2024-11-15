package codigo;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LexicalAnalyzer {
    private final Lexer lexer;
    private final List<Token> tokens = new ArrayList<>();
    private int currentPosition = 0;

    public LexicalAnalyzer(Lexer lexer) throws IOException {
        this.lexer = lexer;
        loadAllTokens();  // Opción 1: Pre-cargar todos los tokens de una vez
    }

    // Opción 1: Pre-cargar todos los tokens de una vez
private void loadAllTokens() throws IOException {
    TokenType tokenType;
    while ((tokenType = lexer.yylex()) != null) {
        // Extrae el lexema actual
        String lexeme = lexer.yytext();
        // Crea un nuevo objeto Token con el tipo y el lexema
        Token token = new Token(tokenType, lexeme, lexer.yyline/2);
        // Agrega el token a la lista
        tokens.add(token);
    }
}
    public Token nextToken() {
        if (currentPosition < tokens.size()) {
            return tokens.get(currentPosition++);
        }
        return null; // o un token de fin de archivo
    }

    public Token peek() {
        return currentPosition < tokens.size() ? tokens.get(currentPosition) : null;
    }
}
