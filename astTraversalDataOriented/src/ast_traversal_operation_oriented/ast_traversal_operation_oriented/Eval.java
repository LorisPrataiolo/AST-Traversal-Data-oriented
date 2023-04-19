package ast_traversal_operation_oriented.ast_traversal_operation_oriented;

import java.util.List;

// Eval is for computing of expression so here we have a method that return --> int
public class Eval implements Visitor<Integer> {



    @Override
    public Integer IntLiteral(int value) {
        return null;
    }

    @Override
    public Integer SignExp(AST Exp) {
        return null;
    }

    @Override
    public Integer MulExp(List<AST> children) {
        return null;
    }
}




