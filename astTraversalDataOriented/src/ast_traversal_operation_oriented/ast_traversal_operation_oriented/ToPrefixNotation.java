package ast_traversal_operation_oriented.ast_traversal_operation_oriented;

import java.util.List;


// here we have a method that return a string that contain expression in prefix notation
public class ToPrefixNotation implements Visitor<String> {


    @Override
    public String IntLiteral(int value) {
        return null;
    }

    @Override
    public String SignExp(AST Exp) {
        return null;
    }

    @Override
    public String MulExp(List<AST> children) {
        return null;
    }
}
