package ast_traversal_operation_oriented.ast_traversal_operation_oriented;

public interface AST {
	<T> T accept(Visitor<T> v);
}
