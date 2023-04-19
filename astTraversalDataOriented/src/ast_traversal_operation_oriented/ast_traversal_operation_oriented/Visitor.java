package ast_traversal_operation_oriented.ast_traversal_operation_oriented;

import java.util.List;

public interface Visitor<T> {

    T IntLiteral(int value);
    T SignExp ( AST Exp );
    T MulExp(List<AST> children);
}
