/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XPC_DC
 */
public class SemanticAnalyzer {
    private final SymbolTable symbolTable = new SymbolTable();
    private final List<SemanticError> errors = new ArrayList<>();

    public void declareVariable(String name, String type, int line) {
        try {
            symbolTable.define(name, new SemanticSymbol(name, type, line));
        } catch (SemanticException ex) {
            Logger.getLogger(SemanticAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void checkVariable(String name, int line) {
        try {
            symbolTable.lookup(name);
        } catch (SemanticException e) {
            errors.add(new SemanticError(e.getMessage(), line));
        }
    }

    public void checkConstantFolding(Expression expr, int line) {
        // TODO(david)
    }

    public void checkConstantPropagation() {
        // TODO(david)
    }

    public void checkBreakContinueInLoop(boolean inLoop, int line) {
        if (!inLoop) {
            errors.add(new SemanticError("'break' o 'continue' fuera de un bucle.", line));
        }
    }

    public List<SemanticError> getErrors() {
        return errors;
    }
}

